package uni.sofia.fmi.master.tzi.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

import uni.sofia.fmi.master.tzi.YAMLRedactor;

public class SaveButtonListener implements ActionListener{
	
	private static SaveButtonListener SAVE_LISTENER_INSTANCE = null;
	private SwingWorker<Void, Void> saveWorker;
	private JFileChooser fchooser;
	private ActionEvent saveEvent;
	
	private SaveButtonListener() {
		fchooser = new JFileChooser();
		fchooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	}

	private void initWorker(){
		saveWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("Save action executing in background.");
				String text = YAMLRedactor.rp.getTextPane().getText();
				System.out.println("Saving text: " + text);
				saveInFile(YAMLRedactor.rp.getManifestName(),text);
				return null;
			}

			private void saveInFile(String file, String text) {
				File fileToSave = null;
				try {
					if (file.equals("")) {
						int fcValue = fchooser.showSaveDialog((JButton)saveEvent.getSource());
						if (fcValue == JFileChooser.APPROVE_OPTION) {
							fileToSave = fchooser.getSelectedFile();
							if (!fileToSave.exists()) {
								fileToSave.getParentFile().mkdirs();
								fileToSave.createNewFile();
							}
						}
						YAMLRedactor.rp.setManifestName(fileToSave.getAbsolutePath());
					}else{
						fileToSave = new File(file);
					}
					
					if (fileToSave.canWrite()) {
						FileOutputStream fos = new FileOutputStream(fileToSave);
						fos.write(text.getBytes());
						fos.flush();
						fos.close();
					}
				} catch (FileNotFoundException fnfe) {
					fnfe.printStackTrace();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
			
			@Override
			protected void done() {
				System.out.println("Save action done.");
				super.done();
			}
		};
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		saveEvent = event;
		initWorker();
		saveWorker.execute();
	}
	
	public static ActionListener getInstance(){
		if(SAVE_LISTENER_INSTANCE == null){
			SAVE_LISTENER_INSTANCE = new SaveButtonListener();
		}
		return SAVE_LISTENER_INSTANCE;
	}
}