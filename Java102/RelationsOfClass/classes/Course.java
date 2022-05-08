package classes;

import java.text.DecimalFormat;

public class Course {
	private String name;
	private String code;
	private Instructor instructor;

	public Course(String name) {
		this.name = name;
	}

	public Course(String name, String code, Instructor instructor) {
		super();
		this.name = name;
		this.code = code;
		this.setInstructor(instructor);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	/*
	 * This method dependency to Student class.. !! Course class uses a Student
	 * class
	 */
	public String calculateAverage(Student[] students) {
		int numOfStds = students.length;
		double total = 0;
		for (Student student : students) {
			total += student.getGrade();
		}
		return new DecimalFormat("##.###").format(total / numOfStds);
	}
}
