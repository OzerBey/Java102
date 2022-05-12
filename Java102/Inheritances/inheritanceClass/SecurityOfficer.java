package inheritanceClass;

public class SecurityOfficer extends Officer {
	private String document;

	public SecurityOfficer(String name, String surname, String phoneNumber, String ePosta, String department,
			String workhours, String document) {
		super(name, surname, phoneNumber, ePosta, department, workhours);
		this.document = document;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public void watch() {
		System.out.println(this.getName() + " watching to university");
	}
}
