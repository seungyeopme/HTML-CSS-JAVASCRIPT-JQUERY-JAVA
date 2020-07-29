package y2020.month7.ncs;

import java.util.Scanner;

class B{
	public int num;
	public String name;
	public String dept;
	public String addr;
	public String birth;
	
	B(int num, String name, String dept, String addr, String birth){}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
public class num11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(11,"aa","bb","cc","dd");
		Scanner s=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1.사원 정보 등록");
			System.out.println("2.사원 정보 조회 ");
			System.out.println("3.프로그램 종료");
			
			int r=s.nextInt();
			switch(r) {
			case 1:
				System.out.println("사번을 입력해주세요");
				int num=s.nextInt();
				b.setNum(num);
				
				System.out.println("이름을 입력해주세요");
				String name=s.next();
				b.setName(name);
				
				System.out.println("부서를 입력해주세요");
				String dept=s.next();
				b.setDept(dept);
				
				System.out.println("주소를 입력하세요");
				String addr=s.next();
				b.setAddr(addr);
				
				System.out.println("생일을 입력하세요");
				String birth=s.next();
				b.setBirth(birth);
			
			case 2:
				System.out.println("검색하고자 하는 사원번호는?");
				int sn= s.nextInt();
				if(sn==b.getNum()) {
					System.out.println("사번은 "+ b.getNum());
					System.out.println("이름은 "+ b.getName());
					System.out.println("부서는 "+ b.getDept());
					System.out.println("주소는 "+ b.getAddr());
					System.out.println("생일은 "+ b.getBirth());
				}
				break;
				
			case 3:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
