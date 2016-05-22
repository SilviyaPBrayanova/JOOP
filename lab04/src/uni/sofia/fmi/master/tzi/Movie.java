package uni.sofia.fmi.master.tzi;

import java.util.Calendar;

public class Movie {
	private String title;
	private int year;
	private byte oscarCount;
	private String director;
	
	public Movie(){
		Calendar now = Calendar.getInstance();
		year = now.get(Calendar.YEAR);		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public byte getOscarCount() {
		return oscarCount;
	}

	public void setOscarCount(byte oscarCount) {
		this.oscarCount = oscarCount;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", oscarCount=" + oscarCount + ", director=" + director
				+ "]";
	}
}
