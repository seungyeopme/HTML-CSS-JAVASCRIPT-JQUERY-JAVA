import java.util.Scanner;

public class study4 {

	public static void main(String[] args) {
		//1.	5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)
		/*
		double num = 5/3;
		System.out.printf("%.2f",num);
		*/
		//2.	키(double)를 하나 입력받아 160보다 작으면 “small”, 170보다 작으면 “medium”, 180보다 작으면 “large” 출력
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("키 입력=>");
		double ki = s.nextDouble();
		if (ki < 160) {
			System.out.println("small\n");	
		}else if(ki < 170) {
			System.out.println("medium");
		}
		else if(ki < 180) {
			System.out.println("large");
		}
		*/
		//3.	n1을 50, n2를 100으로 초기화하여 두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
		/*
		int n1 = 50, n2 = 100;
		char n3 = (n1>n2) ? 'o': 'x';
		System.out.println(n3);
		*/
		//4.	나이를 기준으로 중첩if문을 사용하여 출력해라.(나이, 키, 사이즈 각각 변수를 선언)
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("나이를 입력바랍니다: ");
		int age=s.nextInt();
		System.out.println("키를 입력바랍니다: ");
		double ki=s.nextDouble();
		if(age < 20) {
		if(ki<160) {
		System.out.println("사이즈는 S 입니다.");
		}else if(ki>=160 && ki<170) {
		System.out.println("사이즈는 M 입니다.");
		}else if(ki>=170) {
		System.out.println("사이즈는 L 입니다.");
		}else {
		System.out.println("다시 입력 바랍니다.");
		}
		}else if(age >= 20){
		if(ki<165) {
		System.out.println("사이즈는 S 입니다.");
		}else if(ki>=165 && ki<175) {
		System.out.println("사이즈는 M 입니다.");
		}else if(ki>=175) {
		System.out.println("사이즈는 L 입니다.");
		}else {
		System.out.println("다시 입력 바랍니다.");
		}
		}else {
		System.out.println("다시 입력 바랍니다.");
		}
		*/
		//5.	1부터 50까지의 정수를 출력해라.(for)
		/*
		for(int i = 1; i<=50; i++)
			 System.out.println(i);
		*/
		//5-1	1~50 정수 중 6의 배수를 출력해라.(for, if)
		/*
		for(int i = 1; i<=50; i++)
			if(i%6==0) {
				System.out.println(i);
			}
		*/
		//5-2	1~50까지의 총합 출력해라.
		/*
		 int sum =0;
		 for(int i = 1 ; i<=50; i++) {
		 sum+=i;
		 }
		 System.out.println(sum);
		 */
		//5-3	1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라.
		/*
		 int ran = (int)(Math.random()*50)+1;
		 	System.out.println(ran);
		*/
		// 6	a=10, b=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다. 
		// +이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
		/*
		 int a = 10, b = 20;
		 Scanner s = new Scanner(System.in);
		 System.out.println("연산자 +,-,/,* 하나를 입력하세요");
		 char op = s.next().charAt(0);
		 switch (op) {
		 case '+':
		 System.out.println(a+b);
		 break;
		 case '-':
		 System.out.println(a-b);
		 break;
		 case '*':
		 System.out.println(a*b);
		 break;
		 case '/':
		 System.out.println(a/b);
		 break;
		 }
		 */	
		
		/*
		//1,3,5,7,9 for문 사용 출력
		//첫 번째 방법
		for(int i=1; i<=9; i+=2) {
			System.out.print(i);
		}
		System.out.println();
		//두 번째 방법
		for(int j=1;j<=9;j++) {
			if(j%2==1) {
				System.out.print(j);
			}
		}
		*/
		
		/*
		// $$$
		// $$$
		// $$$
		// 출력
		for(int j=1;j<=9;j++) {
			System.out.print("$");
			if(j%3==0) {
			System.out.println();
			}

		}
		*/
		/*
		int score = 85;
		//char grade=(score>90)? 'A':(score>80)?'B':'C';
		//System.out.println(grade);
		
		if(score>90) {
			grade='A';
		}
		else if(score>80) {
			grade='B';
		}
		else 
			grade = 'C';
		*/
		
		/*
		int sum=0;
		for(int i=1;i<=50;i++) {
			if (i%6==0 || i%7==0) {	//i가 6의 배수이거나 7의 배수
				sum=sum+i;
			}	
		}
		System.out.println(sum);
		*/
		
		//중첩 for문
		//바깥 for문을 기준으로 안쪽 for문이 돈다.
		
		/*
		for(int k=2; k<=9; k++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d \n", k, j, k*j);
			}
			System.out.println();
		}
		*/
		
		/*
		// a=1~10, b=1~10까지 (random)
		// a가 b보다 크면 a/b
		//            a%b
		
		int a =(int)(Math.random()*10) + 1;
		int b =(int)(Math.random()*10) + 1;
		
		if(a<b)
			System.out.printf("%d/%d=%d",a,b,a/b);
		else if (a<b)
			System.out.printf("%d %% %d=%d",a,b,a%b);
		
		if (a>b) {
			System.out.println(a/b);
		}
		else {
			System.out.println(a%b);
		}
		
		double result = (a>b) ? a/b : a%b;
		System.out.printf("%.1f",result);
		
		*/
		
		/*
		//***
		//***
		//***
		for(int i=0;i<3;i++) {		//행
			for(int j=0; j<3; j++) {	//열
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		//$$$$$
		//$$$$$
		for(int i=0; i<2; i++) {			//행
			for(int j=0; j<5; j++) {
				System.out.printf("$");		//열
			}
			System.out.println();
		}
		*/
		
		/*
		//*			i=0 j=1
		//**		i=1 j=2
		//***		i=2 j=3
		//****		i=3 j=4
		//*****		i=5 j=5
		
		// i를 이용해서 j값이 나오도록!!!
		// 열 부분이 가변적일 때, 바깥변수인 i를 이용해서 공통된 수식이 나오도록 조건을 주면 쉽계 짤 수 있음.
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");	
		}
		System.out.println();
		
		}
		*/
		
		/*
		//*****
		//****
		//***
		//**
		//*
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		
		/*
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}
			else if (i>=5) {
				for(int j=0; j<9-i;j++ ) {
					System.out.print("*");
				}
				
			}
			System.out.println();

		}
		
		*/
		
		
		
/*	     
//	     *
//	    **
//	   ***
//	  ****
//	 *****

		for (int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
		for(int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
		}
*/	
		
/*		
//			*
//		   **
//		  ***
//		 ****
//		*****
//		 ****
//		  ***
//		   **
//		    *
		  for (int a = 0; a < 9; a++) {
		   if (a < 5) {
		    for (int s = 0; s < 4 - a; s++) {
		     System.out.print(" "); // 열로 공백4,3,2,1개출력
		    }
		    for (int d = 0; d < a + 1; d++) {// 열에서 별1,2,3,4개출력
		     System.out.print("*");
		    }
		   } else {		//a>=5
		    for (int s = 0; s < a - 4; s++) {
		     System.out.print(" "); // 열로 공백1,2,3,4개출력
		    }
		    for (int d = 0; d < 9 - a; d++) {
		     System.out.print("*");
		    }
		   }
		   System.out.println();
		  }
	*/		
		
/*		
//	     1
//	    123
//	   12345
//	  1234567
//	 123456789
	 
		for (int i= 0; i<5; i++) {
			for(int j=0; j<4-i; j++){	// 공백
				System.out.print(" ");
			}
			int n=1;
			for(int j=0;j<(i*2)+1;j++) {	//개수
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
*/
		
		//스캐너 객체 생성
		/*Scanner s = new Scanner(System.in);
		System.out.println("원하는 단 입력");
		int dan = s.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}*/
		/*
		원하는 단 입력
		2
		2*1=2
		2*2=4
		2*3=6
		2*4=8
		2*5=10
		2*6=12
		2*7=14
		2*8=16
		2*9=18
		*/

/*
//		구구단 거꾸로 출력
//		9 x 9 = 81	8 x 9 = 72	7 x 9 = 63	6 x 9 = 54	5 x 9 = 45	4 x 9 = 36	3 x 9 = 27	2 x 9 = 18	
//		9 x 8 = 72	8 x 8 = 64	7 x 8 = 56	6 x 8 = 48	5 x 8 = 40	4 x 8 = 32	3 x 8 = 24	2 x 8 = 16	
//		9 x 7 = 63	8 x 7 = 56	7 x 7 = 49	6 x 7 = 42	5 x 7 = 35	4 x 7 = 28	3 x 7 = 21	2 x 7 = 14	
//		9 x 6 = 54	8 x 6 = 48	7 x 6 = 42	6 x 6 = 36	5 x 6 = 30	4 x 6 = 24	3 x 6 = 18	2 x 6 = 12	
//		9 x 5 = 45	8 x 5 = 40	7 x 5 = 35	6 x 5 = 30	5 x 5 = 25	4 x 5 = 20	3 x 5 = 15	2 x 5 = 10	
//		9 x 4 = 36	8 x 4 = 32	7 x 4 = 28	6 x 4 = 24	5 x 4 = 20	4 x 4 = 16	3 x 4 = 12	2 x 4 = 8	
//		9 x 3 = 27	8 x 3 = 24	7 x 3 = 21	6 x 3 = 18	5 x 3 = 15	4 x 3 = 12	3 x 3 = 9	2 x 3 = 6	
//		9 x 2 = 18	8 x 2 = 16	7 x 2 = 14	6 x 2 = 12	5 x 2 = 10	4 x 2 = 8	3 x 2 = 6	2 x 2 = 4	
//		9 x 1 = 9	8 x 1 = 8	7 x 1 = 7	6 x 1 = 6	5 x 1 = 5	4 x 1 = 4	3 x 1 = 3	2 x 1 = 2	

		
		 for (int j=9;j>=1;j--){
			   for (int i=9;i>=2;i--){
			   System.out.print(i +" x "+ j +" = "+ i * j + "\t");
			  }
			  System.out.println();
			  }
		*/
		
		/*
		int n=1;	// 초기값 설정
		
		while(n<=5) {	// 조건식
			System.out.println(n);
			n++;		// 증감식
		}
		*/
		
/*		
		0
		2
		4
		6
		8
		10

		int i=0;
		while(i<=10) {
			System.out.println(i);
			i += 2;
		}

		
		int i =0;
		while(i<=10) {
			if(i%2==0) {
			System.out.println(i);
		}
			i++;
		}
*/
/*		
		1
		2
		3
		4
		5
		6
		7
		8
		9
		10
		
		//1부터 10까지 출력
		int i = 0;
		while(i<10) {
			i++;
			System.out.println(i);
		}
		*/
		
		/*
		//1부터 10까지 합
		int sum=0;
		int n=1;
		while(n<=10) {
			sum+=n;
			n++;
		}
		System.out.println(sum); //55
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("정수(2~4)하나 입력해!");
		int n= s.nextInt();
		//입력한 정수의 단 출력
		switch(n) {
		case 2:
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n",2,i,2*i);
			}
			break;
		case 3:
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n",3,i,3*i);
			}
			break;
		case 4:
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n",3,i,3*i);
			}
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
		*/
		/*
		int n=10;
		while(true) {
			if(n>9) {
				break;	// 반복문 탈출!! if문 탈출이 아닌 while문을 빠져나간다.
			}
			System.out.println(n);
			n++;
		}
		*/
		
		/*
		int sum=0,n=100;
		Scanner s = new Scanner(System.in);
		
		while(n!=0) { // 0이 아닐 때까지
			System.out.println("입력해주세요");
			n=s.nextInt();	//정수 입력
			sum+=n; //입력한 수 더함
		}
		System.out.println(sum);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("이름입력:");
			String name=s.next();
			if(name.equals("유강")) {
				break;
			}
			else {
				System.out.println(name);
			}
		}
		*/
		
		/*
		int hap=0;
		int i=1;
		while(i<=100) {
			hap=hap+i;
			if(hap>=1000) {
				break;
			}
			i++;
		}
		System.out.println(i);
		*/
		
		/*
		//continue 활용법
		for(int i=0; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}	//2,3의 배수만 제외
			System.out.println(i);
		}
		*/
		
		/*
		//1부터 6까지 범위설정해서(math.random)
		//만약 6이 나오면 프로그램 종료하고
		// 아닐 때에는 그 수 (랜덤값) 출력
		while(true) {
			int num = (int)(Math.random()*6)+1;
			if(num==6) {
				break;
			}else {
				System.out.printf("%d\n", num);
			}
		}
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("정수 5개 입력");
		
		int sum=0;
		for(int i=0; i<5; i++ ) { // 횟수
			int n=s.nextInt(); // 5번 입력됨
			if (n<0) {
				continue;	// 제외(올라가서 반복문 다시 실행)
			}
			else { 	// n>=0
				sum+=n;
			}
		}
		System.out.println("양수 합:" + sum);
		*/
		
	}
}

			
	
		

