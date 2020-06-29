/**
 * jp.co.flm.market.test.TestOrdersDAO02
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.market.dao;

import java.sql.Connection;
import java.util.ArrayList;

import jp.co.flm.market.dao.ConnectionManager;
import jp.co.flm.market.dao.OrdersDAO;
import jp.co.flm.market.entity.Orders;
import jp.co.flm.market.entity.Product;

/**
 * getOrderList()のテスト用クラスです。
 * @author FLM
 * @version 1.0 YYYY/MM/DD
 */
public class TestOrdersDAO02 {
	public static void main(String[] args) throws Exception {

		// コマンドライン引数を確認する。
		if (args.length != 1) {
			System.out.println("使い方: java jp.co.flm.market.test.TestOrdersDAO02 <会員ID>");
			System.exit(1);
		}

		// コマンドライン引数を取得する。
		String memberId = args[0];

		Connection con = null;
		try {
			// データベースに接続する。
			con = ConnectionManager.getConnection();

			// 単体テスト対象クラスのオブジェクトを生成する。
			OrdersDAO odao = new OrdersDAO(con);

			// 単体テスト対象メソッドを呼び出す。
			ArrayList<Orders> orderList = odao.getOrderList(memberId);

			for(Orders order : orderList) {
				System.out.println("注文番号："+ order.getOrderId());
				System.out.println("会員ID：" + order.getMemberId());
				System.out.println("日付：" + order.getOrderDate().substring(0,10));
				System.out.println("商品ID：" + order.getProduct().getProductId());
				System.out.println("商品名：" + order.getProduct().getProductName());
				System.out.println("単価：" + order.getProduct().getPrice());
				System.out.println("数量：" + order.getQuantity());
				System.out.println("ポイント：" + order.getProduct().getPoint());
				System.out.println("小計金額：" + order.getSubTotal());
				System.out.println("小計ポイント：" + order.getSubTotalPoint());
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			// データベース接続を閉じる。
			if(con != null){
				con.close();
			}
		}
	}
}