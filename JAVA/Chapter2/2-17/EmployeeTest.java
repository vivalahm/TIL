package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLee =new Employee();
		employeeLee.setEmployeeName("�̼���");
		
//		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim =new Employee();
		employeeKim.setEmployeeName("������");
		
		System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());
//		employeeKim.serialNum ++;
//		System.out.println(employeeLee.serialNum);// �ΰ��� �ν��Ͻ��� �ϳ��� �޸𸮸� �����Ѵ�.
//		System.out.println(employeeKim.serialNum);
		//System.out.println(Employee.serialNum);//static ������ �޼���� �ν��Ͻ� ������ �޼��갡 �ƴϹǷ� Ŭ���� �̸����� ���� �����Ѵ�.
		System.out.println(Employee.getSerialNum());
		
	}

}
