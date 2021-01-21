package templatepattern;

public abstract class ShoppingCenter {
	public abstract void doSelect();
	public abstract void doPayment();
	public abstract void doDelivery();
	
	public final void doPack() {
		if(giftWrap()) {
			System.out.println("Do Gift Wrap");
		}
		System.out.println("Pack");
	}
	
	public final void processOrder() {
		doSelect();
		doPayment();
		doPack();
		doDelivery();
	}
	
	//Hook method
	
	public boolean giftWrap() {
		return false;
	}

}
