package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
class Food{
	String menu;
	int price;
	Food(String m){
		menu=m;
		price=100000;
	}
	public String toString() {	//객체를 문자열로
		return menu; 
	}
}
public class study16 {
	public static void main(String[] args) {

		Food f = new Food("짜장면");
		System.out.println(f+" "+f.price+"원");
		//Food 클래스에 String형 menu,
		//int형 price를 준다.
		//생성자는 매개변수에 menu만
		//들어갈 수 있게 구현하고,
		//price는 10000원으로 초기화한다.
	}
}
//짜장면 100000원
*/

/*
interface A{
	double r=3.14;	//final
	default void show() {
		System.out.println("원");
	}
	abstract double area(double ra); //abstract 생략 가능
}
class B implements A{
	double ra;
	public double area(double ra) {
		return r*ra*ra;
	}
}
public class study16 {
	public static void main(String[] args) {

		B b = new B();	//객체 생성 	//객체 생성은 A에서 interface에서 생성 할 수 없다.
		System.out.println(b.area(4.5));	//63.585
	}
}
*/

/*
class Cook{	//요리 쓰레드
	String food;
	boolean send=false; 
	
	void set(String f) {
		food=f;	//초기화 코드
		send=true;
		//synchronized void pr()
		synchronized(this) {
			notifyAll();	//잠자고 있는 쓰레드 다 깨운다!!
	}
}
	String get() {
		if(send=false) {	//음식 도착안했으면
			try {
				synchronized (this) {
					wait();	//손님이 기다림
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return food;
}
public class study16 {
	public static void main(String[] args) {
	
	}
}
*/

/*
class Cook{ //요리쓰레드
	 String food;
	 boolean send=false;
	 
	 void set(String f) {
		 food=f; //초기화 코드
		 send=true;
	 //synchronized void pr()
		 synchronized(this) {
			 notifyAll(); //잠자고 있는 쓰레드 다 깨운다!
		 }
	}
	String get() {
	  if(send==false) { //음식 도착안했으면
		  try {
			  synchronized(this) {
				  wait(); //손님이 기다림
		}
	  } catch(Exception e) {
		  e.printStackTrace();
	  	}
	  }
	  return food;
	}
}
class Chef extends Thread{  //요리사
	 Cook c;
	 
	 Chef(Cook c){
	  this.c=c;
	 }
	 public void run() {
	  c.set("음식");
	 }
}
class Custumer extends Thread{
	 Cook c;
	 Custumer(Cook c){
		 this.c=c;
	 }
	 public void run() {
		 System.out.println(c.get());
	 }
}
public class study16 {
	public static void main(String[] args) {
	 
		Cook co=new Cook();
		Custumer c1=new Custumer(co);
		Custumer c2=new Custumer(co);
		Chef c3=new Chef(co);
	  
		try {
			c1.start();
			c2.start();
			Thread.sleep(1000);
			c3.start();
	   
			c1.join();
			c2.join();
			c3.join();
		}catch(Exception e) {}s
	}
}
*/
//음식
//음식

/*
1.	Interface를 상속받은 Calcu클래스를 작성해라. Main()에서 a,b에 대해 적절한 값을 설정해라.
interface Cal{
   int total(int a, int b); //a부터 b까지의 합 리턴
   int big(int a, int b);} //a,b중 큰 값 리턴
*/
/*
interface Cal{
	   int total(int a, int b); //a부터 b까지의 합 리턴
	   int big(int a, int b); //a,b중 큰 값 리턴
}
class Calcu implements Cal{
	int a,b;
	int sum=0;
	
	Calcu(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int total(int a, int b) {
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}
	public int big(int a, int b) {
		if(a>b) {
			return a;
		}
		else {return b;}
	}
	
}
public class study16 {
	public static void main(String[] args) {
	
		Calcu cal = new Calcu(1,10);
		System.out.println(cal.total(1,10));
		System.out.println(cal.big(67, 3));
	}
}
*/
//55
//67

/*
interface Cal{
	int total(int a, int b); //a부터 b까지의 합 리턴
	int big(int a, int b); 	//a,b중 큰 값 리턴
} 
class Calcu implements Cal{
public int total(int a, int b) {

	int sum=0;

	for(int i=a;i<=b;i++) {
		sum+=i;
	}
	return sum;
}

public int big(int a, int b) {
	int big=0;
	if(a>b) {big=a;}
	else if(a<b) {big=b;}
	return big;
	}
}
public class study16 {
	public static void main(String[] args) {

		Calcu c=new Calcu();
		System.out.println(c.total(2, 3));
		System.out.println(c.big(1, 2));
	}
}
*/
//5
//2

/*
2.	Main()를 보고 “쓰레드1”을 출력해라.
Main(){
  Th t=new Th(“쓰레드 1”);
  Thread th=new Thread(t);
  th.start(); 
*/  
/*  
class Th extends Thread{
	String a;
	
	Th(String a) {
		System.out.println("쓰레드1");
		this.a=a;
	}
	public void run() {
		try {
			sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class study16 {
	public static void main(String[] args) {
		 
		Th t=new Th("쓰레드 1");
		Thread th=new Thread(t);
		th.start(); 
	}
}
*/
//쓰레드1
/*
class Th implements Runnable{
	String str;
	Th(String s) {
		str=s;
	}
	public void run() {
		System.out.println(str);	
	}
}
public class study16 {
	public static void main(String[] args) {
		 
		Th t=new Th("쓰레드 1");
		Thread th=new Thread(t);
		th.start(); 
	}
}
//쓰레드 1
*/

/*
3.	Main()를 보고 클래스 작성해라. (0~10까지 1초동안 잠을 잔 후 깨워라) 
Main(){
  Timer t = new Timer();
  t.start(); }
*/
/*
class Timer extends Thread {
	public void run() {
		for(int i=0; i<=10;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {}
		}
	}
}
public class study16  {
	public static void main(String[] args) {
	
		Timer t = new Timer();
		t.start(); 
	}
}
*/
/*
0
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
*/

/*
4.	다음 코드를 보고 AThread클래스를 작성해라. (1부터 100까지 합 출력)
두 쓰레드가 충돌하지 않게 join()도 활용해라.
class Total{
int sum;
Total(){
  sum=0; }
void total(int n){
 sum+=n; }
int get(){
 return sum; }
}
main(){
 Total t=new Total();
 AThread a=new AThread(t, 1, 50);
 AThread b=new AThread(t, 51, 100);
 a.start(); b.start(); }
*/
/*
class Total {
	int sum;

	Total() {
		sum = 0;
	}
	
	void total(int n) {
		sum += n;
	}

	int get() {
		return sum;
	}
}

class AThread extends Thread{
	Total t;
	int a,b;

	AThread(Total t,int a, int b){
		this.t=t;
		this.a=a;
		this.b=b;
}
public void run() {
	int sum=0;

	for(int i=a;i<=b;i++) {
		sum+=i;
	}
		System.out.println(sum);
	}
}
public class study16 {
	public static void main(String[] args) {
		Total t = new Total();
		AThread a = new AThread(t, 1, 50);
		AThread b = new AThread(t, 51, 100);

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		}catch(Exception e) {}
	}
}

//1275
//3775

/*
5.	main()에 이렇게 주고, Figure인터페이스 만들어 circle_area()에는 원면적, rec_area()에는 사각형 면적 출력해라.
Figure f1=new Circle(5);
Figure f2=new Rec(2,5); 
f1.circle_area(); 
f2.rec_area();
*/
/*
interface Figure{
	void circle_area();
	void rec_area();
}
class Circle implements Figure{
	int a;
	
	Circle(int a){
		this.a=a;
	}
public void circle_area() {
	System.out.println(a*a*3.14);
}
@Override
public void rec_area() {
	// TODO Auto-generated method stub
	}
}
class Rec implements Figure{
	int a,b;
	
Rec(int a, int b){
	this.a=a;
	this.b=b;
}
public void rec_area(){
	System.out.println(a*b);
}
@Override
public void circle_area() {
	// TODO Auto-generated method stub
	}
}
public class study16 {
	public static void main(String[] args) {

		Figure f1=new Circle(5);
		Figure f2=new Rec(2,5);
		f1.circle_area();
		f2.rec_area();
	}
}
*/
//78.5
//10

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		//ok, cancel 버튼 두개
		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		
		c.add(j1);
		c.add(j2);
		
		setVisible(true);
	}
	//flow
	//제목 JFrame
	//컨텐트팬 범위 알아내기
	//색깔 오렌지
	public static void main(String[] args) {
		new study16();
	}
}
*/

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,3));//행열
		//프레임 안에는 문자열(텍스트)이 기준
		for(int i=0; i<9; i++) {
			String str= Integer.toString(i);//wrapper//정수형을 문자열로 변경해서 출력
			JButton j1 = new JButton(str);
			c.add(j1);
		}
		setVisible(true);
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		JButton j1 = new JButton("j1");	
		JButton j2 = new JButton("j2");
		
		c.setLayout(new FlowLayout());
		
		j1.setEnabled(false);	//버튼 비활성화
		c.add(j1);
		c.add(j2);
		setVisible(true);
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		JButton j1 = new JButton("j1");	
		JButton j2 = new JButton("j2");
		
		c.setLayout(new FlowLayout());
		
		//버튼에 대한 이벤트 처리 인터페이스
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1");
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setBackground(Color.green);
			}
		});
		
		c.add(j1);
		c.add(j2);
		setVisible(true);
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

/*
class Aa implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		JButton b=(JButton)e.getSource();//이벤트가 어디에서 발생했는지 알아낸다.
										   //getSource 메소드는 Object 클래스 객체이므로
										   //다운 캐스팅 해서 알아낸다.
		if(b.getText().equals("Java")) {
			b.setText("자바");
		}
	}
}
public class study16 extends JFrame {
	study16(){
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton j1 = new JButton("Java");
		j1.addActionListener(new Aa());
		
		c.add(j1);
		setVisible(true);
	
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/	