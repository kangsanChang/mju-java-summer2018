import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3 이상 짝수 입력 부탁 >>");
		int input = sc.nextInt();
		System.out.println(input + " 입력 ");
		if(input <= 3 || input%2 != 0 ) {
			System.out.print("3이상 아니거나 짝수아님 ㅅㄱ");
			sc.close();
			return;
		}
		StringTokenizer st = new StringTokenizer("wel,fnwpe,nfw,enfwe,fw,ww,33", ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		int[][] arr = new int[input][input];
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				if(j <= i) {
					arr[i][j] = j+1;
				}else {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int[] row : arr) {
			for(int col : row) {
				System.out.print(col);
			}
			System.out.println();
		}
		sc.close();
	}

}
