package statics;

public class Calculate {
	public static void calculateGrade(Course grades[]) {
		int sumOfGrade = 0;
		for (Course i : grades) {
			sumOfGrade += i.grade;
		}
		System.out.println("Average grade is " + sumOfGrade / grades.length);
	}
}
