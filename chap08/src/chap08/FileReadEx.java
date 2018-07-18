package chap08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadEx {
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("hangul.txt"); // file을 직접 읽음.
				InputStreamReader in = new InputStreamReader(fin,"UTF-8"); // 2byte 씩 읽어서 해당 인코딩으로 해석
				){
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c); // integer unicode 를 char 로 변경
			}
		}catch(IOException e) {
			System.out.println("입출력 오류");
			System.out.println(e);
		}
	}
}
