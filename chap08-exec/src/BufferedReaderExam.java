import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExam {

	public static void main(String[] args) {
		String fileName = "file.txt";
		// readLine() 사용 시 줄단위 출력함
		try(BufferedReader in = new BufferedReader(new FileReader(fileName))){
			// 원래 파일리더는 한번만 읽고 왔다 갔다 하게 되는데 buffer 사용 시 여러개를 담았다가 줌
			String str;
			while((str=in.readLine()) != null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}	
	}
}
