package inheritanceClass;

public abstract class Academician extends Employee {

	private String part;
	private String title;

	public Academician(String name, String surname, String phoneNumber, String ePosta, String part, String title) {
		super(name, surname, phoneNumber, ePosta);
		this.part = part;
		this.title = title;

	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public abstract void join();

	public void joinLecture() {
		System.out.println("Lab assistant " + this.getName() + " joined to lecture ");
	}
}
