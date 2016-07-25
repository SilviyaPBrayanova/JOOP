package uni.sofia.fmi.master.tzi.ui;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import uni.sofia.fmi.master.tzi.listeners.ImportTemplateButtonListener;
import uni.sofia.fmi.master.tzi.listeners.LoadTemplateButtonListener;
import uni.sofia.fmi.master.tzi.listeners.NewButtonListener;
import uni.sofia.fmi.master.tzi.listeners.SaveButtonListener;

import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RedactorPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private JTextPane textPane;
	private JLabel manifestName;
	private JLabel templateName;
	
	public RedactorPanel() {
		super();
		this.setBorder(new TitledBorder("YML Redactor"));
		
		textPane = new JTextPane();
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(createActionListener("Save"));
		
		JButton btnLoadTemplate = new JButton("Load template");
		btnLoadTemplate.addActionListener(createActionListener("Load template"));
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(createActionListener("New"));
		
		JButton btnImportTemplate = new JButton("Import template");
		btnImportTemplate.addActionListener(createActionListener("Import template"));
		
		JLabel lblActiveTemplate = new JLabel("Active template:");
		lblActiveTemplate.setHorizontalAlignment(SwingConstants.RIGHT);
		templateName = new JLabel("");
		
		JLabel lblActiveManifest = new JLabel("Active manifest:");
		lblActiveManifest.setHorizontalAlignment(SwingConstants.RIGHT);
		manifestName = new JLabel("");

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
								.addComponent(manifestName)
								.addComponent(templateName))))
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
						.addComponent(templateName))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActiveManifest)
						.addComponent(manifestName))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}
	
	public JTextPane getTextPane() {
		return textPane;
	}
	
	public void setTextPane(JTextPane textPane) {
		this.textPane = textPane;
	}

	public String getManifestName() {
		return manifestName.getText();
	}

	public void setManifestName(String manifestName) {
		this.manifestName.setText(manifestName);
	}
	
	public String getTemplateName() {
		return templateName.getText();
	}

	public void setTemplateName(String templateName) {
		this.templateName.setText(templateName);
	}
	private ActionListener createActionListener(String btnName) {
		switch(btnName){
		case "Save"	: 	return SaveButtonListener.getInstance();
		case "Load template": return LoadTemplateButtonListener.getInstance();
		case "New": return NewButtonListener.getInstance();
		case "Import template": return ImportTemplateButtonListener.getInstance();
		default 	:	return null;
		}
	}
}
