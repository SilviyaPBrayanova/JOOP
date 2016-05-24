package uni.sofia.fmi.master.tzi.computers;

public class ComputerTest {
	public static void main(String[] args) {
		Computable compy = new Computer();
		compy.compute("sumOneTo100", null);
		compy.startup();
		compy.compute("minOfThree", new int[]{2,67,4});
		compy.compute("sumGreaterThan100", null);
		compy.shutdown();
	}
}
