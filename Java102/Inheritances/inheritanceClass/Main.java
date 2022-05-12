package inheritanceClass;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi there!");
		Employee e1 = new Employee("Yasin", "Özer", "555555555", "null@null.com");
		e1.join();
		System.out.println(e1.getPhoneNumber());

		Academician a1 = new Academician("Ozer", "Yasin", "55664488", "null@null.com", "Cs", "Prof.");
		a1.join();
		System.out.println("academician of instrucutor " + a1.getPart());
		a1.joinLecture();
		a1.join();
		Officer officer = new Officer("calisan1", "cls", "8555", "null@null.com", "bahceKat", "23");
		officer.work();

		Instructor i1 = new Instructor("ogretim gorevlisi", "grvl", "555844", "null@null.com", "CS", "doc", "34");
		i1.join();
		i1.joinLecture();
		i1.join("12.00");
		i1.join("12.00", "16.30");

	}

}
