package y2020.month7;

import java.util.InputMismatchException;
import java.util.Scanner;
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

public class study15 {
	public static void main(String[] args) {

		
	}
}