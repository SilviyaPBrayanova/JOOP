package uni.sofia.fmi.master.tzi;

public class Computer {
	private int number;
	private String model;
	private boolean started = false;
	
	public Computer(){}
	
	public Computer(int number, String model){
		this.number = number;
		this.model = model;
	}
	
	public void startup(){
		if(started){
			printOperation("already started");
			return;
		}
		started = true;
		printOperation("starting");
	}
	
	public void shutdown(){
		if(!started){
			printOperation("not started");
			return;
		}
		started = false;
		printOperation("shutting down");
	}
	
	public void doWork(){
		if(started){
			printOperation("working");
		}else{
			printOperation("not working");
		}
	}
	
	private void printOperation(String op){
		System.out.println("Computer " + number + " - " + model + " is " + op + ".");
	}
}