package uni.sofia.fmi.master.tzi.graphics;

import java.awt.Graphics;

public class Line extends Point implements IDrawable{

	private int endX;
	private int endY;
	
	public Line(){
		super();
		endX = 0;
		endY = 0;
	}
	
	public Line(int startX, int startY, int endX, int endY){
		super(startX, startY);
		this.endX = endX;
		this.endY = endY;
	}
	
	public Line(Line otherLine){
		super(otherLine);
		this.endX = otherLine.endX;
		this.endY = otherLine.endY;
	}

	public int compare(Line l){
		double otherLength = l.length();
		double thisLength = length();
		
		if(thisLength > otherLength){
			return 1;
		}
		if(thisLength < otherLength){
			return -1;
		}
		return 0;
	}
	
	public double length(){
		return Math.sqrt(Math.pow((endX - x),2) + Math.pow((endY - y),2)) ;
	}
	
	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

	@Override
	public String toString() {
		return "Line [startX=" + x + ", startY=" + y + ", endX=" + endX + 
				", endY=" + endY + ", length=" + length() + "]";
	}

	@Override
	public void drawIt(Graphics g) {
		g.drawLine(x, y, endX, endY);
	}
}
