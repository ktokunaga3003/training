﻿/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * InputHelloWorldServlet.java
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

@WebServlet("/inputhello")
public class InputHelloWorldServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // エンコーディング方式の指定
        req.setCharacterEncoding("UTF-8");

        // 入力パラメータの取り出し
        String name = req.getParameter("name");

        // アクセス時刻の取得
        Date d = new Date();
        String date = d.toString();

        // 名前とアクセス時刻をHttpServletRequestオブジェクトに格納
        req.setAttribute("name", name);
        req.setAttribute("date", date);

        // フォワード処理
        RequestDispatcher rd = req.getRequestDispatcher("/outputhello");
        rd.forward(req, res);

    }
}