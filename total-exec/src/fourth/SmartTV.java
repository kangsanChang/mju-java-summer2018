package fourth;

public class SmartTV extends Product {
	private String resolution;

	public SmartTV(String pName, int price, String resolution) {
		super(pName, price);
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.print("해상도: "+ resolution);
	}
}
