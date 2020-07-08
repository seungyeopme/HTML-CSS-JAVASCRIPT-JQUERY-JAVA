package y2020.month7;

import java.util.Scanner;

/*
class Car{
	String color;	//필드
	int speed;
	String getcolor() {
		return color;
	}
}
public class study12 {
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.color="빨강";
		c1.speed=0;
		c1.getcolor();
	}
}
*/

/*
class Circle {
	private int r;	//필드
	
	Circle(int r){	//생성자
		this.r=r;
	}
	int get() {		//메소드, 함수, 반지름을 돌려받는 함수
		return r;
	}
}

class NCircle extends Circle{
	String color;
	NCircle(int r, String c) {
		super(r);	//부모 생성자 호출  Circle(int r) 하는 것! private int r(필드)와는 관계 없다. 부모 생성자 호출!
					//만약 부모 생성자가 private이라면 접근 불가하다!!!
		this.color=c;	//이름이 같지 않으니 this로 굳이 같지 않으니 구분하지 않고 color=c; 라고 적어도 된다.
	}
	void show() {
		System.out.println("반지름 "+ get() +" "+color+"색");
	}
}
public class study12 {
	public static void main(String[] args) {
		
		NCircle n =new NCircle(10, "red");
		n.show(); //반지름 10 red색
	}
}
//반지름 10 red색
*/

//오버라이딩 => 상속 관계에 있는 클래스 간에 같은 이름의 메소드를 정의하는 기술
//오버로딩 => 같은 이름의 함수를 여러 개 정의하고, 매개변수의 유형과 개수를 다르게 하여 다양한 유형의 호출에 응답하게 한다.

/*
class Circle{ 			//클래스
	int r;
	Circle(int r){		//생성자
		this.r=r;
	}
	double getarea() {	//void가 아니면 return ,함수,메소드
		return r*r*3.14; 
	}
}

public class study12 {
	public static void main(String[] args) {
		
		Circle c=new Circle(10);
		c.getarea(); //3.14*10*10
	
	}
}
*/

/*
class Circle{ 			
	int r;
	Circle(int r){		
		this.r=r;
	}
	double getarea() {	//void가 아니여서 return값이 있다. void이면 출력 값이 존재
		return r*r*3.14; 
	}
}

public class study12 {
	public static void main(String[] args) {
		
//		Circle c1=new Circle(10);	//객체 생성
									//만약 100개를 생성해야 한다면? 
									//객체 배열을 사용하면 편리
									//객체 배열: 여러개의 객체를 배열형태로 묶어줌
//		int []ary=new int[4];

//		두줄로 객체 배열 생성 
//		Circle[]ary;
//		ary=new Circle[4];
		
		Circle[]ary=new Circle[4];	//한 줄에 객체배열 생성, 생성자 부분이 없다, 객체배열 4개 생성!
		
		for(int i=0; i<ary.length; i++) {
			ary[i]=new Circle(i); //생성자 생성, 객체 4개를 생성해서 배열위치에 저장
			System.out.println(ary[i].getarea());	//반지름 0,1,2,3에 대한 값을 출력
		}
	}
}
//0.0
//3.14
//12.56
//28.26
*/

/*
class Person{
	int age;
	String name;
	public Person() { //생성자1: 객체가 생성될 때 호출
		
	}
	public Person(String s) {	//생성자2
		name=s;
	}
	public String getName() {
		return name;
	}
}
public class study12 {
	public static void main(String[] args) {
		Person[] pa; //Person 타팁으로 객체에 대한 레퍼렌스가 10개 생성, 즉 10명의 사람을 생성.
		pa=new Person[10];
		
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person(); //배열의 원소 객체 생성. 즉, Person() 객체 생성
			pa[i].age=30+i;
			System.out.println("pa["+i+"]나이는 "+pa[i].age+"입니다");
		}
	}
}
//pa[0]나이는 30입니다
//pa[1]나이는 31입니다
//pa[2]나이는 32입니다
//pa[3]나이는 33입니다
//pa[4]나이는 34입니다
//pa[5]나이는 35입니다
//pa[6]나이는 36입니다
//pa[7]나이는 37입니다
//pa[8]나이는 38입니다
//pa[9]나이는 39입니다
*/

/*
class Song{
	String singer,title;
	
	public Song(String s,String t) {	//생성자 생성
		singer=s;
		title=t;
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		  Song so[]=new Song[2];
		  
		  for(int i=0;i<2;i++) {
		   System.out.println("가수");
		   String singer=s.next();
		   System.out.println("제목");
		   String title=s.next();
		   so[i]=new Song(singer,title);
		  }
		  for(int i=0;i<2;i++) {
		  System.out.println(so[i].singer +" "
		    +so[i].title);}
	}
}
//가수
//A
//제목
//a
//가수
//B
//제목
//b
//A a
//B b
*/

//1. 입력받은 텍스트를 java.txt파일에 저장하는 프로그램을 작성해라. (InputStreamReader, FileWriter 사용)
/*
//첫번째 방법
public class study12 {
	public static void main(String[] args) throws IOException {
		
	InputStreamReader in = new InputStreamReader(System.in);
	FileWriter out=new FileWriter("java.txt");
	
	int r;
	char s;
	
		while((r=in.read())!=-1) {
			out.write((char)r);
		}
			out.close();
			in.close();
	}
}
*/

/*
//두번째 방법
public class study12 {
	public static void main(String[] args) throws IOException {
	
	//콘솔창에 입력받은	
	InputStreamReader in = new InputStreamReader(System.in);
	
	
	FileWriter f=null;
	
	int r;
	try {
		f=new FileWriter("java1.txt");
		while((r=in.read())!=-1) {
			f.write((char)r);
		}
	}catch(Exception e) {}
		in.close();
		f.close();
	}
}
*/

/*
//2.main()를 보고 클래스를 작성해라.
//Student s1=new Student(“김길동”, “kim”);

//Student s2=new Student(“이길동”, “lee”);

//s1.pr(); s2.pr();         //모든 데이터 출력

class Student{
	String h,e;
		
	public Student(String h,String e) {	//생성자 생성
			this.h=h;
			this.e=e;
	}
	void pr(){
		System.out.println(h+e);
	}
}

public class study12 {
	public static void main(String[] args) {
		
		Student s1=new Student("김길동", "kim");
		Student s2=new Student("이길동", "lee");
		s1.pr(); s2.pr();         //모든 데이터 출력
	}
}
//김길동kim
//이길동lee
*/

/*
//txt 파일로 데이터 저장하기
public class study12 {
	public static void main(String[] args) {
	try {
		OutputStream os = new FileOutputStream("test01.txt");
		String s = "오늘 날씨는 좋아요";
		byte[] b=s.getBytes();
		os.write(b);
	}catch(Exception e) {
		e.getStackTrace();
		}
	}
}
*/

/*
//3. main()를 참조하여 클래스를 작성해라.
//main(){

//Music m=new Music(“On”, “BTS”);

//System.out.println(title+ “ “ +singer);  // On , BTS 출력

//Music m1=new Music(“00:00”);

//System.out.println(title+” “ +singer);  // 00:00, 방탄 출력

class Music{
	String title,singer;
	
	Music(String title, String singer){
		this.title=title;
		this.singer=singer;
	}
	Music(String title) {
		//this.title = title;
		//this.singer = "방탄";		
		this(title,"방탄");
	}
}
public class study12 {
	public static void main(String[] args) {
		
		Music m=new Music("On", "BTS");
		System.out.println(m.title+ " " +m.singer);  // On , BTS 출력

		Music m1=new Music("00:00");
		System.out.println(m1.title+" " +m1.singer);  // 00:00, 방탄 출력
	}
}
//On BTS
//00:00 방탄
*/


/*
//4. add, div메소드 구현해라.
//main(){

//int a=Cal.add(10,5); //합

//int b=Cal.div(10,5); //몫

//System.out.println(a +" " +b);}

class Cal{
	static int add(int a, int b) {	//static
		return a+b;
	}
	static int div(int c, int d) {
		return c/d;
	}
}
public class study12 {
	public static void main(String[] args) {
		int a=Cal.add(10,5); //합

		int b=Cal.div(10,5); //몫

		System.out.println(a +" " +b);
	}
}
//15 2
*/

//5.       0         이러한 모양 출력해라
//
//        012
//
//       01234
//
//      0123456


/*
public class study12 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for(int j=3-i; j>0; j--) {
				System.out.print(" ");
			}
		
		for(int k=0; k<(i*2)+1; k++) {
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
}
//		0		0->3	//공백 계산식 추출
//	   012		1->2
//	  01234		2->1
//	 0123456	3->0
*/

/*
public class study12 {
	public static void main(String[] args) {
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			int n=0;
			for(int j=0;j<(i*2)+1;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
	}
}
//		0		0->1	//숫자 계산식 추출
//	   012		1->3
//	  01234		2->5
//	 0123456	3->7
 */

/*
public class study12 {
	public static void main(String[] args) {
		int num = 5;
		for(int i=0; i<num; i++) {
			for(int j=1; j<num-i; j++) {
				System.out.print(" ");
			}
		for(int k=0; k<i*2+1;k++) {
			System.out.print("*");
		}
		System.out.println();
			
		}
	}
}
//	  *
//   ***
//  *****
// *******
//*********
*/

/*
class Card {
	String kind ;       	// 카드의 무늬 - 인스턴스 변수
	int number;             // 카드의 숫자 - 인스턴스 변수

	static int width = 100; // 카드의 폭 - 클래스 변수
	static int height = 250;// 카드의 높이 - 클래스 변수

}
public class study12 {
	public static void main(String[] args) {
		
		// 클래스변수(static 변수)는 객체생성없이 '클래스이름.클래스변수'로 직접 사용 가능하다.
		System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );             System.out.println("이제 c1의 width와 height를 각각 50, 80으로 변경합니다.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
}
//Card.width = 100
//Card.height = 250
//c1은 Heart, 7이며, 크기는 (100, 250)
//c2는 Spade, 4이며, 크기는 (100, 250)
//이제 c1의 width와 height를 각각 50, 80으로 변경합니다.
//c1은 Heart, 7이며, 크기는 (50, 80)
//c2는 Spade, 4이며, 크기는 (50, 80)
*/

/*
//6. 배열 안에서 제일 높은 점수를 리턴받는 get함수를작성해라.
//main(){

//int[][] grade = {{55, 60, 65}, {85, 90, 95}};

//int high;

//high= get(grade);

//System.out.println("가장 높은 점수는 " + high+ "점 입니다.") };

public class study12 {
	static int get(int ary[][]) {
		int higt=0;

		for (int i=0;i<ary.length;i++) {
			for (int j=0;j<ary[i].length;j++) {

				if(higt<ary[i][j]) {
					higt=ary[i][j];
				}
			}
		}
		return higt ;
	}

public static void main(String[] args) {
	int[][] grade = {{55, 60, 65}, {85, 90, 95}};
	int high;
	
	high= get(grade);
	System.out.println("가장 높은 점수는 " + high+ "점 입니다.") ;
	}	
}
//가장 높은 점수는 95점 입니다.
*/


//7. 두 개 배열에서 영어단어를 입력받아 한글을 출력하는 프로그램
//String eng[]={“student”,”book”,”future”,”note”};

//String kor[]={“학생”,”책”,”미래”,”노트”};

//           “stop"을 입력하면 프로그램을 종료시켜라. (while(true), equals() 사용)

//실행결과) 영어 단어 입력: book

//책

//     영어 단어 입력: stop

/*
public class study12 {
	public static void main(String[] args) {

		String eng[]={"student","book","future","note"};
		String kor[]={"학생","책","미래","노트"};
		
		Scanner s=new Scanner(System.in);
		
		int i=0;
		
		while (true) {
			eng[i]=s.next();
			System.out.println(kor[i]);

			if(eng.equals("stop")) {
				break;
			}
			i++;
		}
	}
}
//student
//학생
//book
//책
//future
//미래
//note
//노트
//stop
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//	at y2020.month7.study12.main(study12.java:547)
*/

/*
public class study12 {
	public static void main(String[] args) {
		String eng[]={"student","book","future","note"};
		String kor[]={"학생","책","미래","노트"};
		
		Scanner s=new Scanner(System.in);
		while(true) {
			String str=s.next();
			for(int i=0; i<eng.length;i++) {
				if(str.equals(eng[i])) {
					System.out.println(kor[i]);
					break;	//for 반복문 탈출 (가장 가까운 반복문 탈출)
				}
			}
			if(str.equals("stop")) {
				break;//while 반복문 탈출
			}
		}
	}
}
//student
//학생
//future
//미래
//note
//노트
//book
//책
//stop
*/

/*
class AA{
	int aa;
	AA(int aa){
		this.aa=aa;
	}
}
class BB{
	int bb;
	BB(int bb){
		this.bb=bb;
	}
}
public class study12 {
	public static void main(String[] args) {
		
		AA a=new AA(10);
		BB b=new BB(20);
		System.out.println(a.aa);//10
		System.out.println(b.bb);//20
	}
}
//10
//20
*/

/*
abstract class Cat{ // 추상 메서드를 포함하므로 추상클래스로 선언
    abstract void call(); // 추상 메서드 선언(구현x)
    void call2(){
        System.out.println("일반 메서드");
    }
}
 
//Cat 추상클래스를 상속한 클래스들
class FirstCat extends Cat{
    void call(){ //추상메서드는 서브클래스에서 반드시 재정의 되어야 함
        System.out.println("첫번째 야옹이");
    }
}
 
class SecondCat extends Cat{
    void call(){
        System.out.println("두번째 야옹이");
    }
}

public class study12 {
	public static void main(String[] args) {
		 FirstCat fc = new FirstCat();
	     SecondCat sc = new SecondCat();
	        
	     fc.call();
	     sc.call();
	}
}
//첫번째 야옹이
//두번째 야옹이
*/

//추상 클래스는 abstract로 선언된 클래스를 말합니다.
//이 클래스는 추상 메소드를 가지고 있거나 가지고 있지 않을 수도 있습니다.
//추상 클래스는 스스로 인스턴스가 될 수 없으나 자식 클래스는 가능합니다.
//추상 클래스를 사용하려면 상속 받아 사용해야합니다.

//추상 메소드는 구현부 없이 선언된 메소드입니다. (중괄호 없이, 마지막에 세미콜론(;)이 달립니다.

public class study12 {
	public static void main(String[] args) {
	
	}
}
