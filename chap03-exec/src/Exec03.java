import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String eng[] = {"student", "love", "java", "happy", "future"};
		String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
		while(true) {
			System.out.print("영어 단어를 입력하세요>> ");
			String word = scanner.next();
			if(word.equals("exit"))
				break;
			for(int i=0 ; i<5 ; i++) {
				if(word.equals(eng[i])) {
					System.out.println(kor[i]);
					break;
				}
				if(i==4) {
					System.out.println("그런 영어 단어가 없습니다.");
				}
			}
		}
		scanner.close();
	}
}
