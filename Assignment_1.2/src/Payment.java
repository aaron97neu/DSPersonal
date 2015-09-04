/**
 * 
 */

/**
 * @author 16neusta
 *
 */
public class Payment {
	//instance vars
	Double paymentAmount;
	
	public Payment(double amount){
		paymentAmount = amount;
	}
	
	/**
	 * 
	 */
	public void paymentDetails(){
		System.out.println("The payment amount is $"+paymentAmount);
	}

	/**
	 * @return the paymentAmount
	 */
	public Double getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * @param paymentAmount the paymentAmount to set
	 */
	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	
	public boolean equals(Object comp){
		if(comp.getClass().equals(getClass())){
			if(Math.abs(((Payment) comp).getPaymentAmount()-paymentAmount)<.01){
				return true;
			}
		}
		return false;
	}
}
