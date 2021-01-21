package decoratorPattern;

public class CSyrup extends Toppings {
	
	public CSyrup(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String getDescription() {
		return iceCream.getDescription() + ", Chocolate Syrup";
	}
	
	public double cost() {
		return iceCream.cost() + 0.33;
	}
	

}
