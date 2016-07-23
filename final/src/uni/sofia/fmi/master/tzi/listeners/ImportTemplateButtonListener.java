package uni.sofia.fmi.master.tzi.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

public class ImportTemplateButtonListener implements ActionListener {
	private static ImportTemplateButtonListener IMPORT_TEMPLATE_LISTENER_INSTANCE = null;
	private SwingWorker<Void, Void> importTemplateWorker;
	private JFileChooser fchooser;
	private ActionEvent importEvent;
	
	private ImportTemplateButtonListener() {
		fchooser = new JFileChooser();
		fchooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	}
	
	private void initWorker(){
		importTemplateWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("Import template action executing in background.");
				fchooser.showOpenDialog((JButton)importEvent.getSource());
				System.out.println("File " + fchooser.getSelectedFile() + " was choosen.");
				return null;
			}
			
			@Override
			protected void done() {
				System.out.println("Import template action done.");
				super.done();
			}
		};
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		importEvent = event;
		initWorker();
		importTemplateWorker.execute();
	}

	public static ActionListener getInstance() {
		if(IMPORT_TEMPLATE_LISTENER_INSTANCE == null){
			IMPORT_TEMPLATE_LISTENER_INSTANCE = new ImportTemplateButtonListener();
		}
		return IMPORT_TEMPLATE_LISTENER_INSTANCE;
	}
}