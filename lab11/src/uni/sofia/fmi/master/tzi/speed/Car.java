package uni.sofia.fmi.master.tzi.speed;

public class Car implements IMachine {
	
	private boolean on = false;

	@Override
	public void turnOn() {
		on = true;
		System.out.println("Car on");
	}

	@Override
	public void turnOff() {
		on = false;
		System.out.println("Car off");
	}

	@Override
	public void doWork() {
		if(on){
			System.out.println("Brummmmmmm");
		}else{
			System.out.println("Turn me on first");
		}
	}
}
