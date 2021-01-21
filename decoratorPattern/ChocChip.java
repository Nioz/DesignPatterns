package decoratorPattern;

public class ChocChip extends Toppings {
	
	public ChocChip(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getDescription() {
		return iceCream.getDescription() + ", Chocolate Chip";
	}
	
	public double cost() {
		return iceCream.cost() + 1.00;
	}
	

}
