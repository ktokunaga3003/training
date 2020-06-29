/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * InputHelloWorldServlet2.java
 *
 */

package mod6;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/inputhello2")
public class InputHelloWorldServlet2 extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	
        // アクセス時刻の取得
        Date d = new Date();
        String date = d.toString();

        // リクエストオブジェクトにアクセス時刻を格納
        req.setAttribute("date", date);
        
        // エンコーディング方式の指定
        req.setCharacterEncoding("UTF-8");
        // 入力パラメータの取り出し
        String name = req.getParameter("name");
        
        // セッションオブジェクトの獲得
        HttpSession session = req.getSession();
        // セッションオブジェクトに名前を格納
        session.setAttribute("name", name);
 

        // フォワード処理
        RequestDispatcher rd = req.getRequestDispatcher("/outputhello2");
        rd.forward(req, res);

    }
}