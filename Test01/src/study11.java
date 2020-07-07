import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
public class 클래스이름 {

	// 멤버 변수, 필드, 인스턴스 변수
	int a;
    int b;
    
    // 생성자
    클래스이름(){
    	a=10;
        b=15;
    }

	// 메서드
	public static void main(String[] args){
    //프로그램 시작 시점 
    }
}
*/

/*
class Car{
	String name;
	int gas;
	Car(String n, int gas) {	//생성자 .. 클래스이름이랑 동일하게
		name=n;
		this.gas=gas;
	}
	Car(String n){	//생성자 .. 클래스이름이랑 동일하게
		name=n;
	}
}

public class study11 {

	public static void main(String[] args) {
		
		Car c=new Car("인피니티", 100);
		Car c1=new Car("그랜저");
	}
}
*/

/*
class Cal{	//클래스
	public static int max(int a, int b) {	//메소드
		return (a>b)?a:b;
	}
	public static int min(int a, int b) {	//메소드
		return (a<b)?a:b;
	}
}
public class study11 {
	public static void main(String[] args) {
		
		Cal c=new Cal();	//객체 생성
		System.out.println(c.min(6, 8)); // 객체로 접근도 가능
		System.out.println(Cal.max(3,8));//static이기 때문에 클래스로 접근 가능
	}
}
//6
//8
*/

// 객체 저장
// 객체를 파일에 입출력 할 수 있음
// 출력 =>ObjectOutputStream
// 입력 =>ObjectInputStream

// Serializable 객체 직렬화(인터페이스) 필요

/*
//객체 저장하는 작업  Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream os=null;
		try {
			os=new ObjectOutputStream(new FileOutputStream("ob.dat"));
			
			Stu s=new Stu(); //객채 생성
			s.setName("준");
			s.setId("123");
			s.setAge(22);
			os.writeObject(s);
	
		}catch(Exception e) {}
		os.close();
	}
}
*/

/*
//객체 읽어들이는 작업 Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
	
		ObjectInputStream is=null;
		
		try {
			is=new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s=(Stu)is.readObject();	//클래스 형변환
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
		}catch(Exception e) {}
		is.close();
	}
}	
//준
//123
//22
*/


// 클래스의 상속
// 조상, 부모, 슈퍼, 상위
// 자손, 자식, 서브, 하위

// 부모 클래스에 private으로 선언되었다면
// 상속이 불가하다.

/*
class Sports{	//부모 클래스
	String player;
	int number;
}
class Soccer extends Sports{	//상속, 자식 클래스
	int salary;
}
public class study11 {
	public static void main(String[] args) {
	
		Sports s=new Sports();	//객체 생성
		Soccer so=new Soccer();	//객체 생성
		so.salary=200000;
		so.player="손흥민";	//상속 받았기 때문에 접근이 가능하다
		so.number=12; 		//상속 받았기 때문에 접근이 가능하다.
		
		s.player="박지성"; 
//		s.salary=300000;	//부모 클래스로부터 자식쪽 필드, 메소드 접근 불가
	}
}
*/

/*
class XY{
	private int x,y;
	void set(int x, int y) {
		this.x=x;	//초기화,, 함수(메소드)에도  초기화 가능
		this.y=y;	//초기화,, (매개변수를 필드값에 저장)
	}
	void show() {	//출력이니까 void 
		System.out.println(x+" "+y);	//4 8
	}
}

class XYZ extends XY{	//자식	부모 		//XYZ(자식)가 XY(부모)를 상속받았다
						//set(),show()에 접근 가능 private는 접근 불가
	private String name;
	void setname(String name) {
		this.name=name;
	}
	void pr() {
		System.out.println(name);
		show();	//함수 호출(상속 받음)
	}
}
public class study11 {
	public static void main(String[] args) {
		//부모
		XY x = new XY();
		x.set(4, 8);
		x.show();
		
		//자식
		XYZ y=new XYZ();
		y.set(6, 8);
		y.setname("xyz");
		y.pr();
	}
}
//4 8
//xyz
//6 8
*/

//다른 생성자 호출 => this
//부모 클래스의 생성자를 호출=> super()
//super()를 사용할 때 주의할 점은 서브 클래스의 생성자 코드 중에서
//첫 번째 행에 나와야 한다.

//생성자의 상속
//여러 개의 생성자가 있을 때 슈퍼 클래스의 생성자 호출

/*
class Car{
	Car() {	//기본 생성자 먼저 출력 //부모 클래스의 기본 생성자만 출력 가능
		System.out.println("슈퍼 클래스");
	}
	Car(String str) {	//출력 안됨
		System.out.println("슈퍼 클래스 super"+str);
	}
}
class Sedan extends Car{
	Sedan(String str) {
		super(str);	//강제로 슈퍼클래스의 생성자를 호출하는 메소드 super()
		System.out.println("서브 클래스"+str);
	}
}
public class study11 {
	public static void main(String[] args) {
		Sedan sedan1=new Sedan("여기요!!");
	}
}
//슈퍼 클래스
//서브 클래스여기요!!

//슈퍼 클래스 super여기요!!
//서브 클래스여기요!!
*/

/*
class Person{  //부모
	private String name;	//필드
	Person(String name) {	//생성자
		this.name=name;
	}
	void name() {	//출력이니깐 리턴 값이 void	함수
		System.out.println(name);
	}
}
class Student extends Person{ //자식
	private String major;
	private String school;
	
	Student(String name, String major, String school) {
		super(name);	//부모 생성자 호출!!!  부모 생성자 상속
		//this.name=name;
		this.major=major;
		this.school=school;
	}
	void show() {
		System.out.println(major);
		System.out.println(school);
		name();	//name
	}
}

public class study11 {
	public static void main(String[] args) {
		//Person p=new Person("슬기");	// Person()=> 생성자
		Student s=new Student("슬기","컴퓨터","컴공");
		s.name();	//슬기
		s.show();
	}
}
//슬기
//컴퓨터
//컴공
//슬기
*/


//물려받은 기본 생성자 먼저 호출된 후 자식 클래스 출력된다.
//private을 붙이면  상속 불가능!
//상속은 되지만 클래스나 패키지 외에는 접근하지 못하도록 설정하는 것은 
//protected 접근 제어 수식어이다.
//protected는 자신의 클래스 또는 패키지에서만 접근이 가능하다.

//접근제어자 접근 허용 
//public > protected > default > private 

/*
class Book{
	String title;
	Book(){
		title="신곡";
	}
}

public class study11 {
	public static void main(String[] args) {
	
		Book b=new Book();
	}
}
*/


// 메소드 오버로딩(비슷하니 헷갈리 수 있다

// 메소드 오버라이딩(상속) =>기각하다, ~보다 중요하다 , 무효화하는 작업
// 메소드 오버라이딩 => 상위 클래스의 메소드를 하위 클래스에서 재정의 하는 것을 말한다.
// 부모에게 물려받은 것을 수정해서 사용하는 것을 말한다.

/*
class Employee{
	   
     String name;
     int age;
   
    // print() 메소드
    void print(){
        System.out.println("사원의 이름은 "+this.name+ "이고, 나이는" + this.age+"입니다.");
    }   
}

//Employee 상속
class Manager extends Employee{

	String jobOfManage;

 // print() 메소드 오버라이딩
 public void print(){
     System.out.println("사원의 이름은 "+this.name + "이고, 나이는" + this.age + "입니다.");
     System.out.println("관리자 "+this.name+"은 "+this.jobOfManage+" 담당입니다.");
 	}
}

public class study11 {
	public static void main(String[] args) {
		// Manager 객체 생성
	     Manager lee = new Manager();
	     
	     // 변수 설정   
	     lee.name = "하이언";
	     lee.age = 30;
	     lee.jobOfManage="프로젝트 매니저";
	        
	// Overriding된 Manager객체의 print()호출
	      lee.print();	
	}
}
//사원의 이름은 하이언이고, 나이는30입니다.
//관리자 하이언은 프로젝트 매니저 담당입니다.
*/

/*
class AAA{
	
	public void ride() {	// public을 생략하면 default로 설정된다. //오버라이딩
		System.out.println("오버라이딩AAA");
	}
	public void load() {
		System.out.println("오버로딩AAA");
	}
}
class BBB extends AAA{	//상속
	public void ride() {	
		System.out.println("오버라이딩BBB");	//재정의 , 함수를 다시 수정하고 있다.
	}
	public void load(int n) {	//함수의 이름은 똑같지만 매개변수의 값이 다르다.
		System.out.println("오버로딩BBB");
	}
}
public class study11 {
	public static void main(String[] args) {
		
		AAA a=new AAA();
		a.ride();
		a.load();
		
		BBB b=new BBB();
		b.ride();
		b.load(10);
	}
}
//오버라이딩AAA
//오버로딩AAA
//오버라이딩BBB
//오버로딩BBB
*/

// 슈퍼 클래스의 메소드 호출
// 서브 클래스에서 슈퍼 클래스의 메소드를 강제로 호출하려면 'super.메소드이름()'으로 호출한다. 

//메소드 오버라이딩의 제한:final =>재 정의 하지 못하도록 
//이렇게 하면 해당 메소드는 서브 클래스에서 오버라이딩을 할 수 없고 슈퍼 클래스에서 정의한 대로 사용해야 한다.
//final을 필드 앞에 붙이면 그 필드의 내용을 변경할 수 없다.
//일반적으로 final을 붙이는 필드는 상수처럼 고정된 형태이며
//주로 static과 함께 클래스 변수를 상수처럼 지정하는 데 사용된다.

/*
class B{
	static final double pi=3.14;
	//pi=pi+1; 고정된 값이기 때문에 수정할 수 없다. 에러
	double r;
	
	B(double r) { //생성자 생성
		this.r=r;
	}
	void area() {
		System.out.println(r*r*pi);
	}
}
public class study11 {
	public static void main(String[] args) {
	
		B b=new B(5.5);
		b.area();
//		b.pi=3.14; <-변경 불가능
	}
}
//94.985
*/

//메소드에 final을 붙이면 마지막 메소드가 되므로 오버라이딩(재정의) 할 수 없다.
//또한 필드에 final을 붙이면 마지막 변수 값을 갖기 때문에 변경 할 수 없다

/*
//자바 프로그래밍 for Beginner
//p468
//02.다음 코드는 어떤 출력 결과가 나오는가?
class Book{
	Book() {
		System.out.println("Book 클래스 생성자 ~~");
	}
}

class ComputerBook extends Book {
	ComputerBook() {
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
}
public class study11 {
	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook();
	}
}
//Book 클래스 생성자 ~~
//ComputerBook 클래스 생성자 ~~
*/

//자바 프로그래밍 for Beginner
//p469
//03.연습문제 2번의 코드를 수정하여 다음과 같은 결과가 나오도록 Book 클래스와 ComputerBook 클래스를 
//	 완성하시오. 단, Book 클래스의 생성자는 2개, ComputerBook 클래스의 생성자는 1개로 한다.

//public class Exam {
//	public static void main(String[] args) {
//		ComputerBook sedan1 = new ComputerBook("굿 자바");
//	}
//}

/*
 출력결과
 Book 클래스 생성자 ~~ (파라미터 없음)
 Book 클래스 생성자 ->굿 자바
 ComputerBook 클래스 생성자 ~~
 */

class Book{
	Book() {
		System.out.println("Book 클래스 생성자 ~~ (파라미터 없음)");
	}
	Book(String a){
		
	}
}

class ComputerBook extends Book {
	ComputerBook() {
		System.out.println("ComputerBook 클래스 생성자 ~~");
	}
}
public class study11 {
	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook("굿 자바");
	}
}
