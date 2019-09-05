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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/jv32";
		String dbUser = "root";
		String dbPassword = "";
		String sql = "SELECT * FROM 0530_users WHERE age >= ?";
		//?がプレースホルダ（仮置き場）

		//try-with-resourcesの構文
		//try( class管理するオブジェクトの宣言と生成 ) {}
		try(
			Connection con = DriverManager.getConnection(url,dbUser,dbPassword);
			PreparedStatement s = con.prepareStatement(sql);

			//プリペアードステートメントの利点
			//①SQLインジェクション対策
			//②大量更新の高速化
			//【利用指針】
			//・SQL文にユーザーの入力値を用いる
			//・大量に更新する

		){
			//プレースホルダへの値設定
			s.setInt(1,21);
			try(ResultSet rs = s.executeQuery()) {
				while(rs.next()) {
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("password"));
					System.out.println(rs.getInt("age"));
				}
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//JSPへ画面遷移
		request.getRequestDispatcher("WEB-INF/MyServlet.jsp").forward(request, response);
	}

}
