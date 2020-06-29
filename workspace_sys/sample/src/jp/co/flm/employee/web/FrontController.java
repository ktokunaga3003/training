/**
 * jp.co.flm.employee.web.FrontController
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.employee.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * フロントコントローラクラスです。
 * @author FLM
 * @version 1.0 2014/12/21
 */
@WebServlet("/eserv")
public class FrontController extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		// 画面のボタンIDを取得する。
		request.setCharacterEncoding("UTF-8");
		String buttonid = request.getParameter("BUTTON_ID");

		// どのボタンが押されたかによって処理を振り分ける。
		switch(buttonid) {
		  // 従業員検索画面の検索ボタンが押された場合
		  case "B0001G01_01":
			B0001RetrieveEmployeeAction action = new B0001RetrieveEmployeeAction();
			page = action.execute(request);
			break;
		  // 従業員検索結果画面のトップに戻るリンクが押された場合
		  case "B0001G01_02":
			page = "/employee-retrieve.jsp";
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher("/jsp" + page);
		rd.forward(request, response);
	}

}
