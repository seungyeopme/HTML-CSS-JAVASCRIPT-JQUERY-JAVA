import java.io.IOException;
import java.util.Scanner;

public class study5 {

	public static void main(String[] args) {
		/*
		1 1
		1 2
		1 3
		1 4
		1 5
		1 6
		1 7
		1 8
		1 9
		1 10
		2 1
		2 2
		2 3
		2 4
		2 5
		2 6
		2 7
		2 8
		2 9
		2 10
		3 1
		3 2
		3 3
		3 4
		3 5
		3 6
		3 7
		3 8
		3 9
		3 10
		4 1
		4 2
		4 3
		4 4
		4 5
		4 6
		4 7
		4 8
		4 9
		4 10
		5 1
		5 2
		5 3
		5 4
		5 5
		5 6
		5 7
		5 8
		5 9
		5 10
		6 1
		6 2
		6 3
		6 4
		6 5
		6 6
		6 7
		6 8
		6 9
		6 10
		7 1
		7 2
		7 3
		7 4
		7 5
		7 6
		7 7
		7 8
		7 9
		7 10
		8 1
		8 2
		8 3
		8 4
		8 5
		8 6
		8 7
		8 8
		8 9
		8 10
		9 1
		9 2
		9 3
		9 4
		9 5
		9 6
		9 7
		9 8
		9 9
		9 10
		10 1
		10 2
		10 3
		10 4
		10 5
		10 6
		10 7
		10 8
		10 9
		10 10
*/
		/*
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" "+j);
			}
		}
		*/
		
/*		4 1
		4 2
		4 3
		4 4
		4 5
		4 6
		4 7
		4 8
		4 9
		5 1
		5 2
		5 3
		5 4
		5 5
		5 6
		5 7
		5 8
		5 9
		6 1
		6 2
		6 3
		6 4
		6 5
		6 6
		6 7
		6 8
		6 9
*/
		/*
		for(int i=4; i<=6; i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+" "+j);
			}
		}
		*/
		/*
		Scanner s = new Scanner(System.in); //import 단축키 ctrl+shift+o
		while(true) { 	//전제조건
			String str=s.next();
			if(str.equals("stop")) {
				break;	// 무한루프 끝냄
			}		
		}
		*/
		/*
		int n=-1;
		do {
			System.out.println(n);
			n++; //증감			
		}while(n>0);	// 조건을 나중에 검사하기 때문에 조건에 안 맞아도 실행문이 실행된다.
		*/
		
		/*
		//do~while(1~10)
		int n = 1;
		do {
			System.out.println(n);
			n++;
		}while(n<=10);
		*/
		
		/*
		//1번. 두 과목 점수를 입력하여 평균 출력하는 프로그램(평균은소수점 이하 첫째자리까지 출력)

		//출력 결과) 두 과목의점수 : 70  80

		//           평균 : 75.0
		
		Scanner s = new Scanner (System.in);
		System.out.println("두 과목 점수를 입력해주세요");
		double a = s.nextDouble();
		double b = s.nextDouble();
		System.out.printf("두 과목의 평균 점수는 %.1f",(a+b)/2);
		*/
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("두 과목 점수:");
		
		int c= sc.nextInt();
		int d= sc.nextInt();
		System.out.printf("평균: %.1f",(c+d)/2.0);
		*/
		
		//2번.시간과 물건 개수로 금액 할인해주는 프로그램

		//(총 금액은 10만원으로 설정, 시간과물건 개수는 입력받기)

		//14시에 마트를 방문하고 물건 개수가 3개 이하이면 5%로 할인

		//18시에 마트를 방문하고 물건 개수가 5개 이하이면 10%로 할인

		//20시에 마트를 방문하고 물건 개수가 10개 이하이면 20%로 할인
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("시간입력");
		int a = s.nextInt();

		System.out.println("개수 입력");
		int b = s.nextInt();
		switch (a) {
		case 14: {
		if (b <= 3) {
		System.out.println(100000 - (100000 * 0.05));
		}

		}
		break;
		case 18: {
		if (b < 5) {
		System.out.println(100000 - (100000 * 0.1));
		}
		}
		case 20: {
		if (b <= 10) {
		System.out.println(100000 - (100000 * 0.2));
		}
		}
		break;
		default:
		System.out.println("할인없음");
	}
}
*/	
		/*
		double total = 100000;
		Scanner s = new Scanner (System.in);
		System.out.println("시간, 개수 입력");
		int time=s.nextInt();
		int num=s.nextInt();
		
		if(time==14 && num<=3) 
			total=total*0.95;
		
		else if(time==18 && num<=5)
			total*=0.9;
		else if(time==20 && num<=10)
			total*=0.8;
		System.out.println(total);
		*/
		
		/*
		//1~100 짝수 합 출력	
		int a=1,sum=0;
		while(a<=100) {
			if(a%2==0) {
				sum+=a;
			}
			a++;
		}
		System.out.println(sum);
		*/
		
		//문제 3 중첩 반복문으로 5단부터 9단까지 출력
		/* 
		for (int i = 5; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
			System.out.printf("%dX%d=%d\n", i, j, i * j);
			
			}
		*/
		//문제 4 while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
			/*
			int a=0;
			int hap=0;
			while(a<=100) {
			if(a%5==0) {
			hap+=a;
			}
			a++;
			}
			System.out.println(hap);
			*/
	
		/*
		//문제 5
		//while, random()을 이용해서 (x,y)형태로 출력하는데 x+y합이 5이면 실행을 멈추는 코드를 작성. 
		//5가 아니면 난수 계속 발생시키고출력 (x,y 범위는 1부터 5까지)
		
		while(true) {
			   int val1 = (int) (Math.random() * 5) + 1;
			   int val2 = (int) (Math.random() * 5) + 1;



			   System.out.println("(" + val1 + "," + val2 + ")");



			   if (val1 + val2 == 5) { break; }
			   */
		
		/* 
		// do while문
		//"exit"이 아닐 때까지 계속 문자열을 입력받아 출력
		// exit이면 "프로그램 종료"라고 출력(do~while)
		String str;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("문자열 입력");
			str=s.next();
			if(str.equals("exit")) {
				System.out.println("프로그램 종료");
			}
			//exit가 아니면, else 생략
			System.out.println(str);
			} while(!str.equals("exit"));
		*/
		
		/*
		// while문  초기화 필요!
		String str = ""; //  초기화
		Scanner s = new Scanner(System.in);
		while(!str.equals("exit")) {
			System.out.println("문자열 입력");
			str=s.next();
			if(str.equals("exit")) {
			System.out.println("프로그램 종료");
		}
		//exit가 아니면, else 생략
		System.out.println(str);
		} while(!str.equals("exit"));
		*/
		//문제6번 숫자를 입력하여 정답 숫자 맞추는 게임

		//정답을18로 설정

		//입력한숫자가 정답(18)이 아닐 경우 크거나 작은지 알려준다. 정답을맞출 때까지 숫자 입력을 반복하고 정답을 맞춘 후에는 시도한 횟수 출력

		//실행결과) 숫자 입력: 25

		//           25보다 작다!!

		//          숫자 입력: 10

		//          10보다 크다!!

		//          숫자 입력: 18

		//          정답이다!!

		//         시도한 횟수는 3번이다.
		
		/* 첫번째 방법
		Scanner s = new Scanner(System.in);
		int answer = 18;//정답
		int count=0; // 시도한 횟수 
		
		while(true) {
			System.out.println("숫자 입력");
			count++;
			int n=s.nextInt();
	
			if (answer<n) {
				System.out.println(n+"보다 작습니다.");
			}
			else if (answer>n) {
					System.out.println(n+"보다 크다!!");
			}
			else{	// answer == n
				System.out.println("정답이다!!");
				break;
			}
		}
		System.out.println("시도한 횟수는 "+count+"이다");
		*/
		
		/* 두번째 방법
		 int answer=18;  //정답이 될 숫자 지정
	     int guess; //입력받을 숫자
	        
	     Scanner nc = new Scanner(System.in);
	     int count=0;
	        
	        do{
	            System.out.print("정답숫자입력=>");
	            guess=Integer.parseInt(nc.nextLine());
	            count++;
	            
	            if(guess>answer){
	                System.out.println("입력한 숫자가 높다!");
	            }
	            if(guess<answer)
	                System.out.println("입력한 숫자가 낮다!");
	        }while(guess != answer);    //!=같지 않다.
	 
	        System.out.println("축하합니다.시도횟수="+count);
	     */
	
		//문제 7번
		//1.for while do~while
		// 0,2,3,4,6,8,10
		// 세가지 반복문을 사용해서 출력
		
		/* for문 활용
		for (int i=0; i<=10; i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}
		for (int j=0; i<=10; i+=2) {
			System.out.println(i);
		*/
		
		/* while문 활용
		int j = 0;
		while(j<=10) {
			System.out.println(j);
			j+=2;
		}
		*/
		/* do~while문 활용
		int k = 0;
		do {
			System.out.println(k);
			k+=2;
		}while(k<=10);
		*/
		
		/*
		//아스키와 FOR문을 연결한 코드
		System.out.println("한 문자 입력");
		Scanner s = new Scanner(System.in);
		
		char c=s.next().charAt(0);
		
		int n=(int)c;	// 내가 입력한 정수까지 출력하고 싶다.
		//e => 101
		for(int i=97; i<=n; i++) {
			for(int j=i; j<n; j++) { // 97~100
				char ch=(char)j;
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		/*
		//0이 아닐 때까지 입력한 수를 출력
		Scanner s = new Scanner(System.in);
		while(true) {
		int n=s.nextInt();
		if(n==0) {
				break;
		}
		else if(n!=0){
			System.out.println(n);
			}	
		}
		*/
		
		
		
		/*
		4
		5
		program and.... 

		int num = 4;
		do {
			System.out.println(num);
			num++;
		} while (num <= 5);
		System.out.println("program and.... ");
		*/
		
		/*
		// 1~20까지 합 do~while
		int i=1, sum=0;
		
		do {
			sum=sum+i;
			i++;
		}while (i<=20);
		System.out.println(sum);
		*/
		
		// 1~99사이에 있는 정수 중
		// 2의 배수 또는 3의 배수 출력
		/* for 사용
		   for(int i=1; i<=99; i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
		*/
		/* while 사용
		int i=1;
		while(i<=99) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
			i++;
		}
		*/
		
		// 1~10까지 합을 구하는데
		// 합이 30이상이며 되면 탈출..
		// 반복문 중 하나 사용
		
		/*
		// for문 사용
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			if(sum>=30) {
				break;
			}
		}
		System.out.println(sum);
		*/
		
		/* while 이용
		int sum =0, i =1;
		while(i<=10) {
			sum=sum+i;
			if(sum>=30) {
				break;
			}
			i++;  //증가
		}
		System.out.println(sum);
		*/
		/*
		// do while 이용
		int sum =0, i=1;
		
		do {
			System.out.println();
		}
		*/
		
		//0~9까지 수 중에서
		// 홀수만 출력(while, continue 사용)
		/*
		int i =0;
		while(i<10) {
			i++;
			if(i%2==0) {
				continue;	
			}
			System.out.println(i);
		}
		*/
		
		/*
		//1~10까지를 random()로 범위설정 한 후
		//값이 10이 나오면 탈출!
		// (10이 나올 때까지 난수 계속 발생)
		
		for(;;) {	// 무한루프
			int n = (int)(Math.random()*10)+1;
			if(n==10) {
				break;
			}
			System.out.println(n);
		}
		*/
		/*
		while(true) {
			int n = (int)(Math.random()*10)+1;
			if (n==10) {
				break;
			}
			System.out.println(n);
		}
		*/
		
		/*
		//배열: 같은 자료형으로 묶여 있다.
		int [] ary = new int[3]; //베열생성
		ary[0]=10;
		ary[1]=20;
		ary[2]=ary[0]+ary[1];
		
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		
		//int arr [] = new int[5];
		
		// int [] ary; //배열 선언
		// ary=new int[5]; // 배열 생성
		*/
		
		// 1. 정수 5개를 저장할 배열 (배열 명은 마음대로)
		//int a[] = new int[5];
		
		// 2. 실수 10개를 저장할 배열
		//double []a = new double[10];
		
		// 3. 배열 요소 수가 세개인 int 형 배열
		//int []a = new int[3];
		
		// 4. 인덱스의 최대값이 4인 char형 배열
		//char []a = new char[5];
		
		/*
		int [] ary = new int[3]; //베열생성
		ary[0]=10;
		ary[1]=20;
		ary[2]=ary[0]+ary[1];
		for(int i=0; i<3; i++) {	// 인덱스의 범위
			System.out.println(ary[i]);
		}
		*/
		
		/*
		// 실수 3개를 배열 선언, 생성
		double ary[] = new double[3];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			ary[i]=s.nextDouble();
			System.out.println(ary[i]);
		}
		*/
		/*
		int ary[] = new int[] {10, 20,  30};	// 배열 초기화 할때 개수 적으면 에러!
		// 					  [0]  [1]  [2]
		int n=0;
		while (n<3) {
			System.out.println(ary[n]);
			n++;
		}
		*/
		/*
		30
		20
		10

		int ary[] = new int[] {10, 20,  30};	// 배열 초기화 할때 개수 적으면 에러!
		// 					  [0]  [1]  [2]
		// 거꾸로 출력
		for(int i=0; i<3; i++) {
			System.out.println(ary[2-i]);
		}
		*/
		
		/*
		int ary[] = new int [] {1,2,3};
							//3
		for(int i=0; i<ary.length;i++) {
			System.out.println(ary[i]);	
		}
		*/
		
		/*
		//실수 5개를 입력받아 평균 출력해라.
		double a[] = new double[5];
		Scanner s = new Scanner (System.in);
		int sum=0;
		for(int i=0; i<a.length;i++) {
			a[i]=s.nextDouble();
			sum+=a[i];	// sum=sum+a[i];
		}
		System.out.println(sum/5.0);
		*/
		
		/*
		// 숫자 4개의 합계와 곱을 구하는 프로그램을 작성
		Scanner s = new Scanner (System.in);
		int sum=0;	// 총합변수
		int multi=1;	// 총곱변수
		int ary[]=new int[4];
		for(int i=0; i<ary.length; i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요 : ");
			ary[i]=s.nextInt();
			sum+=ary[i];
			multi*=ary[i]; //multi=multi*ary[i];
			}
		System.out.println("합계 ==> "+ sum);
		System.out.println("곱셈 ==> "+ multi);
		*/
		
		/*
		//배열을 사용해서 출력
		//2.0 4.0 6.0 8.0 10.0
		
		double a[] = {2.0, 4.0, 6.0, 8.0, 10.0};
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		*/
		
		/*
		//1 2 3 5 8 13 21 34 55 89(피보나치) 인접한 위치에 있는 값을 더하는 것.
		int ary[] = new int[10];
		ary[0]=1; ary[1]=2;
		for(int i=0; i<8; i++) {
			ary[i+2]=ary[i]+ary[i+1];
		}
		for(int i=0; i<10; i++) {
			System.out.print(ary[i]+" ");
		}
		*/
		
		/*
		//5층 아파트가 있음
		// 사람 수 입력 받아
		//1층에는 몇 명 살아? 
		//2층에는 몇 명 살아? 
		//3층에는 몇 명 살아? 
		//4층에는 몇 명 살아? 
		//5층에는 몇 명 살아? 
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("몇 명 살아?");
		int ary[] = new int [5];
		for(int i=0; i<ary.length; i++) {
			System.out.printf("%d층에 사는 인원: ", i+1);
			ary[i] = s.nextInt();
			sum = sum + ary[i];
		}
		System.out.printf("5층까지 인구수 총합: %d", sum);
		*/
		
	}
}

