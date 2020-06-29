/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * FindAllEmployee.java
 *
 */

package mod4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindAllEmployee {
    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        ResultSet res = null;

        if (args.length != 3) {
            System.out.println("Usage : FindAllEmployee "
                    + "<server> <user> <password>");
            System.exit(1);
        }
        String url = "jdbc:mysql://" + args[0] + ":3306/flm";
        String sql = "select ID,NAME,SECTION,PHONE from EMPLOYEE";

        try {
            // データベースへの接続
            con = DriverManager.getConnection(url, args[1], args[2]);

            // ステートメントの作成
            stmt = con.createStatement();

            // SQL文の実行
            res = stmt.executeQuery(sql);

            System.out.println("All Member------------------------");

            // 結果セットから情報を取り出す
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