package jp.ac.hal;

import java.io.IOException;

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

    //リクエストパラメータ取得
    //String id = request.getParameter("id");
    //String name = request.getParameter("name");

    //JSPへのデータ渡し
    //→アトリビュートを用いる
    //request.setAttribute("new_id"."the"+id);
    //第１引数：JSPで引っこ抜くときの名前
    //第２引数：受け渡すデータ
    //request.setAttribute("new_name","the"+name+"さん");
    //request.setParameterはない。
    //->パラメータはクライアントの領域

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.
			getRequestDispatcher("WEB-INF/index.html")
		//	getRequestDispatcher(index.html)
			.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter().append("post");
	}

}
