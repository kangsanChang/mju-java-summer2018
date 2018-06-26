package chap02;
import java.util.Scanner;

// indentation 할 경우 전체선택 후 correct indentation 눌러주면 됨

public class Exec02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학점을 입력하시오 >> : ");

		String grade = scanner.next(); // 공백을 포함한 문자열일 경우 nextline 사용

		switch(grade) {
		case "A": case "B":
			System.out.println("Excellent"); // A 또는 B 인 경우 출력
			break;
		case "C": case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;
		default:
			System.out.println("잘못된 입력");
		}
		scanner.close();
	}
}
