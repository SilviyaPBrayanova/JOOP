package uni.sofia.fmi.master.tzi;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class NamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField txtFirstnamefield;
	private JTextField txtLastnamefield;
	private JTextField txtTitlefield;
	private JTextField txtNicknamefield;

	public NamePanel(){
		super();
		this.setBorder(new TitledBorder("Name"));
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtFirstnamefield = new JTextField();
		txtFirstnamefield.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtLastnamefield = new JTextField();
		txtLastnamefield.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtTitlefield = new JTextField();
		txtTitlefield.setColumns(10);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtNicknamefield = new JTextField();
		txtNicknamefield.setColumns(10);
		
		JLabel lblDisplayFormat = new JLabel("Display Format:");
		lblDisplayFormat.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JComboBox comboBox = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblDisplayFormat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblFirstName, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtFirstnamefield, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTitlefield, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblLastName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNickname, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtLastnamefield, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNicknamefield, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
						.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(14))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFirstName)
						.addComponent(txtFirstnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLastName)
						.addComponent(txtLastnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitle)
						.addComponent(txtTitlefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNickname)
						.addComponent(txtNicknamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDisplayFormat)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42))
		);
		setLayout(groupLayout);
	}
}
