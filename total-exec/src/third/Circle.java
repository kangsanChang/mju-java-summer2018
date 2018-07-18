package third;

public class Circle extends Shape {
	private double radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return 3.14 * radius * radius;
	}

}
