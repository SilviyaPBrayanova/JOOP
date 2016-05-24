package uni.sofia.fmi.master.tzi.speed.n4s;

public interface INeed4Speed {

	public void powerOn();
	public void powerOff();
	public void drive();
	public void speedUp(double step);
	public void breaks(double step);
	public void overtake(INeed4Speed raceUnit);
}
