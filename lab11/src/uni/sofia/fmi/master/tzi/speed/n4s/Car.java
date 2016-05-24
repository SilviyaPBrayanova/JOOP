package uni.sofia.fmi.master.tzi.speed.n4s;

public class Car extends Vehicle {
	
	private String brand;

	public Car(String brand){
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car: " + brand;
	}
	
	public void flashLights(){
		System.out.println("The car flashed lights.");
	}
	
	public void overtake(INeed4Speed raceUnit){
		flashLights();
		super.overtake(raceUnit);
	}
}
