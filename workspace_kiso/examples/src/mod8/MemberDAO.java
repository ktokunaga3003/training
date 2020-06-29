/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * MemberDAO.java
 *
 */
package mod8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

    private Connection con;  //接続オブジェクト
    private String server;   //DBサーバ名
    private String user;     //ユーザー名
    private String password; //パスワード

    //コンストラクタ
    public MemberDAO(String server, String user, String password) {
    	
        this.server = server;
        this.user = user;
        this.password = password;
        
    }

    //接続
    public void connect() throws SQLException {
    	
        String url = "jdbc:mysql://" + server + ":3306/flm";
        con = DriverManager.getConnection(url, user, password);

    }

    //接続のクローズ
    public void close() throws SQLException {
    	
        if (con != null) {
            con.close();
        }
        
    }

    
    //1件検索
    public Member getMember(int id) throws SQLException {
    	
        ResultSet res = null; //結果セット
        PreparedStatement stmt = null;
        Member member = null;
        String sql = "select ID ,NAME ,PASSWORD from MEMBER where ID=?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            res = stmt.executeQuery();
            if (res.next()) {
                member = new Member();
                member.setId(res.getInt(1));
                member.setName(res.getString(2));
                member.setPassword(res.getString(3));
            }
            
        } finally {
            if (res != null) {
                res.close();
            }

            if (stmt != null) {
                stmt.close();
            }
        }
        return member;
        
    }
}