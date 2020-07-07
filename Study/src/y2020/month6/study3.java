import java.util.Scanner;

public class study3 {

	public static void main(String[] args) {
		
		/*
		//국어 70점, 영어 80점, 수학 90점으로 초기화해서 각각의 점수와 총점을 출력
		double kor = 70, eng = 80, mat = 90;
		
		System.out.printf("국어: %.1f\n영어: %.1f\n수학: %.1f\n", kor, eng, mat);
		System.out.printf("총점: %.1f", kor+eng+mat);
		*/
		
		/*
		// 2*3=6
		// 2*4=8 출력 printf로
		System.out.printf("%d*%d=%d\n",2,3,6);
		System.out.printf("%d*%d=%d\n",2,3,2*4);
		*/
		
		// 두 정수를 입력받아 합을 구하여 출력하는 프로그램
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("정수 a값을 입력해주세요=>");
		int a = s.nextInt();
		System.out.println("정수 b값을 입력해주세요=>");
		int b = s.nextInt();
		System.out.println("정수 a+b =>");
		System.out.println(a+b);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("두 정수 입력");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+b);
		System.out.printf("%.2f", (a+b)/2.0);
		
		// 두 정수를 입력받아 평균 출력하는 프로그램
		Scanner sa = new Scanner(System.in);
		double c = sa.nextDouble();
		double d = sa.nextDouble();
		System.out.println((c+d)/2);
		*/
		

//1.	10/4 한 결과값을 소수점까지 출력해라
		/*
		double a = 10, b = 4;
		System.out.printf("10 나누기 4의 결과는:%.1f",a/b);
		
		//System.out.println(10/4.0);
		*/
		
//2.	하나의 정수를 입력받아 그 수의 제곱을 구해라.
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("하나의 정수를 입력해주세요");
		int a = s.nextInt();
		System.out.printf("입력한 수의 제곱의 결과는:%d", a*a);
		*/
		
//3. 	a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 printf로 출력해라.
//		실행 결과) 4.0+1.2=5.2
		/*
		double a = 4.0 , b = 1.2;
		System.out.printf("%.1f+%.1f=%.1f",a,b,a+b);
		*/
		
//3-1.  앞에서 출력한 5.2를 소수점을 버려라. 
		/*
		double c = 5.2;
		System.out.println((int)c);
		*/

//4.	Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
//		실행 결과) 입력해라: kim seoul 29 65.5
//        내 이름은 kim이다.
//        사는 곳은 seoul이고, 나이는 29살이다.
//        몸무게는 65.5kg이다.
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요=> ");
		String name = s.next();
		System.out.println("내 이름은 "+name+"이다");
		
		System.out.println("사는 곳을 입력해주세요=> ");
		String address = s.next();
		System.out.println("사는 곳은 "+address+"이다");
		
		
		System.out.println("체중을 입력해주세요=> ");
		double weight = s.nextDouble();
		System.out.println("내 체중은 "+weight+"이다");
		*/
		
		/*
		// 여러분의 이름, 나이, 키, 혈액형 초기화해서 printf로 출력
		String name = "sy";
		int age=20;
		double ki = 171.1;
		char blood = 'A';
		
		System.out.printf("%s %d %.1f %c", name, age, ki, blood);
		//System.out.println("이름은 "+name+" 키는 "+ki+" 혈액형은 "+blood+"입니다.");
		*/
		
		/*
		// 6 + 2.5 이 결과 값을 1)소수점 버리기 2)반올림
		//double a =6, b=2.5;
		//System.out.printf("1)소수점 버리기=>%.1f+%.1f=%f\n",a,b,a+b);
	 
	    System.out.println((int)(6+2.5));
	    System.out.println(8.5+0.5);
	    */
		
		/*
		int a=10,b=4;
		if(a==10) {
			System.out.println("A");
		}
		else if(a<b) {
			System.out.println("B");
		}
		else if(a>b) {
			System.out.println("C");
		}
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("점수 입랙해!");
		int kor= s.nextInt();
		char grade;
		
		if(kor>90)
		{
			grade = 'A';
		}
		else if(kor>=80) {
			grade = 'B';
		}
		else if(kor>=70) {
			grade = 'C';
		}
		else 
			grade = 'F';
		
		System.out.println("학점: "+grade);
		*/
		
		/*
		int a=20,b=10;
		
		if (a>10) {
			if(b>=0) {
				b=1;
			}
			else {
				b=-1;
			}
		}
		System.out.println(a+ " " +b);
		*/
		
		/*
		int age = 25, kg = 60;
		char size;
		
		if(age<20) {
			if(kg<50) {
				size = 'S';
			}
			else if(kg<60) {
				size = 'M';
			}
			else 
				size='L';
		}
		else {	//age>=20
			if(kg<60)
				size='S';
			else if(kg<70) {
				size='M';
			}
			else {
				size='L';
			}
			
		}
		System.out.println(size);
		*/
		
		/*
		//세 과목의 총점이 300일 때, 다음 조건에 따라 평균 학점 출력해라
		//평균이 90점 이상이면 A
		//     90점 미만 80점 이상이면 B
		//     80점 미만 70점 이상이면 C
		//     그 이외 F
		int total = 300;
		double avg = 300/3.0;
		
		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		*/
		
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("무슨 요일이죠?");
		String day=s.next();
		
		//내가 입력한 요일 조건으로 인식
		switch(day) {
		case "목요일":
			System.out.println("목");
			break;
		case "금요일":
			System.out.println("금");
			break;
		default:
			System.out.println("목, 금 아님");
			break;
		}
		*/
		
		//학점이 A,B이면 "Excellent", C,D이면 "Good", F이면 "Bad"라고 출력
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("학점을 입력해주세요!");
		String score = s.next();
		
		switch(score) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("Good");
			break;
		default:
			System.out.println("Bad");
		}
		*/
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("학점을 입력해라");
		String grade=s.next();
		
		switch(grade) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("F");
			break;
		}
		*/
		
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("학점을 입력해라");
		char grade=s.next().charAt(0);
		//next() 문자열로
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("Excellent");
			break;
		case 'C':
		case 'D':
			System.out.println("Good");
			break;
		case 'F':
			System.out.println("F");
			break;
		}
		*/
		
		// switch~case문을 사용해서 문자한 입력받아 m입력하면 movie, s입력하면 sing, b 입력하면 book,
		// 나머지는 etc로 출력
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("영화를 보고 싶으면 m, 노래를 부르고 싶으면 s, 책을 보고 싶으면 b를 입력");
		char hobby = s.next().charAt(0);
		
		switch(hobby) {
		case 'm':
			System.out.println("movie");
			break;
		case 's':
			System.out.println("sing");
			break;
		case 'b':
			System.out.println("book");
			break;
		default:
			System.out.println("etc");
			break;
		}
		*/
		
		/*
		// 60점 이상이면 합격인데,
		// 4학년은 70점 이상이어야 합격
		Scanner s = new Scanner(System.in);
		System.out.println("점수 입력:");
		int score = s.nextInt();
		
		System.out.println("학년 입력: ");
		int year = s.nextInt();
		
		if (score>=60) {
			if(year != 4) {
				System.out.println("합격");
			}
			else if (score>=70) {
				//4학년이면서 70점 이상일 때
				System.out.println("합격");
				
			}
			else {
				//4학년이 70점 미만일때
				System.out.println("불합격");
			}
		}
		else {	// 60점 미만일 때
			System.out.println("불합격");
		}
		*/
		
		
		/*
		//static double	random()
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		
		// 0.0 <= (Math.random()) < 1.0;
		// 0.0   <= (Math.random()) < 6.0;
		// 1.0   <= (Math.random()) < 7.0;
		// 1     <= (Math.random()) < 7;
		int n = (int)(Math.random()*6)+1;
		System.out.println(n);
		//1, one
		//2, five
		//6, six
		
		switch(n) {
		case 1: 
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
		}
		*/
		
		/*
		//2~8까지 랜덤 함수
		int n = (int)(Math.random()*7)+2;	//2부터 8까지
		System.out.println(n);
		*/
		
		// ? : 
		// 삼항 조건 연산자
		
		/*
		int score=85;
		char grade=(score>90)? 'A' : 'B'; // 삼항 조건 연산자
										  // 조건식 ? TURE : FALSE
		System.out.println(grade); //grade = B
		*/
		
		
		/*
		//10~13시까지 random으로 범위준 후
		//10,11 -> 공부시간
		//12,13 -> 점심시간 출력
		int n = (int)(Math.random()*4)+10;	
		
		switch(n) {
		
		case 10:
		case 11:
			System.out.println("공부시간");
			break;
		
		case 12:
		case 13:
			System.out.println("점심시간");
			break;
		}
		*/
		
		/*
		// 1~100까지 수
		int n = (int)(Math.random()*100)+1;
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		// 0.0 <= (Math.random()) < 1.0;
		// 0.0 <= (Math.random()) < 100.0
		// 1.0 <= (Math.random()) < 101.0
		
		if(n%5==0)
			System.out.println("5의 배수");
		else if(n%10==0)
			System.out.println("n은 10의 배수");
		else {
			System.out.println("위 조건 다 아님");
		}
		*/
		
		/*
		// 81~100점
		int score = (int)(Math.random()*20)+81;
		// 0.0 <= (Math.random()) < 1.0;
		// 0.0 <= (Math.random()) < 20.0
		// 81.0 <= (Math.random()) < 101.0
		System.out.println(score);
		
		String grade;  //문자열 변수선언
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}
			else { 
				grade="A";
			}
		}
		else {	//90점 미만
			if(score>=85)
				grade="B+";
			else
				grade="B";
		}
		System.out.println("학점: "+grade);
	}
}
*/
		/*
		int a=50, b=100;
		int big;
		
		big=(a>b) ? a : b;
		System.out.println(big);
		
		}
		*/
		
		/*
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		*/
		
		/*
		//***** 출력
		for(int i=1; i<=5; i++) {	// 횟수
			System.out.print("*");	// 한 행에 출력
		}
		*/
		
		/*
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
		*/
		
		/*
		//for~if문 중첩
		//1부터 100까지 수 중에서
		for(int i=1; i<=100; i++) { //전제조건
			if(i%5==0 && i%6==0) {
			System.out.println(i);
			}
		}
		*/
		
		/*
		// 10부터 20까지 for문으로 출력
		for(int i=10; i<=20; i++) {
			System.out.println(i);
		}
		*/
		
		// 무한 루프 for( ; ; )
		
		/*
		// 0 2 4 6 8 10 출력
		for(int i=0; i<=10; i+=2) {
			System.out.println(i);
		}
		*/
		
		/*
		int hap = 0;
		for(int i=1; i<=10; i++) 
			hap=hap+i;	//1~10까지의 합
		System.out.println(hap); //55
		*/
		
		/*
		// 1부터 100까지 합 출력
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		
		/*
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) { //짝수이면
				sum+=i;		//더하겠다.
			}
		}
		System.out.println(sum);
		*/
	
		/*
		//몇 단 ? 7
		// 구구단이 거꾸로 출력
		Scanner s = new Scanner(System.in);
		System.out.println("몇 단 ? ");
		int dan = s.nextInt();
		
		for (int i=9; i>=1; i--) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		*/
		
		
		// *****
		// *****
		// *****
		
		/*
		for(int i=1; i<=15; i++) {
			System.out.print("*");	//println (x)
			if (i%5==0) {	// 5의 배수
				System.out.println(); // 줄 바꿈
			}
		}
		*/
	}
	
}
	
