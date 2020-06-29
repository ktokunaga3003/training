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

    // サーブレットの初期化処理
    public void init() throws ServletException {
        System.out.println("init");
    }

    // サーブレットのサービス
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("doGet");
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = res.getWriter();
        pw.println("<html><head></head><body><div align=\"center\">");
        pw.println("こんにちは世界のみなさん!!");
        pw.println("</div></body></html>");
    }

    // サーブレットの終了処理
    public void destroy() {
        System.out.println("destroy");
    }

}
