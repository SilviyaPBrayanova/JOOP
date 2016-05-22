package uni.sofia.fmi.master.tzi;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

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
		txtFirstnamefield.setText("firstNameField");
		txtFirstnamefield.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtLastnamefield = new JTextField();
		txtLastnamefield.setText("lastNameField");
		txtLastnamefield.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtTitlefield = new JTextField();
		txtTitlefield.setText("titleField");
		txtTitlefield.setColumns(10);
		
		JLabel lblNickname = new JLabel("Nickname:");
		lblNickname.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtNicknamefield = new JTextField();
		txtNicknamefield.setText("nicknameField");
		txtNicknamefield.setColumns(10);
		
		JLabel lblDisplayFormat = new JLabel("Display Format:");
		lblDisplayFormat.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox comboBox = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addComponent(lblFirstName)
					.addGap(10)
					.addComponent(txtFirstnamefield, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtLastnamefield, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54)
					.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtTitlefield, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addComponent(lblNickname, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(txtNicknamefield, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(lblDisplayFormat, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFirstName))
						.addComponent(txtFirstnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblLastName))
						.addComponent(txtLastnamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTitle))
						.addComponent(txtTitlefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNickname))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addComponent(txtNicknamefield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDisplayFormat))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		setLayout(groupLayout);
	}
}
