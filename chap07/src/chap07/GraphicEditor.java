package chap07;

import java.util.ArrayList;

public class GraphicEditor {
	ArrayList<GraphicObject> shapes = new ArrayList<>();
	void add(GraphicObject ob) {
		shapes.add(ob);
	}
	void draw() {
		for(GraphicObject ob : shapes) {
			ob.view();
		}
	}
	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.add(new Rect(2,2,4,4));
		g.add(new Line(3,3,8,8));
		g.add(new Rect(4,6,0,0));
		g.add(new Line(2,5,6,6));
		g.draw();
	}

}
