package fourth;

public class ShopLauncher {

	public static void main(String[] args) {
		IShop shop = new MyShop();
		shop.setTitle("G market");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
