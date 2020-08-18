package y2020.month8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
 5개 학생 이름과 성적을 입력받아 해시맵에 저장한다.
 가장 성적이 높은 학생을 검색하여 출력하는 프로그램
 
 학생, 성적: 김길동 90
 학생, 성적: 홍길동 100
 학생, 성적: 박길동 98
 학생, 성적: 이길동 80
 학생, 성적: 민길동 80
 
 제일 성적 높은 학생: 홍길동 100
 */
public class study5 {
	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<String,Integer>();

		Scanner s=new Scanner(System.in);

		for(int i=0;i<5;i++) {
			System.out.println("학생이름을 입력하세요");
			String a=s.next();
			System.out.println("학생성적을 입력하세요");
			int b=s.nextInt();

			h.put(a, b);
		}
		Set<String> key=h.keySet();
		Iterator<String> it=key.iterator();

		int max=0;
		String o=null;
		
		while(it.hasNext()) {
			String a=it.next();
			int b=h.get(a);
			
			if(max<b) {
				max=b;
				o=a;
			}
		}
		System.out.println("가장 성적이 높은 사람은 : "+o+", "+max);
	}
}
/*
학생이름을 입력하세요
김길동
학생성적을 입력하세요
90
학생이름을 입력하세요
홍길동
학생성적을 입력하세요
100
학생이름을 입력하세요
박길동
학생성적을 입력하세요
98
학생이름을 입력하세요
이길동
학생성적을 입력하세요
80
학생이름을 입력하세요
민길동
학생성적을 입력하세요
80
가장 성적이 높은 사람은 : 홍길동, 100
*/