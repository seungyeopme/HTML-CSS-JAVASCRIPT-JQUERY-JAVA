package y2020.month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
class Name{
	private String name;
	private int age;
	
	Name(String n, int a){
		name = n;
		age = a;
	}
	String getname() {
		return name;
	}
	int getage() {
		return age;
	}
}
public class study15 {
	public static void main(String[] args) {

		//이름과 나이를 입력받아서 출력
		Scanner s = new Scanner(System.in);
		Name n = new Name(s.next(),s.nextInt());
		System.out.println("이름은 "+n.getname() + " "+"나이는 "+n.getage());
		
		//Name n = new Name("abc",30);
		//System.out.println("이름은 "+ n.getname() + " 나이는 "+n.getage()+"입니다.");
//		홍길동 30
//		이름은 홍길동 나이는 30
		}
}
*/



/*
class Book{
	String a,b;
	Book(String a, String b){
		this.a=a;
		this.b=b;
	}
	Book(String a){
		this.a=a;
		b="CSS";
	}
	void show(){
		System.out.println(a+" "+b);
	}
}
public class study15 {
	public static void main(String[] args) {
		
		Book b1=new Book("자바","DB");
		Book b2=new Book("HTML");
		b1.show();//자바 DB
		b2.show();//HTML CSS
	}
}
*/

/*
public class study15 {
	public static void main(String[] args) {
		
		Double b=new Double(10.5);//10.5f를 박싱(객체화)시키기
		double d=b.doubleValue();//언박싱
	}
}
*/

/*
abstract class Cal{
	protected int a,b;
	abstract int cal();	//추상 메소드
	
	void in() {
		Scanner s=new Scanner(System.in);
		System.out.println("두 수 입력");
		 a=s.nextInt();
		 b=s.nextInt();
	}
	void pr() {
		in();
		int r=cal();
		System.out.println("결과값"+r);
	}
}
class Multi extends Cal{
	int cal() {
		return a*b;
		
	}
}
class Div extends Cal{
	int cal() {
		return a/b;
	}
}
public class study15 {
	public static void main(String[] args) {
		//Cal 클래스 상속 받아 Multi, Div 클래스 짜기
		Multi m=new Multi();
		Div d=new Div();
		m.pr();
		d.pr();
	}
}
*/
/*
두 수 입력
10 5
결과값50
두 수 입력
10 5
결과값2
*/
		
		//compareTo 메소드
		
		//2개의 스트링을 사전적으로 비교, 문자열 비교 함수(사전 dictionary 순)
		//A와 B가 같으면 0을 반환
		//A가 B보다 크면 양수를 반환
		//A가 B보다 작으면 음수를 반환
		
			
		//StringBuffer
		
		//문자의 개수에 따라 버퍼 크기를 자동으로 조절할 수 있다.
		//문자열이 길거나 문자열 작업이 많은 경우
		//StringBuffer sb=new StringBuffer("Java");
		//sb.append(" is very good");//추가
		//sb.insert(0,"A ");
		//sb.replace(2, 6, "Html");
		//System.out.println(sb);	//A Java is very good	A Html is very good

/*
1. 다음 main함수를 보고 작성해라.

main(){

 Book b1=new Book(“멋진 신세계”, “올더스 헉슬리”);

 Book b2=new Book(“더 해빙”);

 Book b3=new Book(); }

실행 결과) 멋진 신세계 올더스 헉슬리

                   더 해빙 작가 미상

                   생성자 호출!!
*/
/*
class Book{
	String a,b;
	Book(String a, String b){
		this.a=a;
		this.b=b;
	}
	Book(String a){
		this(a," 작가 미상");	//다른 생성자 호출!!	// 매개변수가 2개 있는 생성자 호출하는 작업이다!!
	}
	Book(){
		this("생성자 호출","");	//다른 생성자 호출!! 두번째 파라미터에 공백을 줌으로써 생성자 호출만 출력한다!!
	}
	void pr() {
		System.out.println(a+b);
	}
}
public class study15 {
	public static void main(String[] args) {	
		
		Book b1=new Book("멋진 신세계", " 올더스 헉슬리");
		Book b2=new Book("더 해빙");
		Book b3=new Book(); 
		b1.pr();
		b2.pr();
		b3.pr();
	}
}
*/

/*
2. Friend클래스를 상속받은 ITFriend클래스를구현해라.

class Friend{

    private String name;

    private String phone;

Friend(String name, String phone){

    this.name=name;  this.phone=phone; }

String get(){

  return name + “ “+phone;}

 

Main() {

    ITFriend it=new ITFreind(“홍길동”, “010-111-1111”, “컴퓨터”);

    it.show();            

실행 결과) 컴퓨터 홍길동 번호 010-111-1111
*/
/*
class Friend{
	private String name;
	private String phone;

	Friend(String name, String phone){
		this.name=name; 
		this.phone=phone; 
	}
	String get(){
		return name + " "+phone ;
	}
}
class ITFriend extends Friend{

	String com;
	ITFriend(String a, String b, String c) {
		super(a,b);
		com=c;
}
void show() {
	System.out.println(get()+com);
	}
}
public class study15 {
	public static void main(String[] args) {

		ITFriend it=new ITFriend("홍길동", "010-111-1111", "컴퓨터");
		it.show();
	}
}
*/
/*
3. 5개 정수를 입력받아 합을 구하는 프로그램.
만약, 정수를 아닌 문자를 입력할 때 발생하는 InputMismatchException예외를 처리하여 다시 입력받도록 작성해라.

실행 결과) 1번째 정수: 1

         2번째 정수: a

         다시 입력해라. 정수아니다.

         2번째 정수 : 2

         3번째 정수 : 3

         4번째 정수: 4

         5번째 정수: 5          

         총합: 15
*/
/*
public class study15 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("5개 정수를 입력하세요: ");
		
		while(true) {
			try {
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();
				int d=s.nextInt();
				int e=s.nextInt();
				
				int sum=a+b+c+d+e;
				System.out.println("5개 정수의 합은 "+sum+"입니다.");
				break;
				
			}
			catch(InputMismatchException e) {
				
				s=new Scanner(System.in);
				System.out.println("잘못 입력했습니다. 정수만 입력해주세요!!");
			}
		}
	}
}
*/
/*
 5개 정수를 입력하세요: 
1.1 1.1 1.2 1.2 1.3
잘못 입력했습니다. 정수만 입력해주세요!!
1 2 3 4 5
5개 정수의 합은 15입니다.
*/
/*
public class study15 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		int sum=0,n;
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"번째 정수: ");
			try {
				n=s.nextInt();
			}
		catch(InputMismatchException e) {
			System.out.println("다시 입력해라. 정수 아니다.");
			s.next();	//잘못 입력된 값 지우는 작업
			i--;
			continue; //다시 반복문 올라가는 작업
		}
		sum+=n;
	}
		System.out.println(sum);
	}
}
*/
/*
1번째 정수: 
1
2번째 정수: 
2
3번째 정수: 
3
4번째 정수: 
1.1
다시 입력해라. 정수 아니다.
4번째 정수: 
5
5번째 정수: 
2
13
*/

/*
4. 실수 9.5를 객체화(박싱) 시켜라.

4.1) 객체화 시킨 9.5를 문자열로 변경해라.

4.2) 문자열로 변경한 9.5를 기본형값으로 언박싱해라.
*/
 /*
public class study15 {
	public static void main(String[] args) {
		double data1= 9.5f;
		Double a=new Double(data1);	//박싱
		System.out.println(a);
		
		String b=a.toString();//문자열로
		System.out.println(b);
		
		double c=Double.parseDouble(b);
		System.out.println(c);
	}
}
*/
/*
9.5
9.5
9.5
*/

/*
5. equals(두 원의 면적이 같은지 비교),  toString메소드를 사용하여 완성시켜라.

(반지름이 30임)

main(){

Circle a=new Circle(30);

                     Circle b=new Circle(30);

                     System.out.println("반지름"+a);

                     System.out.println("반지름"+b);

                     if(a.equals(b)) {

                                System.out.println("같은 원"); }

                     else {

                                System.out.println("다른 원");} }
*/
//첫번째 방법
/*
class Circle{
	int n;
	
	Circle(int n){
		this.n=n;
	}
	public String toString() {
		return n+" ";
	}
	public boolean equals(Circle ob) {
		if(this.n==ob.n) {
			return true;
		}
		return false;
	}
}

public class study15 {
	public static void main(String[] args) {
	
		Circle a=new Circle(30);
		Circle b=new Circle(30);

        System.out.println("반지름"+a);
        System.out.println("반지름"+b);

        if(a.equals(b)) {
        	System.out.println("같은 원"); }
        else {
        	System.out.println("다른 원");
        }
	}
}
/*
반지름30 
반지름30 
같은 원
*/

//두번째 방법
/*
class Circle{
	int n;
	
	Circle(int n){
		this.n=n;
	}
	public String toString() {
		return n+" ";
	}
	public boolean equals(Object ob) {
		if(this.n== ((Circle)ob).n) {
			//down casting
			return true;
		}
		return false;
	}
}

public class study15 {
	public static void main(String[] args) {
	
		Circle a=new Circle(30);
		Circle b=new Circle(31);

        System.out.println("반지름"+a);
        System.out.println("반지름"+b);

        if(a.equals(b)) {
        	System.out.println("같은 원"); }
        else {
        	System.out.println("다른 원");
        }
	}
}
*/
/*
반지름30 
반지름31 
다른 원
*/

/*
6. 인터페이스 Po를 만들고 추상메소드 pr을 만들어라. 상속받아 구현해라.

main(){

Po p=new Point();

           p.pr(30000,"java");  

           p.pr("python"); }

실행 결과) java책은30000원

         python
*/
/*
interface Po{
	void pr(int a, String b);
	void pr(String a); //오버로딩
}
class Point implements Po{
	public void pr(int a, String b) {
		System.out.println(b+"책은 "+a);
	}
	public void pr(String a) {
		System.out.println(a);
	}
}
public class study15 {
	public static void main(String[] args) {

		Po p=new Point();
		p.pr(30000,"java");  
		p.pr("python"); 
	}
}
*/

/*
abstract class Ab {
		abstract String pr(String a, int b);
	}
	class Aa extends Ab{
		String c="";
		String pr(String a, int b) {
			for(int i=0; i<b; i++) {
				a=c.concat(a); //$
				System.out.print(a); //$
			}
			return a;
		}
	}

	public class study15 {
		public static void main(String[] args) {
		
			Ab a=new Aa();//Ab는 추상 클래스
						  //pr은 추상 메소드
			System.out.println(a.pr("$",10));
			//$$$$$$$$$$
	}
}
*/

/*
class Fruit{
	void fruit() {
		System.out.println("과일");
	}
}
class Apple extends Fruit{
	void apple() {
		System.out.println("사과");
	}
}
class PineApple extends Apple{
	void pineapple() {
		System.out.println("파인애플");
	}
}
public class study15 {
	
	static void pr(Fruit fr) {
		//Fruit fr=new Fruit;
		if(fr instanceof PineApple) {
			((PineApple) fr).pineapple();
		}//다운 캐스팅 할 때 클래스 명칭 적어햐 한다!!!
		else if(fr instanceof Apple) {
			((Apple) fr).apple();
		}
		else 
			fr.fruit();
	}
	
	public static void main(String[] args) {
	
		Fruit f=new Fruit();
		Apple a=new Apple();
		PineApple p=new PineApple();
		
		pr(f);//객체로 부터 접근하는 것이 아니라 메인과 퍼블릭 클래스 사이에 있는 함수
		pr(a);
		pr(p);
	}
}
*/
/*
과일
사과
파인애플
*/

/*
interface Elec{
	abstract void pr();
}
class Ipad implements Elec{
	int a;
	Ipad(int a){
		this.a=a;
	}
	public void pr() {
		System.out.println(a+"만원");
	}
}

public class study15 {
	public static void main(String[] args) {
		
		Elec e=new Ipad(80);	//Elec 인터페이스명
								//pr() 추상 메소드
		e.pr();	//80만원	
	}
}
*/

/*
abstract class Profile{
	abstract void add(String name, String id);
	abstract String check(String id);
}
class Person{
	String name,id;
	Person(String n, String i){
		name=n; id=i;
	}
	String getname() {
		return name;
	}
	String getid() {
		return id;
	}
}
class Per extends Profile{
	Person ary[];	//객체 배열 선언
	int n;
	Per(int n) {
		ary=new Person[n];
		n=0;
	}
	public void add(String name, String id) {
		ary[n]=new Person(name,id);
		n++;
	}
	public String check(String id) {
		for(int i=0;i<n;i++) {
			if(id.compareTo(ary[i].getid())==0) {	//문자열이 같으면 0 return
				return ary[i].getname();
			}
		}
		return null;
	}
}
public class study15 {
	public static void main(String[] args) {

		Profile p=new Per(5);	//객체 5개 생성
		p.add("승철","123");
		p.add("두희", "345");
		p.add("주희", "344");
		
		System.out.println(p.check("123"));
		System.out.println(p.check("345"));
		System.out.println(p.check("344"));
	}
}
*/
/*
승철
두희
주희
*/

/*
abstract class A{
	protected int n;
	A(int n) {
		this.n=n;
	}
	abstract boolean even();	//13이 짝수인지 홀수인지
								//짝수이면 true, 홀수이면 false 리턴
}
class C extends A{
	int n;
	C(int n){
		super(n);	//this.n=n;
	}
	boolean even(int n) {
		if(n%2==0) { 
			System.out.println(n+"은 짝수");
			return true;
		}
	else {
		System.out.println(n+"은 홀수");
		return false;
	}
}
	@Override
	boolean even() {
		// TODO Auto-generated method stub
		return false;
	}
}

public class study15 {
	public static void main(String[] args) {

		C c=new C(13);
		System.out.println(c.even(13));
	}	
}
*/
/*
13은 홀수
false
*/


/*
 싱글 쓰레드
 멀티쓰레드
 
 start() => run()
 
 a.start();
 b.start();
 ---------------------------
 1. join()
 2. synchronized (lock을 건다)
 하나의 메소드에 여러 개의 쓰레드가 접근할 때, 메소드 잠그는 작업
 3. wait(), notify()
 
 */
//public class study15 {
//	public static void main(String[] args) {

		/** 말 쓰레드 5개 생성*/
//		Horse horse1 = new Horse("최윤진", new Rank());
//		Horse horse2 = new Horse("김윤진", new Rank());
//		Horse horse3 = new Horse("박윤진", new Rank());
//		Horse horse4 = new Horse("심윤진", new Rank());
//		Horse horse5 = new Horse("윤자", new Rank());
//
//		
		/** 말 쓰레드 5개 실행*/
//		horse1.start();
//		horse2.start();
//		horse3.start();
//		horse4.start();
//		horse5.start();


//		Thread myThread = null;
//		for (int i = 1; i <= 5; i++) {
//			myThread = new Horse(i+"번", new Rank());
//			myThread.start();
//		}
		
		
//	} // end of main
//} // end of class

//class Horse extends Thread {
	/** 말의 이름 */
//	String h_name = "";

	/** 총길이 */
//	int meter = 100;

	/** 등수 매길 static 변수 */
//	static int count = 1;

	/** Rank클래스 */
//	Rank rank;

	/** 기본생성자 */
//	public Horse() {
		// TODO Auto-generated constructor stub
//	}

	/** 말의 이름과 객체를 만들 Rank생성 */
//	public Horse(String h_name, Rank rank) {
//		this.h_name = h_name;
//		this.rank = rank;
//	}

//	@Override
//	public void run() {
		// TODO Auto-generated method stub
//		try {
//			while (true) {
//				/** 1~2000 사이의 난수 발생후 sleep */
//				sleep((int) (Math.random() * 2000 + 1));

//				System.out.println(h_name + " 말의 남은 거리 : " + meter);

//				/** 말이 20미터 단위로 이동 */
//				meter -= 20;

//			/** meter가 0이되면 결승점이기 때문에 rank.finishLine(말의 이름)실행 */
//				if (meter == 0) {
//					this.rank.finishLine(h_name);
//					break;
//				}
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//		}
//	}

//}

//class Rank {
//	/** 말의 등수 */
//	int rank;

//	public Rank() {
		// TODO Auto-generated constructor stub
//	}

//	public void finishLine(String name) {
//		// TODO Auto-generated method stub
//		rank = Horse.count++;
//		System.out.println(name + " 말 " + rank + "등으로 결승점 도착");

//		/** 1등 말일 경우 JOptionPane.showMessageDialog로 띄어준다 */

//		if (rank == 1) {
//			/** 첫번째 매개변수는 Frame지정인데 없기때문에 기본frame로 띄운다 없으면 null지정 가능. */
//			JOptionPane.showMessageDialog(null, "1등말은 " + name + " 입니다 !!");
//		}
//	}
//}

/*
//Thread 클래스 상속
class Th extends Thread{
	String str;
	Th(String str){
		this.str=str;
	}
	public void run() {		//쓰레드의 메인메소드
		for(int i=0;i<10;i++) {
			System.out.println(str);
		try {
			sleep(100); //1000이 1초 100은 0.1초
		}
		catch(Exception e) {}	
		}
	}
}
public class study14 {
	public static void main(String[] args) {
		Th t = new Th("쓰레드");
		t.start();	
	}
}
*/

/*class Music extends Thread{
	String m;
	
	Music(String m){
		this.m=m;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(m);
		}
	}
}
class Movie implements Runnable{
	String s;
	Movie(String s) {
		this.s=s;
	}
	public void run() {
		System.out.println(s);
	}
}
public class study15 {
	public static void main(String[] args) {
		
		Music m=new Music("음악 재생");
		m.start(); //10번 출력
		
		Movie m1=new Movie("영화 재생");
		Thread t=new Thread(m1);
		t.start(); //영화 재생 출력
	
		try {
			m.join();
			t.join();
		}catch(Exception e) {}
	}
}
*/

/*
class Th extends Thread{
	String str;
	Th(String str, int n) {
		this.str=str;
		setPriority(n);//쓰레드 우선순위 세팅
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(str);
			System.out.println(getPriority());//getPriority(); 쓰레드 우선순위 얻어냄
		}
	}
}
public class study15 {
	public static void main(String[] args) {
	
		Th t1=new Th("효준",Thread.MAX_PRIORITY);//MAX_PRIORITY =>10
		Th t2=new Th("윤혁",Thread.MIN_PRIORITY);//MIN_PRIORITY =>1
		Th t3=new Th("오섭",Thread.NORM_PRIORITY);//NORM_PRIORITY =>5
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
*/
/*
효준
10
효준
10
효준
10
효준
10
효준
10
효준
10
효준
10
효준
10
효준
10
효준
10
오섭
5
오섭
5
오섭
5
오섭
5
오섭
5
오섭
5
오섭
5
오섭
5
오섭
윤혁
1
윤혁
1
5
오섭
5
윤혁
1
윤혁
1
윤혁
1
윤혁
1
윤혁
1
윤혁
1
윤혁
1
윤혁
1
*/

/*
class Pr{	//lock을 건다
	synchronized void pr(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));//자바는 재밌어 =>문자열 전부 출력
		}
		System.out.println();
	}
}
class Student extends Thread{
	Pr p;	//객체 선언
	String [] str;
	
	Student(Pr p,String [] str) {
		this.p=p;
		this.str=str;
	}
	public void run() {
		for(int i=0; i<str.length; i++) {
			p.pr(str[i]);
		}
	}
}
//멀티 쓰레드
public class study15 {
	public static void main(String[] args) {
	
		Pr s = new Pr();
		String [] eng = {"computer","book", "apple"};
		String [] kor = {"컴퓨터", "책", "사과"};
		
		Thread t1=new Student(s,eng);	//upcasting
		Thread t2=new Student(s,kor);
		t1.start();
		t2.start();
	}
}
*/
/*
computer
book
apple
컴퓨터
책
사과
*/

/*
class Cal{
	int cnt=0;
	int add(int a, int b) {
		cnt++;
		return a+b;
	}
	int sub(int a, int b) {
		cnt++;
		return a-b;
	}
	void show() {
		System.out.println("연산 횟수"+cnt);
	}
}
class Add extends Thread{
	Cal c;
	Add(Cal c) {
		this.c=c;
	}
	public void run() {
		System.out.println(c.add(20,10));
	}
}
class Sub extends Thread{
	Cal c;
	Sub(Cal c) {
		this.c=c;
	}
	public void run() {
		System.out.println(c.sub(50,10));
	}
}
public class study15 {
	public static void main(String[] args) {

		Cal c=new Cal();
		Add a=new Add(c);
		Sub s=new Sub(c);
		
		a.start();
		s.start();
		
		try {
			a.join();
			s.join();
		}catch(Exception e) {}
		
		c.show();
	}
}
*/
/*
30
40
연산 횟수2
*/




//GUI 화면 구성

//JFrame (최상위 컨테이너)
//Jpanel -> 컴포넌트 
//JFrame 클래스 상속받아서 만든다.
/*
public class study15 extends JFrame {
	study15(){
			
			super("Java");	//제목 설정 //setTitle("Java");
			setSize(300,300); //프레임 크기 설정
			setVisible(true); //프레임 출력 메소드
			
			JButton j1 = new JButton("버튼 1");
			JButton j2 = new JButton("버튼 2");
			JButton j3 = new JButton("버튼 3");
			
			Container c=getContentPane();//컨텐트팬 알아낸다.
			c.add(j1);
			c.add(j2);
			c.add(j3);
			
			c.setLayout(new FlowLayout());		
	}
	public static void main(String[] args) {
		new study15();//생성자 호출
	}
}
*/


/*
public class study15{
	public static void main(String[] args) {
		
		JFrame j = new JFrame();//상속 받지 않고 메인에 하려면 객체 만들어서 짜주면 된다!
		j.setLayout(new BorderLayout());
		
		j.add(new JButton("동"),BorderLayout.EAST);//BorderLayout은 위치 지정 필요함
		j.add(new JButton("서"),BorderLayout.WEST);//BorderLayout은 위치 지정 필요함
		j.add(new JButton("남"),BorderLayout.SOUTH);//BorderLayout은 위치 지정 필요함
		j.add(new JButton("북"),BorderLayout.NORTH);//BorderLayout은 위치 지정 필요함
		j.add(new JButton("중앙"),BorderLayout.CENTER);//BorderLayout은 위치 지정 필요함
		
		j.setVisible(true);
	}
}
*/

/*
public class study15 extends JFrame{
	study15(){
		Container c = getContentPane();
		c.setBackground(Color.MAGENTA);
		setVisible(true);
	}
	public static void main(String[] args) {
		new study15();
	}	
}
*/

/*
//상속 문제
class TV{
	private int size;
	public TV(int size) { 
		this.size = size; 
	}
	protected int getSize() { 
		return size; 
	}
}
class ColorTV extends TV{
	private int resolution;
	ColorTV(int size, int resolution) {
		super(size);
		this.resolution=resolution;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+resolution+"컬러"); //32인치 1024컬러
	}
}
public class study15{
	public static void main(String[] args) {

		 ColorTV myTV = new ColorTV(32, 1024);
		 myTV.printProperty();
	}
}
*/
/*
class ColorTV{
	private int size,resolution;
	public ColorTV(int size,int resolution) { 
		this.size = size; 
		this.resolution=resolution;
	}
	void printProperty() {
		System.out.println(size+" "+resolution);
	}
}
class IPTV extends ColorTV {
	String IP;
	IPTV(String IP, int size, int resolution){
		super(size, resolution);
		this.IP=IP;
}
	public void printProperty() {
		System.out.print("나의 IPTV는 "+IP+"주소의 ");
		super.printProperty();
	}
}
public class study15{
	public static void main(String[] args) {
	
		  IPTV iptv = new IPTV("192.1.1.2 ", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
		  iptv.printProperty();
		}
}
*/
