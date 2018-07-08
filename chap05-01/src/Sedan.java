
public class Sedan extends Car {
	private int seatNum;

	public Sedan(String color, int speed, int seatNum) {
		super(color, speed);
		this.seatNum = seatNum;
	}

	public int getSeatNum() {
		return seatNum;
	}
	
}
