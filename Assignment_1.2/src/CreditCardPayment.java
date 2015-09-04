/**
 * 
 */

/**
 * @author 16neusta
 *
 */
public class CreditCardPayment extends Payment{
	String name;
	String expirationDate;
	String ccNumber;
	
	public CreditCardPayment(double amount, String n, String ex, String ccnum) {
		super(amount);
		name = n;
		expirationDate = ex;
		ccNumber = ccnum;
	}
	
	public void paymentDetails(){
		System.out.println("The credit card payment amount is $"+super.getPaymentAmount()+
		"\nThe name on the card is "+name+
		"\nThe expiration date is "+expirationDate+
		"\nThe credit card number is "+ccNumber); 
	}

}
