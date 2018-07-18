package first;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하시오>>");
		int input = sc.nextInt();
		if (input <= 0) {
			System.out.println("0 보다 커야 합니다.");
			sc.close();
			return;
		}
		for(int i=input; i>0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				if(j==i-1) {
					System.out.println("X");
				}else {
					System.out.print("O");
				}
			}
		}
		sc.close();
	}
}
