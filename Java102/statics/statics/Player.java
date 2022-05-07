package statics;

public class Player {

	public String name;
	public int idNo;
	public static String nameOfTeam = "GS";
	public static int count = 0;

	public Player(String name, int id) {
		this.name = name;
		this.idNo = id;
	}

	public void login() {
		count++;
	}

	// static method
	public static void showName() {
		Player p = new Player("showName method ran", 1);
		System.out.println(p.name);
	}
}
