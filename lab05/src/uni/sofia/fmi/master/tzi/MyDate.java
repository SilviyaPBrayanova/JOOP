package uni.sofia.fmi.master.tzi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyDate {
	private int days = 0;
	private int months = 0; 
	private int years = 0;
	private int hours = 0;
	private int minutes = 0; 
	private int seconds = 0;
	private int milliseconds = 0;
	
	public MyDate(){}
	
	public MyDate(int days,	 int months, 
				  int years, int hours,
				  int minutes, int seconds,
				  int milliseconds){
		verify(days, months, years, hours, minutes, seconds, milliseconds);
		init(days, months, years, hours, minutes, seconds, milliseconds);
	}

	public void fill(){
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int days = askAndRead("Days", br);
			int months = askAndRead("Months", br);
			int years = askAndRead("Years", br);
			int hours = askAndRead("Hours", br);
			int minutes = askAndRead("Minutes", br);
			int seconds = askAndRead("Seconds", br);
			int milliseconds = askAndRead("Milliseconds", br);
			
			verify(days, months, years, hours, minutes, seconds, milliseconds);
			init(days, months, years, hours, minutes, seconds, milliseconds);
		}catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public int compare(MyDate otherDate){
		if(this.years > otherDate.years){
			return 1;
		}else if(this.months > otherDate.months){
			return 1;
		}else if(this.days > otherDate.days){
			return 1;
		}else if(this.hours > otherDate.hours){
			return 1;
		}else if(this.minutes > otherDate.minutes){
			return 1;
		}else if(this.seconds > otherDate.seconds){
			return 1;
		}else if(this.milliseconds > otherDate.milliseconds){
			return 1;
		}else if(this.years == otherDate.years &&
				this.months == otherDate.months &&
				this.days == otherDate.days &&
				this.hours == otherDate.hours &&
				this.minutes == otherDate.minutes &&
				this.seconds == otherDate.seconds &&
				this.milliseconds == otherDate.milliseconds
				){
			return 0;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "MyDate [days=" + days + ", months=" + months + ", years=" + years + ", hours=" + hours + ", minutes="
				+ minutes + ", seconds=" + seconds + ", milliseconds=" + milliseconds + "]";
	}

	private void verify(int days, int months, 
						int years, int hours, 
						int minutes, int seconds, 
						int milliseconds) throws IllegalArgumentException{
		daysInMonth(days, months);
		if(hours < 0 || hours > 23 ||
			minutes < 0 || minutes > 59 ||
			seconds < 0 || seconds > 59 ||
			milliseconds < 0 || milliseconds > 999){
			throw new IllegalArgumentException("Incorrect values.");
		}
	}

	private void daysInMonth(int days, int months) throws IllegalArgumentException {
		if(days < 0 ){
			throw new IllegalArgumentException("Incorrect values for days.");
		}
		switch (months) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (days > 31) {
				throw new IllegalArgumentException("Incorrect values for days.");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (days > 30) {
				throw new IllegalArgumentException("Incorrect values for days.");
			}
			break;
		case 2:
			if (days > 28) { // assume there are no bissextile years
				throw new IllegalArgumentException("Incorrect values for days.");
			}
			break;
		default:
			throw new IllegalArgumentException("Incorrect values for months.");
		}
	}
	
	private int parseInt(String toParse){
		try{
			return Integer.parseInt(toParse);
		}catch(NumberFormatException nfe){
			System.out.println(toParse + " is not an integer.");
		}
		return 0;
	}
	
	private int askAndRead(String what, BufferedReader from) throws IOException{
		System.out.print(what + " : ");
		return parseInt(from.readLine());
	}
	
	private void init(int days, int months, 
					  int years, int hours, 
					  int minutes, int seconds, 
					  int milliseconds) {
		this.days = days;
		this.months = months;
		this.years = years;
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.milliseconds = milliseconds;		
	}
}
