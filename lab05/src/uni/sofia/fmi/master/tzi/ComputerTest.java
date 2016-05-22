package uni.sofia.fmi.master.tzi;

public class ComputerTest {

	public static void main(String[] args) {
		Computer compy1 = new Computer(1, "HP");
		Computer compy2 = new Computer(2, "IBM");
		compy1.startup();
		compy2.startup();
		compy2.doWork();
		compy1.shutdown();
		compy2.shutdown();
		
		compy1.doWork();
		compy2.shutdown();
	}
}
