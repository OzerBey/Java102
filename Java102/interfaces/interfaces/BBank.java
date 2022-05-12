package interfaces;

public class BBank implements IBank {
	private String nameOfBank;
	private String terminalId;
	private String password;

	public BBank(String nameOfBank, String terminalId, String password) {
		super();
		this.nameOfBank = nameOfBank;
		this.terminalId = terminalId;
		this.password = password;
	}

	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String nameOfBank) {
		this.nameOfBank = nameOfBank;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean connect(String ipAddress) {
		System.out.println("ip of user is " + ipAddress);
		System.out.println("ip of machine is " + this.hostIpAddress);
		System.out.println(this.nameOfBank + " connected");
		return true;
	}

	@Override
	public boolean payment(double price, String cardNumber, String expiredDate, String cvc) {
		System.err.println("Waiting answer from " + this.getNameOfBank());
		System.out.println("Process is success");
		return true;
	}

}
