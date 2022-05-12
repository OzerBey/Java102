package interfaces;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter card no");
		String cardNo = scan.nextLine();

		System.out.println("Enter a price");
		double price = scan.nextDouble();
		scan.nextLine();

		System.out.println("Enter expired Date");
		String expiredDate = scan.nextLine();

		System.out.println("Enter a security no");
		String cvc = scan.nextLine();

		System.out.println("1. A Bank\n 2. B Bank \n 3. C Bank Select your bank");
		int choose = scan.nextInt();
		switch (choose) {
		case 1:
			ABank aPos = new ABank("A-Bank", "15.05.2022", "thisisapassword");
			aPos.connect("127.0.0.1");
			aPos.payment(1600.30, "22549865495", "15.05.2022", "255");
			break;
		case 2:
			BBank bPos = new BBank("B-Bank", "16.05.2022", "thisisapassword");
			bPos.connect("127.0.0.1");
			break;
		case 3:
			ABank cPos = new ABank("C-Bank", "17.05.2022", "thisisapassword");
			break;
		default:
			System.out.println("Enter a valid bank");
			break;
		}
	}
}
