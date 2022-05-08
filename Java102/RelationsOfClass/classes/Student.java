package classes;

public class Student {
	private String name;
	private String surname;
	private String idNo;
	private String address;
	private int grade;

	public Student(String name, String surname, String idNo, String address, int grade) {
		this.name = name;
		this.surname = surname;
		this.idNo = idNo;
		this.address = address;
		if (grade > 100 || grade < 0) {
			grade = 0;
		} else
			this.grade = grade;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		if (grade > 100 || grade < 0) {
			grade = 0;
		} else
			this.grade = grade;
	}

}
