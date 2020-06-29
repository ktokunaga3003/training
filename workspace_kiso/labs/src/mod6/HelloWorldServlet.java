/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * HelloWorldServlet.java
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

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // クライアントへ送るHTMLの作成
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = res.getWriter();
        pw.println("<html><head></head><body><div style=\"text-align:center;\">");
        pw.println("<h1>サーブレットの世界へようこそ!!</h1>");
        pw.println("</div></body></html>");

    }

}
