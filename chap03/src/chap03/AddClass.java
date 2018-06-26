package chap03;

public class AddClass {
// 실행 시 param 주려면 run as 에서 run configuration 에서 넣어줌. 
// 없으면 run configuration 을 만들어 줘야 함.
	public static void main(String[] args) {
		int n, m;
		n = Integer.parseInt(args[0]); // 정수데이터에 대한 여러 기능을 모아놓은 class : Interger
		m = Integer.parseInt(args[1]);
		
		System.out.println(n+m);
		
	}

}
