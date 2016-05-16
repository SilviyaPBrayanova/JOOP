package uni.sofia.fmi.master.tzi;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ContactEditorUI extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public ContactEditorUI(){
		super();
		NamePanel namePanel = new NamePanel();
		EmailPanel emailPanel = new EmailPanel();
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		getContentPane().add(namePanel);
		getContentPane().add(emailPanel);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		JButton button = new JButton("OK");
		panel.add(button);
		JButton button_1 = new JButton("Cancel");
		panel.add(button_1);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContactEditorUI();
	}
}