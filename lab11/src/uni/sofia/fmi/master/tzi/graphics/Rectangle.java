package uni.sofia.fmi.master.tzi.graphics;

import java.awt.Graphics;

public class Rectangle extends Point implements IDrawable{

	private int width;
	private int height;
	
	public Rectangle(){
		super();
		width = 0;
		height = 0;
	}
	
	public Rectangle(int x, int y, int width, int height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Rectangle otherRectangle){
		super(otherRectangle);
		this.width = otherRectangle.width;
		this.height = otherRectangle.height;
	}

	public int surface(){
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", startX=" + x + ", startY=" + 
				x + ", surface=" + surface() + "]";
	}

	@Override
	public void drawIt(Graphics g) {
		g.drawRect(x, y, width, height);
	}
}
