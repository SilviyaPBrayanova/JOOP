package uni.sofia.fmi.master.tzi.individuals;

import java.time.LocalDate;

public class Student extends Person {
	private String facultyNumber;
	private String major;
	private int year;
	
	public Student(){
		super();
	}

	public Student(String firstName, 
				   String middleName, 
				   String lastName, 
				   Gender gender, 
				   LocalDate birthDate, 
				   String facultyNumber, 
				   String major, 
				   int year) {
		super(firstName, middleName, lastName, gender, birthDate);
		this.facultyNumber = facultyNumber;
		this.major = major;
		this.year = year;
	}
	
	public Student(Student otherStudent){
		super(otherStudent);
		this.facultyNumber = otherStudent.facultyNumber;
		this.major = otherStudent.major;
		this.year = otherStudent.year;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString() + "\nStudent [facultyNumber=" + facultyNumber + ", major=" + major + ", year=" + year + "]";
	}
	
}
