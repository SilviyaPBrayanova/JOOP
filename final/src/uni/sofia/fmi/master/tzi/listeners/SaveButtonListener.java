package uni.sofia.fmi.master.tzi.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingWorker;

public class SaveButtonListener implements ActionListener{
	
	private static SaveButtonListener SAVE_LISTENER_INSTANCE = null;
	private final SwingWorker<Void, Void> saveWorker;
	
	private SaveButtonListener() {
		saveWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("Save action executing in background.");
				return null;
			}
			
			@Override
			protected void done() {
				System.out.println("Save action done.");
				super.done();
			}
		};
	}
	
	public static ActionListener getInstance(){
		if(SAVE_LISTENER_INSTANCE == null){
			SAVE_LISTENER_INSTANCE = new SaveButtonListener();
		}
		return SAVE_LISTENER_INSTANCE;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		saveWorker.execute();
	}
}
