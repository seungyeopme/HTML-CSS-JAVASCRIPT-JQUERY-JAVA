package y2020.month8.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	public static Connection con; 
	public static Connection get() throws SQLException {
		Connection conn=null;
		
		try {
			String id="sys as sysdba";
			String pw="1234";
			String url="jdbc:oracle:thin:@172.16.7.69:1521/xepdb1";
			
			//JDBC 드라이버를 로딩하는 코드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection(url, id, pw);
			
			System.out.println("데이터베이스에 연결됐다\n");
					
		}catch(ClassNotFoundException e) {
			System.out.println("로딩 실패");
		}catch(SQLException s) {
			System.out.println("데이터베이스 접속 실패");
		}
		return conn;
	}	
}
