package decoratorPattern;

public class Chocolate extends IceCream {
	
	public Chocolate() {
		description = ("Straight from brown cows it's chocolate!");
	}
	
	public double cost() {
		return 3.00;
	}
	
}
