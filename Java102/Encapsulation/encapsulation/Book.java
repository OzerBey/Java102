package encapsulation;

public class Book {

	private String name;
	private int pageNumber;

	public Book(String name, int pageNumber) {
		this.name = name;
		this.pageNumber = pageNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber > 0) {
			this.pageNumber = pageNumber;
		} else {
			this.pageNumber = 0;
			System.err.println("The page number must be greater than 0");
		}
	}
}
