package inheritanceClass;

public class InformationTechnologies extends Officer {
	private String task;

	public InformationTechnologies(String name, String surname, String phoneNumber, String ePosta, String department,
			String workhours, String task) {
		super(name, surname, phoneNumber, ePosta, department, workhours);
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public void installNetwork() {
		System.out.println("network installed");
	}

}
