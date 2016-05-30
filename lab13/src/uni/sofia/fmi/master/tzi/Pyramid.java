package uni.sofia.fmi.master.tzi;

public class Pyramid extends Shapes3D implements IPrintable{

	private double height;
	private double base;
	
	public Pyramid(double height, double base){
		this.height = height;
		this.base = base;
	}
	
	@Override
	public void print() {
		System.out.println("3D Pyramid with volume " + volume() + " is being printed.");		
	}
	
	public double volume(){
		 return base*height;
	}
}