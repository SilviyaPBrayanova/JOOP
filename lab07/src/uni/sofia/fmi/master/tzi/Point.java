package uni.sofia.fmi.master.tzi;

public class Point {
	private double xPosition = 0.0;
	private double yPosition = 0.0;
	
	public Point(){}
	
	public Point(double x, double y){
		this.xPosition = x;
		this.yPosition = y;
	}
	
	public Point(Point p){
		this.xPosition = p.xPosition;
		this.yPosition = p.yPosition;
	}

	public double distanceTo(Point pointTarget){
		return Math.sqrt(Math.pow((pointTarget.xPosition - xPosition),2) +
					Math.pow((pointTarget.yPosition - yPosition),2));
	}
	
	public double distanceBetween(Point source, Point target){
		return Math.sqrt(Math.pow((source.xPosition - target.xPosition),2) +
				Math.pow((source.yPosition - target.yPosition),2));
	}
	
	public double getxPosition() {
		return xPosition;
	}

	public void setxPosition(double xPosition) {
		this.xPosition = xPosition;
	}

	public double getyPosition() {
		return yPosition;
	}

	public void setyPosition(double yPosition) {
		this.yPosition = yPosition;
	}

	@Override
	public String toString() {
		return "Point [xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
	}
}
