package y2020.month7.ncs;

import java.util.Scanner;

//ncs 출제 문제
class Worker{
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;

	
	Worker(int id, String name, String dept, String addr, String birth) {}
	
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
public class num1 {
	public static void main(String[] args) {
		
		Worker w=new Worker(123,"aa","bb", "cc","dd");
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
				int id=s.nextInt();
				w.setId(id);
				
				System.out.println("이름을 입력해주세요");
				String name=s.next();
				w.setName(name);
				
				System.out.println("부서를 입력해주세요");
				String dept=s.next();
				w.setDept(dept);
				
				System.out.println("주소를 입력해주세요");
				String addr=s.next();
				w.setAddr(addr);
				
				System.out.println("생일을 입력해주세요");
				String birth=s.next();
				w.setBirth(birth);
				break;
			case 2:
				System.out.println("검색하고자 하는 사원번호는?");
				int st=s.nextInt();	//123
				if(st==w.getId()) {
					System.out.println("사번은 "+w.getId());
					System.out.println("이름은 "+w.getName());
					System.out.println("부서는 "+w.getDept());
					System.out.println("주소는 "+w.getAddr());
		            System.out.println("생일은 "+w.getBirth());
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;
			}
		}	
	}
}