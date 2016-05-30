package uni.sofia.fmi.master.tzi;

public class Sphere extends Shapes3D implements IDrawable{

	private double radius;
	
	public Sphere(double radius){
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("3D Sphere with volume " + volume() + " is being drawn.");		
	}

	public double volume(){
		 return 4/3*Math.PI*radius*radius*radius;
	}
}
