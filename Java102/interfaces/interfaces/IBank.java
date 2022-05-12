package interfaces;

public interface IBank { // template of Banks

	final String hostIpAddress = "127.0.0.1";

	boolean connect(String ipAddress);

	boolean payment(double price, String cardNumber, String expiredDate, String cvc);
}
