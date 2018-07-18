import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam {
	public static void main(String[] args) {
		String fileName = "file.txt";
		
		try(FileReader fin = new FileReader(fileName)) {
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}