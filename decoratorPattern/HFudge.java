package decoratorPattern;

public class HFudge extends Toppings {
	
	public HFudge(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getDescription() {
		return iceCream.getDescription() + ", Hot Fudge";
	}
	
	public double cost() {
		return iceCream.cost() + 0.50;
	}
	

}
