package uni.sofia.fmi.master.tzi.graphics;

public class Point {
	protected int x;
	protected int y;
	
	public Point(){
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point otherPoint){
		x = otherPoint.x;
		y = otherPoint.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
