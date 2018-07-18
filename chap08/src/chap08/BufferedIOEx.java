package chap08;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {
	public static void main(String[] args) {
		int c;
		try(FileReader fin = new FileReader("test.txt");
				BufferedOutputStream out = new BufferedOutputStream(System.out, 5)){
			// 한글자씩 읽어서 buffer 에 쌓고, 5칸이 다 차면 쓰기 실행함.
			// 마지막에 다 안찼는데 남은것들 뽑아주려면 out.flush() 해주면 됨
			while((c = fin.read()) != -1 ) {
				// -1 은 EOF 를 의미.
				out.write(c);
			}
			new Scanner(System.in).nextLine(); // Enter Key 입력
			out.flush();
		} catch (IOException e) {
			e.printStackTrace(); // 예외발생 시 어디서 예외가 발생했지 java 가 msg 보여줌.
		}
	}
}
