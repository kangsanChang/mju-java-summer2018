package chap07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PointManager {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		Random rd = new Random();
		int x, y;
		for(int i=0 ; i<10 ; i++) {
			x = rd.nextInt(101);
			y = rd.nextInt(101);
			list.add(new Point(x, y));
		}
		for(Point point: list) {
			System.out.println(point);
		}
		System.out.println("======================");
		Collections.sort(list);
		for(Point point : list) {
			System.out.println(point);
		}

	}

}
