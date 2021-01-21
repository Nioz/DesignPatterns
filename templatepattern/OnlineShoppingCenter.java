package templatepattern;

public class OnlineShoppingCenter extends ShoppingCenter{
	
	public void doSelect() {
		System.out.println("Selecting Items ");
	}
	
	public void doPayment() {
		System.out.println("Processing... ");
	}
	
	public void doDelivery() {
		System.out.println("Please Provide Address... ");
	}

}
