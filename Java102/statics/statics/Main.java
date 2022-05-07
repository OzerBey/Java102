package statics;

public class Main {

	public static void main(String[] args) {
		Player player = new Player("Yasin Ozer", 1);
		System.out.println(player.name);
		player.login();
		System.out.println("count of player Yasin " + Player.count);
		System.err.println("Static access " + Player.nameOfTeam);

		// 2nd player
		Player player2 = new Player("Ozer Yasin", 2);
		player2.login();
		System.out.println("count of player ozer " + Player.count);

		Player player3 = new Player("Zeynep Nur", 3);
		player3.login();
		System.out.println("count of player Zeynep " + Player.count);
		Player.showName();

		// !Note : we can call the static methods with name of Class directly
		System.out.println("static variable calling " + Player.count);
	}
}
