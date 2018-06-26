package chap02;

import java.util.Scanner;

// 이 file 안에 여러 class 가 있다면 public 이라는 접근권한은 main method를 가진 
// class 하나만 줄 수 있고, 이때 public 이 있는 class가 파일 이름이 되어야 함.

// cmd + shift + O 하면 자동으로 없는 모듈 import 해줌.
public class Exec01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // reference type. 2번 access 함.
		System.out.print("2자리 정수 입력 : >>");
		int input = scanner.nextInt();
		if((input/10) == (input%10))
			System.out.println("10의 자리와 1의 자리가 같다.");
	}

}
