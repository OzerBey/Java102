package classes;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Yasin", "Ozer", "1234", "İst", 88);
		Student student2 = new Student("Ozer", "Yasin", "1235", "Ank", 77);
		Student student3 = new Student("Zeynep", "Nur", "1236", "İzm", 66);
		student2.setGrade(46);
		// System.out.println(student2.getGrade());
		Student[] students = { student1, student2, student3 };
		Course prog = new Course("Programming");
		Instructor ozerTeacher = new Instructor("Ozer", "Yasin", "MS");
		// Composition!! Course has a Instructor(Sınıfın bir eğitmeni vardir)
		Course math = new Course("Mathematic", "MATH102", ozerTeacher);

		// String result = prog.calculateAverage(students);
		// System.out.println(result);

		System.out.println(math.getInstructor().getName());

	}

}
