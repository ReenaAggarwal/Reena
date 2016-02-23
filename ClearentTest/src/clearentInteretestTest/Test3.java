package clearentInteretestTest;

import org.testng.annotations.Test;

public class Test3 {

	public CreditCardType[] creditCardPerson1 = {new VisaCard(100), new MasterCard(100)};
	public CreditCardType[] creditCardPerson2 = {new VisaCard(100), new MasterCard(100)};
	public WalletId[] wallet1Person1 = {new WalletId(creditCardPerson1)};
	public WalletId[] wallet1Person2 = {new WalletId(creditCardPerson2)};
	public PersonId pid1 = new PersonId(wallet1Person1);
	public PersonId pid2 = new PersonId(wallet1Person2);
	
	@Test(priority=1)
	public void totalInterestP1() 
	{
		System.out.println("Test 3");
		Double actual = pid1.findInterest();
		double expected = 15.0;
		if (actual.equals(expected))
		{
			System.out.println("Total Interest for person 1: " + actual);
		}
	}
	
	@Test(priority=2)
	public void totalInterestP2()
	{
		Double actual = pid2.findInterest();
		double expected = 15.0;
		if (actual.equals(expected))
		{
			System.out.println("Total interest for person 2: " + actual);
		}
	}
	
	@Test(priority=3)
	public void totalInterestP1W1()
	{
		Double actual = wallet1Person1[0].findInterest();
		double expected = 15.0;
		if (actual.equals(expected))
		{
			System.out.println("Total interest for person 1 for wallet 1: " + actual);
		}
	}
	
	@Test(priority=4)
	public void totalInterestP2W1()
	{
		Double actual = wallet1Person2[0].findInterest();
		double expected = 15.0;
		if (actual.equals(expected))
		{
			System.out.println("Total interest for person 2 for wallet 1: " + actual);
		}
	}
}
