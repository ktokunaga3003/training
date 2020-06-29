/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * CalcServlet.java
 *
 */

package mod7;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    	//遷移先画面の初期値設定
        String page = "/mod7/CalcBeanResult.jsp";

        // エンコーディング方式の指定
        req.setCharacterEncoding("UTF-8");
        // 入力パラメータの取り出し
        int number = 0;
        int power = 0;
        try {
        	number = Integer.parseInt(req.getParameter("number"));
        	power = Integer.parseInt(req.getParameter("power"));

	        CalcBean calcBean = new CalcBean(number, power);
	        calcBean.calc();

	        // JavaBeansのオブジェクトをHttpServletRequestオブジェクトに格納
	        req.setAttribute("calc", calcBean);
        } catch(NumberFormatException e) {
        	req.setAttribute("error", "数値を入力してください。");
        	page = "/mod7/CalcBeanInput.jsp";
        }

        // フォワード処理
        RequestDispatcher rd = req.getRequestDispatcher(page);
        rd.forward(req, res);
    }
}
