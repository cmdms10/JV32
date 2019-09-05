package jp.ac.hal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/UserRegister.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String R_id = request.getParameter("id");
		String R_password = request.getParameter("password");
		HttpSession ghs = request.getSession();
		String mssg = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/jv32";
		String dbUser = "root";
		String dbPassword = "";
		String sql = "INSERT INTO kadai01_users (id, password) VALUES(?,MD5(?))";

		if (R_id != "" && R_password != "") {
			try(
				Connection con = DriverManager.getConnection(url,dbUser,dbPassword);
				PreparedStatement s = con.prepareStatement(sql);
			){
				s.setString(1,R_id);
				s.setString(2,R_password);
				s.executeUpdate();
				mssg = "正常に登録されました";
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				mssg = "DB登録でエラーが発生しました";
				e.printStackTrace();
			}
		}else {
			mssg = "値を入力してください";
		}

		ghs.setAttribute("mssg", mssg);
		response.sendRedirect("UserRegister");
	}

}
