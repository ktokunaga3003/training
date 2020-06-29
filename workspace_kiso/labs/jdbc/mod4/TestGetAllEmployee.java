/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * TestGetAllEmployee.java
 *
 */

package mod4;

import java.sql.SQLException;
import java.util.ArrayList;

public class TestGetAllEmployee {
	public static void main(String args[]) {

		if (args.length != 3) {
			System.out
					.println("Usage : TestGetAllEmployee <server> <user> <password>");
			System.exit(1);
		}

		EmployeeDAO dao = new EmployeeDAO(args[0], args[1], args[2]);

		try {

			dao.connect();
			ArrayList<Employee> list = dao.getAllEmployee();
			for (Employee emp : list) {
				emp.print();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				dao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
