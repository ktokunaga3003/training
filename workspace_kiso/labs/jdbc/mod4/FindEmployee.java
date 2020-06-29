/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * FindEmployee.java
 *
 */

package mod4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindEmployee {
    public static void main(String args[]) {


   /* *******************************************************
    実習問題1の説明に従って、プログラムを記述してください。

    ＜JDBCプログラミング手順＞
    1．データベースへの接続
    2. ステートメントの作成
    3. SQL文の実行
    4．ResultSetの操作
    5．接続のクローズ
   ******************************************************** */

    	Connection con =null;
    	Statement stmt = null;
    	ResultSet res = null;

    	if (args.length != 4) {
    		System.out.println("Usage : FindEmployee <server> <user> <password> <ID>");
    		System.exit(1);
    	}

    	String url = "jdbc:mysql://" + args[0] + ":3306/flm";
    	String sql = "select ID,NAME,SECTION,PHONE from EMPLOYEE where ID="+args[3];

    	try {
    		// データベースへの接続
    		con = DriverManager.getConnection(url, args[1], args[2]);

    		// ステートメントの作成
    		stmt = con.createStatement();

    		// SQL分の実行
    		res = stmt.executeQuery(sql);

    		if(res .next()) {
    			System.out.println("検索結果    :  該当者が見つかりました。");
    			System.out.println("ID                :  "+res.getInt(1));
    			System.out.println("NAME         :  "+res.getString(2));
    			System.out.println("SECTION     :  "+res.getString(3));
    			System.out.println("PHONE        :  "+res.getString(4));
    		}else {
    			System.out.println("検索結果    :  該当者が見つかりません。 ID="+args[3]);
    		}
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}finally{
    		try {
    			// 結果セットのクローズ
    			if(res != null) {
    				res.close();
    			}

    			// ステートメントのクローズ
    			if(stmt != null) {
    				stmt.close();
    			}

    			// データベース接続のクローズ
    			if (con != null) {
    				con.close();
    			}
    		}catch(SQLException e) {
    			e.printStackTrace();
    		}
    	}
    }
}