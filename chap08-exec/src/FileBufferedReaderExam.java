import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileBufferedReaderExam {

	public static void main(String[] args) {
		String fileName = "file.txt";
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))){
			int c;
			while(bis.available() > 0) {
				c = bis.read();
				System.out.print((char)c);
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
