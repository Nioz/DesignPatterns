package decoratorPattern;

public class Vanilla extends IceCream {
	
	public Vanilla() {
		description = "Plain Jane ordered Vanilla";
	}
	
	public double cost() {
		return 2.50;
	}

}
