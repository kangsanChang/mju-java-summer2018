
public interface Shape {
	double PI = 3.14; // final 생략해도 됨
	
	void draw(); // public 하고 abstract생략해도 됨
	double getArea();
	
	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();
	}
	
}
