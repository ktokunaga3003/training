/**
 * jp.co.flm.market.dao.OrdersDAO
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */
package jp.co.flm.market.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.co.flm.market.entity.Orders;
import jp.co.flm.market.entity.Product;

/**
 * Ordersテーブルを利用するDAOクラスです。
 * @author FLM
 * @version 1.0 YYYY/MM/DD
 */
public class OrdersDAO {

	/** コネクション */
	private Connection con;

	/**
	 * コンストラクタ
	 * @param con コネクション
	 */
	public OrdersDAO(Connection con) {
		this.con = con;
	}

	/**
	 *  商品購入情報を検索する
	 *  @param memberid 会員ID
	 *  @param return 商品購入情報
	 *  @param SQLException SQL例外
	 */
	public ArrayList<Orders> getOrderList(String memberid) throws SQLException{

		// 戻り値の準備
		ArrayList<Orders> orderList = new ArrayList<>();

		// SQL文の準備
		String sql = "SELECT orderid, memberid, orderdate, product.productid, productname, quantity, orders.price, orders.point, " +
				"quantity*orders.price AS subtotal, quantity*orders.point AS subtotalpoint " +
				"FROM orders INNER JOIN product ON orders.productid=product.productid " +
				"WHERE memberid=? ORDER BY orderid DESC";
		PreparedStatement stmt = null;
		ResultSet res = null;

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, memberid);

			// SQL文を実行する。
			res = stmt.executeQuery();

			while(res.next()) {
				//商品購入情報を取得
				Orders orders = new Orders();
				orders.setProduct(new Product());
				orders.setOrderId(res.getInt("orderid"));
				orders.setMemberId(res.getString("memberid"));
				orders.setOrderDate(res.getString("orderdate").substring(0,10));
				orders.getProduct().setProductId(res.getString("productid"));
				orders.getProduct().setProductName(res.getString("productname"));
				orders.setQuantity(res.getInt("quantity"));
				orders.getProduct().setPrice(res.getInt("price"));
				orders.getProduct().setPoint(res.getInt("point"));
				orders.setSubTotal(res.getInt("subtotal"));
				orders.setSubTotalPoint(res.getInt("subtotalpoint"));
				orderList.add(orders);

			}
		}catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if(res != null) {
				res.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		}
		return orderList;
	}

}