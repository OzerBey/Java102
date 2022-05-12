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
		System.out.println(this.getName() + " " + this.getSurname() + " joined ..");
	}

	// method overloading //
	public void join(String joinHour) {
		System.out.println(this.getName() + " joined at " + joinHour);
	}

	public void join(String joinHour, String exitHour) {
		System.out.println(this.getName() + " joined at " + joinHour + "and " + this.getName()
				+ " will exit from university at " + exitHour);
	}

	public void exit() {
		System.out.println(this.getName() + " " + this.getSurname() + " exitting from school");
	}

	public void refectory() {
		System.out.println(this.getName() + " " + this.getSurname() + " Joined to refectory");
	}

}
