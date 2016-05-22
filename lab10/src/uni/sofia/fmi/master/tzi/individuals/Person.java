package uni.sofia.fmi.master.tzi.individuals;

import java.util.Date;

public class Person {
	private String firstName;
	private String middleName; 
	private String lastName;
	private Gender gender;	
	private Date birthDate;
	
	public Person(){
		super();
	}

	public Person(String firstName, String middleName, String lastName, Gender gender, Date birthDate) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}
	
	public Person(Person otherPerson){
		this.firstName = otherPerson.firstName;
		this.middleName = otherPerson.middleName;
		this.lastName = otherPerson.lastName;
		this.gender = otherPerson.gender;
		this.birthDate = otherPerson.birthDate;
	}

	public String showInfo(){
		return this.toString();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender="
				+ gender + ", birthDate=" + birthDate + "]";
	}
	
}
