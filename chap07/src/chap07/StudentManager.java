package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		HashMap<String,Student> stuMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String name, dept, stuNo;
		Student stu;
		System.out.println("학생 5명의 정보 입력 >>");
		for(int i = 0 ; i<5 ; i++) {
			System.out.print((i+1) + "번째 학생의 이름: ");
			name = sc.next();
			System.out.print((i+1) + "번째 학생의 학과: ");
			dept = sc.next();
			System.out.print((i+1) + "번째 학생의 학번: ");
			stuNo = sc.next();
			stu = new Student(name, dept, stuNo);
			stuMap.put(stuNo, stu);
		}
		
		while(true) {
			System.out.print("학생을 검색하려면 학번을, 종료하려면 q를 입력하세요:");
			stuNo = sc.next();
			if(stuNo.equals("q")) {
				System.out.println("종료");
				System.exit(0);
			}
			stu = stuMap.get(stuNo);
			if(stu!=null)
				System.out.println(stu);
			else
				System.out.println("해당하는 학생이 없음");
		}
	}
	
}
