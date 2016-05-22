package uni.sofia.fmi.master.tzi;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ContactEditorUI extends JFrame {
	private static final long serialVersionUID = 1L;
	NamePanel namePanel;
	EmailPanel emailPanel;
	public ContactEditorUI(){
		super();
		namePanel = new NamePanel();
		emailPanel = new EmailPanel();
			
		JButton okButton = new JButton("OK");		
		JButton cancelButton = new JButton("Cancel");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(emailPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(namePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(0))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(343, Short.MAX_VALUE)
					.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(namePanel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(emailPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(okButton)
						.addComponent(cancelButton))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContactEditorUI();
	}
}