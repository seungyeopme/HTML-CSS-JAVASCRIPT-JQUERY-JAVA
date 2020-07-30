package y2020.month7.ncs;

import java.util.Scanner;

class Business{
	
	int id;
	String name;
	String dept;
	String addr;
	String birth;
	
	Business(){}

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
public class num13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business b =new Business();
		Scanner s=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1.사원 정보 등록");
			System.out.println("2.사원 정보 조회 ");
			System.out.println("3.프로그램 종료");
			
			int r=s.nextInt();
			switch(r) {
			
			case 1:
				System.out.println("사원번호를 입력해주세요");
				int id=s.nextInt();
				b.setId(id);
				
				System.out.println("이름을 입력해주세요");
				String name=s.next();
				b.setName(name);
				
				System.out.println("부서를 입력해주세요");
				String dept=s.next();
				b.setDept(dept);
				
				System.out.println("주소를 입력해주세요");
				String addr=s.next();
				b.setAddr(addr);
				
				System.out.println("생일을 입력해주세요");
				String birth=s.next();
				b.setBirth(birth);
				
			case 2:
				System.out.println("검색하고자 하는 사원번호는?");
				
				int c=s.nextInt();
				if(c==b.getId()) {
					System.out.println("사번은 "+b.getId());
					System.out.println("이름은 "+b.getName());
					System.out.println("부서는 "+b.getDept());
					System.out.println("주소는 "+b.getAddr());
					System.out.println("생일은 "+b.getBirth());
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
				
			}
		}
	}
}
