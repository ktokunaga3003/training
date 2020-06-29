/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SearchEmployeeServlet.java
 *
 */

package mod8;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchemp")
public class SearchEmployeeServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

    	// 遷移先画面の初期値設定
    	String page = "/mod8/searchEmployee.jsp";

        // FORM情報の取り出し
    	req.setCharacterEncoding("UTF-8");
    	String id = req.getParameter("id");


		// EmployeeDAOクラスのオブジェクト生成
    	EmployeeDAO dao = new EmployeeDAO("localhost", "mysql", "mysql");

        try {
            // 未入力チェック
        	if(id != null && !(id.equals(""))) {

                // データベースへの接続
        		dao.connect();

                // 従業員情報の検索
        		Employee emp = dao.getEmployee(Integer.parseInt(id));
        		if(emp != null) {
        		//if(dao.getEmployee(Integer.parseInt(id)) != null) {
        			// 検索成功の場合
        			//Employee emp = dao.getEmployee(Integer.parseInt(id));
        			req.setAttribute("employee", emp);
        			page = "/mod8/found.jsp";

        		}else {
                    // 検索失敗の場合
        			req.setAttribute("error", "ID="+id+"：該当者が見つかりません。");
        		}
        	}else{
        		req.setAttribute("error", "従業員IDを入力してください。");
        	}
        } catch (NumberFormatException e) {
        	req.setAttribute("error", "数値を入力してください。");
        } catch (SQLException e) {
    		e.printStackTrace();
    		req.setAttribute("error", "システム管理者に連絡してください。");
    		page = "/mod8/systemError.jsp";
        } finally {
        	try {
                // 接続のクローズ
        		dao.close();
        	}catch (SQLException e) {
        		e.printStackTrace();
        		req.setAttribute("error", "システム管理者に連絡してください。");
        		page = "/mod8/systemError.jsp";
        	}
        }
        // フォワード処理
        RequestDispatcher rd= req.getRequestDispatcher(page);
        rd.forward(req,res);
    }
}
