/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * UpdateEmployee.java
 *
 */

package mod4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEmployee {
	
    public static void main(String args[]) {
    	
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        if (args.length != 5) {
            System.out.println("Usage : UpdateEmployee <server> <user>"
                    + " <password> <ID> <SECTION>");
            System.exit(1);
        }

        String url = "jdbc:mysql://" + args[0] + ":3306/flm";
        String sql1 = "update EMPLOYEE set SECTION=? where ID=?";
        String sql2 = "select ID,NAME,SECTION,PHONE from EMPLOYEE";

        try {
        	
            // データベースへの接続
            con = DriverManager.getConnection(url, args[1], args[2]);

            // PreparedStatementの作成
            stmt = con.prepareStatement(sql1);

            // INパラメータの設定
            stmt.setString(1, args[4]);
            stmt.setInt(2, Integer.parseInt(args[3]));

            // SQL文の実行
            int count = stmt.executeUpdate();


            
            // 更新確認
            if (count == 1) {
                System.out.println("所属の更新が成功しました");

            } else {
                System.out.println("所属の更新ができませんでした。");
            }
            
            // 結果表示
            stmt = con.prepareStatement(sql2);
            res = stmt.executeQuery();
            System.out.println("Member----------------------------");
            
            while (res.next()) {
                System.out.print(res.getInt(1) + ",");
                System.out.print(res.getString(2) + ",");
                System.out.print(res.getString(3) + ",");
                System.out.print(res.getString(4));
                System.out.println();
            }
            System.out.println("-------------------------------End");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 結果セットのクローズ
                if (res != null) {
                    res.close();
                }

                // ステートメントのクローズ
                if (stmt != null) {
                    stmt.close();
                }

                // 接続のクローズ
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}