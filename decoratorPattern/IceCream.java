package decoratorPattern;

public abstract class IceCream {
	
	String description = "no toppings...";
	
	public abstract double cost();
	
	public String getDescription() {
		return description;
	}
	

}
