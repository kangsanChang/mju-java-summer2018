package second;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
		int clone[][];
		
		System.out.println("배열의 출력=================");
		printArr(arr);
		
		System.out.println("배열의 복제=================");
		clone = cloneArr(arr);
		
		if(clone != null && arr != clone) {
			System.out.println("복제한 배열의 출력 ===========");
			printArr(clone);
		}
	}
	
	public static void printArr(int[][] arr){
		for(int[] row : arr) {
			for(int elem : row) {
				System.out.printf("%3d", elem);
			}
			System.out.println();
		}
	}
	
	public static int[][] cloneArr(int[][] arr) {
		int[][] clone = new int [arr.length][];
		for(int i=0 ; i < arr.length ; i++) {
			clone[i] = new int[arr[i].length];
			for(int j=0 ; j < arr[i].length ; j++) {
				clone[i][j] = arr[i][j];
			}
		}
		return clone;
	}

}
