package today;

import java.util.Scanner;

class A{
	private int id;
	private String name;
	private String addr;
	private String dept;
	private String birth;
	
	A(int id, String name, String addr, String dept, String birth){}
	
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
public class ncs1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A(11,"AA","BB","CC","DD");
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.println("사원 정보 프로그램");
			
			System.out.println("1.사원정보 입력");
			System.out.println("2.사원정보 조회");
			System.out.println("3.사원정보 종료");
			
			int r= s.nextInt();
			
			switch(r) {
			
			case 1: 
				System.out.println("사번을 입력해주세요");
				int id=s.nextInt();
				a.setId(id);
			
				System.out.println("이름을 입력해주세요");
				String name=s.next();
				a.setName(name);
				
				System.out.println("주소를 입력해주세요");
				String addr=s.next();
				a.setAddr(addr);
				
				System.out.println("부서를 입력해주세요");
				String dept=s.next();
				a.setDept(dept);
				
				System.out.println("생일을 입력해주세요");
				String birth=s.next();
				a.setBirth(birth);
			
			case 2:
				System.out.println("검색하고자 하는 사원번호는?");
				int b= s.nextInt();
				
				if(b==a.getId()) {
					System.out.println("사번은"+a.getId());
					System.out.println("이름은"+a.getName());
					System.out.println("주소는"+a.getAddr());
					System.out.println("부서는"+a.getDept());
					System.out.println("생일은"+a.getBirth());
				}
		
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
			
			}
		}
	}

}
