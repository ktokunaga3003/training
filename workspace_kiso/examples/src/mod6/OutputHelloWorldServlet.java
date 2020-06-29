/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * OutputHelloWorldServlet.java
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

@WebServlet("/outputhello")
public class OutputHelloWorldServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // HttpServletRequestオブジェクトからデータを取得
        String name = (String) req.getAttribute("name");
        String date = (String) req.getAttribute("date");

        // 出力処理
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = res.getWriter();

        pw.println("<html><head></head><body><div align=\"center\">");
        pw.println("こんにちは、" + name + "さん。<br>");
        pw.println("今日も一日がんばりましょう。<br>");
        pw.println("<br><hr><br>");
        pw.println("アクセス時刻：" + date + "<br>");
        pw.println("</div></body></html>");

    }
}