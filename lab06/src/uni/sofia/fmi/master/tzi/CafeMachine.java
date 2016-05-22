package uni.sofia.fmi.master.tzi;

public class CafeMachine {
	
	private int ones = 0;
	private int twos = 0;
	private int fives = 0;
	private int tens = 0;
	private int twenties = 0;
	private int fifties = 0;

	public CafeMachine(){}
	
	public CafeMachine(int ones, int twos, int fives, int tens, int twenties, int fifties){
		this.ones = ones;
		this.twos = twos;
		this.fives = fives;
		this.tens = tens;
		this.twenties = twenties;
		this.fifties = fifties;
	}
	
	public int checkTotal(){
		int sum = ones + 2*twos + 5*fives + 10*tens + 20*twenties + 50*fifties;
		return sum;
	} 
	
	public String takeResto(int resto){
		int [] nominals = {50,20,10,5,2,1};
		String restoStr = "Your resto:";
		int pieces = 0;
		for(int i = 0 ; i < nominals.length ; i++){
			if(resto / nominals[i] > 0){ 
				pieces = resto/nominals[i];
				restoStr += "\n" + pieces + " pieces of " + nominals[i] + " cents";
				resto -= pieces*nominals[i];
			}	
		}
		return restoStr;
	}

	@Override
	public String toString() {
		return "CafeMachine [" + getAmount("ones") + getAmount("twos") + getAmount("fives") 
							   + getAmount("tens") + getAmount("twenties") +getAmount("fifties") + "]";
	}
	
	private String getAmount(String nominal){
		switch(nominal){
			case "ones": return ones==0 ?  "" : "\n One cents: " + Integer.toString(this.ones);
			case "twos": return twos==0 ? "" : "\n Two cents: " + Integer.toString(this.twos);
			case "fives": return fives==0 ? "" : "\n Five cents: " + Integer.toString(this.fives);
			case "tens": return tens==0 ? "" : "\n Ten cents: " + Integer.toString(this.tens);
			case "twenties": return twenties==0 ? "" : "\n Twenty cents: " + Integer.toString(this.twenties);
			case "fifties": return fifties==0 ? "" : "\n Fifty cents: " + Integer.toString(this.fifties);
			default : return "";
		}
	}
}
