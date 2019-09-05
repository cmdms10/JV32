package jp.ac.hal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		System.out.println(1);
		//IDE(統合開発環境)を使った
		//デバッグ
		int i = 0;
		for( ; i<5;i++ ){
			System.out.println(i);
		}

		String url =
			"jdbc:mysql://localhost:3306/jv32";
		String dbUser = "root";
		String dbPassword = "";
		Connection con = null;
		try{
			//コネクションオープン
			try {
				con = DriverManager.getConnection(
					url,dbUser,dbPassword);

				//ステートメント
				//(SQL実行オブジェクト)生成
				Statement s = null;
				try{
					s = con.createStatement();

					//SQL実行
					String sql = "SELECT * FROM 0530_users";
					ResultSet r = null;
					try{
						r = s.executeQuery(sql);
						while(r.next()){
							System.out.println(r.getInt(1));
							System.out.println(r.getString(2));
						}
					}finally{
						if( r != null && !r.isClosed() ){
							r.close();
						}
					}
				}finally{
					if( s != null && !s.isClosed() ){
						s.close();
					}
				}
			}finally{
				if( con != null
						&& !con.isClosed() ){
					con.close();
				}
			}
		}catch( SQLException e ){
			e.printStackTrace();
		}
	}

}
