package uni.sofia.fmi.master.tzi;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;

public class EmailPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField eMailAddressField;
	
	public EmailPanel(){
		super();
		this.setBorder(new TitledBorder("E-mail"));
		JLabel lblEmailAddress = new JLabel("E-mail Address:");
		eMailAddressField = new JTextField();
		eMailAddressField.setColumns(10);
		JButton btnAdd = new JButton("Add");
		JTextPane textPane = new JTextPane();
		JButton btnEdit = new JButton("Edit");
		JButton btnRemove = new JButton("Remove");
		JButton btnAsDeffault = new JButton("As deffault");
		JLabel lblMailFormat = new JLabel("Mail Format:");
		JRadioButton rdbtnHtml = new JRadioButton("HTML");
		JRadioButton rdbtnPlainText = new JRadioButton("Plain Text");
		JRadioButton rdbtnCustom = new JRadioButton("Custom");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEmailAddress)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(eMailAddressField, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
								.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAsDeffault, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnRemove, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnEdit, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
						.addComponent(lblMailFormat)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(rdbtnHtml)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnPlainText)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnCustom)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailAddress)
						.addComponent(eMailAddressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAdd))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnEdit)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnRemove)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAsDeffault)
							.addGap(12))
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblMailFormat)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnHtml)
						.addComponent(rdbtnPlainText)
						.addComponent(rdbtnCustom))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
}
