/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * HelloWorldServlet2.java
 *
 */

package mod6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello2")
public class HelloWorldServlet2 extends HttpServlet {

	// サーブレットのサービス
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// エンコーディング方式の指定
		req.setCharacterEncoding("UTF-8");

		// 入力パラメータの取り出し
		String name = req.getParameter("name");

		// コンテンツ・タイプの指定
		res.setContentType("text/html; charset=UTF-8");

		// ストリームの獲得
		PrintWriter pw = res.getWriter();

		// 出力
		pw.println("<html><head></head><body><div align=\"center\">");
		pw.println("こんにちは、" + name + "さん。<br>");
		pw.println("今日も一日がんばりましょう。<br>");
		pw.println("</div></body></html>");

	}
}
