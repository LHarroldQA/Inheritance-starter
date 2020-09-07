
public class HSBC extends Bank{
	
	public HSBC() {
		super();
		setName("HSBC");
	}
	
	public HSBC(String name, String country, float accountBalance) {
		super(name, country, accountBalance);
	}

	public void openAccount() {
		System.out.println("Open a "+ getName() + " account");
	}
	
	public void showBalance() {
		System.out.println("Your HSBC Balance is: £" + getAccountBalance());
	}
	
	@Override
	public String message() {
		return "Welcome to " + getName();
	}
}
