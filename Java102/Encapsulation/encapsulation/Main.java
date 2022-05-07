package encapsulation;

public class Main {

	/*
	 * Encapsulation, Inheritance, Polymorphism and Abstraction are basic structure of OOP
	 */
	public static void main(String[] args) {
		Book hc = new Book("Hayvan Çiftliği", 120);
		Book kızıl = new Book("Kızıl", -100);
		kızıl.setPageNumber(-100);
		System.out.println(kızıl.getPageNumber());
	}
}
