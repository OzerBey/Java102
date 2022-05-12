package inheritanceClass;

public class Employee {
	private String name;
	private String surname;
	private String phoneNumber;
	private String ePosta;

	public Employee(String name, String surname, String phoneNumber, String ePosta) {
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.ePosta = ePosta;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public void join() {
		System.out.println(this.name + " " + this.surname + " joined ..");
	}

	public void exit() {
		System.out.println(this.name + " " + this.surname + " exitting from school");
	}

	public void refectory() {
		System.out.println(this.name + " " + this.surname + " Joined to refectory");
	}

}
