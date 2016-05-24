package uni.sofia.fmi.master.tzi.speed;

public class Truck implements IMachine {

	private boolean on = false;

	@Override
	public void turnOn() {
		on = true;
		System.out.println("Truck on");
	}

	@Override
	public void turnOff() {
		on = false;
		System.out.println("Truck off");
	}

	@Override
	public void doWork() {
		if(on){
			System.out.println("Truck Brummmmmmm");
		}else{
			System.out.println("Turn the Truck on first");
		}
	}
}
