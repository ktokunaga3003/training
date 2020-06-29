package management4_1_1;

public class Manager extends Employee {
	
	private int staff;
	
	public Manager(int staff) {
		
		this.staff = staff;
		
	}
	
	void display() {
		System.out.println("STAFF  ："+staff);
	}

}
