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
  		c.pr();   //������ 2.5�� circle
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
		//��ü 5�� �迭����
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
	static int [] con(int a[], int b[]) {	//static Ű���带 �ٿ��� Ŭ���� �޼ҵ带 �����Ѵ�.
		int [] arr=new int[a.length+b.length];
		//int [] arr=new int[8];
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
			for(int j=a.length;j<a.length+b.length;j++) {
				arr[j]=b[j-a.length];
			}
		}
		return arr;	//���� ���� ���� �迭�� �����־�� �Ѵ�.
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
		int []ary3= Arr.con(ary1,ary2);	//Ŭ���� �̸��� �̿��Ͽ� Ŭ���� �޼ҵ带 ȣ���Ѵ�.
		Arr.pr(ary3);
	}
}
*/

//Ŭ���� ������ ������ �� static�̾�� �Ѵ�.

/*
//1. Main()�� ���� Ŭ������ �����ض�.
//main(){

//   Tv t = new Tv(���Ｚ��, 2020, 20);

//   t.show();   //2020�⿡ �Ｚ���� ���� 20��ġ Tv ���

class Tv{
	String company;
	int year, size;
	Tv(String company, int year, int size){
		this.company=company;
		this.year=year;
		this.size=size;
	}
	void show() {
		System.out.println(company+" "+year+" "+size);	//�Ｚ 2020 20
	}
}
public class study13 {
	public static void main(String[] args) {

		 Tv t = new Tv("�Ｚ",2020,20);

		 t.show();   //2020�⿡ �Ｚ���� ���� 20��ġ Tv ���
	}
}
*/

/*
//2. Main()�� ���� Ŭ������ �����ض�.

//(math, eng, com������ �Է¹޾� ����)

//Score s= new Score(math, eng, com);

//System.out.println(��������� + s.avg());

//ù��° ���
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

		System.out.println("�����" + s.avg());
	}
}
//100 70 65
//�����78.0
*/

/*
//�ι�° ���
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

		System.out.println("�����" + s.avg());
	}
}
//50 60 88
//�����66.0
*/


/*
//3. Main()�� ���� Ŭ���� �����ض�

//(XY�� ����Ŭ����, XYZ�� ����Ŭ����)

//main(){

// XY x= new XY();

// x.set(1,2);

// x.show();         //1,2 ���

 

// XYZ xy=new XYZ();

// xy.set(4,5);

// xy.color(��blue��);

// xy.show();       //4,5,blue ���  


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
		super.set(a,b);//���� Ŭ������ �޼ҵ� ȣ��
	}
	void color(String color) {
		this.color=color;
	}
	void show() {
		super.show();//���� Ŭ������ �޼ҵ� ȣ��
		System.out.println(color);
	}
}

public class study13 {
	public static void main(String[] args) {

		 XY x= new XY();
		 x.set(1,2);
		 x.show();         //1,2 ���

		 XYZ xy=new XYZ();
		 xy.set(4,5);
		 xy.color("blue");
		 xy.show();       //4,5,blue ���  
	}
}
//1 2
//4 5
//blue
*/


/*
//4. �� ����� ������������ �Ѵ�. ����,����,�� �� �ϳ��� ���ڿ��� �Է¹޾� ���� �̰���� �Ǵ��ϴ� ���α׷����ۼ��ض�.(��ø if�� ����ؾ���, ���ڿ� ��)
//������) ���� : ����

//             ö�� : ��

//              ö���� �̰��.

public class study13 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("���� :");
		String y=s.next();
		
		System.out.println("ö�� :");
		String c=s.next();

		if(y.equals("��")) {
			if(c.equals("����")) {
				System.out.println("ö���� �̰��.");
			} else if(c.equals("����")) {
				System.out.println("������ �̰��.");
			} else {
				System.out.println("���º�");
			}
		}
		
		if(y.equals("����")) {
			if(c.equals("����")) {
				System.out.println("������ �̰��.");
			} else if(c.equals("����")) {
				System.out.println("���º�");
			} else {
				System.out.println("ö���� �̰��.");
			}
		}
		
		if(y.equals("����")) {
			if(c.equals("����")) {
				System.out.println("���º�");
			} else if(c.equals("����")) {
				System.out.println("ö���� �̰��.");
			} else {
				System.out.println("������ �̰��.");
			}
		}
	}
}
//���� :
//����
//ö�� :
//����
//ö���� �̰��.
*/


//5. ���� CircleŬ������ Ȱ���Ͽ� Circle ��ü�迭�� �����ϰ�, 5���� �� �������� �Է¹޾� �迭�������� ��, 
//   ���� ������ ���� ����ض�. main�� �ϼ��϶�!
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
//ù��° ���
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
//�ι�° ���
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

//6. ���� 10���� �������� �Է��Ͽ� ���������������Ľ��Ѽ� ����ض�.
//ù��° ���
public class study13 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("���� 10���� �Է��ϼ���");
		
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
//���� 10���� �Է��ϼ���
//1 2 3 4 5 6 7 8 9 10
//12345678910
*/

/*
//�ι�° ���
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
