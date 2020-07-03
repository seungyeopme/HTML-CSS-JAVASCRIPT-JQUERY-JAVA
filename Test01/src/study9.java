import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
public class study9 {
	static void adder(int a, int b) {
		System.out.println(a+b);	//9

		
	}
	public static void main(String[] args) {
	
		int a=3,b=6;
		adder(a,b);
	}
}
*/

/*
//반환형이 있으면 return!
//반환형이 없으면 출력!
 
public class study9 {
	static int adder(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a=3,b=6;
		int r=adder(a,b);
		System.out.println(r);	//9
	}
}
*/

/*
public class study9 {
	static void total(int a[]) {
	}
	public static void main(String[] args) {
		int a[]= new int[4];
		total(a);
	}
}
*/

/*
//42 0
//경고
public class study9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try { 
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a/b;
		}catch (Exception e) {
			System.out.println("경고");
		}
		//두 정수를 입력받아 나누는 수가 0일 때
		//경고를 출력
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter out =null;
		
		int r;
		try {
			out=new FileWriter("e.txt");
			while((r=in.read())!=-1) {
				out.write(r);
			}
			in.close();
			out.close();
		}catch(IOException e) {
			System.out.println("입출력 오류!!");
		}
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		//f.txt에 읽어와서 콘솔에 출력
		FileReader f=new FileReader("f.txt");
		BufferedReader b = new BufferedReader(f);
		
		String n=null;
		while((n=b.readLine())!=null) {
			System.out.println(n);
		}
		f.close();
		b.close();
	}
}
*/

/*
//1. 정수 10개를 입력받아 배열에 저장한 후, 배열을 검색하여 4의 배수만 골라 출력하는 프로그램
public class study9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("정수 10개 입력해");
			num[i] = s.nextInt();
		}
		for(int i=0 ; i<10; i++){
			   if(num[i]%4==0){
				   if(num[i]==0) continue;    //값이 0일 때는 출력 반복문 넘기기
				   System.out.print(num[i]+" ");   //그 외의 4의 배수 출력.
			   		}
			  }
			  
			  s.close();
	}
}
//정수 10개 입력해
//1
//정수 10개 입력해
//2
//정수 10개 입력해
//3
//정수 10개 입력해
//4
//정수 10개 입력해
//5
//정수 10개 입력해
//6
//정수 10개 입력해
//7
//정수 10개 입력해
//8
//정수 10개 입력해
//9
//정수 10개 입력해
//10
//4 8 
*/

/*
//2. 정수 a=50, b=150으로 초기화해서 a가 b보다 크면 a와 b의 곱, 아니면 a를 b로 나눴을 때의 나머지 출력(삼항 조건 연산자 활용)

public class study9 {
	public static void main(String[] args) {
		int a=50, b=150;
		
		int c = (a<b) ? a*b : a%b;
		System.out.println(c);	//7500
	}
}
*/

/*
//3. 100이하의 자연수 중에서 2의 배수이고 7의 배수인 숫자를 출력하고, 출력된 숫자의 합을 출력(while문 이용)
public class study9 {
	public static void main(String[] args) {
		int num=1,sum = 0;
		
		while(num<=100) {
			if (num%2== 0 && num%7== 0) {
				System.out.println(num);
				sum+=num;
			}num++;
		}
		System.out.println("합: "+sum);
	}	
}
//14
//28
//42
//56
//70
//84
//98
//합: 392
 */

/*
//4. 정수를 입력받아 짝수이면 “짝수”, 홀수이면 “홀수” 라고 출력해라.
//정수를 입력하지 않은 경우에는 프로그램을 종료시켜라.(try-catch 사용)
public class study9 {
	public static void main(String[] args) {
		
		try {
				Scanner s= new Scanner(System.in);
				System.out.print("정수 입력해: ");
				int num = s.nextInt();
				
				if (num % 2 == 0)  
				    System.out.print(num + "는 짝수입니다.");
				
				else 
				    System.out.print(num + "는 홀수입니다.");
					s.close();
			}
				
				catch (Exception e) {
			    System.out.println("정수가 아니야, 정수 입력해");
				}
	}
}
//정수 입력해: 1
//1는 홀수입니다.

//정수 입력해: 2
//2는 짝수입니다.

//정수 입력해: 1.1
//정수가 아니야, 정수 입력해
*/

/*
//5. 무한루프안에 두 정수를 입력받아 합을 구하고, 실수를 입력하면 “실수는 안된다”라고 출력하고, 
//   다시 두 정수를 입력받는 코드를 작성해라.
//
//실행 결과) 두 정수 입력: 3 3.5
//        실수는 안된다
//
//        두 정수 입력: 3 5
//        답: 8 

public class study9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		while(true) {
			System.out.println("두 정수 입력: ");
			try {
				a=s.nextInt(); // 예외 가능성 있음
				b=s.nextInt(); // 예외 가능성 있음
				System.out.println(a+b);
				break;
			}catch(Exception e) {
				System.out.println("실수는 안된다");
				s.nextLine();	// 엔터 값으로 행단위로 끊어 저장해 주기 때문에
								// 다음 값을 입력할 때 지장이 없다
								// 입력 스트림에 있는 정수가 아닌 토큰을 버리는 코드
				continue; 		// 다시 위로 올라간다.
			}
		}
	}
}
//두 정수 입력: 
//10 2.2
//실수는 안된다
//두 정수 입력: 
//10 5
//15
*/ 


/*
//6. func함수 작성하기.(키보드로 입력한 양수를 5로 나누어 몫과 나머지를 변수에 저장하기
//main(){
//Scanner s = new Scanner(System.in);
//		int c=s.nextInt();
//		int a=c/5;
//		int b=c%5;
//	
//		func(a,b); //a->몫, b-> 나머지 
//} 
// 
//실행결과) 양수 입력: 8
//몫 : 1, 나머지: 3

public class study9 {
	static void func(int a, int b) {
		System.out.println(a+ " " +b);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int c=s.nextInt();
		int a=c/5;
		int b=c%5;
	
		func(a,b);
	}
}
*/


/*
//7. 다섯 과목 점수가 저장된 배열의 값에 따라 #출력 (#은 5점당 하나씩 출력하며 남는 점수는 버리기. pr함수를 작성
//main(){
//int score[]=new int[] {58, 60, 86, 90, 84};
//pr(score, 5) }

public class study9 {
	static void pr(int a[], int b) {
		for(int i=0; i<b; i++) {
			a[i]=a[i]/5;
			for(int j=0; j<a[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int score[]=new int[] {58, 60, 86, 90, 84};
		pr(score, 5);
		}
}
//###########
//############
//#################
//##################
//################
*/

/*
//8. 다음 main함수를 보고 반환형을 String값으로 주고 출력해라.
//   main(){
//     System.out.println(show(‘$’ , 10)); }

public class study9 {
	static String show(String a, int b) {
		String str="";
		for(int i=1; i<=b; i++) {
			str=str.concat(a); // $ 10번 연결
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(show("$",10));	//$$$$$$$$$$
	}
}
*/

/*
//9. “공부는 어렵지만, 재밌네요”라는 문자열을 str에 저장한 후,
//","를 기준으로 문자열을 구분해보고, 인덱스 6에 있는 한 글자를 출력, “공부는” 출력

public class study9 {
	public static void main(String[] args) {
		String str = "공부는 어렵지만, 재밌네요";
		String a[] = str.split(",");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.printf("%c \n", str.charAt(6));			//지
		System.out.printf("%s \n", str.substring(0, 3));	//공부는
		}
}
//공부는 어렵지만
// 재밌네요
//지 
//공부는 
*/

/*
public class study9 {
	 public static void main(String[] args) {
		 byte[]in= {1,2,3,4,5};
		 byte[]out=null;
		 
		 ByteArrayInputStream input = null;
		 ByteArrayOutputStream output = null;
		 
		 input = new ByteArrayInputStream(in);
		 output = new ByteArrayOutputStream();
		 
		 int r=0;
		 while((r=input.read())!=-1) {
			 output.write(r);	//스트림에 저장
		 }
		 out=output.toByteArray();	// 바이트 스트림을 바이트 배열로 바꿔서 out(바이트 배열) 
		 //저장
		 System.out.println(Arrays.toString(in));//문자열로 변경해서 저장해라
		 System.out.println(Arrays.toString(out));		
		 
		 }
}
//[1, 2, 3, 4, 5]
//[1, 2, 3, 4, 5]
*/

/*
//g.dat 파일에 123 출력
public class study9 {
	public static void main(String[] args) throws IOException {
		InputStream in=null;
		OutputStream out=null;
		//OutputStream out=new FileOutputStream("g.dat");
		//부모 클래스				자식 클래스
		try {
			byte[] b=new byte[] {1,2,3};
			in=new ByteArrayInputStream(b);
			out=new FileOutputStream("g.dat");
			
			int r=-1;
			while((r=in.read())!=-1) {
				out.write(r);
			}
		}catch(Exception e) {}
		out.close();
		in.close();
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=null;
		ByteArrayOutputStream out=null;
		
		try {
			in=new FileInputStream("g.dat");
			//g.dat파일을 읽어와서
			out=new ByteArrayOutputStream();
			//바이트 배열에 저장하겠다.
			int r=-1;
			while((r=in.read())!=-1) {
				out.write(r);  //배열에 저장함 1,2,3
			}
			byte [] b=out.toByteArray(); //스트림을 바이트 단위로 변경해서 바이트에 저장
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
		}catch(Exception e) {}
		out.close();
		in.close();
	}
}
//1
//2
//3
 */

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		
		DataOutputStream out=null;
		// 기본 자료형 값을 저장 할 수 있다
		try {
			int a=5;
			double b=1.5;
			boolean c=true;
			FileOutputStream fi=new FileOutputStream("h.txt");
			
			out=new DataOutputStream(fi);
			out.writeInt(a);
			out.writeDouble(b);
			out.writeBoolean(c);
		}catch(Exception e) {}
		out.close();
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		
		DataInputStream in=null;
		try {
			FileInputStream fi=
					new FileInputStream("h.txt");
			in=new DataInputStream(fi);
			int a=in.readInt();
			double b=in.readDouble();
			boolean c=in.readBoolean();
			// 파일에 저장한 기본자료형 값 읽어와서 출력
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		catch(Exception e) {} {
		in.close();
		}
	}
}
//5
//1.5
//true
 */


// 클래스에서 사용하는 변수 값을 필드라고 한다.
// 기능은 메소드로 구현
// 객체의 개수의 제한이 없다.
// 객체 배열이라는 개념이 나중에 나옴
// 객체.필드 = 객체의 초기화
// 인스턴스 이름.필드이름
// 각 인스턴스는 독립적인 공간을 차지한다.

// 메소드도 각 인스턴스마다 별도로 존재한다고 생각하고 사용하면 된다
// myCar1.upSpeed(30);
/*
class Car{	
	 String color;	//필드
	 int speed; 	//필드
	 
	 void upSpeed(int value) {	//메소드
		 speed=speed+value;
	 }
	 void downSpeed(int value) { //메소드
		 speed=speed-value;
	 }
}
*/

/*
class Profile{			//클래스 이름은 관행상 첫글자가 대문자
	int age;	 		//필드
	String name; 		//필드
	
	void show() {		// 메소드
		System.out.println(age+ " " +name);	//22 준호
	}
}
public class study9 {	//public 클래스는 소스파일에 하나만 생성 가능하다!
	public static void main(String[] args) {
		Profile p1=new Profile(); //인스턴스 p1 한글로는 객체 p1
		p1.age=22;
		p1.name="준호";
		p1.show(); 		//함수 호출
		
		//Scanner s=new Scanner():
		//s.nextInt();
	}
}
*/

//인스턴스.메소드
/*
class Circle{
	int r;
	String name;
	
	double area() {
		return 3.14*r*r;
	}
	void show() {
		System.out.println(name);
	}
}

public class study9 {
	public static void main(String[] args) {
		Circle c=new Circle();	//클래스명은 Circle 객체명은 c
		c.r=10;					
		c.name="윤혁";
		double a=c.area();
		System.out.println(a);
		c.show();
	}
}
//314.0
//윤혁
 */



/*
//필드를 보통 private로 두고, 함수(메소드)는 public으로 둔다.
class Circle{
	private int r;			//private을 붙이면 Circle 클래스 안에서만 사용 가능
	private String name;	//private을 붙이면 Circle 클래스 안에서만 사용 가능
	
	double area() {
		return 3.14*r*r;
	}
	void show() {
		System.out.println(name);
	}
}

public class study9 {
	public static void main(String[] args) {
		Circle c=new Circle();	//클래스명은 Circle 객체명은 c
		c.r=10;					
		c.name="윤혁";
		double a=c.area();
		System.out.println();
		c.show();
	}
}
*/

/*
class Human{
	String eyes="눈";
    String ears="귀";
    String nose="코";
    String mouth="입";
     
    void useEyes(){
        System.out.println(eyes+"으로 봄");
    }
    void useEars(){
        System.out.println(ears+"로 소리를 들음");
    }
    void useNose(){
        System.out.println(nose+"로 냄새를 맡음");
    }
    void useMouth(){
        System.out.println(mouth+"으로 욕을 함");
    }
}

public class study9 {
	public static void main(String[] args) {
		Human human=new Human();
        human.eyes="쌍꺼풀 수술한 눈";
        human.useEyes();
        human.useEars();
        human.useNose();
	}
}
//쌍꺼풀 수술한 눈으로 봄
//귀로 소리를 들음
//코로 냄새를 맡음
 */

/*
class Rec{
	int width;
	int height;	//필드
	
	int area(int a, int b) {
		return a*b; //메소드
	}
}

public class study9 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Rec r=new Rec();	//객체
		//너비와 높이를 입력받음
		r.width=s.nextInt();	//너비 입력한 값을 width에 저장
		r.height=s.nextInt();	//높이 입력한 값을 height에 저장
		System.out.println(r.area(r.width,r.height));		
	}
}
//10 5
//50
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		//문자열을 저장해서 읽어오는 코드
		//첫번째 방법
		FileWriter f=new FileWriter("i.txt");
		BufferedWriter w=new BufferedWriter(f);
		
		w.write("오늘은 금요일");
		w.newLine();
		w.write("자바는 참 재밌네요");
		w.newLine();
		w.close();
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		//문자열을 저장해서 읽어오는 코드
		//두번째 방법
		FileWriter bf = new FileWriter("i1.txt");
		BufferedWriter out = new BufferedWriter(bf);

		out.write("오늘은 금요일");
		out.newLine();
		out.write("자바는 참 재밌네요!!");
		out.close();
		}
	}
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		//문자열을 읽어와서 콘솔에 출력 
		//첫 번째 방법
		FileReader f=new FileReader("i.txt");
		BufferedReader w=new BufferedReader(f);
		
		String s=null;
		while((s=w.readLine())!=null) {
			System.out.println(s);
		}
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) {
		//문자열을 읽어와서 콘솔에 출력 
		//두 번째 방법
		try {
			FileReader fr=new FileReader("i.txt");
			BufferedReader br_f = new BufferedReader(fr);
			
			String line="";
			for(int i=1; (line=br_f.readLine())!=null; i++) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
//오늘은 금요일
//자바는 참 재밌네요
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		//문자열을 읽어와서 콘솔에 출력 
		//세 번째 방법
		
		BufferedReader in = new BufferedReader(new FileReader("i1.txt"));
		
		String str;
		while(true) {
			str=in.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		in.close();
	}
}
//오늘은 금요일
//자바는 참 재밌네요!!
 */


