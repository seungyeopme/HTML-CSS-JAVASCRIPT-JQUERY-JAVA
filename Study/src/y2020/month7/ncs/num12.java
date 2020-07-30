package y2020.month7.ncs;

import java.util.Scanner;

class AA{
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;
	
	AA(int id, String name, String dept, String addr, String birth){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}
public class num12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA d=new AA(1,"A","B","C","D");
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1.사원 정보 등록");
			System.out.println("2.사원 정보 조회 ");
			System.out.println("3.프로그램 종료");
			
			int r=s.nextInt();
			
			switch(r) {
			
			case 1:
				System.out.println("사원번호 입력");
				int id=s.nextInt();
				d.setId(id);
				
				System.out.println("이름 입력");
				String name=s.next();
				d.setName(name);
				
				
			}
		
		}

	}
}