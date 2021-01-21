package decoratorPattern;

public class WhippedCream extends Toppings {
	
	public WhippedCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getDescription() {
		return iceCream.getDescription() + ", Whipped Cream";
	}
	
	public double cost() {
		return iceCream.cost() + 0.00;
	}
}
