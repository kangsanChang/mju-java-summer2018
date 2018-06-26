import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 10개 입력>> ");
		for(int i=0 ; i<10; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("입력된 짝수>> ");
		int sum=0;
		for(int i=0 ; i<10; i++) {
			if(arr[i]%2 == 0) {
				sum += arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("\n짝수의 합>> " + sum);
		scanner.close();
	}
}
