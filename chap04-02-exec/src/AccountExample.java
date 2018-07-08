// 다른 package 이면 import해줘야 함.
public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(-100); 
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(2000000); 
		System.out.println("현재 잔고: " + account.getBalance());

		account.setBalance(300000); 
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
