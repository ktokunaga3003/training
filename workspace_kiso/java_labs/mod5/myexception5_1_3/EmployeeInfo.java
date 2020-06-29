package myexception5_1_3;

public class EmployeeInfo {
	
	private String name;
	private int age;
	private int salary;
	
	public EmployeeInfo(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void displayInfo() throws MyException {
		
		if(age < 0 || salary < 0) {
			throw new MyException("年齢、または給料にマイナスの値が入力されました");
		}
		
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
		System.out.println("給料："+salary);
		
	}

}
