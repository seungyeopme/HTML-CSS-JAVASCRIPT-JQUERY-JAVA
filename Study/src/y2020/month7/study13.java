package y2020.month7;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
class Circle{
	private double r;
	
	Circle(double r){
	  this.r=r;
	}
	 
	double get() {
		return r;
	}
}
	
class Cir extends Circle{
	String str;
	Cir(double r, String str){
		super(r);
		this.str=str;
	}
	void pr() {
	  System.out.println(get()+ " "+str);
	}
}
public class study13 {
	public static void main(String[] args) {
		Cir c=new Cir(2.5,"circle");
  		c.pr();   //반지름 2.5인 circle
	}
}
//2.5 circle
*/

/*
abstract class Circle{
	protected double r;
	Circle(double r){
		this.r=r;
	}
	abstract double get();
}

class Cir extends Circle{
	Cir(double r) {
		super(r);
	}
	double get() {
		return r;
	}
}
public class study13 {
	public static void main(String[] args) {
	
		Circle c[]=new Circle[5];
		//객체 5개 배열생성
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<c.length;i++) {
			double r=s.nextDouble();
			c[i]=new Cir(r);
			//1.1 2.1 3.1 4.1 5.1
			System.out.println(c[i].get());
		}
	}
}
//2.2
//2.2
//3.0
//3.0
//5.6
//5.6
//63.7
//63.7
//2.2
//2.2
*/

/*
class Arr{
	static int [] con(int a[], int b[]) {	//static 키워드를 붙여서 클래스 메소드를 생성한다.
		int [] arr=new int[a.length+b.length];
		//int [] arr=new int[8];
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
			for(int j=a.length;j<a.length+b.length;j++) {
				arr[j]=b[j-a.length];
			}
		}
		return arr;	//리턴 받을 때는 배열명만 적어주어야 한다.
	}
	static void pr(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);	//12345678
		}		
	}
}
public class study13 {
	public static void main(String[] args) {
	
		int []ary1= {1,2,3,4};
		int []ary2= {5,6,7,8};
		int []ary3= Arr.con(ary1,ary2);	//클래스 이름을 이용하여 클래스 메소드를 호출한다.
		Arr.pr(ary3);
	}
}
*/

//클래스 명으로 접근할 때 static이어야 한다.

/*
//1. Main()를 보고 클래스를 구현해라.
//main(){

//   Tv t = new Tv(“삼성”, 2020, 20);

//   t.show();   //2020년에 삼성에서 나온 20인치 Tv 출력

class Tv{
	String company;
	int year, size;
	Tv(String company, int year, int size){
		this.company=company;
		this.year=year;
		this.size=size;
	}
	void show() {
		System.out.println(company+" "+year+" "+size);	//삼성 2020 20
	}
}
public class study13 {
	public static void main(String[] args) {

		 Tv t = new Tv("삼성",2020,20);

		 t.show();   //2020년에 삼성에서 나온 20인치 Tv 출력
	}
}
*/

/*
//2. Main()를 보고 클래스를 구현해라.

//(math, eng, com점수를 입력받아 구현)

//Score s= new Score(math, eng, com);

//System.out.println(“평균은” + s.avg());

//첫번째 방법
class Score{
	int a,b,c;
	Score(int math, int eng, int com){
		this.a=math;
		this.b=eng;
		this.c=com;
	}
	double avg() {
		return (a+b+c)/3;
	}
}

public class study13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		Score s= new Score(a, b, c);

		System.out.println("평균은" + s.avg());
	}
}
//100 70 65
//평균은78.0
*/

/*
//두번째 방법
class Score{
	int a,b,c;
	Score(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double avg() {
		return (a+b+c)/3.0;
	}
}

public class study13 {
	public static void main(String[] args) {
	
		Scanner s1=new Scanner(System.in);
		int math=s1.nextInt();
		int eng=s1.nextInt();
		int com=s1.nextInt();
		
		Score s= new Score(math, eng, com);

		System.out.println("평균은" + s.avg());
	}
}
//50 60 88
//평균은66.0
*/


/*
//3. Main()를 보고 클래스 구현해라

//(XY는 슈퍼클래스, XYZ는 서브클래스)

//main(){

// XY x= new XY();

// x.set(1,2);

// x.show();         //1,2 출력

 

// XYZ xy=new XYZ();

// xy.set(4,5);

// xy.color(“blue”);

// xy.show();       //4,5,blue 출력  


class XY{
	int a,b;
	void set(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+" "+b);
	}
}
class XYZ extends XY{
	String color;
	void set(int a, int b) {
		super.set(a,b);//슈퍼 클래스의 메소드 호출
	}
	void color(String color) {
		this.color=color;
	}
	void show() {
		super.show();//슈퍼 클래스의 메소드 호출
		System.out.println(color);
	}
}

public class study13 {
	public static void main(String[] args) {

		 XY x= new XY();
		 x.set(1,2);
		 x.show();         //1,2 출력

		 XYZ xy=new XYZ();
		 xy.set(4,5);
		 xy.color("blue");
		 xy.show();       //4,5,blue 출력  
	}
}
//1 2
//4 5
//blue
*/


/*
//4. 두 사람이 가위바위보를 한다. 가위,바위,보 중 하나를 문자열로 입력받아 누가 이겼는지 판단하는 프로그램을작성해라.(중첩 if문 사용해야함, 문자열 비교)
//실행결과) 영수 : 가위

//             철수 : 보

//              철수가 이겼다.

public class study13 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("영수 :");
		String y=s.next();
		
		System.out.println("철수 :");
		String c=s.next();

		if(y.equals("보")) {
			if(c.equals("가위")) {
				System.out.println("철수가 이겼다.");
			} else if(c.equals("바위")) {
				System.out.println("영수가 이겼다.");
			} else {
				System.out.println("무승부");
			}
		}
		
		if(y.equals("바위")) {
			if(c.equals("가위")) {
				System.out.println("영수가 이겼다.");
			} else if(c.equals("바위")) {
				System.out.println("무승부");
			} else {
				System.out.println("철수가 이겼다.");
			}
		}
		
		if(y.equals("가위")) {
			if(c.equals("가위")) {
				System.out.println("무승부");
			} else if(c.equals("바위")) {
				System.out.println("철수가 이겼다.");
			} else {
				System.out.println("영수가 이겼다.");
			}
		}
	}
}
//영수 :
//가위
//철수 :
//바위
//철수가 이겼다.
*/


//5. 다음 Circle클래스를 활용하여 Circle 객체배열을 생성하고, 5개의 원 반지름을 입력받아 배열에저장한 후, 
//   원의 면적의 합을 출력해라. main을 완성하라!
/*
class Circle{

private double r;

circle(double r){

   this.r=r;

}

double area(){

   return 3.14*r*r;

}
*/

/*
//첫번째 방법
class Circle{
	private double r;

	Circle(double r){
		this.r=r;
	}
	
	double area(){
		return 3.14*r*r;
	}
}
public class study13 {
	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(s.nextDouble());
		}
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].area());
		}
	}
}
//5 8 9 10 1 2
//78.5
//200.96
//254.34
//314.0
//3.14
*/

/*
//두번째 방법
class Circle{
	private double r;

	Circle(double r){
		this.r=r;
	}
	
	double area(){
		return 3.14*r*r;
	}
}
public class study13 {
	public static void main(String[] args) {

		Circle []c=new Circle[5];
		Scanner s=new Scanner(System.in);
		
		double sum = 0;
		for(int i=0; i<c.length;i++) {
			c[i]=new Circle(s.nextDouble());
			sum+=c[i].area();
		}
		System.out.println(sum);
	}
}
//1.1 2.2 3.3 4.4 5.5
//208.96700000000004
 */
/*

//6. 정수 10개를 무작위로 입력하여 오름차순으로정렬시켜서 출력해라.
//첫번째 방법
public class study13 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요");
		
		int [] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}	
}
//정수 10개를 입력하세요
//1 2 3 4 5 6 7 8 9 10
//12345678910
*/

/*
//두번째 방법
public class study13 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int [] arr = new int[10];
		int tmp;
	
		for(int i=0; i<arr.length; i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++) {
				if(arr[i]>arr[j]) {
				tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
	}
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
//900 800 700 600 500 400 300 200 100 10
//10 100 200 300 400 500 600 700 800 900 
*/

/*
class Person{}
class Student extends Person{}
class Worker extends Person{}
class ITWorker extends Worker{}

public class study13 {
	static void show(Person p) {
		//Person p=new Student(); //up casting 학생은 사람이다
		//Person p=new Worker();
		//Person p=new ITWorker();
		if(p instanceof Person) {
			System.out.println("사람");
		}
		if(p instanceof Student) {
			System.out.println("학생");
		}
		
		if(p instanceof Worker) {
			System.out.println("직장인");
		}
		if(p instanceof ITWorker) {
			System.out.println("IT직장인");
		}
		
	}
	public static void main(String[] args) {
		
		show(new Student());
		System.out.println();
		show(new Worker());
		System.out.println();
		show(new ITWorker());
		//instance of 연산자
	}
}
//사람
//학생

//사람
//직장인

//사람
//직장인
//IT직장인
*/

/*
//up casting 활용 법
//interfacd의 다중 상속

interface A{
	public void funcA(); 	//추상 메소드
}
interface B{
	public void funcB(); 	//추상 메소드 
}
interface C extends A,B{	//다중 상속 <- implements 사용할 수 없다. <=추상 메소드 구현할 때 사용
	public void funcC();	//추상 메소드
}
class D implements C{		//자식-> D	부모-> C
	public void funcA() {
		System.out.println("funcA");
	}
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcC() {
		System.out.println("funcC");
	}
}
public class study13 {
	public static void main(String[] args) {
		
		//인터페이스에서는 객체 생성 불가능했기 때문에
		//상속받은 클래스 D에서 객체 생성해주고 있다.
		D d1=new D();
		A a1=d1;	//up casting
		a1.funcA();	//funcA
		System.out.println();
		
		B b1=d1; 	//up casting
		b1.funcB();	//funcB
		System.out.println();
		
		C c1=d1;
		c1.funcA();	//funcA
		c1.funcB();	//funcB
		c1.funcC();	//funcC
	}
}
*/

/*
interface Day{
	int THU=1, FRI=2, SAT=3;	//변경 불가능, Final이 생략되어 있다.	//상수 필드
}

public class study13 {
	public static void main(String[] args) {
		
		System.out.println("오늘 무슨 요일이죠?");
		Scanner s= new Scanner(System.in);
		
		System.out.println("1.목 2.금 3.토");
		int n=s.nextInt();
		//switch~case
		 switch(n){
		    case 1:
		        System.out.println("목");
		        break;
		    case 2:
		        System.out.println("금");
		        break;
		    case 3:
		        System.out.println("토");
		        break;
		    default:
		        System.out.println("1.목 2.금 3.토 중에서 번호를 입력하시오");
		        break;
		    }
	}
}
//오늘 무슨 요일이죠?
//1.목 2.금 3.토
//금

//오늘 무슨 요일이죠?
//1.목 2.금 3.토
//4
//1.목 2.금 3.토 중에서 번호를 입력하시오
*/

/*
class Tv{
	public void on() {
		System.out.println("티비 켬");
	}
}
interface Computer{
	public void m();	//추상 메소드
}
class Com{
	public void m() {	//m() => 위의 추상 메소드의 m과 다른 것이다.
		System.out.println("컴");		
	}
}
class Ipad extends Tv implements Computer{
	
	Com c=new Com();
	public void m() {
		c.m();	//System.out.println("컴");
	}
	public void ip() {
		m();
		on(); 
	}
}
public class study13 {
	public static void main(String[] args) {
		
		Ipad i = new Ipad();
		Tv t=i;	//up casting
		Computer c=i; //up casting
		
		i.ip();
		
		
	}
}
//컴
//티비 켬
*/

/*
interface Animal{
	void bear();
}
interface Fish{
	void swim();
}
class Whale implements Animal, Fish{
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
	}
	public void swim() {
		System.out.println("고래는 물속에서 삽니다.");
	}
}

public class study13 {
	public static void main(String[] args) {
		
		Whale tank1 = new Whale(); //클래스명 + 객체변수명 = new 클래스명
								   //객체의 선언과 생성을 동시에
		tank1.bear();
		tank1.swim();
	}
}
//고래는 새끼를 낳습니다.
//고래는 물속에서 삽니다.
*/

/*
interface Addin{
	public int add(int a, int b);
	public int add(int a);
}
class Add implements Addin{
	public int add(int a, int b) {
		return a+b;	//5
	}
	public int add(int a) {
		int sum=0;
		for(int i=0; i<=a;i++) {
		sum+=i;
	}
		return sum;	//55
	}
}
public class study13 {
	public static void main(String[] args) {
		//인터페이스명은 Addin
		//인터페이스와 클래스 구현
		//함수는 전부 추상메소드
		Add a = new Add();
		System.out.println(a.add(1,4)); // 두 수 합		//5
		System.out.println(a.add(10)); 	// 1부터 10까지 합	//55
	}
}
*/

/*
class In{
	int num;
	In(int n){
		num=n;
	}
	boolean eq(In i) {	//매개변수 안에 (클래스명 ,객체가 들어갈 수 있다)
		//in i=new In(i2);
		if(this.num==i.num) {
			return true;
		}
		return false;
	}
}
public class study13 {
	public static void main(String[] args) {
		
		//객체 3개 생성
		In i1 = new In(4);
		In i2 = new In(6);
		In i3 = new In(6);
		
		//객체 비교
		if(i1.eq(i2)) {
			System.out.println("i1,i2는 동일");
		}
		else {
			System.out.println("i1,i2는 다름");
		}
		if(i2.eq(i3)) {
			System.out.println("i1,i3는 동일");
		}
		else {
			System.out.println("i1,i3는 다름");
		}
 	}
}
//i1,i2는 다름
//i1,i3는 동일
*/

/*
class In{
	private int num;
	In(int num) {
		this.num=num;
	}
	public String toString() {
		return num +" "; //Returns a string representation of the object.
						 //구조를 외우자 api에 나와있다. num이 int값이니 문자열로 변경하기 위해
						 //" "를 붙여준다.
	}
}
public class study13 {
	public static void main(String[] args) {

		In i=new In(4);
		System.out.println(i);	//y2020.month7.In@7ce6a65d //메모리 값
	}
}
*/

/*
interface Food{
	String name();	//기본적으로 추상
}
class Pizza implements Food{
	public String name() {
		return "피자";
	}
	
}
class Steak implements Food{
	public String name() {
		return "스테이크";
	}
}
public class study13 {
	static void pr(Food f) {	//Food f=new Pizza() //up casting
		System.out.println(f.name());
	}
	public static void main(String[] args) {
		//Pizza p=new Pizza();
		pr(new Pizza());	//피자 출력
		pr(new Steak());	//스테이크 출력
	}
}
//피자
//스테이크
*/

/*
class Log{
	boolean login(String name, String pw) {
		if(name.equals(name)&&pw.equals(pw)) {
			return true;
		}
		return false;
	}
	void logout(String a) {
		System.out.println("로그아웃됨!!");
	}
}

public class study13 {
	public static void main(String[] args) {
		
		Log log=new Log();
		boolean result=log.login("용석","123");
		//이름과 비밀번호가 둘 다 일치해야 로그인!!
		if(result) {
			System.out.println("로그인!!!");
			log.logout("용석");	//로그아웃됨!!
		}
		else {
			System.out.println("로그인 안됨!!");
		}
	}
}
//로그인!!!
//로그아웃됨!!
*/

//import pack2.*;
//pack2 패키지의 모든 클래스를 한 번에 임포트하기 위해서 사용한다.

/*
public class study13 {
	public static void main(String[] args) {

		//기본 자료형을 객체로 변경시키는 과정(박싱) => 포장하는 작업 <=> 언박싱
		Integer i=new Integer(10);
		Double d=new Double(3.14);
		
		System.out.println(i); //10
		System.out.println(d); //3.14
		
		System.out.println();
		
		//객체를 기본자료형으로 변경(언박싱) => ~Value로 끝나면 기본형으로 변경하는 언박싱 과정 
		i=new Integer(i.intValue());
		d=new Double(d.doubleValue());
		System.out.println(i);
		System.out.println(d);
	}
}
*/

/*
문자열에서 double형으로 바꾸는 방법 -Double 클래스 parseDouble 메소드 이용

parseDouble(String s)
Returns a new double initialized to the value represented by the specified String, 
as performed by the valueOf method of class Double.
*/

/*
public class study13 {
	public static void main(String[] args) {
		
		Integer i=100;	//자동 박싱 기능이 있기 때문에 이렇게 적을 수 있다. //박싱 과정
		
		//언박싱
		System.out.println(i.intValue()); //객체를  다시 일반적인 자료형으로 변경하는 언박싱 과정이다.
		
		int a=i; //언박싱 과정, 자동 언박싱 되었다. 객체 i를 일반적인 자료형인 a로 언박싱하였다.
		
	}
}
*/