package third;

import java.util.ArrayList;

public class ShapesManager {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		double sum = 0;
		shapes.add(new Circle(5));
		shapes.add(new Circle(10));
		shapes.add(new Circle(15));
		shapes.add(new Rect(5,5));
		shapes.add(new Rect(10,10));
		shapes.add(new Rect(15,15));
		for(Shape shape : shapes) {
			sum += shape.calcArea();
		}
		System.out.println("면적의 합: " + sum);
	}

}
