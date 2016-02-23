package clearentInteretestTest;

import org.testng.annotations.Test;


public class Test1 {

	public CreditCardType[] creditCard = {new VisaCard(100), new MasterCard(100), new DiscoverCard(100)};
	public WalletId[] wid = {new WalletId(creditCard)};
	public PersonId pid = new PersonId(wid);
	
	@Test(priority=1)
	public void totalInterest() 
	{
		System.out.println("Test 1");
		Double actual = pid.findInterest();
		double expected = 16.0;
		if (actual.equals(expected))
		{
			System.out.println("Total Interest for the person: " + actual);
		}
	}
	
	@Test(priority=2)
	public void visaInterest()
	{
		Double actual = creditCard[0].findInterest();
		double expected = 10.0;
		if (actual.equals(expected))
		{
			System.out.println("Interest for Visa Card: " + actual);
		}
	}
	
	@Test(priority=3)
	public void masterCardInterest()
	{
		Double actual = creditCard[1].findInterest();
		double expected = 5.0;
		if (actual.equals(expected))
		{
			System.out.println("Interest for MasterCard: " + actual);
		}
	}
	
	@Test(priority=4)
	public void discoverInterest()
	{
		Double actual = creditCard[2].findInterest();
		double expected = 1.0;
		if (actual.equals(expected))
		{
			System.out.println("Interest for Discover Card: " + actual);
		}
	}
}