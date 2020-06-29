/**
 * jp.co.flm.employee.dao.ConnectionManager
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * データベース接続を管理するクラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
public class ConnectionManager {
	/** データベース接続URL */
	private static final String URL = "jdbc:mysql://localhost:3306/sample";
	/** ユーザー名 */
	private static final String USER = "mysql";
	/** パスワード */
	private static final String PASSWORD = "mysql";

	/**
	 * データベース接続を取得する。
	 * @return データベース接続
	 * @throws SQLException
	 */
	public static synchronized Connection getConnection() throws SQLException {
		Connection con = null;
		try{
		    con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch(SQLException e){
			e.printStackTrace();
			throw e;
		}
		return con;
	}
}
