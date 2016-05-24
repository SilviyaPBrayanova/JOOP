package uni.sofia.fmi.master.tzi.speed.n4s;

public class Truck extends Vehicle {

	private String brand;
	
	public Truck(String brand){
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Truck: " + brand;
	}
	
	public void honkTheHorn(){
		System.out.println("Honk, honk!");
	}
	
	public void overtake(INeed4Speed raceUnit){
		honkTheHorn();
		super.overtake(raceUnit);
	}
}
