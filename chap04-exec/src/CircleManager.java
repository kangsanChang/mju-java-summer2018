import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("("+x+", "+y+")"+radius);
	}
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3]; //3개의 Circle 배열 선언
		
		for(int i = 0; i < 3; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(Circle circle : c)
			circle.show();
	sc.close();
	}

}
