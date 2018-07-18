package chap07;

public class Rect extends GraphicObject {
	private int width, height;
	
	public Rect(int x1,int y1,int x2,int y2) {
		super(x1, y1, x2, y2);
	}
	
	@Override
	void view() {
		calcWidthHeight();
		System.out.printf("(%d, %d) ->(%d, %d), %d X %d의 사각형\n",x1,y1,x2,y2,width,height);
	}
	
	private void calcWidthHeight() {
		width = Math.abs(x1 - x2);
		height = Math.abs(y1 - y2);
	}
}
