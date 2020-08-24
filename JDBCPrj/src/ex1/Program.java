package ex1;
/*
 1.Class.forName("oracle.jdbc.driver.OracleDriver");
 2.Connection con = DriverManager.getConnection(...);
 3.Statement st = con.createStatement();
 4.ResultSet rs = st.executeQuery(sql);
 5.rs.next();
 6.String title = rs.getString("title");
 */
/*
 CREATE TABLE NOTICE(
ID NUMBER,
TITLE NVARCHAR2(100),
WRITER_ID NVARCHAR2(50),
CONTENT CLOB,
REGDATE TIMESTAMP,
HIT NUMBER,
FILES NVARCHAR2(1000)
);
--Table NOTICE이(가) 생성되었습니다.

CREATE TABLE COMMENT(
ID NUMBER,
CONTENT NVARCHAR2(2000),
REGDATE TIMESTAMP,
WRITER_ID NVARCHAR2(50),
NOTICE_ID NUMBER
);
/*
오류 보고 -
ORA-00903: 테이블명이 부적합합니다
00903. 00000 -  "invalid table name"
*/
/*
ORACLE DATABASE에 입력!!!

CREATE TABLE ROLE(
ID VARCHAR2(50),
DISCRIPTION NVARCHAR2(500)
);
--Table ROLE이(가) 생성되었습니다.

CREATE TABLE MEMBER_ROLE(
MEMBER_ID NVARCHAR2(50),
ROLE_ID VARCHAR2(50)
);
--Table MEMBER_ROLE이(가) 생성되었습니다.

CREATE TABLE MEMBER(
ID NVARCHAR2(50),
PWD NVARCHAR2(50),
NAME NVARCHAR2(50),
GENDER NCHAR(2),
BIRTHDAY CHAR(10),
PHONE CHAR(13),
REGDATE DATE,
EMAIL VARCHAR2(200)
);
--Table MEMBER이(가) 생성되었습니다.

DESC NOTICE;
INSERT INTO NOTICE VALUES(1, 'JDBC란 무엇인가?', 'newlec', 'aaa', SYSDATE, 0, '');
COMMIT;
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@172.16.7.69:1521/xepdb1";
		/*String url = "jdbc:oracle:thin:@localhost:49161/xe";*/
		String sql = "SELECT * FROM NOTICE";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		/*Connection con = DriverManager.getConnection(url,"system","oracle");*/
		Connection con = DriverManager.getConnection(url,"sys as sysdba","1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String title = rs.getString("TITLE");
			System.out.println(title);	
		}
		
		rs.close();
		st.close();
		con.close();
	}
}