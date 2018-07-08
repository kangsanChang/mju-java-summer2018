
public class Account {
	// member 변수에만 접근제한자 사용 가능. method 내부에서의 지역변수는 불가능
	private int balance;
	public static final int MIN_BALANCE = 0; // final 이면 무조건 선언과 동시에 초기화(당연) 
	public static final int MAX_BALANCE = 1_000_000; // java7 부터 underscore 로 자릿수 구분 용도로 사용가능
	
	public int getBalance() {
		return balance; // 자바는 무조건 call by value. 리턴값도 복사해서 줌.
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
			this.balance = balance;
	}
	
}
