package uni.sofia.fmi.master.tzi;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import uni.sofia.fmi.master.tzi.ui.RedactorPanel;

public class YAMLRedactor {
	public static RedactorPanel rp;
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				rp = new RedactorPanel();
				JFrame application = new JFrame();

				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				application.add(rp);
				application.setSize(500, 400);
				application.setResizable(false);
				application.setVisible(true);
			}
		});
	}
}
