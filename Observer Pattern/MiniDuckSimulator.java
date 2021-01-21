package duckyP;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		//Mallard Duck
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		
		//Model duck
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		model.display();

	}

}
