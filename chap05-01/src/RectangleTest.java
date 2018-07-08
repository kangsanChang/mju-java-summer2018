
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 3, 10, 20);
		Rectangle rect2 = new Rectangle(8, 9, 10, 20);
		
		rect1.draw();
		System.out.println("도형의 면적: " + rect1.area());
		
		rect2.draw();
		System.out.println("도형의 면적: " + rect2.area());
	}

}
