package uni.sofia.fmi.master.tzi.geom;

public class Line extends Point {

	private double endX;
	private double endY;
	
	public Line(){
		super();
		endX = 0.0;
		endY = 0.0;
	}
	
	public Line(double startX, double startY, double endX, double endY){
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
	
	public double getEndX() {
		return endX;
	}

	public void setEndX(double endX) {
		this.endX = endX;
	}

	public double getEndY() {
		return endY;
	}

	public void setEndY(double endY) {
		this.endY = endY;
	}

	@Override
	public String toString() {
		return "Line [startX=" + x + ", startY=" + y + ", endX=" + endX + ", endY=" + endY + "]";
	}
	
}
