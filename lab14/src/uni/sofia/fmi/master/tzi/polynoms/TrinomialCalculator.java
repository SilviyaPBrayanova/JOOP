package uni.sofia.fmi.master.tzi.polynoms;

public class TrinomialCalculator {

	private double a;
	private double b;
	private double c;
	
	public TrinomialCalculator(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double[] findZeros(){
		if(a == 0){
			throw new ZeroCoeficient();
		}
		double discriminant = b*b - 4*a*c;
		if(discriminant < 0){
			throw new NegativeSquareRoot();
		}
		double[] result = new double[2];
		result[0] = (-b + Math.sqrt(discriminant))/(2*a);
		result[1] = (-b - Math.sqrt(discriminant))/(2*a);
		return result;
	}
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "TrinomialCalculator [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}