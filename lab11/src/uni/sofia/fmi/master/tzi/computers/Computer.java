package uni.sofia.fmi.master.tzi.computers;

public class Computer implements Computable {

	protected boolean up = false;
	
	@Override
	public void startup() {
		if(up){
			System.out.println("System is alredy up.");
		}else{
			up = true;
			System.out.println("Starting up.");
		}
	}

	@Override
	public void shutdown() {
		if(up){
			up = false;
			System.out.println("Shutting down.");
		}else{
			System.out.println("System is already shut down.");
		}
	}

	@Override
	public void compute(String operation, int[] opInput) {
		if(!up){
			System.out.println("The computer is down.");
			return;
		}
		switch (operation) {
		case "maxOfThree": System.out.println(maxOfThree(opInput)); break;
		case "minOfThree": System.out.println(minOfThree(opInput)); break;
		case "sumOneTo100" : System.out.println(sumOneTo100()); break;
		case "takeDigits" : System.out.println(takeDigits(opInput)); break;
		case "formula" : System.out.println(formula(opInput)); break;
		case "sumGreaterThan100" : System.out.println(sumGreaterThan100()); break;
		default:
			System.out.println("Possible operations : [" + "maxOfThree, " 
														 + "minOfThree, " 
														 + "sumOneTo100, "
														 + "takeDigits, "
														 + "formula, "
														 + "sumGreaterThan100" +"]");
			break;
		}
	}
	
	private int maxOfThree(int[] opInput){
		if(opInput != null && opInput.length < 3){
			System.out.println("\"maxOfThree\" requires 3 integers;");
		}
		int a = opInput[0];
		int b = opInput[1];
		int c = opInput[2];
		
		if(a > b && a > c){
			return a;
		}
		if(b > c){
			return b;
		}
		return c;
	}
	
	private int minOfThree(int[] opInput){
		if(opInput != null && opInput.length < 3){
			System.out.println("\"minOfThree\" requires 3 integers;");
		}
		int a = opInput[0];
		int b = opInput[1];
		int c = opInput[2];
		
		
		if(a < b && a < c){
			return a;
		}
		if(b < c){
			return b;
		}
		return c;
	}
	
	private int sumOneTo100(){
		int sum = 0;
		for(int i = 1 ; i <= 100; i++){
			sum += i;
		}
		return sum;
	}
	
	private int[] takeDigits(int[] opInput){
		if(opInput != null && opInput.length < 1){
			System.out.println("\"takeDigits\" requires 1 integer;");
		}
		int x = opInput[0];
		
		int []  result = new int[5];
		int workVar = x;
		for(int i = 4 ; i >= 0 ; i--){
			result[i] = workVar%10;
			workVar = workVar/10;
		}
		
		return result;
	}
	
	private double formula(int[] opInput){
		if(opInput != null && opInput.length < 6){
			System.out.println("\"formula\" requires 3 integers;");
		}
		int a = opInput[0];
		int b = opInput[1];
		int c = opInput[2];
		int h = opInput[3];
		int x = opInput[4];
		int y = opInput[5];
		
		return ((double)(a * ( b + c ) - ( a * b - b * c )))/(h*(x*x + y*y));
	}
	
	private int sumGreaterThan100(){
		int sum = 0;
		int increment = 1;
		do{
			sum += increment++;
		}while(sum < 100);
		
		return increment;
	}
}