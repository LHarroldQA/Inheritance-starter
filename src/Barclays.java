
public class Barclays extends Bank{
	
	public Barclays() {
		super();
		setName("Barclays");
	}
	
	public Barclays(String name, String country, float accountBalance) {
		super(name, country, accountBalance);
	}

	public void openAccount() {
		System.out.println("Open a " + getName() + " account");
	}
	
	public void showBalance() {
		System.out.println("Your Barclays Balance is: £" + getAccountBalance());
	}
	
	@Override
	public String message() {
		return "Welcome to " + getName();
	}
}
