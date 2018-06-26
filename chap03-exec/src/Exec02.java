import java.util.Scanner;
import java.util.Arrays;

public class Exec02 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 10개 입력>> ");
		for(int i=0 ; i<10; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("오름차순 정렬>> " + Arrays.toString(arr));
		scanner.close();
	}

}
