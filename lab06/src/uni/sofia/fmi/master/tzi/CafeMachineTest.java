package uni.sofia.fmi.master.tzi;

public class CafeMachineTest {

	public static void main(String[] args) {
		CafeMachine cm1 = new CafeMachine();
		System.out.println(cm1.takeResto(79));
		
		CafeMachine cm2 = new CafeMachine(56, 34, 5, 78, 4, 59);
		System.out.println(cm2.toString());
		System.out.printf("Total: %d cents.", cm2.checkTotal());
	}

}
