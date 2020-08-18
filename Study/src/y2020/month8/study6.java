package y2020.month8;

import java.util.Scanner;

/*
 문자열을 입력받아 String 클래스를 활용하여 enter키 입력하면

한글자씩 뒤로가도록 quit을 입력하면 종료한다.

(substring, concat활용)
----------------------------------------------------------------------
입력: 자바, 데이터베이스.

바, 데이터베이스.자

,데이터베이스. 자바

데이터베이스. 자바,
.........................
quit

종료
 */
public class study6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		while(true) {
			String a=sc.nextLine();
			if(a.equals("")) {
				String a1=str.substring(0,1); //맨 앞 문자 추출
				String a2=str.substring(1); //두번째 글자부터 끝까지
				str=a2.concat(a1);
				System.out.print(str);
			}
			else if(a.equals("quit")) {
				break;
			}
		}
		System.out.println("종료");
	}
}
/*
 자바, 데이터베이스.

바, 데이터베이스.자
, 데이터베이스.자바
 데이터베이스.자바,
데이터베이스.자바, 
이터베이스.자바, 데quit
종료
*/