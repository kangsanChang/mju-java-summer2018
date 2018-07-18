package fourth;

public class CellPhone extends Product {
	private String carrier;

	public CellPhone(String pName, int price, String carrier) {
		super(pName, price);
		this.carrier = carrier;
	}

	@Override
	public void printExtra() {
		System.out.print("통신사: " + carrier);
	}
	
}
