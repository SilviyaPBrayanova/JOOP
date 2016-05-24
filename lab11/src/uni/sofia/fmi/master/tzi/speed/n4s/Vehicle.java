package uni.sofia.fmi.master.tzi.speed.n4s;

public abstract class Vehicle implements INeed4Speed {

	protected boolean on = false;
	protected double speed = 0;
	
	@Override
	public void powerOn() {
		if(on){
			System.out.println("Power is alredy on.");
		}else{
			on = true;
			System.out.println("Powering on.");
		}
	}

	@Override
	public void powerOff() {
		if(on){
			on = false;
			System.out.println("Powering off.");
		}else{
			System.out.println("Power is already off.");
		}
	}

	@Override
	public void drive() {
		if(on){
			System.out.println("Driving.");
		}else{
			System.out.println("Cannot drive power is off.");
		}
	}

	@Override
	public void speedUp(double step) {
		if(on){
			speed += step;
			System.out.println("Speeding up with " + step + " units. "
							 + "New speed is - " + speed);
		}else{
			System.out.println("Power is off. We cannot speed up.");
		}
	}

	@Override
	public void breaks(double step) {
		if(on){
			if(step > speed){
				speed = 0;
				System.out.println("We are not going that fast."
								 + " New speed is 0.");
				return;
			}
			speed -= step;
			System.out.println("Speeding down with " + step + " units. "
							 + "New speed is - " + speed);
		}else{
			System.out.println("Power is off. We cannot speed down.");
		}
	}

	@Override
	public void overtake(INeed4Speed raceUnit) {
		System.out.println("Ovetaking " + raceUnit + ".");
	}
}
