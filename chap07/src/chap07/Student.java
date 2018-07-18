package chap07;

public class Student {
	private String name;
	private String department;
	private String stuNo;

	public Student(String name, String department, String stuNo) {
		this.name = name;
		this.department = department;
		this.stuNo = stuNo;
	}
	@Override
	public String toString() {
		return "Student [이름=" + name + ", 학과=" + department + ", 학번=" + stuNo + "]";
	}
	
}
