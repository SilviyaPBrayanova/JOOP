package uni.sofia.fmi.master.tzi;

public abstract class Shapes3D {
	 public void play(){
		 if(this instanceof IDrawable){
			 ((IDrawable)this).draw();
		 }
		 if(this instanceof IPrintable){
			 ((IPrintable)this).print();
		 }
	 }
	 
	 public static void dumpShapes3D(Shapes3D [] shapes){
		 for(Shapes3D shape : shapes){
			 shape.play();
		 }
	 }
	 
	 public abstract double volume();
}
