package jp.ac.hal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean success = false;

		String P_id = request.getParameter("id");
		String P_password = request.getParameter("password");
		HttpSession hs = request.getSession();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/jv32";
		String dbUser = "root";
		String dbPassword = "";
		String sql = "SELECT * FROM kadai01_users WHERE id = ? AND password = MD5(?)";

		try(
			Connection con = DriverManager.getConnection(url,dbUser,dbPassword);
			PreparedStatement s = con.prepareStatement(sql);
		){
			s.setString(1,P_id);
			s.setString(2,P_password);

			try(ResultSet rs = s.executeQuery()) {
				if(rs.next()) {
					success = true;
				}
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		if(success) {
			hs.setAttribute("id",P_id);

			response.sendRedirect("Member");
		}else {
			hs.setAttribute("msg","ID、またはパスワードが不正です");
			response.sendRedirect("Login");
		}

	}

}
