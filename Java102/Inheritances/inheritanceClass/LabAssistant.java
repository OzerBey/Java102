package inheritanceClass;

public class LabAssistant extends Assistant {

	public LabAssistant(String name, String surname, String phoneNumber, String ePosta, String part, String title,
			String officeHours) {
		super(name, surname, phoneNumber, ePosta, part, title, officeHours);
	}

	public void joinLabs() {
		System.out.println(this.getName() + "joined to labs");
	}

	public void joinLecture() {
		System.out.println("Lab assistant joined to labs lecture");
	}
}
