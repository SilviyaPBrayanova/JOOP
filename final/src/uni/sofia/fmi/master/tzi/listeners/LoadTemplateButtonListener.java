package uni.sofia.fmi.master.tzi.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingWorker;

import uni.sofia.fmi.master.tzi.YAMLRedactor;
import uni.sofia.fmi.master.tzi.templates.YAMLRedactorFileSystemView;

public class LoadTemplateButtonListener implements ActionListener {
	
	private static LoadTemplateButtonListener LOAD_TEMPLATE_LISTENER_INSTANCE = null;
	private SwingWorker<Void, Void> loadTemplateWorker;
	private ActionEvent loadEvent;
	private JFileChooser fchooser;
	
	private LoadTemplateButtonListener() {
		fchooser = new JFileChooser(YAMLRedactor.workingDir.toFile(), new YAMLRedactorFileSystemView());
		fchooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	}
	
	private void initWorker(){
		loadTemplateWorker = new SwingWorker<Void, Void>(){

			@Override
			protected Void doInBackground() throws Exception {
				System.out.println("Load template action executing in background.");
				int fcValue = fchooser.showOpenDialog((JButton)loadEvent.getSource());
				if(fcValue == JFileChooser.APPROVE_OPTION){
					File selectedFile = fchooser.getSelectedFile();
					YAMLRedactor.rp.setTemplateName(selectedFile.getName());
					String templateText = getTemplateText(Files.lines(Paths.get(selectedFile.toURI())));
					YAMLRedactor.rp.getTextArea().setText(templateText);
				}
				return null;
			}
			
			private String getTemplateText(Stream<String> lines) {
				StringBuffer sb = new StringBuffer();
				lines.forEach(str -> {	sb.append(str); 
										sb.append(System.lineSeparator()); 
									});
				return sb.toString();
			}

			@Override
			protected void done() {
				System.out.println("Load template action done.");
				super.done();
			}
		};
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		loadEvent = event;
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