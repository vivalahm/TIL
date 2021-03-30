package ch19;

public class Car {
	static int carNum = 10001;
	int carID;
	
	public Car() {
		carNum++;
		carID=carNum;
	}
	
	public int getCarNum() {
		return carID;
	}

}
