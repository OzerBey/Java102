package statics;

public class User {

	public String name;
	public static int count = 0;

	static {
		// This field is a static code block
		int random = (int) (Math.random() * 10);
		System.out.println("random number is " + random);
		count = random;
	}

	public User(String name) {
		this.name = name;
		count++;
	}

}
