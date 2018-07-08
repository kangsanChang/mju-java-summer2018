
public class Shape {
	private int x, y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	} // 이렇게 만들어 두면, default 생성자 Shape() 는 생기지 않음. 상속받을 시 super 를 명시해 주어야 함.

	public void print() {
		System.out.printf("(%d, %d)", x, y); // C의 printf 와 동일함. 이렇게 쓰는 이유는 "("+ ... +")" 하기 귀찮으니까
	}
	
}
