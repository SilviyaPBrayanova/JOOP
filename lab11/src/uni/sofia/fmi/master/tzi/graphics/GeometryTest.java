package uni.sofia.fmi.master.tzi.graphics;

public class GeometryTest {

	public static void main(String[] args) {
		Point p1 = new Point(3,6);
		Point p2 = new Point();
		Point p3 = new Point(33,16);
		
		Line l1 = new Line();
		Line l2 = new Line(1,2,3,4);
		Line l3 = new Line(l2);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3, 6, 15, 35);
		Rectangle r3 = new Rectangle(r2);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(4, 5, 23);
		Circle c3 = new Circle(c2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
