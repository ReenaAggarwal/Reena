package clearentInteretestTest;

import org.testng.annotations.Test;

public class Test2 {

	public CreditCardType[] creditCardWallet1 = {new VisaCard(100), new DiscoverCard(100)};
	public CreditCardType[] creditCardWallet2 = {new MasterCard(100)};
	public WalletId[] wid = {new WalletId(creditCardWallet1), new WalletId(creditCardWallet2)};
	public PersonId pid = new PersonId(wid);
	
	@Test(priority=1)
	public void totalInterest() 
	{
		System.out.println("Test 2");
		Double actual = pid.findInterest();
		double expected = 16.0;
		if (actual.equals(expected))
		{
			System.out.println("Total Interest for the person: " + actual);
		}
	}
	
	@Test(priority=2)
	public void interestWallet1()
	{
		Double actual = wid[0].findInterest();
		double expected = 11.0;
		if (actual.equals(expected))
		{
			System.out.println("Interest for Wallet 1: " + actual);
		}
	}
	
	@Test(priority=3)
	public void interestWallet2()
	{
		Double actual = wid[1].findInterest();
		double expected = 5.0;
		if (actual.equals(expected))
		{
			System.out.println("Interest for Wallet 2: " + actual);
		}
	}
	
}
