package uni.sofia.fmi.master.tzi;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		MyDate date2 =  new MyDate(5 , 6, 1894, 23, 46, 31, 899);
		date1.fill();
		switch(date1.compare(date2)){
		case 1: 
			System.out.println(date1 + "\nis after\n" + date2);
			break;
		case -1:
			System.out.println(date1 + "\nis before\n" + date2);
			break;
		case 0:
			System.out.println("It is the same date");
		}
	}
}
