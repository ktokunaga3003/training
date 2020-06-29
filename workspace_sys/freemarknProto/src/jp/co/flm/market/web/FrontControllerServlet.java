/**
 * jp.co.flm.framework.FrontControllerServlet
 *
 * All Rights Reserved, Copyright Fujitsu Learning Media Limited
 */

package jp.co.flm.market.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * フロントコントローラクラス
 * @author FLM
 * @version 1.0  YYYY/MM/DD
 */
@WebServlet("/mserv")
public class FrontControllerServlet extends HttpServlet {

	/**
	 * サーブレットのサービス
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * サーブレットのサービス
	 * @param req HttpServletRequest
	 * @param res HttpServletResponse
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String flag = request.getParameter("flag");

		String page = null;

		if (flag == null) {
			flag = "TOP";
		}
		switch (flag) {
		case "TOP":
			CommonAction commonAction = new CommonAction();
			page = commonAction.execute(request);
			break;
		case "CommonLogin":
			CommonLoginAction commonLoginAction = new CommonLoginAction();
			page = commonLoginAction.execute(request);
			break;
		case "B0202LoginMember":
			B0202LoginMemberAction b0202LoginMemberAction = new B0202LoginMemberAction();
			page = b0202LoginMemberAction.execute(request);
			break;
		}

		RequestDispatcher rd = request.getRequestDispatcher("/jsp/" + page);
		rd.forward(request, response);
	}
}
