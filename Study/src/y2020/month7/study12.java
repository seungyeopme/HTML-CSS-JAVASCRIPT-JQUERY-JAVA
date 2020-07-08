package y2020.month7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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

/*
class Person{
	String name;
	String id;
	
	Person(String name) {	//생성자
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String major;
	
	//생성자 만들면서 부모 생성자 호출
	Student(String name) {
		super(name);	//생성자의 첫 줄에 적어야 한다. super
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Person p;	//부모 클래스의 객체 선언
		Student s=new Student("승엽");	//자식 클래스의 객체 생성

		p=s;	//업 캐스팅(자식클래스 객체를 부모 클래스의 객체로 캐스팅하는 작업)
				//Student에서 Person으로
		System.out.println(p.name);
//		p.grade="A"; //부모에서 자식으로 접근 불가
	}
}
*/

/*
class Person{
	String name;
	String id;
	
	Person(String name) {	//생성자
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String major;
	
	//생성자 만들면서 부모 생성자 호출
	Student(String name) {
		super(name);	//생성자의 첫 줄에 적어야 한다. super
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Person p=new Student("승엽");	//upcasting
		//Student s=new Student("승엽");
		Student s=(Student)p;//다운 캐스팅  //부모 클래스를 자식 클래스로 보내는 작업
		System.out.println(s.name);
	}
}
*/
/*
class Fruit{
	String a;
	int b;
	Fruit(String a, int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a + " "+b);
	}
}
class Apple extends Fruit{
	Apple(String a, int b){
		super(a,b);
	}
}

public class study12 {
	public static void main(String[] args) {
	
		Fruit f1=new Apple("red",10);//자식 쪽에 생성자가 있으면 부모 쪽에 생성자 생성해야
		f1.show();	//red 10
	}
}
*/

/*
class Elec{
	String color;
	Elec(String c){
		color=c;
	}
}
class Note extends Elec{
	int number;
	Note(String c, int n) {
		super(c); //color=c;
		number=n;
	}
}
class Ipad extends Note {
	int size;
	Ipad(String c, int n, int s) {
		super(c,n);//color=c; number=n;
		size=s;
	}
	void show() {
		System.out.println(color+"색 " +number+"개 "+size+"인치");
	}
}

public class study12 {
	public static void main(String[] args) {
	
		Ipad i1=new Ipad("white", 5, 5);
		i1.show();	//white색 5개 5인치
	}
}
//white색 5개 5인치
*/

/*
class Parent{
    int age=45;
    String name="Parent";
    public Parent(){
        System.out.println("Parent Default Constructor");
    }
    public Parent(int _age,String _name){
        age=_age;
        name=_name;
        System.out.println("Parent Constructor");
    }
    public void showInfo(){
        System.out.println("Name:"+name+", age:"+age);
    }
}
 
class Child extends Parent{
    public Child(int _age, String _name){
        System.out.println("Child Constructor");
    }
}
public class study12 {
	public static void main(String[] args) {
		Child a=new Child(25,"REAKWON");
        a.showInfo();
	}
}
//Parent Default Constructor
//Child Constructor
//Name:Parent, age:45
*/


//추상 클래스는 일반 클래스와 인스턴스를 생성할 수 없다.
//추상 클래스를 사용하려면 먼저 서브 클래스에서 추상 클래스를 상속받은 후
//서브 클래스의 인스턴스를 생성해야 한다.

//	abstract class 클래스이름 {
		//필드 및 메소드 정의
//	}

/*
abstract class Car{
	int speed=0;
	String color;
}
public class study12 {
	public static void main(String[] args) {
	
		Car c=new Car(); //abstract는 인스턴스 객체 생성 불가능
	}
}
*/

/*
abstract class Car{
	int speed=0;
	String color;
}
class Sedan extends Car{
}
class Truck extends Car{
}

public class study12 {
	public static void main(String[] args) {
	
//		Car c=new Car(); //abstract는 인스턴스 객체 생성 불가능
		Sedan sedan1=new Sedan();
		Truck truck1=new Truck();
		//추상 클래스를 상속받은 Sedan, Truck 클래스는 인스턴스를 상속받을 수 있다.
	}
}
*/

/*
//abstract 반환형메소드이름(파라미터);

//예를 들어 upSpeed()를 추상 메소드로 정의하면 다음과 같다.
//abstract void upSpeed(int speed);

//추상 메소드의 목적은 상속 받은 서브 클래스에서 오버라이딩(부모 클래스 물려받아서 자식에서 재정의)
//부모 클래스에는 추상 메소드로 껍데기만 만들어놓고,
//실제 내용은 각각의 서브 클래스에서 채워넣는 방식이다.

//추상 메소드가 하나라도 들어 있는 클래스는 무조건 추상 클래스로 지정해야 한다!!!
//추상 클래스 안에 일반적인 메소드, 추상 메소드는 올 수 있다.

//추상 클래스의 상속을 받은 서브 클래스는 추상 메소드를 오버라이딩하지 않으면 
//문법적으로 오류가 발생하므로 반드시 모든 추상 메소드를 오버라이딩하여
//그 내용을 다시 의무적으로 채워야 한다.


abstract class A{	//추상 클래스가 꼭 있어야 한다. 추상 메소드가 있기 때문에
	abstract void aa(); //추상 메소드	
}
public class study12 {
	public static void main(String[] args) {
	
	}
}
*/

/*
abstract class Car{	//추상 메소드가 존재하므로 클래스는 추상 클래스!!!
	String name;
	
	void run() {	//일반적인 메소드
		System.out.println("차가 움직인다");
	}
	
	abstract void stop();	//추상 메소드 //빈껍데기 함수 //선언만 해주어야!
}

class Cars extends Car{	//Cars-> 자식 Car->부모
	Cars() {
		this.name="인피니티";//name="인피니티" 도 가능
	}
	void stop() {	//추상 메소드는 반드시 상속받아서 구현(오버라이딩)
		System.out.println("차가 멈춘다");
	}
}

public class study12 {
	public static void main(String[] args) {
		
//		Cars c=new Cars();	//가능
		Car c=new Cars();	//업 캐스팅 이렇게도 가능

//		Cars c=new Car();	//다운 캐스팅은 불가능
//		Car c=new Car(); 객체 생성 불가능	
		c.run();
		c.stop();
	}
}
//차가 움직인다
//차가 멈춘다
*/


//추상 클래스에 필드, 일반 메소드, 추상 메소드가 모두 존재할 수 있다.
//단, 인스턴스로 만들지 못할 뿐이다.

/*
//첫번째 방법
abstract class Ca{
	int a,b,c;
	abstract int add(int a, int b);
	abstract double avg(int a[]);
}

class Cal extends Ca{
	public int add(int a, int b) {
		return a+b;
	}
	double avg(int a[]) {
		int hap=0;
		for(int i=0; i<a.length; i++) {
			hap = hap+a[i];
		}
		return hap/a.length;
	}
}
public class study12 {
	public static void main(String[] args) {
		
		Cal c=new Cal(); //Cal->클래스
		System.out.println(c.add(3,7));//두 수 합
		System.out.println(c.avg(new int[]	{1,2,3}));///1,2,3의 평균
	}
}
//10
//2.0
*/

// 두번째 방법
/*
abstract class Ca{
	abstract int add(int a, int b);
	abstract double avg(int a[]);
}

class Cal extends Ca{
	int add(int a, int b) {
		return a+b;
	}
	double avg(int a[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return (double)sum/a.length;
	}
}

public class study12 {
	public static void main(String[] args) {
		
		Cal c=new Cal(); //Cal->클래스
		System.out.println(c.add(3,7));//두 수 합
		System.out.println(c.avg(new int[]	{1,2,3}));///1,2,3의 평균
	}
}
//10
//2.0
*/

/*
class Num extends Exception{
	Num() {
		super("잘못된 값!!!!!");	// 부모 생성자 호출(Exception class에 있는)
	}
}
public class study12 {
	
	static int in() throws Num {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			Num num=new Num();	//객체 생성 , 생성자 호출
			throw num;	//예외 미루기, 예외 던지기, 여기서 처리 안함. 부모 클래스 생성자로 이동.
		}//else 생략
		return n;
	}
	public static void main(String[] args) {
		
		System.out.println("양수를 입력해라");
		try {
			int n=in(); //정수 입력하는 함수
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
//양수를 입력해라
//-7
//잘못된 값!!!!!

//양수를 입력해라
//8
//8
*/

/*
//직렬화
class Rec implements Serializable{	//Serializable <-인터페이스, 상속 개념
									//인터페이스를 구현할 때는 implements
									//클래스를 상속 받는 것은 extends
	//객체를 파일에 저장: 직렬화 과정
	//파일에 저장한 객체를 읽어옴: 역직렬화 과정
	
	int x,y; //필드
	Rec(int x, int y){	//생성자
		this.x=x; this.y=y;
	}
	void show() {
		System.out.println(x + "," + y);
	}
}
public class study12 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ObjectOutputStream out=
				new ObjectOutputStream
				(new FileOutputStream("obj.dat"));
		
		//Rec r=new Rec(4,7);
		out.writeObject(new Rec(4,7));
		out.writeObject(new Rec(8,5));
		out.writeObject(new String("glgl"));
	}
}
*/

/*
//역직렬화
class Rec implements Serializable{	//Serializable <-인터페이스, 상속 개념
									//인터페이스를 구현할 때는 implements
									//클래스를 상속 받는 것은 extends
	//객체를 파일에 저장: 직렬화 과정
	//파일에 저장한 객체를 읽어옴: 역직렬화 과정
	
	int x,y; //필드
	Rec(int x, int y){	//생성자
		this.x=x; this.y=y;
	}
	void show() {
		System.out.println(x + "," + y);
	}
}
public class study12 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInputStream in=
				new ObjectInputStream
				(new FileInputStream("obj.dat"));
		
		Rec r1=(Rec)in.readObject(); //down casting
		//object 객체-> Rec
		//형 변환
		Rec r2=(Rec)in.readObject();
		String str=(String)in.readObject(); //자바 api에서 최상위에 있는 것이 object 클래스이다.
		//Object(부모)를 
		//Rec, String 객체로 다운 캐스팅
		in.close();
		r1.show();
		r2.show();
		System.out.println(str);
	}
}
//4,7
//8,5
//glgl
*/

/*
//자바 api에서 최상위에 있는 것이 object 클래스이다.

Class Object
java.lang.Object

public class Object
Class Object is the root of the class hierarchy. 
Every class has Object as a superclass. 
All objects, including arrays, implement the methods of this class.
*/


//인터페이스는 추상 클래스와 거의 비슷하며 다중 상속을 위해 사용하기도 한다.
//인터페이스도 추상 클래스와 마찬가지로 직접 인스턴스를 생성할 수 없다.

//둘의 차이점으라면 인터페이스는 필드, 추상 메소드를 가질 수 있지만 추상 클래스와 달리
//일반 메소드, 생성자를 가질 수 없다는 것이다.

//메소드를 구현하려면 메소드 앞에 default!!!

//인터페이스 안에 abstract 라는 키워드를 안 적어주어도
//저절로 추상메소드로 인식한다.

//인터페이스는 기본 설정값이(추상메소드, 상수값(final))

/*
interface 인터페이스이름{
	 static final 필드 및 추상 메소드 정의
}
*/

//인터페이스에 들어가는 메소드는 추상 메소드밖에 없기 때문에 
//abstract를 생략해도 당연히 추상 메소드로 인식한다.
//또한 인터페이스는 implements 키워드를 사용한다는 의미에서
//클래스처럼 '상속받는다'라고 표현하기보다는 주로 '구현한다'라고 표현한다

/*
interface Car{
	static final int CAR_COUNT=0; //int CAR_COUNT=0; 이렇게 적어도 가능하다
	abstract void work(); //선언만 주고 있다.
}
class Sedan implements Car{
	public void work() {
					//인터페이스에서 메소드 구현시 반드시 public이 필요하다. 안 적으면 error
					//오버라이딩
		System.out.println("승용차가 사람 태운다");
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Sedan s=new Sedan(); 
//		Car s=new Sedan();		//up casting <-이렇게도 가능하다!
		s.work();
	}
}
//승용차가 사람 태운다
*/

//인터페이스를 만들 때 void,int 등의 반환형은 지정하지 않는다.
//반환형은 메소드, 함수만 !
//final 클래스 변수는 직접 접근은 가능하지만 변경은 불가능하다


/*
//Car1.java 파일에서 실행
 
class Sedan implements Car1{
	public void work() {
					//인터페이스에서 메소드 구현시 반드시 public이 필요하다. 안 적으면 error
					//오버라이딩
		System.out.println("승용차가 사람 태운다");
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Sedan s=new Sedan(); 
//		Car s=new Sedan();		//up casting <-이렇게도 가능하다!
		s.work();
	}
}
*/

//자바는 다중 상속을 허용하지 않는다.
//그 대안으로 인터페이스가 다중 상속을 허용한다.
//인터페이스에서 함수 구현 가능하다
//default를 앞에 붙여주면 가능하다.
//인터페이스의 추상 메소드를 완성할 때는 public을 붙인다.

public class study12 {
	public static void main(String[] args) {
	
	}
}