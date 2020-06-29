/**
 * jp.co.flm.market.test.TestMemberDAO01
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.market.dao;

import java.sql.Connection;

import jp.co.flm.market.dao.ConnectionManager;
import jp.co.flm.market.dao.MemberDAO;
import jp.co.flm.market.entity.Member;

/**
 * getMember()(引数2つ)のテスト用クラスです。
 * @author FLM
 * @version 1.0 YYYY/MM/DD
 */
public class TestMemberDAO01 {
	public static void main(String[] args) throws Exception {

		// コマンドライン引数を確認する。
		if (args.length != 2) {
			System.out.println("使い方: java jp.co.flm.market.test.TestMemberDAO01 <会員ID> <パスワード>");
			System.exit(1);
		}

		// コマンドライン引数を取得する。
		String memberId = args[0];
		String password = args[1];

		Connection con = null;
		try {
			// データベースに接続する。
			con = ConnectionManager.getConnection();

			// 単体テスト対象クラスのオブジェクトを生成する。
			MemberDAO mdao = new MemberDAO(con);

			// 単体テスト対象メソッドを呼び出す。
			Member member = mdao.getMember(memberId, password);
			System.out.println("会員ID：" + member.getMemberId());
			System.out.println("名前：" + member.getMemberName());
			System.out.println("性別：" + member.getGender());
			System.out.println("住所：" + member.getAddress());
			System.out.println("電話番号：" + member.getPhone());
			System.out.println("ポイント：" + member.getMemberPoint());
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