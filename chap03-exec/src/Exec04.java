import java.util.Random;
import java.util.Arrays;
public class Exec04 {

	public static void main(String[] args) {
		int arr[][] = new int[5][10];
		Random rd = new Random();
		System.out.println("학생의 점수");
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = rd.nextInt(101);
			}
		}

		for(int i=0; i<5; i++) {
			Arrays.sort(arr[i]);
			System.out.print((i+1)+"반: ");
			for(int j=0; j<10; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("\n각 반의 최고 점수");
		for(int i=0 ; i<5 ; i++) {
			int max = 0;
			System.out.print((i+1)+"반:");
			for(int j=0 ; j<10 ; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
