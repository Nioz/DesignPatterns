package decoratorPattern;

public class Sprinkles extends Toppings {
	
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getDescription() {
		return iceCream.getDescription() + ", Sprinkles";
	}
	
	public double cost() {
		return iceCream.cost() + 0.50;
	}
}