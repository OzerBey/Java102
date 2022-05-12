package inheritanceClass;

public class Instructor extends Academician {
	private String doorNo;

	public Instructor(String name, String surname, String phoneNumber, String ePosta, String part, String title,
			String doorNo) {
		super(name, surname, phoneNumber, ePosta, part, title);
		this.doorNo = doorNo;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public void meetSenato() {
		System.out.println("Completed senato meet with instructors");
	}

	public void doExam() {
		System.out.println(this.getName() + " did a exam.");
	}

	@Override
	public void join() {
		System.out.println(this.getName() + " Instructor joined to university");
	}

}
