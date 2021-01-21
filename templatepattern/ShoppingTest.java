package templatepattern;

public class ShoppingTest {
	public static void main(String[] args) {
	StoreShoppingOrder sShop1 = new StoreShoppingOrder();
	OnlineShoppingCenter oShop1 = new OnlineShoppingCenter();
	
	sShop1.processOrder();
	oShop1.processOrder();

	}
}
