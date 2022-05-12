package inheritanceClass;

public class Officer extends Employee {

	private String department;
	private String workHours;

	public Officer(String name, String surname, String phoneNumber, String ePosta, String department,
			String workhours) {
		super(name, surname, phoneNumber, ePosta);
		this.department = department;
		this.workHours = workhours;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getWorkHours() {
		return workHours;
	}

	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	public void work() {// calis method
		System.out.println(this.getName() + " working at school");
	}

}
