package inheritanceClass;

public class Assistant extends Academician {

	private String officeHours;

	public Assistant(String name, String surname, String phoneNumber, String ePosta, String part, String title,
			String officeHours) {
		super(name, surname, phoneNumber, ePosta, part, title);
		this.officeHours = officeHours;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public void doQuiz() {
		System.out.println("Assistant " + this.getName() + " did a quiz");
	}

	@Override
	public void join() {
		System.out.println(this.getName() + "Assistant joined lecture");
	}

}
