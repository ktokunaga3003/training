/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * OutputHelloWorldServlet2.java
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
import javax.servlet.http.HttpSession;

@WebServlet("/outputhello2")
public class OutputHelloWorldServlet2 extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // リクエストオブジェクトからアクセス時刻を取得
        String date = (String)req.getAttribute("date");

        // セッションオブジェクトの獲得
        HttpSession session = req.getSession();
        // セッションオブジェクトから名前を取得
        String name = (String)session.getAttribute("name");

        // 出力処理
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = res.getWriter();

        pw.println("<html><head></head><body><div align=\"center\">");
        pw.println("こんにちは、" + name + "さん。<br>");
        pw.println("今日も一日がんばりましょう。<br>");
        pw.println("<br><hr><br>");
        pw.println("アクセス時刻：" + date + "<br>");
        pw.println("<form method='post' action='/examples/logout'>");
        pw.println("<input type='submit' value='ログアウト'>");
        pw.println("</div></body></html>");

    }
}