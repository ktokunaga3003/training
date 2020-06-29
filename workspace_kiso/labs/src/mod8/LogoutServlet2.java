/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * LogoutServlet2.java
 *
 */

package mod8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout2")
public class LogoutServlet2 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	// 遷移先画面の初期値設定
        String page = "/mod8/logout.jsp";
/*
        // セッションオブジェクトからユーザー情報を取得



        AccountDAO dao = null;
        try {
	        // AccountDAOオブジェクトを生成してユーザー情報を更新




	        // セッションオブジェクトを削除


        } catch (SQLException e) {






        } finally {











        }
*/
        // フォワード処理
        RequestDispatcher rd = req.getRequestDispatcher(page);
        rd.forward(req, res);
    }
}
