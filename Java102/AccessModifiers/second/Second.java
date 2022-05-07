package second;

import first.First;

public class Second {
	protected void callMeFromSecondClass() {
		System.out.println("I'm calling you");
	}

	public static void main(String[] args) {
		First first = new First("from Second class");
		first.show();
	}
}
