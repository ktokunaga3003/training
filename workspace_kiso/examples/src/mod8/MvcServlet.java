/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * MvcServlet.java
 *
 */

package mod8;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc")
public class MvcServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        //遷移先画面の初期値設定
        String page = "/mod8/Mvc.jsp";

        //FORM情報の取り出し
        req.setCharacterEncoding("UTF-8");
        String sid = req.getParameter("id");
        String password = req.getParameter("password");

        // 未入力チェック
        if ((sid != null && !sid.equals("")) &&           // ユーザーID、パスワードが
            (password != null && !password.equals(""))) { // 入力されている場合

            // DAOの生成
            MemberDAO dao = new MemberDAO("localhost", "mysql", "mysql");
            try{
                int id = Integer.parseInt(sid);

                // DBへ接続
                dao.connect();

                // Memberテーブルにidをキーに検索
                Member member = dao.getMember(id);

                // ログイン処理
                if (member != null && member.isValid(password)) { //ログイン成功の場合

                     // リクエストオブジェクトにMemberオブジェクトを格納
                    req.setAttribute("member", member);
                    // ログイン成功時の画面遷移先の設定
                    page = "/mod8/Valid.jsp";
                } else {
                    // リクエストオブジェクトにエラーメッセージを格納
                    req.setAttribute("error", "ユーザーIDまたはパスワードが不正です。");
                }
            } catch (NumberFormatException e) {
                // リクエストオブジェクトにエラーメッセージを格納
                req.setAttribute("error", "ユーザーIDまたはパスワードが不正です。");
            } catch (SQLException e){
                e.printStackTrace();

                // リクエストオブジェクトにエラーメッセージを格納
                req.setAttribute("error", "システム管理者に連絡してください。");
                // システムエラー発生時の画面遷移先の設定
                page = "/mod8/SystemError.jsp";
            } finally {
                try {
                    // 接続のクローズ
                    dao.close();
                } catch (SQLException e) {
                    e.printStackTrace();

                    // リクエストオブジェクトにエラーメッセージを格納
                    req.setAttribute("error", "システム管理者に連絡してください。");
                    // システムエラー発生時の画面遷移先の設定
                    page = "/mod8/SystemError.jsp";
                }
            }
        }else{ // ユーザーIDまたはパスワードが未入力の場合
            // リクエストオブジェクトにエラーメッセージを格納
            req.setAttribute("error", "ユーザーIDまたはパスワードが未入力です。");
        }

        // フォワード処理
        RequestDispatcher rd = req.getRequestDispatcher(page);
        rd.forward(req, res);
    }
}
