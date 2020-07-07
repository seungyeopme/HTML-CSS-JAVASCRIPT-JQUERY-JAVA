import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {

		/*
		System.out.println((int)2.9+1.7);	// 3.7
		
		int a=3, b=3, c=3;
		a+=3;
		b*=3;
		c%=2;
		
		System.out.println(a+" "+b+" "+c);	// 6 9 1
		*/
		
		/*
		System.out.println(3>=2);
		System.out.println(3==2);
		System.out.println((3>2)&&(3>4));
		// && and 둘다 참이어야 함
		System.out.println((3!=2)||(-1>0));
		// || or 둘 중 하나만 참이어도 참
		*/
		
		/*
		int a=100;
		boolean b=(a!=0);
		System.out.println(b);  //true
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		// 스캐너 객체 생성!!!
		System.out.println("무슨 공부해?");
		String study=s.next(); // 문자열 입력해서 study에 저장
		
		System.out.println("몇 시에 공부해?");
		int time=s.nextInt();	// 정수 입력해서  time에 저장
		
		System.out.println("키는 몇인데?");
		double ki=s.nextDouble();	// 실수 입력 값이 ki에 저장
		
		System.out.println("오늘 tv 봤어?");
		boolean y=s.nextBoolean();	// yes or no 값이 y에 저장
		*/
		
		/*
		Scanner s=new Scanner(System.in); // 스캐너 객체 객성
		// 수학, 컴퓨터점수 입력받아
		System.out.println("수학, 컴퓨터 점수 입력해!");
		// 실수로 설정
		double math_score = s.nextDouble();
		double com_score = s.nextDouble();
		// 평균 출력
		System.out.println((math_score+com_score)/2.0);
		
		//String next();
		//boolean nextBoolean();
		*/
		
		/*
		// 두개 정수를 입력하여
		// 나머지를 출력하시오.
		Scanner s=new Scanner(System.in);
		System.out.println("두 개 수 입력해주세요");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a%b);
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("이름==>");
		String name =s.next();
		System.out.println("나이==>");
		int age = s.nextInt();
		System.out.println("키==>");
		double ki = s.nextDouble();
		
		System.out.println(name+" "+age+" "+ki);
		*/
		
		/*
		// 3명의 키를 입력받아
		// 키의 평균 출력(소수점 첫째자리까지 출력)
		Scanner s=new Scanner(System.in);
		System.out.println("키를 입력해주세요");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		System.out.printf("%.1f",(a+b+c)/3);
		*/
		
		/*
		// 두 정수 입력받아
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		// a/b -> 소수점 버림
		//System.out.println((int)a/(int)b);
		System.out.println((int)(a/b));
		*/
		
		// 저의 나이는 ( 정수   )입니다.
		// 제 번지수는 (  정수-정수  )번지입니다.
		// 제 거주지는( 문자열   )입니다.
		
		/*
		System.out.printf("저의 나이는 %d입니다\n", 40);
		System.out.printf("제 번지수는 %d-%d입니다\n",187,4);
		System.out.printf("제 거주지는 %s입니다\n", "서울");
		*/
		
		/*
		// 5.5 + 5.5 = 11
		System.out.printf("%.1f + %.1f = %d", 5.5,5.5,11);
		*/
		
		/*
		//24를 실수로 변경하는 코드
		int a = 24;
		System.out.println((double) a);
		double c = (double)a;
		System.out.println(c);
		int d =(int)c;
		System.out.println(d); // 다시 정수로 변환
		*/
		
		/*
		int a=99;
		if(a<100) {
			System.out.println("100보다 작군요");
		}
		*/
		
		/*
		//ctrl+shift+O <IMPORT 시 사용하는 단축키>
		//a가 더 크면 a를 b로 나눴을 때의 몫
		//                      나머지
		Scanner s = new Scanner(System.in);
		System.out.println("정수 a를 입력해주세요=> ");
		int a = s.nextInt();
		System.out.println("정수 b를 입력해주세요=> ");
		int b = s.nextInt();
		
		if(a>b)
			System.out.println(a/b);
		else
			System.out.println(a%b);
		*/
		/*
		//나이를 입력하여 성인인지 아닌지 판별하는 프록램
		Scanner s = new Scanner(System.in);
		System.out.println("나이가 어떻게 되세요?");
		int a = s.nextInt();
		if(a<20)
			System.out.println("성인이 아닙니다");
		else
			System.out.println("성인입니다.");
		*/
		
		/*
		int a=0, b=0;
		
		if(a>0) {	//1번째 조건
			b=1;
		}
		else if(a==0) { //2번째 조건
			b=2;
		}
		else {	// 3번째 조건
			b=3;
		}
		System.out.println(b);
		*/
		
		/*
		// 키가 187.5이상이고 몸무게가 80.0미만이면
		// OK 출력
		// 그 이외 CANCEL 출력
		double ki=179.5;
		double kg=75.0;
		
		if (ki>=187.5 && kg<80.0) {
			System.out.println("OK");
		}
		else {
			System.out.println("CANCEL");
		}
		*/
		
		/*
		int a=1,b=2,c=3;
		
		if(a<b && c>b && b==2) {
			System.out.println("참");
		}
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요 : ");
		int a = s.nextInt();
		System.out.println("계산할 연산자를 입력하세요: ");
		String c = s.next();
		System.out.println("두번째 수를 입력하세요: ");
		int b = s.nextInt();
		
		// 문자열 비교할 때 쓰는 함수: equals
		if(c.equals("+")) {
			System.out.println(a+b);
			
		}
		else if (c.equals("-")) {
			System.out.println(a-b);
		}
		else if (c.equals("*")) {
			System.out.println(a*b);
		}
		else if (c.equals("/")) {
			System.out.println(a/b);
		}
		else if (c.equals("%")) {
			System.out.println(a%b);
		}
		else
			System.out.println("...");
		 */
		
		
	}

}
