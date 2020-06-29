/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * LogoutServlet.java
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

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // セッションオブジェクトの獲得
        HttpSession session = req.getSession();
        // セッションオブジェクトから名前の取得
        String name = (String) session.getAttribute("name");

        // 出力処理
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter pw = res.getWriter();
        pw.println("<html><head></head><body><div align=\"center\">");
        pw.println("おつかれさまでした。" + name + "さん。<br>");
        pw.println("</div></body></html>");

        // セッションオブジェクトの破棄
        session.invalidate();

    }
}