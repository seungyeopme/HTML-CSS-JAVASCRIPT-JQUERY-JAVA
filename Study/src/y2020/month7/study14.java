package y2020.month7;

import java.util.Scanner;

/*
interface IT{
	public void java();
}
class Student{
	public void study(IT it) {	//인터페이스 or 클래스 	객체
		it.java();
	}
}
class ITStudent implements IT{	//오버라이딩
	public void java() {
		System.out.println("자바 공부");
	}
}
class DBStudent implements IT{	//오버라이딩
	public void java() {
		System.out.println("데이터베이스 공부");
	}
}
public class study14 {
	public static void main(String[] args) {
		
		Student s =new Student();
		ITStudent i=new ITStudent();
		DBStudent d=new DBStudent();
		s.study(i);	// 업 캐스팅 작업	//자바 공부
		//It it=new ITStudy;
		s.study(d);	//데이터베이스 공부
	}
}

*/

/*
public class study14 {
	public static void main(String[] args) {
	
		Integer i=100;	//auto boxing  		//객체화
		int n1=i;		//auto unboxing		//기본 자료형으로 변환
		//Integer i=new Integer(100);
//		int n1=n+200;
		System.out.println(n1);
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {
		
		Integer i=new Integer(10);		//정수 10의 객체화
		int i1=i.intValue(); 			//Unboxing
		
		Character c=new Character('a');	//문자 'a'객체화
		char c1=c.charValue();			//Unboxing
		
		Boolean b=new Boolean(true);	//불린 값 true객체
		boolean b1=b.booleanValue();	//Unboxing
		
		//문쟈열을 기본타입으로 반환!!
		int i2=Integer.parseInt("123");
		boolean b2=Boolean.parseBoolean("true");	//parse로 시작되는 것은 전부 문자열!!!
		double d2=Double.parseDouble("3.14");
		
		int i3=Integer.valueOf("123");	// valueOf는 문자열 정수 모두 가능!!!
		
		int i4 = Integer.valueOf("10")+Integer.valueOf("20");	//문자열을 객체로 반환
		//객체지만 자동 언박싱(auto unboxing)기능으로 기본 자료형으로 변환되어 계산이 가능하다!!!
		System.out.println(i4);	//30	//산술 연산 가능!!! 
		
		String s=Integer.toString(123);	//정수형 객체 123을 문자열로 반환!!
		
		//valueOf(Stirng) - 객체를 반환한다.
		//parse~~(String) - 기본 자료형을 반환한다.
	}
}
*/


/*
public class study14 {
	public static void main(String[] args) {

		int n=(int)(Math.random()*10)+1;//1부터 10까지 랜덤
	}
}
*/

/*
class Profile{
	String name,id;
	
	Profile(String n, String i){
		name=n;
		id=i;
	}
}

public class study14 {
	public static void main(String[] args) {

		//객체 배열[2] 생성해서
		//값을 입력한 후 출력
		Profile p[] = new Profile[2];
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			String name=s.next();
			String id=s.next();
			p[i]=new Profile(name, id);
		}
		for(int i=0;i<2;i++) {
			System.out.println(p[i].name+" "+p[i].id);
		}
	}
}
//abc
//123
//456
//789
//abc 123
//456 789
*/

/*
//1. main()를 보고 클래스를 작성해라.
//main(){

//Point p = new Point(3,4);

//System.out.println(p);   //3.4출력

class Point{
	int a,b;
	Point(int a, int b){
		this.a=a;
		this.b=b;
	}
	public String toString() {
		return a+"."+b;
	}
}
public class study14 {
	public static void main(String[] args) {
		
		Point p = new Point(3,4);

		System.out.println(p);   //3.4출력
	}
}
*/


/*
//2. 주민번호 "841111-1234560"을 초기화하여여성인지 남성인지 출력해

//(7번째 숫자가 1이면 남성, 2이면여성 – switch case사용)

public class study14 {
	public static void main(String[] args) {
		
		String s = "841111-1234560";
		switch(s.charAt(7)) {
		case '1':
			System.out.println("남성");	//남성
			break;
		case '2':
			System.out.println("여성");
			break;
		}
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {
		
		String s = "841111-1234560";
		switch(s.charAt(7)) {
		case '1':
			System.out.println("남성");	//남성
			break;
		case '2':
			System.out.println("여성");
			break;
		}
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {

		Integer a=300;
		Integer b=300;
		
		System.out.println(a.equals(b));
		
		//언 박싱 후에 두 수 비교
		//기본 자료형으로 변경 되었으니 ==으로 비교가 가능하다
		System.out.println(a.intValue() == b.intValue());
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {

		long start = 0;
		long end = 0;
		
		//primitive type(기본 자료형)
		start = System.currentTimeMillis();
		fibonacci1(30);
		end = System.currentTimeMillis();
		System.out.println("int를 이용한 피보나치 연산::" + (end - start));
		
		//Wrapper Class
		start = System.currentTimeMillis();
		fibonacci2(30);
		end = System.currentTimeMillis();
		System.out.println("Integer를 이용한 피보나치 연산::" + (end - start));
	}
	public static int fibonacci1(int value) {
		if (value == 0 || value == 1)
			return 1;
		else
			return fibonacci1(value - 1) + fibonacci1(value - 2);
		}
	public static Integer fibonacci2(int value) {
		if (value == 0 || value == 1)
			return 1;
		else
			return fibonacci2(value - 1) + fibonacci2(value - 2);
	}
}
//int를 이용한 피보나치 연산::5
//Integer를 이용한 피보나치 연산::9

//이 소스코드를 돌려보면 항상 STACK보다 HEAP에서 더 느리다는 것을 알 수 있습니다.
//소스코드 결과를 통해 래퍼클래스는 필요할 때만 쓰는 것이 효율적임을 알 수 있습니다.
*/


//3.Tv클래스와main()를 보고 Tv클래스를 상속받은 Tv1클래스를작성해라.
//class Tv{

//private int size;

//Tv(int size){

//  This.size=size; }

//protected int getsize(){

//   Return size; }

//}

//main(){

// Tv1 t=new Tv1(20, “삼성”);

//t.show();}  //삼성 20인치 Tv 출력

/*
class Tv{
	private int size;
	Tv(int size){
		this.size=size;
	}
protected int getsize(){
	return size; 
	}
}
class Tv1 extends Tv{
	String str;
	Tv1(int s, String str){
		super(s);
		this.str=str;
	}
void show() {
	System.out.println(str + getsize()+"인치 Tv" );
	}
}

public class study14 {
	public static void main(String[] args) {
		
		Tv1 t=new Tv1(20, "삼성");
		t.show(); //삼성20인치 Tv 출력
	}
}
//삼성20 인치 Tv
*/

/*
//4. main()를 보고 클래스 작성해라.
//main(){

//Shape s = new Shape();

//Shape s1 = new Shape(2,5);

//s.pr("@");

//s1.pr("#");

//s.show();   //@@@-> 1행 3열로 출력
//s1.show();  //#####->2행 5열로 출력
			  //#####

class Shape{
	int a,b;
	String c;
	Shape() {
		this(1,3);	//아래 생성자 호출
	}
	Shape(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void pr(String c) {
		this.c=c;
	}
	void show() {
		for(int i=0; i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
public class study14 {
	public static void main(String[] args) {

		Shape s = new Shape();
		Shape s1 = new Shape(2,5);
		s.pr("@");
		s1.pr("#");
		s.show();   //@@@-> 1행 3열로 출력
		s1.show();  //#####->2행 5열로 출력
					//#####
	}
}
//@@@
//#####
//#####
*/

/*
class Food{
	String str;
	Food(){
		this("치킨");
	}
	Food(String str){
		this.str=str;
	}
	void pr() {
		System.out.println(str);
	}
}
public class study14 {
	public static void main(String[] args) {

		Food f=new Food();
		Food f1=new Food("피자");
		f.pr();		//치킨
		f1.pr(); 	//피자
	}
}
*/

//생성자 호출은 무조건 첫 행에 나와야 한다.


//5번.main(), XY클래스를 보고 XY를 상속받는 XYZ 클래스를 작성해라.
//첫번째 방법(두번째 코드가 더 좋은 코드)
/*
class XY{
	private int x,y;
	XY(int x, int y){
		this.x=x;
		this.y=y;
	}
	int getx() {
		return x;
	}
	int gety() {
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
class XYZ extends XY{
	String color;
	XYZ(int x, int y, String color){
		super(x,y);
		this.color=color;
	}
	void setxy(int x, int y) {
		System.out.println(x+" "+y);
	}
	void setcolor(String color) {
		System.out.println(color);
	}
	void show() {
		
	}
}

public class study14 {
	public static void main(String[] args) {
		XYZ xyz=new XYZ(10,10,"red");
		xyz.setxy(20,30);
		xyz.setcolor("blue");
		xyz.show();
	}
}
//20 30
//blue
*/

//더 좋은 코드
//두번째 방법
/*
class XY{
	private int x,y;
	XY(int x, int y){
		this.x=x;
		this.y=y;
	}
	int getx() {
		return x;
	}
	int gety() {
		return y;
	}
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
class XYZ extends XY{
	String str;
	XYZ(int x, int y, String str){
		super(x,y);
		this.str=str;
	}
	void setxy(int x, int y) {
		super.move(x,y);	//this.x=x; this.y=y;
	}
	void setcolor(String str) {
		this.str=str;
	}
	void show() {
		System.out.println(getx()+","+gety()+"인"+str+"색!");		//20,30인blue색!
	}
}

public class study14 {
	public static void main(String[] args) {
		XYZ xyz=new XYZ(10,10,"red");
		xyz.setxy(20,30);
		xyz.setcolor("blue");
		xyz.show();
	}
}
*/

/*
//문제6번 
//main()를 보고 인터페이스를 작성해라.
//(인터페이스명은 Re, 모든 메소들들을 인터페이스안에서 선언하고 show함수는 default로 설정,area는 abstract로 설정)

interface Re{
	default void show() {
		System.out.println("사각형!!");
	}
	abstract int area();
}
class Rec implements Re{
	int a,b;
	Rec(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int area() {
		return a*b;
	}
}
public class study14 {
	public static void main(String[] args) {
		
		Re r=new Rec(10,20);	//upcasting
		r.show();	//"사각형!!" 출력
		System.out.println("면적" + r.area());
	}
}
//사각형!!
//면적200
*/

/*
public class study14 {
	public static void main(String[] args) {

		//기본 자료형을 생성자에 넘겨주어 대응되는 래퍼 클래스를 생성하는 동작을 '박싱'
		int a=10;
		Integer wI=new Integer(a);		//int Boxing 동작
		
		double d=3.14;
		Double sD=new Double(d);		//double Boxing 동작
										
		boolean b=true;
		Boolean wB = new Boolean(b);	//boolean Boxing 동작
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {

		Integer wI = new Integer(10);
		int i = wI.intValue();			// Integer Unboxing 동작
		
		Double wD = new Double(3.14);
		double d = wD.doubleValue();	// Double Unboxing 동작
		
		Boolean wB = new Boolean(true);
		boolean b = wB.booleanValue();	// Boolean Unboxing 동작
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {

		Integer wI = new Integer(10);
		int i1 = wI.intValue(); //언박싱
		int i2 = wI;			//오토 언박싱
	}
}
*/

/*
public class study14 {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		if(i1 == i2)
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}
// 이 코드를 수행하면, "다르다"라는 문자열이 출력된다. '==' 연산은 참조 변수의 주소값을 비교하는 연산이다.
// i1과 i2는 그 안에 담고 있는 값은 같지만 힙 메모리의 별도 주소공간에 만들어지는 다른 객체다. 따라서 참조 값이
// 다르기 때문에 i1==i2 라는 조건은 거짓이 된다.
*/


