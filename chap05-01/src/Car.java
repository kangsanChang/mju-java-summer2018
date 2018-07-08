
public class Car {
	private String color;
	private int speed;
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void upSpeed(int value) {
		speed += value;
	}
	
	public void downSpeed(int value) {
		if(speed >= value) {
			speed -= value;
		} else {
			speed = 0;
		}
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}
	
}
