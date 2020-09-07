
public class Runner {

	public static void main(String[] args) {
		HSBC h = new HSBC("HSBC","Hong Kong", -273.56f);
		Barclays b = new Barclays();
		System.out.println(h.message());
		h.openAccount();
		h.showBalance();
		System.out.println();
		System.out.println(b.message());
		b.openAccount();
		b.setAccountBalance(200.70f);
		b.showBalance();
	}
}
