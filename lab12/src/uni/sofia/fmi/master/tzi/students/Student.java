package uni.sofia.fmi.master.tzi.students;

public class Student {

	private String name;
	private double totalScore;
	private static double allStudentsTotalScore = 0;
	private static int numberOfStudents;
	
	public Student(String name, double totalScore){
		this.name = name;
		this.totalScore = totalScore;
		numberOfStudents++;
		allStudentsTotalScore += totalScore;
	}
	
	public static double calculateTotalScores(){
		System.out.println(numberOfStudents + " students achieved collective total score of " + allStudentsTotalScore);
		return allStudentsTotalScore;
	}
}
