package uni.sofia.fmi.master.tzi.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingWorker;

public class NewButtonListener implements ActionListener {
	
	private static NewButtonListener NEW_LISTENER_INSTANCE = null;
	private SwingWorker<Void, Void> newWorker;
	
	private NewButtonListener() {}
	
	private void initWorker(){
		newWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("New action executing in background.");
				
				return null;
			}
			
			@Override
			protected void done() {
				System.out.println("New action done.");
				super.done();
			}
		};
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
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