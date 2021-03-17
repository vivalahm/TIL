package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		Bus bus1 = new Bus(100);
		Subway subway1 = new Subway(1);
	
		james.takeBus(bus1);
		
		
		bus1.showInfo();
		james.showInfo();
		

		tomas.takeSubway(subway1);
		
		
		subway1.showInfo();
		tomas.showInfo();

	}

}
