package y2020.month7.ncs;

import java.util.Scanner;

class A{
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;
	
	A(int id, String name, String dept, String addr, String birth) {}
	
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
public class num10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(11,"11","22","33","44");
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("<사원정보관리프로그램>");
			System.out.println("1.사원정보등록");
			System.out.println("2.사원정보조회");
			System.out.println("3.프로그램 종료");
			
			int r=s.nextInt();
			
			switch(r) {
			case 1:
			System.out.println("사번을 입력해주세요.");
			int id=s.nextInt();
			a.setId(id);
			
			System.out.println("이름을 입력해주세요");
			String name=s.next();
			a.setName(name);
			
			System.out.println("부서를 입력해주세요");
			String dept=s.next();
			a.setDept(dept);
			
			System.out.println("주소를 입력해주세요");
			String addr=s.next();
			a.setAddr(addr);
			
			System.out.println("생일을 입력해주세요");
			String birth=s.next();
			a.setBirth(birth);
			break;
			
			case 2:
			System.out.println("검색하고자 하는 사원번호는?");
			int st=s.nextInt();
			if(st==a.getId()) {
				System.out.println("사번은 "+a.getId());
				System.out.println("이름은 "+a.getName());
				System.out.println("부서는 "+a.getBirth());
				System.out.println("주소는 "+a.getAddr());
				System.out.println("생일은 "+a.getBirth());
			}
			
			case 3:
				System.out.println("프로그램 종료");
				return;
		}
		
		}
		
	}

}
