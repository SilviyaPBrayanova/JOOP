package uni.sofia.fmi.master.tzi.geom;

public class LineTest {

	public static void main(String[] args) {
		Line l1 = new Line(1.2, 3.2, 5.2, 4.4);
		Line l2 = new Line(1.2, 3.2, 10.2, 12.4);
		Line l3 = new Line(1.2, 3.2, 23.2, 34.4);
		
		System.out.println("Comparing " + l1 + " to " + l2 + " -> " + l1.compare(l2));
		System.out.println("Comparing " + l2 + " to " + l1 + " -> " + l2.compare(l1));
		
		System.out.println("Comparing " + l1 + " to " + l3 + " -> " + l1.compare(l3));
		System.out.println("Comparing " + l3 + " to " + l1 + " -> " + l3.compare(l1));
		
		System.out.println("Comparing " + l3 + " to " + l2 + " -> " + l3.compare(l2));
		System.out.println("Comparing " + l2 + " to " + l3 + " -> " + l2.compare(l3));
		
		System.out.println("Comparing " + l1 + " to itself -> " + l1.compare(l1));
		System.out.println("Comparing " + l2 + " to itself -> " + l2.compare(l2));
		System.out.println("Comparing " + l3 + " to itself -> " + l3.compare(l3));
	}

}
