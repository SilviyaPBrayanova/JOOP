package uni.sofia.fmi.master.tzi;

public class JavaEssentials {

	public static void main(String[] args) {
		JavaEssentials je = new JavaEssentials();
		je.takeDigits(12345);
		je.formula(1, 2, 3, 4, 5, 6);
		je.maxOfThree(1, 2, 3);
		je.minOfThree(4, 6, 7);
		je.sumGreaterThan100();
		je.formula(1, 2, 3, 4, 5, 6);
	}
	
	public int maxOfThree(int a, int b, int c){
		if(a > b && a > c){
			return a;
		}
		if(b > c){
			return b;
		}
		return c;
	}
	
	public int minOfThree(int a, int b, int c){
		if(a < b && a < c){
			return a;
		}
		if(b < c){
			return b;
		}
		return c;
	}
	
	public int sumOneTo100(){
		int sum = 0;
		for(int i = 1 ; i <= 100; i++){
			sum += i;
		}
		return sum;
	}
	
	public int[] takeDigits(int x){
		int []  result = new int[5];
		int workVar = x;
		for(int i = 4 ; i >= 0 ; i--){
			result[i] = workVar%10;
			workVar = workVar/10;
		}
		
		return result;
	}
	
	public double formula(int a, int b, int c, int h, int x, int y){
		return ((double)(a * ( b + c ) - ( a * b - b * c )))/(h*(x*x + y*y));
	}
	
	public int sumGreaterThan100(){
		int sum = 0;
		int increment = 1;
		do{
			sum += increment++;
		}while(sum < 100);
		
		return increment;
	}
}
