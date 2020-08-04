package y2020.month8.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle {

	public static void main(String[] args) throws SQLException {
		
		Connection conn=null; //DB와 연결하는 인터페이스
		PreparedStatement pstm=null; //sql문 객체 
		ResultSet r=null; //sql에 대한 반환
		
		try {
			String que="select * from emp";
			
			conn=Db.get();
			pstm=conn.prepareStatement(que);
			r=pstm.executeQuery();
			
			while(r.next()) {
				String empno=r.getString(1);
				String ename=r.getString(2);
				String job=r.getString(3);
				int mgr=r.getInt(4);
				java.sql.Date hiredate=r.getDate(5);
				int sal=r.getInt(6);
				int comm=r.getInt(7);
				int deptno=r.getInt(8);
				
				System.out.println(empno+" "+ename+" "+job+" "+mgr);
			}
		}catch(SQLException e) {
			System.out.println("예외발생!!!");
			e.printStackTrace();
		}
		r.close();
		pstm.close();
		conn.close();
		}
}
/*
데이터베이스에 연결됐다

7839 KING PRESIDENT 0
7566 JONES MANAGER 1234
7698 BLAKE MANAGER 7839
7782 CLARK MANAGER 7839
7788 SCOTT ANALYST 7566
7902 FORD ANALYST 7566
7499 ALLEN SALESMAN 7698
7521 WARD SALESMAN 7698
7654 MARTIN SALESMAN 7698
7844 TURNER SALESMAN 7698
7900 JAMES CLERK 7698
7934 MILLER CLERK 7782
7369 SMITH CLERK 7902
7876 ADAMS CLERK 7788
7888 히히히 대리 7832
3000 aa nn 7839
*/