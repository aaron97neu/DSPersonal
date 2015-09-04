/**
 * 
 */

/**
 * @author 16neusta
 *
 */
public class CashPayment extends Payment{

	public CashPayment(double amount) {
		super(amount);
	}
	
	public void paymentDetails(){
		System.out.println("The cash payment amount is $"+super.getPaymentAmount());
	} 
}
