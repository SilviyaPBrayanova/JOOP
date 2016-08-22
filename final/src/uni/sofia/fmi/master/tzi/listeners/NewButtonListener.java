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

public class NewButtonListener implements ActionListener {
	
	private static NewButtonListener NEW_LISTENER_INSTANCE = null;
	private SwingWorker<Void, Void> newWorker;
	private JFileChooser fchooser;
	private ActionEvent newEvent;
	
	private NewButtonListener() {
		fchooser = new JFileChooser();
	}
	
	private void initWorker(){
		newWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("New action executing in background.");
				String currentManifest = YAMLRedactor.rp.getManifestName();
				String text = YAMLRedactor.rp.getTextArea().getText();
				if(!text.equals("")){
					saveInFile(currentManifest, text);
					YAMLRedactor.rp.setManifestName("");
					YAMLRedactor.rp.getTextArea().setText("");
				}
				return null;
			}
			
			@Override
			protected void done() {
				System.out.println("New action done.");
				super.done();
			}
			private void saveInFile(String file, String text) {
				File fileToSave = null;
				try {
					if (file.equals("")) {
						int fcValue = fchooser.showSaveDialog((JButton)newEvent.getSource());
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
		};
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		newEvent = e;
		initWorker();
		newWorker.execute();
	}

	public static ActionListener getInstance() {
		if(NEW_LISTENER_INSTANCE == null){
			NEW_LISTENER_INSTANCE = new NewButtonListener();
		}
		return NEW_LISTENER_INSTANCE;
	}
}