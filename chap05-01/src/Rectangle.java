
public class Rectangle extends Shape {
	private int width, height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y); // 상위 클래스에 의뢰. 자기의 일은 스스로
		this.width = width;
		this.height = height;
	}
	public double area() {
		return width * height;
	}

	public void draw() {
		print();
		System.out.printf("너비: %d,높이: %d \n", width, height);
	}
}
