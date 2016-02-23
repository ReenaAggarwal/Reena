package clearentInteretestTest;

public class PersonId {
	
	public WalletId[] wallet;
	public double interest = 0.0;
	
	public PersonId()
	{
		
	}
	
	public PersonId(WalletId[] wallet) 
	{
		returnWallet(wallet);
		calculateInterest();
	}
	
	public void calculateInterest() 
	{
		for(int i = 0; i < wallet.length; i++)
			this.interest += wallet[i].findInterest();
	}

	public WalletId[] findWallet() 
	{
		return wallet;
	}

	public void returnWallet(WalletId[] wallet) 
	{
		this.wallet = wallet;
	}

	public double findInterest() 
	{
		return interest;
	}

	public void returnInterest(double interest) 
	{
		this.interest = interest;
	}

}

