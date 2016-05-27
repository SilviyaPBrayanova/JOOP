package uni.sofia.fmi.master.tzi.birds;

public class BirdTest {

	public static void main(String[] args) {
		Bird bird1 = new Bird();
		System.out.println(Bird.springMessage());
		Bird bird2 = new Bird();
		System.out.println(Bird.springMessage());
		Bird bird3 = new Bird();
		System.out.println(Bird.springMessage());
		
		bird1.increaseCounter();
		System.out.println(Bird.counter);		
		bird2.increaseCounter();
		System.out.println(Bird.counter);	
		bird3.increaseCounter();
		System.out.println(Bird.counter);	
		Bird.increaseCounter();
		System.out.println(Bird.counter);	
	}
}
