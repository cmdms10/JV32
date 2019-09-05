package jp.ac.hal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jv32";
		String dbUser = "root";
		String dbPassword = "";
		String sql = "INSERT INTO 0530_users VALUES(NULL,'d君',MD5('ddd'),21)";

		//try-with-resourcesの構文
		//try( class管理するオブジェクトの宣言と生成 ) {}
		try(
			Connection con = DriverManager.getConnection(url,dbUser,dbPassword);
			Statement s = con.createStatement();
		){
			//SQL実行
			s.execute(sql);
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
