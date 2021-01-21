package duckyP;

public abstract class Duck{
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("Alle Enten schwimmen, sogar Lockv�gel!");
	}
	
	public void display() {
		System.out.println("");
	}
	
	
	//Setter Methods
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}
