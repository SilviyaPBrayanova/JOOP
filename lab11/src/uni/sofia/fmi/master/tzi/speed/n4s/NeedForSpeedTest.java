package uni.sofia.fmi.master.tzi.speed.n4s;

public class NeedForSpeedTest {

	public static void main(String[] args) {
		Car c1 = new Car("Citroen ZX");
		Truck t1 = new Truck("Ford Cargo");
		c1.powerOn();
		t1.powerOn();
		c1.drive();
		t1.drive();
		c1.speedUp(34.5);
		t1.speedUp(35);
		t1.overtake(c1);
		c1.speedUp(4.5);
		c1.overtake(t1);
		t1.breaks(40);
		c1.breaks(39);
		c1.powerOff();
		t1.powerOff();
	}
}
