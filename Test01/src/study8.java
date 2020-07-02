import java.util.Scanner;

/* 첫번째 방법
public class study8 {
	public static double average(int a, int b) {
		return (a+b)/2.0;
	}
	public static void main(String[] args) {
	// 두 정수를 입력받아서 평균 반환하는 함수  
	//10 200
	//105.0

		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		double avg=average(x,y);
		System.out.println(avg);
	}
}
*/

/* 두번째 방법
//두 정수를 입력받아서 평균 반환하는 함수  
//200 100
//150.0
public class study8 {
	public static double average() {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		return (x+y)/2.0;
	}
	public static void main(String[] args) {
		double avg=average();
		System.out.println(avg);
	}
	
}*/

/*
//세 번째 방법
//두 정수를 입력받아서 평균 반환하는 함수  
//100 200
//150.0
public class study8 {
	public static void average() {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println((x+y)/2.0);
	}
	public static void main(String[] args) {
		average();
	}	
}
*/
/*
//*****
//@@@@@@@@@@
public class study8 {
	public static void pr(char a, int b) {
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
	System.out.println();
	}
	public static void main(String[] args) {
		pr('*',5);  //*****
		pr('@',10);	//@@@@@@@@@@
	}	
}
*/

/*
//*****
//@@@@@@@@@@
public class study8 {
	public static void pr(String a, int b) {
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
	System.out.println();
	}
	public static void main(String[] args) {
		pr("*",5);  //*****
		pr("@",10);	//@@@@@@@@@@
	}	
}
*/

/*
public class study8 {
	public static int total(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int ary[]= {1,2,3,4,5};
		System.out.println(total(ary));	//15
		//총합
	}
}
*/

/*
public class study8 {
	public static int total(int a[][]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int ary[][]= {{1,2,3},
					 {4,5,6}};	
		System.out.println(total(ary));	//21   <--2차원 배열 총합
	}
}
*/

/*
public class study8 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(add(10,20));	//30
		//a=10,b=20을 주고 호출하여
		//두 수 더하는 add 함수 만들기
	}
}
*/

/*
public class study8 {
	public static int add(int a, int b) {
	int sum;
	sum = a + b;
	System.out.println(a + b);	//30
	return sum;
	}
	public static void main(String[] args) {
	add(10,20);	
	}
}
*/

/*
//15 8
//15
//두 정수 비교해서 큰 값 출력
public class study8 {
	public static void big(int a, int b) {
		int max=a>b?a:b;
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		big(s.nextInt(),s.nextInt());
	}
}
*/


//1.	1~10까지의 총곱을 출력해라.(while)
/*
public class study8 {
	public static void main(String[] args) {
		int i = 1;
		int mul = 1;
		while(i<10) {
		i++;
		mul=mul*i;
		}
		System.out.println(mul);	//3628800
	}
}
*/

/*
//2. 구구단의 짝수단만 출력하면서 해당되는 단의 범위까지(2단은 2*2, 4단은 4*4, 6단은 6*6, 8단은 8*8)출력해라.(break)
//2 x 1 = 2
//2 x 2 = 4
//4 x 1 = 4
//4 x 2 = 8
//4 x 3 = 12
//4 x 4 = 16
//6 x 1 = 6
//6 x 2 = 12
//6 x 3 = 18
//6 x 4 = 24
//6 x 5 = 30
//6 x 6 = 36
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//8 x 4 = 32
//8 x 5 = 40
//8 x 6 = 48
//8 x 7 = 56
//8 x 8 = 64
public class study8 {
	public static void main(String[] args) {
		
		for(int i=2; i<10; i+=2) { // 짝수 단만 2, 4, 6, 8
			for(int j=1; j<10; j++) { 
				System.out.println(i + " x " + j + " = " + i*j);
				if(j>=i)    // i = 2 일 때, j = 1, 2 까지 출력해서 반복문 탈출하기 위한 조건
					break;    // 4, 6, 8 단도 마찬가지
			}
		}
	}
}
*/	

/*
//3. main함수를 보고 adder, exp 함수를 작성해라.
//       main(){
//         int result=adder(10,20);          //두 수의 합 출력
//         System.out.println(result);
//         System.out.println(exp(3.5)); }   //3.5의 제곱한 값 출력

public class study8 {
	public static int adder(int a, int b) {
	return a+b;
	}
	public static double exp(double a) {
		return a*a;
	}
	public static void main(String[] args) {
		int result=adder(10,20);
		System.out.println(result);		//30
		System.out.println(exp(3.5));	//12.25
	}
}
*/

/*
//4.	원의 반지름 정보를 전달하면, 원의 넓이를 계산해서 반환하는 메소드를 만들어라.
//(두가지 과정으로) (메소드명은 임의로 준다.)
//4.1) 출력을 main에서 하기!
//4.2) 출력을 메소드안에서 하기!

public class study8 {
	 public static double width(double num){
	  double p=3.14;
	  double sirWidth=p*num*num;
	  return sirWidth; //width 값을 반환 
	}
	public static void main(String[] args) {
		System.out.println("반지름이 5인 원의 넓이 : "+ width(5));  //반지름이 5인 width 메소드 호출
	}	//반지름이 5인 원의 넓이 : 78.5
}
*/

/*
//5.	1  3  5  7  9  이러한 모양의 2차원 배열 출력해라.
//      11 13 15 17 19 

public class study8 {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 3, 5, 7, 9},
				{11,13,15,17,19},
				};
		for(int i=0; i<arr.length; i++){ 
			for(int j=0; j<arr[i].length; j++) 
				System.out.print(arr[i][j]+" "); 
				System.out.println(""); 
		}
	}
}
*/

/*
//6.   문자열 a에 “C++”, b에 “,JAVA”를 초기화해라.
//6-1) 문자열 a의 길이를 출력해라.
//6-2) a,b의 문자열을 연결해라.
//6-3) 인덱스 3부터 끝까지 출력해라.
//6-4) JAVA를 “C#”으로 변경해라 
//6-5) ,를 기준으로 문자열을 분리해라.
public class study8 {
	public static void main(String[] args) {
		String a="C++";
		String b=",JAVA";
		
		System.out.println(a.length());
		String c=a.concat(b);
		System.out.println(c);
		
		c=c.substring(3,7);
		System.out.println(c);
		
		c=c.replace("JAVA","C#");
		System.out.println(c);
		
		String []str=c.split(",");
		for(int i=0; i<str.length;i++)
			System.out.println(str[i]);
	}	
}
*/

/*
public class study8 {
	public static int big(int [][]a, int b, int c ) {
		int m=0;
		for(int i=0; i<b; i++) { 		//b :2
			for(int j=0; j<c; j++) {	//c :3
				if(m<a[i][j]) {
					m=a[i][j];
				}
			}
		}
		return m;
	}
	public static void main(String[] args) {
		//2행 3열
		int [][]grade= {{55,86,90},
						{60,58,100}};
		int max;
		max = big(grade,2,3);
		System.out.println("높은점수: "+max);	// 높은점수: 100
	}
}
*/

/*
//java.lang.ArithmeticException: / by zero
//at study8.main(study8.java:341)
//끝

public class study8 {
	public static void main(String[] args) {
		try {
			int n = 10/0; //error
			System.out.println(n);
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		finally {
			System.out.println("끝");
		}
	}
	
}
*/

/*
public class study8 {
	public static void main(String[] args) {
		int a =100, b=0;
		int result;
		try {
			if(b==0) {	// 이 블록에서 예외 처리 않겠다.
				throw new Exception("0으로 나누려고요? 안됩니다.");
			}	//예외 미루기, 던지기 
			result = a/b;
			}catch (Exception e) {
				System.out.println("발생 오류 ==> ");
				System.out.println(e.getMessage()); //0으로 나누려고요? 안됩니다.
			}
	}
}
*/

/*
//첫번째 수 입력
//5
//연산자 입력
//*
//두번째 수 입력
//0
//둘다 0이면 안됨
public class study8 {
	 public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  	try {
		  		System.out.println("첫번째 수 입력");
		  		int a=s.nextInt();
		  		
		  		System.out.println("연산자 입력");
		  		char b=s.next().charAt(0);
		   
		  		System.out.println("두번째 수 입력");
		  		int c=s.nextInt();
		   
		  		switch(b) {
		  			case '*':
		  				if(a==0 || c==0) {
		  					throw new Exception("둘다 0이면 안됨"); 
		  				}
		  					System.out.println(a*c);
		  					break;
		  			case '/':
		  				if(c==0) {
		  					throw new Exception("0이면 안됨"); 
		  				}
		  					System.out.println(a/c);
		  					break;
		  		}
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
	}
}
*/

public class study8 {
	 public static void main(String[] args) {
		 
	 }
}


