package uni.sofia.fmi.master.tzi.geom;

public class Rectangle extends Point {

	private double width;
	private double height;
	
	public Rectangle(){
		super();
		width = 0.0;
		height = 0.0;
	}
	
	public Rectangle(double x, double y, double width, double height){
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Rectangle otherRectangle){
		super(otherRectangle);
		this.width = otherRectangle.width;
		this.height = otherRectangle.height;
	}

	public double surface(){
		return width * height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
