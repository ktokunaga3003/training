/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * UseTransaction.java
 *
 */

package mod4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UseTransaction {
    public static void main(String args[]) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        if (args.length != 8) {
            System.out.println("Usage : java UseTransaction <server> <user> "
                    + "<password> <ID> <NAME> <SECTION> <PHONE> <MODE>");
            System.exit(1);
        }

        String url = "jdbc:mysql://" + args[0] + ":3306/flm";
        String sql1 = "select ID, NAME, SECTION, PHONE from EMPLOYEE where ID=?";
        String sql2 = "update EMPLOYEE set NAME=?, SECTION=?, PHONE=? where ID=?";
        
        try {

            // データベースへの接続
            con = DriverManager.getConnection(url, args[1], args[2]);

            // 自動コミットモードの解除
            con.setAutoCommit(false);

            // PreparedStatementの作成
            stmt = con.prepareStatement(sql1);

            // INパラメータの設定
            stmt.setInt(1, Integer.parseInt(args[3]));

            // 変更前の情報を獲得
            res = stmt.executeQuery();
            System.out.println("【初期データ】");
            

            // 変更前の情報を表示
            if (res.next()) {
                System.out.println("ID      : " + res.getInt(1));
                System.out.println("NAME    : " + res.getString(2));
                System.out.println("SECTION : " + res.getString(3));
                System.out.println("PHONE   : " + res.getString(4));
                
            } else {
                System.out.println("更新対象の従業員が存在しません。");
            }

            System.out.println();

            // UPDATE文の実行
            stmt = con.prepareStatement(sql2);
            stmt.setString(1, args[4]);
            stmt.setString(2, args[5]);
            stmt.setString(3, args[6]);
            stmt.setInt(4, Integer.parseInt(args[3]));
            int count = stmt.executeUpdate(); // 名前の変更

            if ((count == 1) && args[7].equals("1")) {
                // コミット
                con.commit();
                System.out.println("レコードの更新を確定しました。");
                System.out.println();
                
            } else {
                // ロールバック
                con.rollback();
                System.out.println("レコードの更新を取り消しました。");
                System.out.println();
                
            }

            // 最終的なデータを表示
            System.out.println("【最終データ】");

            stmt = con.prepareStatement(sql1);
            stmt.setInt(1, Integer.parseInt(args[3]));
            res = stmt.executeQuery();
            
            if (res.next()) {
                System.out.println("ID      : " + res.getInt(1));
                System.out.println("NAME    : " + res.getString(2));
                System.out.println("SECTION : " + res.getString(3));
                System.out.println("PHONE   : " + res.getString(4));
            }

            
        } catch (SQLException e) {
            System.out.println("システムエラーが発生しました。");
            try {
                if (con != null) {
                    // ロールバック
                    con.rollback();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            System.out.println();
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