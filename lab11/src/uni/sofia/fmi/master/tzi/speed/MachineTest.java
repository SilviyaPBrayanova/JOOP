package uni.sofia.fmi.master.tzi.speed;

public class MachineTest {
 
	public static void main(String[] args) {
	
		Car c = new Car();
		Truck tr = new Truck();
		
		c.turnOn();
		c.doWork();
		c.turnOff();
		
		tr.doWork();
		tr.turnOn();
		tr.doWork();
		tr.turnOff();
	}	
}
