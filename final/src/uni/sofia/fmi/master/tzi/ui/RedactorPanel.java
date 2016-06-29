package uni.sofia.fmi.master.tzi.ui;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RedactorPanel extends JPanel{
	public RedactorPanel() {
		super();
		this.setBorder(new TitledBorder("YML Redactor"));
		
		JTextPane textPane = new JTextPane();
		
		JButton btnSave = new JButton("Save");
		
		JButton btnLoadTemplate = new JButton("Load template");
		
		JButton btnNew = new JButton("New");
		
		JButton btnImportTemplate = new JButton("Import template");
		
		JLabel lblActiveTemplate = new JLabel("Active template:");
		lblActiveTemplate.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblActiveManifest = new JLabel("Active manifest:");
		lblActiveManifest.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblNone = new JLabel("none");
		
		JLabel lblNone_1 = new JLabel("none");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnSave, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btnImportTemplate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNew, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(btnLoadTemplate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblActiveManifest, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblActiveTemplate, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNone_1)
								.addComponent(lblNone))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNew)
							.addGap(9)
							.addComponent(btnSave)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnImportTemplate)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLoadTemplate)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActiveTemplate)
						.addComponent(lblNone))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActiveManifest)
						.addComponent(lblNone_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	private static final long serialVersionUID = 1L;

}
