package templatepattern;
import java.util.*;

public class StoreShoppingOrder extends ShoppingCenter {
	
	Scanner s = new Scanner(System.in);
	
	
	public void doSelect() {
		System.out.println("Selecting items ");
	}
	
	public void doPayment() {
		System.out.println("Processing... ");
	}
	
	public void doDelivery() {
		System.out.println("Thanks for shopping with us ");
	}
	
	public boolean giftWrap() {
		System.out.println("Would you like this to be gift wrapped? yyeses or no ");
		String choice = s.nextLine();
		if(choice.equals("yes"))
			return true;
		else if(choice.equals("no"))
			return false;
		return false;

	}
	

}
