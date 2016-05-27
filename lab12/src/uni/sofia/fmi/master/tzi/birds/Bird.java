package uni.sofia.fmi.master.tzi.birds;

public class Bird {
	public static int counter = 0;
	public static int flyingBirds = 0;
	public static final int SPRING_BIRD_COUNT = 3;
	private String species;
	private boolean flying;
	
	static void increaseCounter() {
		counter++;
	}
	public Bird(){
		species = "Unidentified";
		flying = true;
		countBirds(true);
	}
	public Bird(String species, boolean flying){
		this.species = species;
		this.flying = flying;
		countBirds(flying);
	}
	
	public static String springMessage(){
		if(flyingBirds == 1){
			return "1 bird does not bring the Spring!";
		}
		if(flyingBirds < SPRING_BIRD_COUNT){
			return flyingBirds +" birds do not bring the Spring!";
		}
		return flyingBirds + " flying birds. "
				+ "The Srping is comming.";
	}
	
	private void countBirds(boolean fly){
		if(fly){
			flyingBirds += 1;
		}
		increaseCounter();
	}
}
