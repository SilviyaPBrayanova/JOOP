package uni.sofia.fmi.master.tzi.geom;

public class Point {
	protected double x;
	protected double y;
	
	public Point(){
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point otherPoint){
		x = otherPoint.x;
		y = otherPoint.y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
