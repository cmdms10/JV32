package jp.ac.hal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		//パラメータ取得
		String id;
		String password;
		String comment;
		String type;
		String check;
		String select;

		//サーバサイドでの入力チェックは必ず行うこと。
		if(request.getParameter("id") == null
				|| request.getParameter("password") == null
				|| request.getParameter("comment") == null
				|| request.getParameter("type") == null
				|| request.getParameter("select") == null) {
			response.sendRedirect("index.html?ParameterError=");
			return;
		}

		id = request.getParameter("id");
		password = request.getParameter("password");
		comment = request.getParameter("comment");
		type = request.getParameter("type");
		//チェックボックスは配列で受け取る
		//check = request.getParameter("check");
		String[] checks = request.getParameterValues("check");
		check = "";
		if(check != null) {
			for(String value : checks) {
				check += value;
			}
		}
		select = request.getParameter("select");

		out.write(id);
		out.write("<br>");
		out.write(password);
		out.write("<br>");
		out.write(comment);
		out.write("<br>");
		out.write(type);
		out.write("<br>");
		out.write(check);
		out.write("<br>");
		out.write(select);
		out.write("<br>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
