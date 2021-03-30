package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee =new Employee();
		employeeLee.setEmployeeName("이순신");
		
//		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim =new Employee();
		employeeKim.setEmployeeName("김정은");
		
		System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());
//		employeeKim.serialNum ++;
//		System.out.println(employeeLee.serialNum);// 두개의 인스턴스가 하나의 메모리를 공유한다.
//		System.out.println(employeeKim.serialNum);
		//System.out.println(Employee.serialNum);//static 변수와 메서드는 인스턴스 변수나 메서브가 아니므로 클래스 이름으로 직접 참조한다.
		System.out.println(Employee.getSerialNum());
		
	}

}
