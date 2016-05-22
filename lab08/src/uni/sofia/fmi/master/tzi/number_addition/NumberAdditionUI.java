package uni.sofia.fmi.master.tzi.number_addition;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class NumberAdditionUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel firstName;
	private JLabel secondName;
	private JLabel result;	
	private JTextField firstNameField;
	private JTextField secondNameField;
	private JTextField resultField;
	private JButton clear;
	private JButton add;
	private JButton exit;
	
	public NumberAdditionUI(String name){
		super(name);
		init();
	}
	
	private void init(){
		JPanel panel = new JPanel();
		
		TitledBorder border = new TitledBorder("Number Addition");
		panel.setBorder(border);
		
		initLabels();		
		initFields();	
		initButtons();
		addListeners();
		initPanel(panel);
		
		this.getContentPane().add(panel, BorderLayout.NORTH);
		this.getContentPane().add(exit, BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}

	private void initPanel(JPanel panel) {
		panel.setLayout(new GridLayout(4, 2, 5, 5));
		panel.add(firstName);
		panel.add(firstNameField);
		panel.add(secondName);
		panel.add(secondNameField);
		panel.add(result);
		panel.add(resultField);
		panel.add(clear);
		panel.add(add);
	}

	private void initButtons() {
		clear = new JButton("Clear");
		add = new JButton("Add");
		exit = new JButton("Exit");
	}

	private void initFields() {
		firstNameField = new JTextField();
		secondNameField = new JTextField();
		resultField = new JTextField();
	}

	private void initLabels() {
		firstName = new JLabel("First Number");
		secondName = new JLabel("Second Number");
		result = new JLabel("Result");
	}
	
	private void addListeners(){
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNameField.setText("");
				secondNameField.setText("");
				resultField.setText("");
			}
		});
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 float num1 = Float.parseFloat(firstNameField.getText());
				 float num2 = Float.parseFloat(secondNameField.getText());
				 float res = num1 + num2;
				 resultField.setText(String.valueOf(res));
			}
		});
	}
}
