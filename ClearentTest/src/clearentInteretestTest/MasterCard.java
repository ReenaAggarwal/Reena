package clearentInteretestTest;

public class MasterCard implements CreditCardType{
	
	private double interestRate = 0.05;
	public double balance;
	public double interest;
	
	public MasterCard(double balance)
	{
		returnBalance(balance);
		returnInterest();
	}
	
	public void returnInterest() 
	{
		this.interest = balance * interestRate;
	}
	
	@Override
	public double findInterest() 
	{
		return interest;
	}
	public void returnBalance(double balance) 
	{
		this.balance = balance;
	}

	@Override
	public double findBalance()
	{
		return balance;
	}

}
