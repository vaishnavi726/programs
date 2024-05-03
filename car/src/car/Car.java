package car;

public class Car {
	public int speed =5;
	public int distance =50;
	public void run(int speed, int distance) {
		int t = distance/speed;
		System.out.println("time taken by the car:" +t);
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.run(5,50);
	}

}
