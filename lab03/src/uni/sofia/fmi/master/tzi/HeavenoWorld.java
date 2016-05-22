package uni.sofia.fmi.master.tzi;

public class HeavenoWorld {

	public static void main(String[] args) {
		if(args.length < 2 || !"John".equals(args[0]) || !"Johnson".equals(args[1])){
			System.out.println("You are not my friend!!!");
		}else{
			System.out.println("Hello, " + args[0] + " " + args[1] + "!");
		}
	}
}
