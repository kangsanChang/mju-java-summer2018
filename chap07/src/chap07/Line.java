package chap07;

public class Line extends GraphicObject {
	
	public Line(int x1,int y1,int x2,int y2) {
		super(x1, y1, x2, y2);
	}

	@Override
	void view() {
		System.out.printf("(%d, %d) ->(%d, %d)의 선\n",x1,y1,x2,y2);
	}
}
