package uni.sofia.fmi.master.tzi.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingWorker;

public class LoadTemplateButtonListener implements ActionListener {
	
	private static LoadTemplateButtonListener LOAD_TEMPLATE_LISTENER_INSTANCE = null;
	private SwingWorker<Void, Void> loadTemplateWorker;
	
	
	private LoadTemplateButtonListener() {}
	
	private void initWorker(){
		loadTemplateWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("Load template action executing in background.");
				return null;
			}
			
			@Override
			protected void done() {
				System.out.println("Load template action done.");
				super.done();
			}
		};
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		initWorker();
		loadTemplateWorker.execute();
	}

	public static ActionListener getInstance() {
		if(LOAD_TEMPLATE_LISTENER_INSTANCE == null){
			LOAD_TEMPLATE_LISTENER_INSTANCE = new LoadTemplateButtonListener();
		}
		return LOAD_TEMPLATE_LISTENER_INSTANCE;
	}
}