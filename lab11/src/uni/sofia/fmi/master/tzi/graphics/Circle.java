package uni.sofia.fmi.master.tzi.graphics;

import java.awt.Graphics;

public class Circle extends Point implements IDrawable{

	private int radius;
	
	public Circle(){
		super(0,0);
		radius = 0;
	}
	
	public Circle(int centerX, int centerY, int r){
		super(centerX, centerY);
		radius = r;
	}

	public Circle(Circle otherCircle){
		super(otherCircle);
		radius = otherCircle.radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double surface(){
		return 2*Math.PI*radius*radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", centerX=" + x + ", centerY=" + y + ", surface=" + surface() + "]";
	}

	@Override
	public void drawIt(Graphics g) {
		g.drawOval(x, y, radius, radius);		
	}
}

