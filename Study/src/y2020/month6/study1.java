import java.util.Scanner;

public class study1 {

	public static void main(String[] args) {
		
		//sysout => control + space bar ==> System.out.println();
		
		/*
		// 출력하는 프로그램
		System.out.println("안녕!");	// 문자열
		System.out.println("하세요~");
		System.out.println("내 나이는"+39+"살");
		System.out.println("자바는 재밌네요");
		*/
		/*
		System.out.println("안녕하세요");
		System.out.println("저는 홍길동입니다");
		System.out.println("제 나이는 20이고");
		System.out.println("서울에 있습니다.");
		*/
		
		/*
		// 서식문자 필요!!
		//%d 정수
		//%f 실수
		//%s 문자열 -> 큰 따옴표
		//%c 하나의 문자 -> 작은 따옴표
		//\n -> enter
		System.out.printf("나이: %d살\n", 10);
		System.out.printf("키:%.1fcm\n",176.6);
		System.out.printf("이름: %s\n","홍길동");
		System.out.printf("학점: %c\n", 'A');
	*/
		
		// 2*3=6
		// 2*4=8 -> printf
		/*
		System.out.printf("%d*%d=%d\n",2,3,6);
		System.out.printf("%d*%d=%d\n",2,4,2*4);
		*/
		
		//문자열일때는 +가 나열연산자가 된다.
		/*
		System.out.println("100"+"100");
		System.out.printf("\n");	//enter
		System.out.printf("%d\n",100+100);
		System.out.printf("%d",100);
		*/
		
		//System.out.printf("%d/%d=%.1f\n",100,200,0.5);
		
		/*
		  정수   int 		%d
		  실수   double		%f
		  	  float
		 
		 문자열  String 	%s
		 한 글자 char 		%c
		 */
		
		//int age;	// 변수 선언
		// 자료형 변수명
		// 메모리 공간을 확보한 후에 코드 작성 가능
		//1. 메모리 공간을 확보하기 위해
		//2. age라는 변수명을 쓰기 위해
		
		/*
		int age = 43; // = 대입연산자
		// 오른쪽 값을 왼쪽에 대입한다. (저장)
		
		double height = 177.7; //실수
		char grade = 'A'; // 한 글자
		String name = "tom";	// 문자열(한글자 이상)
		
		//printf사용해서 출력
		
		System.out.printf("%d\n", age);
		System.out.printf("%f\n", height);
		System.out.printf("%c\n", grade);
		System.out.printf("%s\n", name);
		*/
		
		/*
		int a=3, b=5;
		// 같은 자료형일 때 한줄로 가능
		// 다른 자료형일 때 한줄은 에러
		int c=4; String d ="aa";
		*/
		
		/*
		int a,b;
		double c,d;
		
		//a에 정수 100을 대입
		a = 100;
		b = a;	 //a를 b에 저장
		
		System.out.println(b);
		
		c = 111.1;	// 초기화: 처음으로 값을 대입할때
		d = c+1;
		System.out.println(d);
		*/
		
		/*
		 
		String name = "jack";
		// 문자열 클래스
		int id=123;
		//jack id는 123(변수명 사용)
		
		System.out.printf(name+" id는 "+id);
		// 문자열과 변수의 나열 : +
		
		*/
		
		/*
		double a=1.2;
		char b='B';
		String name = "juli";
		int age=40;
		
		// juli는 40살
		// juli 시력은 1.2이며 b형
		
		System.out.println(name+"는 "+age+"살");
		System.out.println(name+" 시력은 "+a+"이며 "+b+"형");
		*/
		
		/*
		//Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		// 클래스명 객체 = new 클래스명(System.in);
		
		System.out.println("나이 몇살이세요?");
		int age = s.nextInt();		// 정수 입력
		// 정수를 입력해서 age에 대입
		
		// . : 접근연산자(참조)
		System.out.println("키는 몇이죠?");
		double ki = s.nextDouble();	// 실수 입력
		
		System.out.println("이름은요?");
		String name=s.next();	//문자열 입력
		
		System.out.println(age);
		System.out.println(ki);
		System.out.println(name);
		// 객체 생성
		// int a; double b; <==변수
		// 자료형(int, double, char)
		// 클래스명 	객체명
		// 클래스(String)
		// String name="jack";  여기서 name은 객체이다.
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		//java.util로 해야함.
		System.out.println("두 수 입력해라 ");
		
		double a = s.nextDouble();
		int b = s.nextInt();
		System.out.println(a+b);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("공부했어요?");
		boolean a = s.nextBoolean();
		System.out.println(a);
		//true or false
		// 1   or   0
		*/
		
		/*
		System.out.printf("%d\n",123);
		System.out.printf("%15d\n",123);	//            123	
		System.out.printf("%05d\n",123);	// 5개 공간 안에서 오른쪽 정렬(빈공간이 있으면 0으로 채우겠다)
		System.out.printf("%-5d\n",123);	// 5개 공간 안에서 왼쪽 정렬
		
		
		System.out.printf("%f\n",123.45);
		// 소숫점 여섯 째 자리까지
		System.out.printf("%7.1f\n",123.45);	//7개 공간 안 에서 첫째 자리까지 출력
		System.out.printf("%7.3f\n",123.45);	//7개 공간 안에서 셋째 자리까지 출력
		*/
		
		/*
		int a = 100;
		double c=5.5;
		float b=123.45f; //f를 사용하면 뒤에 f 붙여야 한다.
		*/
		
		/*
		int a=(int)123.45f;//형 변환
		float b=200;
		System.out.println(a);
		System.out.printf("%f",b);
		*/
		
		/*
		float a = 123.45f;
		System.out.printf("%08.3f",a); // a = 0123.450
		*/
		
		/*
		float a=123.45f, b;
		int c;
		c=(int)a; //c=123
		b=c; 	//b=123
		System.out.printf("%6.2f",b); //123.00
		*/
		
		/*
		float c= 111.1f;
		System.out.printf("%5.1f",c);
		// 111.100000
		// 111.1 (5공간) (소숫점 첫째자리)
		 */
		
		/*
		float c=111.1f;
		c=12.5f;
		System.out.println(c); //c=12.5
		*/
		
		/*
		int a=100, b=200;
		float result=a/b;
		System.out.printf("%f\n",result);
		*/
		
		/*
		int eng=95, kor=100;
		// 평균을 구해(소수점 첫째자리까지 출력)
		double avg = (eng+kor) /2.0 ;
		
		System.out.printf("%.1f\n",avg);		//avg = 97.5
		
		// 몫, 나머지 출력
		System.out.println((double)eng/kor); // 몫
		System.out.println(eng%kor);  // 나머지
		*/
		
		/*
		int a=5, b=2;
		System.out.println(a/(double)b);
		*/
		
		/*
		int a=5,b;
		
		//b=++a;  //먼저 1을 증가시킨 후에 b에 넣어라
		//System.out.println(b);
		
		b=a++;	//대입을 한 이후에 1을 증가시켜라.
		System.out.println(b);
		*/
		
		/* 자신의 학번, 이름, 학점을 출력하는 프로그램
		실행결과)
		  학번: 201231
		 이름: 홍길동
		 학점: A
		 
		 실수 3.8 소수점을 버려주세요.
		*/
		
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("학번을 입력해주세요");
		*/
		
	}
}
