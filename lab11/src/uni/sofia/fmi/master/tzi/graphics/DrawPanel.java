package uni.sofia.fmi.master.tzi.graphics;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class DrawPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	IDrawable currentDrawable;

	public DrawPanel() {
		super();
		
		JButton btnLine = new JButton("Line");
		btnLine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				currentDrawable = new Line(20, 40, 190, 210);
				paintComponent(getGraphics());
			}
		});
		add(btnLine);
		
		JButton btnRectangle = new JButton("Rectangle");
		btnRectangle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				currentDrawable = new Rectangle(40, 60, 150, 100);
				paintComponent(getGraphics());
			}
		});
		add(btnRectangle);
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				currentDrawable = new Circle(40, 40, 150);
				paintComponent(getGraphics());
			}
		});
		add(btnCircle);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		super.repaint();
		if(currentDrawable != null){
			currentDrawable.drawIt(g);
		}
	}
}