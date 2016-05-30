package uni.sofia.fmi.master.tzi;

public class Shapes3DTest {

	public static void main(String[] args) {
		Shapes3D [] myShapes = new Shapes3D[10]; 
		Shapes3D shape1 = new Sphere(31.5);
		shape1.play(); myShapes[0] = shape1;
		Shapes3D shape2 = new Pyramid(12.4, 54.2);
		shape2.play(); myShapes[1] = shape2;
		Shapes3D shape3 = new Prism(23, 6.4);
		shape3.play(); myShapes[2] = shape3;
		Shapes3D shape4 = new Sphere(45.5);
		shape1.play(); myShapes[3] = shape4;
		Shapes3D shape5 = new Pyramid(62.4, 24.2);
		shape2.play(); myShapes[4] = shape5;
		Shapes3D shape6 = new Prism(12, 6.5);
		shape3.play(); myShapes[5] = shape6;
		Shapes3D shape7 = new Sphere(37.5);
		shape1.play(); myShapes[6] = shape7;
		Shapes3D shape8 = new Pyramid(74.4, 513.2);
		shape2.play(); myShapes[7] = shape8;
		Shapes3D shape9 = new Prism(93, 7.4);
		shape3.play(); myShapes[8] = shape9;
		Shapes3D shape10 = new Sphere(3.57);
		shape1.play(); myShapes[9] = shape10;

		
		Shapes3D.dumpShapes3D(myShapes);
	}
}