/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * FindEmployee.java
 *
 */

package mod4;

import java.sql.SQLException;

public class FindEmployee {
    public static void main(String args[]) {
    	
    	// DAOの変数の定義
    	EmployeeDAO dao = null;
    	
        if (args.length != 4) {
            System.out.println("Usage : java FindEmployee <server> <user> "
                    + "<password> <ID>");
            System.exit(1);
        }

        // DAOの生成
        dao = new EmployeeDAO(args[0], args[1], args[2]);

        try {        	
        	// DBへの接続
            dao.connect();
            //EMPLOYEEテーブルにIDをキーに検索
            Employee emp = dao.getEmployee(Integer.parseInt(args[3]));
            
            if (emp != null) {
                emp.print();
            } else {
                System.out.println("該当者が見つかりません。 id:" + args[3]);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
            	// 接続のクローズ
                dao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
