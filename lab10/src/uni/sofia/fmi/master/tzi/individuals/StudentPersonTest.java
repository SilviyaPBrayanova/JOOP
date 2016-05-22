package uni.sofia.fmi.master.tzi.individuals;

import java.util.Date;

public class StudentPersonTest {

	public static void main(String[] args) {
		Person p = new Person("Gosho", "Ivanov", "Pawlov", Gender.Male, new Date(1994, 5, 12));
		Student s = new Student("Vanya", "Veleva", "Goranova", 
								Gender.Female, new Date(1995, 4, 5), 
								"FN3456", "Informatics", 2);
		
		System.out.println(p.showInfo());
		System.out.println(s.showInfo());
	}

}
