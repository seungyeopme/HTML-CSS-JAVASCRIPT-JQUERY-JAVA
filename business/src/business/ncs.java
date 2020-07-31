package business;

import java.util.Scanner;
/*
business 프로젝트를 생성한다.
business 패키지를 작성한 후 전체 클래스를 작성한다.
다른 클래스에서 접근이 불가능하도록 접근 제한자를 설정한다.
각 필드명과 타입은 클래스 다이어그램을 참조하도록 한다.
필드전체를 인자로 받는 생성자를 작성한다.
각 필드의 값을 세팅하기 위한 setter 메소드를 작성한다.
각 필드의 값을 가져오기 위한 getter 메소드를 작성한다.
while문을 사용한다.
사용자에게 메뉴를 보여주고 사용자가 콘솔 상에서 특정 메뉴를 입력하여 요청하면 해당 요청을 처리하는 기능을 가지고 있는 클래스를 작성하도록 한다.
메뉴에서 각 화면을 입력받은 후 동작하기
<사원 정보 관리 프로그램>

사원정보 입력
사원정보 개별 조회
프로그램 종료
<사원정보 입력 화면은 다음과 같다.>

사번: 123

이름: 홍길동

부서: 개발부서

주소: 서울시 용산구

생일: 10/26

사원정보가 입력되었다.

<사원정보 개별 조회 화면은 다음과 같다>

검색하고자 하는 사원의 사번은? 123(입력)

이름: 홍길동

부서: 개발부서

주소: 서울시 용산구

생일: 10/26

 - 프로그램 종료 화면은 “프로그램 종료”라 출력하고 종료시킨다.
*/

class sowon{
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;
	
	sowon(int id, String name, String dept, String addr, String birth){}
	
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

public class ncs {
	public static void main(String[] args) {
		
		sowon sw=new sowon(1,"a","b","c","d");
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1.사원정보 입력");
			System.out.println("2.사원정보 개별 조회");
			System.out.println("3.프로그램 종료");
			
			int a = s.nextInt();
			
			switch(a) {
			
			case 1:
				System.out.println("사번 입력");
				int id=s.nextInt();
				sw.setId(id);
				
				System.out.println("이름 입력");
				String name=s.next();
				sw.setName(name);
				
				System.out.println("부서 입력");
				String dept=s.next();
				sw.setDept(dept);

				System.out.println("주소 입력");
				String addr=s.next();
				sw.setAddr(addr);
				
				System.out.println("생일 입력");
				String birth=s.next();
				sw.setBirth(birth);
			
			case 2:
				System.out.println("검색하고자 하는 사원의 사번은? ");
				
				int b=s.nextInt();
				if(b==sw.getId()) {
					System.out.println("이름: "+sw.getName());
					System.out.println("부서: "+sw.getDept());
					System.out.println("주소: "+sw.getAddr());
					System.out.println("생일: "+sw.getBirth());
				}
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
}
