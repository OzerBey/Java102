package first;

public class First {
	private String str;

	public First(String str) {
		this.str = str;
	}

	public void getNameFromFirstClass() {
		System.out.println("I'm telling you my name");
	}

	private void showStr() {
		System.out.println(this.str);
	}

	public void show() {
		this.showStr();
	}
}