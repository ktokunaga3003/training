/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * LoginAccountServlet2.java
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

@WebServlet("/loginAccount2")
public class LoginAccountServlet2 extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	// 遷移先画面の初期値設定
        String page = "/mod8/accountact.jsp";

        // FORM情報の取り出し
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String password = req.getParameter("password");

        AccountDAO dao = null;

        // ログイン処理
        // ログインに失敗した場合はリクエストオブジェクトにエラーメッセージ
        // を格納し、ログイン画面にフォワード
        if (!(id.equals("101") && password.equals("eclipse"))) {
        	req.setAttribute("error", "IDまたはパスワードが間違っています。");
        	page = "/mod8/loginAccount.jsp";
        } else {

		        // AccountDAOオブジェクトを生成してユーザー情報を検索




		        // ユーザー情報をセッションオブジェクトに格納























        }

        // フォワード処理
        RequestDispatcher rd = req.getRequestDispatcher(page);
        rd.forward(req, res);
    }
}
