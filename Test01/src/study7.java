import java.util.Scanner;

public class study7{
	static int coffee_machine(int button) {
		
		System.out.printf("\n#1.(자동으로) 뜨거운 물을 준비한다\n");
		System.out.printf("#2.(자동으로) 종이컵을 준비한다\n");
		
		switch (button) {
		case  1:
			System.out.printf("#3.(자동으로) 보통커피를 탄다\n"); break;
		case 2:
			System.out.println("#3.(자동으로) 설탕커피를 탄다"); break;
		case 3:
			System.out.println("#3.(자동으로) 블랙커피를 탄다"); break;
		default:
			System.out.println("#3.(자동으로) 아무거나 탄다"); break;
		}
		
		System.out.printf("#4.(자동으로) 물을 붓는다\n");
		System.out.printf("#5.(자동으로) 스푼으로 저어서 녹인다\n\n");
		
		return 0;
		}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.println("A님, 어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.print("A님 커피 여기 있습니다.\n");
		
		System.out.println("B님, 어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.print("B님 커피 여기 있습니다.\n");
		
		System.out.println("C님, 어떤 커피 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.print("C님 커피 여기 있습니다.\n");
	}
}

/*		
//배열 첨자가 배열 크기보다 커요!!

int []aa=new int[3];
try {
	aa[3]=100;	// 예외가 날 수 있는 코드
	System.out.println("aa"); //출력 안됨
} catch(Exception e) {
	System.out.println("배열 첨자가 배열 크기보다 커요!!");
}
 */

/*
public class study7{
static int in() {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt(); 
	  return n;
	 }
	public static void main(String[] args) {
	  System.out.println(in());
	 }
}
//15415151 (입력)
//15415151 (출력)
*/

//반환형이 void일 주로 출력함수
//매개변수가 void일 때 주로 입력 클래스
/*
public class study7{
	static int in(int p) {
		return p;	
	}
	public static void main(String[] args) {
		//정수 하나 입력받아 입력한 정수를 그대로 출력
		//함수명은 in
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(in(num));
	}
}
//15415151 (입력)
//15415151 (출력)
*/

/*
public class study7{
	static void cal(char a, int b, int c) {
		switch(a) {
		case '+':
			System.out.println(b+c); break;
		case '-':
			System.out.println(b-c); break;	
		}
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);	//+,-
	int b=s.nextInt();
	int c=s.nextInt();
	cal(a,b,c);
	}
}
-
9
6
3
*/

/*
public class study7{
	static double big(double a, double b) {
		return a>b ? a:b;
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int c=s.nextInt();
	int d=s.nextInt();
	System.out.print(big(c,d));	//
		// 두 수 중 큰 값 출력하는 함수
	}	
}
5
56
56.0
*/

/*
public class study7{
	static double big(double a, double b) {
		double max;
		if (a> b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("큰수는 " + max);
		return max;	
	}
	public static void main(String[] args) {
	big(5.5,6.5);
		// 두 수 중 큰 값 출력하는 함수
	}
}
*/

/*
public class study7{
	static double big(double a, double b) {
		return a>b ? a:b;
	}
	public static void main(String[] args) {
	System.out.println(big(5.5,7.5));
		// 두 수 중 큰 값 출력하는 함수
	}
}
*/

/*
public class study7{
static int big(int ary[]) {
	int max=0;
	for(int i=0;i<ary.length;i++) {
		if(max<ary[i]) {
			max=ary[i];
		}
}
	return max;
}

public static void main(String[] args) {
	int a[]=new int[7];
	Scanner s = new Scanner(System.in);
	
	for(int i=0;i<a.length;i++) {
		System.out.println("정수7개 입력: ");
		a[i]=s.nextInt();	
	}
	System.out.println(big(a));
	//매개변수 배열명일때, 
	//배열을 호출할  때 배열명만 적으면 됨
	}
}
정수7개 입력: 
1
정수7개 입력: 
2
정수7개 입력: 
3
정수7개 입력: 
4
정수7개 입력: 
8
정수7개 입력: 
55
정수7개 입력: 
2
55
*/

/*
public class study7{
public static void main(String[] args) {
	 
    String name = "lee sun shin";
    
    // sun을 soon으로 변경하기 
    if (name.contains("sun")) { //contains는 "sun" 이 name 변수에 있는지 있으면 true, 없으면 false 반환!
        name = name.replace("sun", "soon");
        System.out.println(name);
    }else {
        System.out.println("sun 이라는 문자열은 없습니다.");
    }
    
    // 성과 이름을 분리하기 
    String firstName = "";
    String lastName = "";
    
    firstName = name.substring(0, 3); // 0~3 
    lastName = name.substring(4);      // 4~last character
    
    System.out.println("성: " + firstName);
    System.out.println("이름: " + lastName);
	}
}
*/
	/*
	static int multi(int a, int b) {
		int mul=1;
		for(int i=1; i<=b; i++) {
			//i=1 1*2=2
			//i=2 2*2=4
			//i=3 4*2=8
			mul=mul*a;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		//2의 10승
		//2*2*2*2*2*2*2*2*2*2
		System.out.println(multi(2,10));	//1024
	}
	*/


	/*
	static int a;	//전역변수
	static void aa() {
		a=10;
	}
	static void bb() {
		int a;		// 지역변수
		a=20;
	}
	
	public static void main(String[] args) {
		aa();
		bb();
		System.out.println(a);	//10
	}
	*/
	

	/*
	static void in() {
		int a=10;	//지역변수
		System.out.println(a); //10
		
	}
	public static void main(String[] args) {
		
		int a=0;	//지역변수
		in();		//함수호출
		System.out.println(a);	//0
	}
	*/


/*
//30
//15
//60
//30

public class study7{
	public static void main(String[] args) {
        study7.sum(10, 20);
        study7.avg(10, 20);

        study7.sum(20, 40);
        study7.avg(20, 40);
    }
	 public static void sum(int left, int right){
	        System.out.println(left+right);
	    }

	 public static void avg(int left, int right){
	        System.out.println((left+right)/2);
	    }
	}
*/
	

	

	/*
	static void star(char a, int b) {
		int i = 0;
		while(i<=b) {
			System.out.print("*");
			i++;
		}
	}
	
	public static void main(String[] args) {
		star('*',10);	// **********(while)
	}
	*/


/*	
//	55
//	5050

	static void total(int a, int b) {
		int sum=0;
		for (int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		//1부터 10까지 합 출력
				//1부터 100까지 합 출력
		
		total(1,10);
		total(1,100);
	}
}
*/
	
//1. 출력을 어디에서 할 건지
//2. main에서 할거면 함수에서 리턴
//	 ->함수 호출과 동시에 출력
//	 ->변수를 주면서 리턴 값을 저장할 것인지!
//3. 함수에서 할거면 return문 필요없음 (void)

/*
{
	public static double meter(int n) {
		return n/100.0;
	}
	public static void main(String[] args) {
		double a;
		a=meter(176);
		System.out.println(a);	//1.76
	}
}
*/
/*
	{
	public static double meter(int n) {
	return n/100.0;
	}
	public static void main(String[] args) {
	System.out.println(meter(176)); //1.76

	
	}
}
*/
	/*
	public static void meter(int n) {
		System.out.println(n/100.0);
	}	// 함수 구현할 때 최대한 입력값(매개변수)를 활용해서 구현해야 한다!!
	
	public static void main(String[] args) {
		
		
		meter(176);	// 함수 호출  1.76로 나타내고 싶다
	*/
	
	/*	
	String ary[][] = {{"book","책"},
					  {"water","물"},
					  {"note", "노트"}};
	
	Scanner s = new Scanner(System.in);
	//book?
	//water?
	for(int i=0; i<ary.length; i++) {
		System.out.println(ary[i][0]+"의 뜻은?");
		String str=s.next();	//한글로 답을 입력함
		
		if(str.equals(ary[i][1])) {
			System.out.println("정답!");
		}
		else {
			System.out.println("정답은 "+ary[i][1]);
			}
	  }
	  */
	
	
	



/*
public class study7 {
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		 int a = 3;
	     int b = 4;

	     study7 myTest = new study7();
	     int c = myTest.sum(a, b);

	     System.out.println(c);	//7
	     
	}
}
*/	

/*	
//	원의 넓이: 94.985
//	원의 둘레: 20.096000000000004

	static double area(double r) {
		return 3.14*r*r;
	}
	static double round(double r) {
		return 3.14*r*2;
	}
	public static void main(String[] args) {
		System.out.println("원의 넓이: "+area(5.5));	//함수호출과 동시에 출력 area()
		System.out.println("원의 둘레: "+round(3.2));
		//넓이: 3.14 * 반지름 * 반지름
		//둘레: 3.14 * 반지름 * 2
*/		

/*
//	123
//	키는156.6
//	125
//	키는164.5
//	그럼 이만..
	
public static void pr(int id, double ki) {
	System.out.println(id);
	System.out.println("키는"+ki);
}
public static void show() {
	System.out.println("그럼 이만..");
}
public static void main(String[] args) {
	double k=164.5;
	pr(123,156.6);
	pr(125,k);
	show();
*/	
	
/*	
//	시작
//	안녕!
//	나이는52이다
//	안녕!
//	나이는23이다
//	끝

	public static void pro(int age) {	// void 반환형 없다. return 필요 없다.
		System.out.println("안녕!");
		System.out.println("나이는"+age+"이다");
	}
	public static void main(String[] args) {
		System.out.println("시작");
		pro(52);	// 함수호출
		pro(23);	// 함수호출의 횟수는 제한이 없다!
		System.out.println("끝");
	}
*/
	
	/*
	public static int plus(int v1, int v2) {	//v1:100, v2:200
		int result;
		result=v1+v2;	// result => 300
		return result;
	}
	
	public static void main(String[] args) {
		//함수 호출이 없으면 
		int hap;
		hap=plus(100,200);	// 함수호출!! 함수명만 적어준다!!
		System.out.println(hap);	//300

		 
		// 반환형
		// int, double, char, String, boolean, void
		// void -> return 키워드 필요없다.
	*/	
		/*
		String str[]={"JAVA", "C++"};		// 객체 배열
		System.out.println(str); 			// [Ljava.lang.String;@23d2a7e8
		System.out.println(str[0]);			//JAVA
		
		String b ="java,c++";
		b.split(" ");
		
		String a="java";
		System.out.println(a);		//java
		*/
		
		
/*	
//		java
//		c++

		String a="java,c++";
		String str[];
		
		str=a.split(",");
		for(int i=0; i<str.length;i++)
			System.out.println(str[i]);
*/
		
//		1. 50+11.8의 결과를 소수점을 버리고 출력해라.
		/*
		double a=50, b=11.8;
		System.out.printf("%.0f",a+b);
		*/
//		2. 0~20까지 수 중에서 3의 배수를 제외하고 출력해라.
//		(무한 반복문과 break, continue를 다 사용하여 출력)
		
/*		
//		1
//		2
//		4
//		5
//		7
//		8
//		10
//		11
//		13
//		14
//		16
//		17
//		19
		
		int i=0;
		while(true) {
			i++;
			if(i>=20) {
				break;
			}
			if(i%3==0) 
				continue;
			System.out.println(i);	
			
		}
*/	

		/*
//		정수 10개를 입력해주세요 0/10
//		100
//		정수 10개를 입력해주세요 1/10
//		50
//		정수 10개를 입력해주세요 2/10
//		100
//		정수 10개를 입력해주세요 3/10
//		50
//		정수 10개를 입력해주세요 4/10
//		100
//		정수 10개를 입력해주세요 5/10
//		50
//		정수 10개를 입력해주세요 6/10
//		100
//		정수 10개를 입력해주세요 7/10
//		50
//		정수 10개를 입력해주세요 8/10
//		100
//		정수 10개를 입력해주세요 9/10
//		50
//		[100, 50, 100, 50, 100, 50, 100, 50, 100, 50]
//		평균=75.0

		
		
		
//		3. 정수 10개를 입력받아 평균 출력(배열, length필드 사용)
		int input =0,sum=0;
		Scanner s = new Scanner(System.in);
		int userdata[] = new int[10];
		double avg = 0;
		
		//입력받기
		for (int i=0; i<userdata.length;i++) {
			System.out.println("정수 10개를 입력해주세요 "+i+"/"+userdata.length);
			input = s.nextInt();
			userdata[i]=input;
		}
		
		//평균 구하기
		for(int i=0; i<userdata.length;i++) {
			sum = sum +userdata[i];
		}
			avg= sum/userdata.length;
			
		//결과 출력
			System.out.println(Arrays.toString(userdata));
			System.out.println("평균=" + avg);
*/

		

/*		
//		정수 10개를 입력해주세요 0/10
//		35
//		정수 10개를 입력해주세요 1/10
//		63
//		정수 10개를 입력해주세요 2/10
//		56
//		정수 10개를 입력해주세요 3/10
//		42
//		정수 10개를 입력해주세요 4/10
//		1
//		정수 10개를 입력해주세요 5/10
//		3
//		정수 10개를 입력해주세요 6/10
//		5
//		정수 10개를 입력해주세요 7/10
//		79
//		정수 10개를 입력해주세요 8/10
//		101
//		정수 10개를 입력해주세요 9/10
//		152
//		35 63 56 42 		

		//		3.1) 정수 10개를 입력받아 7의 배수만 출력 (배열)
		try {
		int input =0;
		Scanner s = new Scanner(System.in);
		int userdata[] = new int[10];
		 
		//입력받기
		for (int i=0; i<userdata.length;i++) {
			System.out.println("정수 10개를 입력해주세요 "+i+"/"+userdata.length);
			input = s.nextInt();
			userdata[i]=input;
		}
		
		//7의 배수
		for(int i=0; i<10; i++) {
			if(userdata[i]%7==0) {
				if(userdata[i]==0)continue; // 값이 0일 때는 출력 반복문 넘기기
				System.out.print(userdata[i]+" "); // 그 외 7의 배수 출력
			}
		}
		
		s.close();
	}

		catch(InputMismatchException e) {	//int형이 아니라면 프로그램 종료
			System.out.println("정수가 아닙니다. 처음부터 다시 시작해주세요");
		}
*/		
		
//		4. 다음 코드를 보고 3가지로 변경하여 출력해라.
//		 double sum=0.0;

//		 double ary[]={1.0, 1.5, 2.0, 2.5};

//		 for(int i=0; i<4 ;i++)

//		    sum+=ary[i];

//		 System.out.println(sum);	//7.0


		 
/*
//		4.1)while문으로 바꾸어 출력해라.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		int i=0;
		while(i<4) {
			sum+=ary[i];
			i++;
		}
		System.out.println(sum);	
*/

/*		
//		4.2)do~while문으로 바꾸어 출력해라.

		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		int i=0;
		do{
			sum+=ary[i];
			i++;
		}while(i<4);
		System.out.println(sum);
*/
/*		
//		4.3)for~each문으로 바꾸어 출력해라.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		for(double a:ary) {
			sum+=a;
		}
		System.out.println(sum);
*/
		/*
		//평균3.783333333333333

		double score[][]= {{3.3,2.3},
							{4.4,3.2},
							{4.2,5.3}};	//3행 2열 초기화
				
							
		double sum=0.0;
		for(int i=0;i<score.length;i++) {			//행
			for(int j=0;j<score[i].length;j++) {	//열
				sum+=score[i][j];
			}	

		}
		int a=score.length;//3
		int b=score[0].length;//2	// 한 행에 대한 열의 개수
		System.out.println("평균"+sum/(a*b));
		*/
		
		/*
		//abcdefghijklmnopqrstuvwxyz
		//형변환 사용해서 출력
		char a='a';
		System.out.println((int)(a));	//97
		while(a<='z') {
			System.out.print(a);
			a=(char)(a+1);	//a++;
		}
		*/
/*		
//		5.1) 3행 3열 배열을 0~8까지정수로 초기화해라.
		int ary[][] = {{0,1,2},
				  	  {3,4,5},
				      {6,7,8}};
*/

/*
//		5.2) 2행 3열 배열을 a~f까지문자로 초기화해라.
		char ary1[][]=new char[][]
				{{'a','b','c'},{'d','e','f'}};
*/

/*
//		문제 6번
//		3행 4열의정수형 배열을 생성하여  0~9 범위의정수를 랜덤하게 저장한다.
//		저장후 2차원 배열과 합을 출력해라.

//	실행결과) 5 4 1 5

//	       0 5 3 5

//		   7 8 1 4

//		    합은 48
			
		int ary[][]=new int[3][4];
		int sum=0;
		for(int i=0; i<ary.length;i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = (int)(Math.random()*10);
				sum+=ary[i][j];
				System.out.print(ary[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		System.out.println("합은 "+sum);
*/
		
		//메소드
		//반환형 함수명(매개변수)		
		//함수호출이 없으면 함수 실행 안된다!!
	
	
