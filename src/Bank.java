
abstract public class Bank {
	private String name,country;
	private float accountBalance;
	
	public Bank() {
		super();
		this.name = "Bank";
	}

	public Bank(String name, String country, float accountBalance) {
		super();
		this.name = name;
		this.country = country;
		this.accountBalance = accountBalance;
	}
	
	abstract public void openAccount();
	abstract void showBalance();
	
	public String message() {
		return "Welcome to Bank";
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public float getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", country=" + country + ", accountBalance=" + accountBalance + "]";
	}
} 