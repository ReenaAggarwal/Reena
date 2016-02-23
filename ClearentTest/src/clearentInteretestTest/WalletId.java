package clearentInteretestTest;

public class WalletId {

	public CreditCardType[] creditCard;
	public double interest=0.0;
	
	public WalletId()
	{
		
	}
	
	public WalletId(CreditCardType[] creditCard) {
		returnCards(creditCard);
		calculateInterest();
	}
	
	public void calculateInterest()
	{
		for (int i=0; i<creditCard.length; i++)
		{
			this.interest += creditCard[i].findInterest();
		}
	}
	
	public double findInterest()
	{
		return interest;
	}
	
	public void returnInterest(double interest) {
		this.interest = interest;
	}

	public CreditCardType[] findCards() {
		return creditCard;
	}

	public void returnCards(CreditCardType[] creditCard) {
		this.creditCard = creditCard;
	}
}

