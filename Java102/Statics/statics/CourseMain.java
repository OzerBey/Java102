package statics;

public class CourseMain {

	public static void main(String[] args) {
		Course algo = new Course("Algorithms", "ALGO222", 75);
		Course mat = new Course("Math", "MATH212", 88);
		Course chem = new Course("Chemistry", "CHEM243", 54);
		// int grades[] = { algo.grade, mat.grade, chem.grade };
		Course[] lessons = { algo, mat, chem };
		Calculate.calculateGrade(lessons);
	}
}
