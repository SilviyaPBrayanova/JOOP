package uni.sofia.fmi.master.tzi;

public class Prism extends Shapes3D implements IDrawable, IPrintable{

	private double height;
	private double base;
	
	public Prism(double height, double base){
		this.height = height;
		this.base = base;
	}
	
	@Override
	public void print() {
		System.out.println("3D Prism with volume " + volume() + " is being printed.");		
	}

	@Override
	public void draw() {
		System.out.println("3D Prism with volume " + volume() + " is being drawn.");		
	}

	public double volume(){
		 return base*height;
	}
}
