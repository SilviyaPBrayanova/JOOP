package uni.sofia.fmi.master.tzi.students;

public class TestStudent {
	
	public static void main(String[] args) {
		Student s1 = new Student("Gosho", 342.56);
		Student s2 = new Student("Pesho", 235.39);
		Student s3 = new Student("Ceko", 393.52);
		System.out.println(Student.calculateTotalScores());
	}
}
