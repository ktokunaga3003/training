/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * EmployeeDAO.java
 *
 */
package mod4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

    private Connection con;  // 接続オブジェクト
    private String server;   // DBサーバ名
    private String user;     // ユーザー名
    private String password; // パスワード

    // コンストラクタ
    public EmployeeDAO(String server, String user, String password) {
        this.server = server;
        this.user = user;
        this.password = password;
    }

    // 接続
    public void connect() throws SQLException {
        String url = "jdbc:mysql://" + server + ":3306/flm";
        con = DriverManager.getConnection(url, user, password);
            
    }

    // 接続のクローズ
    public void close() throws SQLException {
        if (con != null) {
            con.close();
            
        }
    }

    // 1件検索
    public Employee getEmployee(int id) throws SQLException {
        ResultSet res = null; // 結果セット
        PreparedStatement stmt = null;
        Employee emp = null;
        String sql = "select * from EMPLOYEE where ID=?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            res = stmt.executeQuery();
            
            if (res.next()) {
            	// Employeeオブジェクトの生成と値の設定
                emp = new Employee();
                emp.setId(res.getInt(1));
                emp.setName(res.getString(2));
                emp.setSection(res.getString(3));
                emp.setPhone(res.getString(4));
            }
            
        } finally {
            if (res != null) {
                res.close();
            }

            if (stmt != null) {
                stmt.close();
            }
            
        }
        return emp;
    }
}