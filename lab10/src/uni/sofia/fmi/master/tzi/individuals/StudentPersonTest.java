package uni.sofia.fmi.master.tzi.individuals;

import java.time.LocalDate;

public class StudentPersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("Gosho", "Ivanov", "Pawlov", Gender.Male, LocalDate.of(1994, 5, 12));
		Person person2 = new Person(person1);
		Student student1 = new Student("Vanya", "Veleva", "Goranova", 
								Gender.Female, LocalDate.of(1995, 4, 5), 
								"FN3456", "Informatics", 2);
		Student student2 = new Student(student1);
		
		System.out.println(person1.showInfo());
		System.out.println(student1.showInfo());
		System.out.println("--------------------------------"
						 + "--------------------------------");
		System.out.println(person2.showInfo());
		System.out.println(student2.showInfo());
	}

}
