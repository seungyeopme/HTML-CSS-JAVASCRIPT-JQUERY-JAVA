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
