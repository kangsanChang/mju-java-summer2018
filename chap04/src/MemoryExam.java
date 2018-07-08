
public class MemoryExam {
	int x;
	
	int f(int y) {
		int z = 0;
		return x+y+z;
	}
	public static void main(String[] args) {
		MemoryExam obj = new MemoryExam();
		int n = obj.f(5);
		System.out.println(n);
	}

}
