package uni.sofia.fmi.master.tzi;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import uni.sofia.fmi.master.tzi.ui.RedactorPanel;

public class YAMLRedactor {
	public static RedactorPanel rp;
	public static String TEMPLATE_DIR = ".redactor";
	public static Path workingDir = null;
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				workingDir = prepareWorkDir();
				rp = new RedactorPanel();
				JFrame application = new JFrame();

				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				application.add(rp);
				application.setSize(500, 400);
				application.setResizable(false);
				application.setVisible(true);
			}
			
			private Path prepareWorkDir() {
				Path osUserHome =  Paths.get(System.getProperty("user.home"));
				Path redactorConfig = osUserHome.resolve(YAMLRedactor.TEMPLATE_DIR);	
				if(!Files.isDirectory(redactorConfig, new LinkOption[0])){
					try {
						Files.createDirectories(redactorConfig);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return redactorConfig;
			}
		});
	}
}
