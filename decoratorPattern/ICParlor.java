package decoratorPattern;

public class ICParlor {
	
	public static void main(String args[]) {
		IceCream iceCream = new Vanilla();
		System.out.println(iceCream.getDescription() + " $" + iceCream.cost());
	
		IceCream iceCream2 = new Chocolate();
		iceCream2 = new WhippedCream(iceCream2);
		iceCream2 = new HFudge(iceCream2);
		iceCream2 = new CSyrup(iceCream2);
		iceCream2 = new ChocChip(iceCream2);
		iceCream2 = new Sprinkles(iceCream2);
		System.out.println(iceCream2.getDescription() + " $" + iceCream2.cost());
		
	}

}
