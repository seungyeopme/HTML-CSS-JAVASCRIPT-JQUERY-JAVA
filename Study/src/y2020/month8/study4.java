package y2020.month8;
import java.util.Scanner;
/*
 클래스명을 profile로 설정하고 객체배열을 사용하여 코드를 작성해라.


실행 결과) 검색할 이름:  홍길동

          홍길동의 번호는 111-1111입니다.

          검색할 이름: 김길동

          김길동은 없다.

          검색할 이름: stop

         종료
 */
class Profile{
	private String name, id;
	Profile(String name, String id) {
		this.name=name;
		this.id=id;
	}
	String getname() {
		return name;
	}
	String getid() {
		return id;
	}
}
public class study4 {
	public static void main(String[] args) {
		
		//객체 배열의 개수는 입력받아서 구현
		Scanner s =new Scanner(System.in);
		System.out.println("객체배열 개수");
		int n=s.nextInt();

		Profile p[]=new Profile[n];
		for(int i=0;i<p.length;i++) {
			System.out.println(n+"개의이름과 아이디를 저장해주세요");
			
			String name=s.next();
			String id=s.next();
		
			p[i]=new Profile(name, id);
		}
		for(int j=0;j<p.length;j++) {
			System.out.println("검색할이름");
			String name1=s.next();
		
			if(p[j].getname().equals(name1)) {
				System.out.println(p[j].getname()+"번호는"+p[j].getid()+"입니다");
			}else if(name1.equals("stop")) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println(name1+"은 없다");
			}
		if(j==p.length){
			System.out.println("더이상 존재하는 데이터는 없습니다");
			break;
		}
		}
	}
}