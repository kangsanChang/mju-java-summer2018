
public class Rectangle {
	int x, y, width, height;
	
	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	public void set(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Rectangle r) {
		if(width == r.width && height == r.height) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Rectangle rects[] = new Rectangle[3];
		
		rects[0] = new Rectangle(1, 1, 5, 6);
		rects[1] = new Rectangle(2, 3, 5, 6);
		rects[2] = new Rectangle();
		
		for(Rectangle rect : rects) {
			System.out.println(rect);
		}
		
		if(rects[0].equals(rects[1])) {
			System.out.println("첫번쨰와 두번째는 같은 사각형입니다.");
		}
	}

}
