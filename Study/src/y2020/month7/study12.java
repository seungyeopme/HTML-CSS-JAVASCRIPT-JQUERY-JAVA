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
	String color;	//�ʵ�
	int speed;
	String getcolor() {
		return color;
	}
}
public class study12 {
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.color="����";
		c1.speed=0;
		c1.getcolor();
	}
}
*/

/*
class Circle {
	private int r;	//�ʵ�
	
	Circle(int r){	//������
		this.r=r;
	}
	int get() {		//�޼ҵ�, �Լ�, �������� �����޴� �Լ�
		return r;
	}
}

class NCircle extends Circle{
	String color;
	NCircle(int r, String c) {
		super(r);	//�θ� ������ ȣ��  Circle(int r) �ϴ� ��! private int r(�ʵ�)�ʹ� ���� ����. �θ� ������ ȣ��!
					//���� �θ� �����ڰ� private�̶�� ���� �Ұ��ϴ�!!!
		this.color=c;	//�̸��� ���� ������ this�� ���� ���� ������ �������� �ʰ� color=c; ��� ��� �ȴ�.
	}
	void show() {
		System.out.println("������ "+ get() +" "+color+"��");
	}
}
public class study12 {
	public static void main(String[] args) {
		
		NCircle n =new NCircle(10, "red");
		n.show(); //������ 10 red��
	}
}
//������ 10 red��
*/

//�������̵� => ��� ���迡 �ִ� Ŭ���� ���� ���� �̸��� �޼ҵ带 �����ϴ� ���
//�����ε� => ���� �̸��� �Լ��� ���� �� �����ϰ�, �Ű������� ������ ������ �ٸ��� �Ͽ� �پ��� ������ ȣ�⿡ �����ϰ� �Ѵ�.

/*
class Circle{ 			//Ŭ����
	int r;
	Circle(int r){		//������
		this.r=r;
	}
	double getarea() {	//void�� �ƴϸ� return ,�Լ�,�޼ҵ�
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
	double getarea() {	//void�� �ƴϿ��� return���� �ִ�. void�̸� ��� ���� ����
		return r*r*3.14; 
	}
}

public class study12 {
	public static void main(String[] args) {
		
//		Circle c1=new Circle(10);	//��ü ����
									//���� 100���� �����ؾ� �Ѵٸ�? 
									//��ü �迭�� ����ϸ� ��
									//��ü �迭: �������� ��ü�� �迭���·� ������
//		int []ary=new int[4];

//		���ٷ� ��ü �迭 ���� 
//		Circle[]ary;
//		ary=new Circle[4];
		
		Circle[]ary=new Circle[4];	//�� �ٿ� ��ü�迭 ����, ������ �κ��� ����, ��ü�迭 4�� ����!
		
		for(int i=0; i<ary.length; i++) {
			ary[i]=new Circle(i); //������ ����, ��ü 4���� �����ؼ� �迭��ġ�� ����
			System.out.println(ary[i].getarea());	//������ 0,1,2,3�� ���� ���� ���
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
	public Person() { //������1: ��ü�� ������ �� ȣ��
		
	}
	public Person(String s) {	//������2
		name=s;
	}
	public String getName() {
		return name;
	}
}
public class study12 {
	public static void main(String[] args) {
		Person[] pa; //Person Ÿ������ ��ü�� ���� ���۷����� 10�� ����, �� 10���� ����� ����.
		pa=new Person[10];
		
		for(int i=0;i<pa.length;i++) {
			pa[i]=new Person(); //�迭�� ���� ��ü ����. ��, Person() ��ü ����
			pa[i].age=30+i;
			System.out.println("pa["+i+"]���̴� "+pa[i].age+"�Դϴ�");
		}
	}
}
//pa[0]���̴� 30�Դϴ�
//pa[1]���̴� 31�Դϴ�
//pa[2]���̴� 32�Դϴ�
//pa[3]���̴� 33�Դϴ�
//pa[4]���̴� 34�Դϴ�
//pa[5]���̴� 35�Դϴ�
//pa[6]���̴� 36�Դϴ�
//pa[7]���̴� 37�Դϴ�
//pa[8]���̴� 38�Դϴ�
//pa[9]���̴� 39�Դϴ�
*/

/*
class Song{
	String singer,title;
	
	public Song(String s,String t) {	//������ ����
		singer=s;
		title=t;
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		  Song so[]=new Song[2];
		  
		  for(int i=0;i<2;i++) {
		   System.out.println("����");
		   String singer=s.next();
		   System.out.println("����");
		   String title=s.next();
		   so[i]=new Song(singer,title);
		  }
		  for(int i=0;i<2;i++) {
		  System.out.println(so[i].singer +" "
		    +so[i].title);}
	}
}
//����
//A
//����
//a
//����
//B
//����
//b
//A a
//B b
*/

//1. �Է¹��� �ؽ�Ʈ�� java.txt���Ͽ� �����ϴ� ���α׷��� �ۼ��ض�. (InputStreamReader, FileWriter ���)
/*
//ù��° ���
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
//�ι�° ���
public class study12 {
	public static void main(String[] args) throws IOException {
	
	//�ܼ�â�� �Է¹���	
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
//2.main()�� ���� Ŭ������ �ۼ��ض�.
//Student s1=new Student(����浿��, ��kim��);

//Student s2=new Student(���̱浿��, ��lee��);

//s1.pr(); s2.pr();         //��� ������ ���

class Student{
	String h,e;
		
	public Student(String h,String e) {	//������ ����
			this.h=h;
			this.e=e;
	}
	void pr(){
		System.out.println(h+e);
	}
}

public class study12 {
	public static void main(String[] args) {
		
		Student s1=new Student("��浿", "kim");
		Student s2=new Student("�̱浿", "lee");
		s1.pr(); s2.pr();         //��� ������ ���
	}
}
//��浿kim
//�̱浿lee
*/

/*
//txt ���Ϸ� ������ �����ϱ�
public class study12 {
	public static void main(String[] args) {
	try {
		OutputStream os = new FileOutputStream("test01.txt");
		String s = "���� ������ ���ƿ�";
		byte[] b=s.getBytes();
		os.write(b);
	}catch(Exception e) {
		e.getStackTrace();
		}
	}
}
*/

/*
//3. main()�� �����Ͽ� Ŭ������ �ۼ��ض�.
//main(){

//Music m=new Music(��On��, ��BTS��);

//System.out.println(title+ �� �� +singer);  // On , BTS ���

//Music m1=new Music(��00:00��);

//System.out.println(title+�� �� +singer);  // 00:00, ��ź ���

class Music{
	String title,singer;
	
	Music(String title, String singer){
		this.title=title;
		this.singer=singer;
	}
	Music(String title) {
		//this.title = title;
		//this.singer = "��ź";		
		this(title,"��ź");
	}
}
public class study12 {
	public static void main(String[] args) {
		
		Music m=new Music("On", "BTS");
		System.out.println(m.title+ " " +m.singer);  // On , BTS ���

		Music m1=new Music("00:00");
		System.out.println(m1.title+" " +m1.singer);  // 00:00, ��ź ���
	}
}
//On BTS
//00:00 ��ź
*/


/*
//4. add, div�޼ҵ� �����ض�.
//main(){

//int a=Cal.add(10,5); //��

//int b=Cal.div(10,5); //��

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
		int a=Cal.add(10,5); //��

		int b=Cal.div(10,5); //��

		System.out.println(a +" " +b);
	}
}
//15 2
*/

//5.       0         �̷��� ��� ����ض�
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
//		0		0->3	//���� ���� ����
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
//		0		0->1	//���� ���� ����
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
	String kind ;       	// ī���� ���� - �ν��Ͻ� ����
	int number;             // ī���� ���� - �ν��Ͻ� ����

	static int width = 100; // ī���� �� - Ŭ���� ����
	static int height = 250;// ī���� ���� - Ŭ���� ����

}
public class study12 {
	public static void main(String[] args) {
		
		// Ŭ��������(static ����)�� ��ü�������� 'Ŭ�����̸�.Ŭ��������'�� ���� ��� �����ϴ�.
		System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );             System.out.println("���� c1�� width�� height�� ���� 50, 80���� �����մϴ�.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );
	}
}
//Card.width = 100
//Card.height = 250
//c1�� Heart, 7�̸�, ũ��� (100, 250)
//c2�� Spade, 4�̸�, ũ��� (100, 250)
//���� c1�� width�� height�� ���� 50, 80���� �����մϴ�.
//c1�� Heart, 7�̸�, ũ��� (50, 80)
//c2�� Spade, 4�̸�, ũ��� (50, 80)
*/

/*
//6. �迭 �ȿ��� ���� ���� ������ ���Ϲ޴� get�Լ����ۼ��ض�.
//main(){

//int[][] grade = {{55, 60, 65}, {85, 90, 95}};

//int high;

//high= get(grade);

//System.out.println("���� ���� ������ " + high+ "�� �Դϴ�.") };

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
	System.out.println("���� ���� ������ " + high+ "�� �Դϴ�.") ;
	}	
}
//���� ���� ������ 95�� �Դϴ�.
*/


//7. �� �� �迭���� ����ܾ �Է¹޾� �ѱ��� ����ϴ� ���α׷�
//String eng[]={��student��,��book��,��future��,��note��};

//String kor[]={���л���,��å��,���̷���,����Ʈ��};

//           ��stop"�� �Է��ϸ� ���α׷��� ������Ѷ�. (while(true), equals() ���)

//������) ���� �ܾ� �Է�: book

//å

//     ���� �ܾ� �Է�: stop

/*
public class study12 {
	public static void main(String[] args) {

		String eng[]={"student","book","future","note"};
		String kor[]={"�л�","å","�̷�","��Ʈ"};
		
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
//�л�
//book
//å
//future
//�̷�
//note
//��Ʈ
//stop
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//	at y2020.month7.study12.main(study12.java:547)
*/

/*
public class study12 {
	public static void main(String[] args) {
		String eng[]={"student","book","future","note"};
		String kor[]={"�л�","å","�̷�","��Ʈ"};
		
		Scanner s=new Scanner(System.in);
		while(true) {
			String str=s.next();
			for(int i=0; i<eng.length;i++) {
				if(str.equals(eng[i])) {
					System.out.println(kor[i]);
					break;	//for �ݺ��� Ż�� (���� ����� �ݺ��� Ż��)
				}
			}
			if(str.equals("stop")) {
				break;//while �ݺ��� Ż��
			}
		}
	}
}
//student
//�л�
//future
//�̷�
//note
//��Ʈ
//book
//å
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
abstract class Cat{ // �߻� �޼��带 �����ϹǷ� �߻�Ŭ������ ����
    abstract void call(); // �߻� �޼��� ����(����x)
    void call2(){
        System.out.println("�Ϲ� �޼���");
    }
}
 
//Cat �߻�Ŭ������ ����� Ŭ������
class FirstCat extends Cat{
    void call(){ //�߻�޼���� ����Ŭ�������� �ݵ�� ������ �Ǿ�� ��
        System.out.println("ù��° �߿���");
    }
}
 
class SecondCat extends Cat{
    void call(){
        System.out.println("�ι�° �߿���");
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
//ù��° �߿���
//�ι�° �߿���
*/

//�߻� Ŭ������ abstract�� ����� Ŭ������ ���մϴ�.
//�� Ŭ������ �߻� �޼ҵ带 ������ �ְų� ������ ���� ���� ���� �ֽ��ϴ�.
//�߻� Ŭ������ ������ �ν��Ͻ��� �� �� ������ �ڽ� Ŭ������ �����մϴ�.
//�߻� Ŭ������ ����Ϸ��� ��� �޾� ����ؾ��մϴ�.

//�߻� �޼ҵ�� ������ ���� ����� �޼ҵ��Դϴ�. (�߰�ȣ ����, �������� �����ݷ�(;)�� �޸��ϴ�.

/*
class Person{
	String name;
	String id;
	
	Person(String name) {	//������
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String major;
	
	//������ ����鼭 �θ� ������ ȣ��
	Student(String name) {
		super(name);	//�������� ù �ٿ� ����� �Ѵ�. super
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Person p;	//�θ� Ŭ������ ��ü ����
		Student s=new Student("�¿�");	//�ڽ� Ŭ������ ��ü ����

		p=s;	//�� ĳ����(�ڽ�Ŭ���� ��ü�� �θ� Ŭ������ ��ü�� ĳ�����ϴ� �۾�)
				//Student���� Person����
		System.out.println(p.name);
//		p.grade="A"; //�θ𿡼� �ڽ����� ���� �Ұ�
	}
}
*/

/*
class Person{
	String name;
	String id;
	
	Person(String name) {	//������
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String major;
	
	//������ ����鼭 �θ� ������ ȣ��
	Student(String name) {
		super(name);	//�������� ù �ٿ� ����� �Ѵ�. super
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Person p=new Student("�¿�");	//upcasting
		//Student s=new Student("�¿�");
		Student s=(Student)p;//�ٿ� ĳ����  //�θ� Ŭ������ �ڽ� Ŭ������ ������ �۾�
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
	
		Fruit f1=new Apple("red",10);//�ڽ� �ʿ� �����ڰ� ������ �θ� �ʿ� ������ �����ؾ�
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
		System.out.println(color+"�� " +number+"�� "+size+"��ġ");
	}
}

public class study12 {
	public static void main(String[] args) {
	
		Ipad i1=new Ipad("white", 5, 5);
		i1.show();	//white�� 5�� 5��ġ
	}
}
//white�� 5�� 5��ġ
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


//�߻� Ŭ������ �Ϲ� Ŭ������ �ν��Ͻ��� ������ �� ����.
//�߻� Ŭ������ ����Ϸ��� ���� ���� Ŭ�������� �߻� Ŭ������ ��ӹ��� ��
//���� Ŭ������ �ν��Ͻ��� �����ؾ� �Ѵ�.

//	abstract class Ŭ�����̸� {
		//�ʵ� �� �޼ҵ� ����
//	}

/*
abstract class Car{
	int speed=0;
	String color;
}
public class study12 {
	public static void main(String[] args) {
	
		Car c=new Car(); //abstract�� �ν��Ͻ� ��ü ���� �Ұ���
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
	
//		Car c=new Car(); //abstract�� �ν��Ͻ� ��ü ���� �Ұ���
		Sedan sedan1=new Sedan();
		Truck truck1=new Truck();
		//�߻� Ŭ������ ��ӹ��� Sedan, Truck Ŭ������ �ν��Ͻ��� ��ӹ��� �� �ִ�.
	}
}
*/

/*
//abstract ��ȯ���޼ҵ��̸�(�Ķ����);

//���� ��� upSpeed()�� �߻� �޼ҵ�� �����ϸ� ������ ����.
//abstract void upSpeed(int speed);

//�߻� �޼ҵ��� ������ ��� ���� ���� Ŭ�������� �������̵�(�θ� Ŭ���� �����޾Ƽ� �ڽĿ��� ������)
//�θ� Ŭ�������� �߻� �޼ҵ�� �����⸸ ��������,
//���� ������ ������ ���� Ŭ�������� ä���ִ� ����̴�.

//�߻� �޼ҵ尡 �ϳ��� ��� �ִ� Ŭ������ ������ �߻� Ŭ������ �����ؾ� �Ѵ�!!!
//�߻� Ŭ���� �ȿ� �Ϲ����� �޼ҵ�, �߻� �޼ҵ�� �� �� �ִ�.

//�߻� Ŭ������ ����� ���� ���� Ŭ������ �߻� �޼ҵ带 �������̵����� ������ 
//���������� ������ �߻��ϹǷ� �ݵ�� ��� �߻� �޼ҵ带 �������̵��Ͽ�
//�� ������ �ٽ� �ǹ������� ä���� �Ѵ�.


abstract class A{	//�߻� Ŭ������ �� �־�� �Ѵ�. �߻� �޼ҵ尡 �ֱ� ������
	abstract void aa(); //�߻� �޼ҵ�	
}
public class study12 {
	public static void main(String[] args) {
	
	}
}
*/

/*
abstract class Car{	//�߻� �޼ҵ尡 �����ϹǷ� Ŭ������ �߻� Ŭ����!!!
	String name;
	
	void run() {	//�Ϲ����� �޼ҵ�
		System.out.println("���� �����δ�");
	}
	
	abstract void stop();	//�߻� �޼ҵ� //�󲮵��� �Լ� //���� ���־��!
}

class Cars extends Car{	//Cars-> �ڽ� Car->�θ�
	Cars() {
		this.name="���Ǵ�Ƽ";//name="���Ǵ�Ƽ" �� ����
	}
	void stop() {	//�߻� �޼ҵ�� �ݵ�� ��ӹ޾Ƽ� ����(�������̵�)
		System.out.println("���� �����");
	}
}

public class study12 {
	public static void main(String[] args) {
		
//		Cars c=new Cars();	//����
		Car c=new Cars();	//�� ĳ���� �̷��Ե� ����

//		Cars c=new Car();	//�ٿ� ĳ������ �Ұ���
//		Car c=new Car(); ��ü ���� �Ұ���	
		c.run();
		c.stop();
	}
}
//���� �����δ�
//���� �����
*/


//�߻� Ŭ������ �ʵ�, �Ϲ� �޼ҵ�, �߻� �޼ҵ尡 ��� ������ �� �ִ�.
//��, �ν��Ͻ��� ������ ���� ���̴�.

/*
//ù��° ���
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
		
		Cal c=new Cal(); //Cal->Ŭ����
		System.out.println(c.add(3,7));//�� �� ��
		System.out.println(c.avg(new int[]	{1,2,3}));///1,2,3�� ���
	}
}
//10
//2.0
*/

// �ι�° ���
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
		
		Cal c=new Cal(); //Cal->Ŭ����
		System.out.println(c.add(3,7));//�� �� ��
		System.out.println(c.avg(new int[]	{1,2,3}));///1,2,3�� ���
	}
}
//10
//2.0
*/

/*
class Num extends Exception{
	Num() {
		super("�߸��� ��!!!!!");	// �θ� ������ ȣ��(Exception class�� �ִ�)
	}
}
public class study12 {
	
	static int in() throws Num {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			Num num=new Num();	//��ü ���� , ������ ȣ��
			throw num;	//���� �̷��, ���� ������, ���⼭ ó�� ����. �θ� Ŭ���� �����ڷ� �̵�.
		}//else ����
		return n;
	}
	public static void main(String[] args) {
		
		System.out.println("����� �Է��ض�");
		try {
			int n=in(); //���� �Է��ϴ� �Լ�
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
//����� �Է��ض�
//-7
//�߸��� ��!!!!!

//����� �Է��ض�
//8
//8
*/

/*
//����ȭ
class Rec implements Serializable{	//Serializable <-�������̽�, ��� ����
									//�������̽��� ������ ���� implements
									//Ŭ������ ��� �޴� ���� extends
	//��ü�� ���Ͽ� ����: ����ȭ ����
	//���Ͽ� ������ ��ü�� �о��: ������ȭ ����
	
	int x,y; //�ʵ�
	Rec(int x, int y){	//������
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
//������ȭ
class Rec implements Serializable{	//Serializable <-�������̽�, ��� ����
									//�������̽��� ������ ���� implements
									//Ŭ������ ��� �޴� ���� extends
	//��ü�� ���Ͽ� ����: ����ȭ ����
	//���Ͽ� ������ ��ü�� �о��: ������ȭ ����
	
	int x,y; //�ʵ�
	Rec(int x, int y){	//������
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
		//object ��ü-> Rec
		//�� ��ȯ
		Rec r2=(Rec)in.readObject();
		String str=(String)in.readObject(); //�ڹ� api���� �ֻ����� �ִ� ���� object Ŭ�����̴�.
		//Object(�θ�)�� 
		//Rec, String ��ü�� �ٿ� ĳ����
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
//�ڹ� api���� �ֻ����� �ִ� ���� object Ŭ�����̴�.

Class Object
java.lang.Object

public class Object
Class Object is the root of the class hierarchy. 
Every class has Object as a superclass. 
All objects, including arrays, implement the methods of this class.
*/


//�������̽��� �߻� Ŭ������ ���� ����ϸ� ���� ����� ���� ����ϱ⵵ �Ѵ�.
//�������̽��� �߻� Ŭ������ ���������� ���� �ν��Ͻ��� ������ �� ����.

//���� ����������� �������̽��� �ʵ�, �߻� �޼ҵ带 ���� �� ������ �߻� Ŭ������ �޸�
//�Ϲ� �޼ҵ�, �����ڸ� ���� �� ���ٴ� ���̴�.

//�޼ҵ带 �����Ϸ��� �޼ҵ� �տ� default!!!

//�������̽� �ȿ� abstract ��� Ű���带 �� �����־
//������ �߻�޼ҵ�� �ν��Ѵ�.

//�������̽��� �⺻ ��������(�߻�޼ҵ�, �����(final))

/*
interface �������̽��̸�{
	 static final �ʵ� �� �߻� �޼ҵ� ����
}
*/

//�������̽��� ���� �޼ҵ�� �߻� �޼ҵ�ۿ� ���� ������ 
//abstract�� �����ص� �翬�� �߻� �޼ҵ�� �ν��Ѵ�.
//���� �������̽��� implements Ű���带 ����Ѵٴ� �ǹ̿���
//Ŭ����ó�� '��ӹ޴´�'��� ǥ���ϱ⺸�ٴ� �ַ� '�����Ѵ�'��� ǥ���Ѵ�

/*
interface Car{
	static final int CAR_COUNT=0; //int CAR_COUNT=0; �̷��� ��� �����ϴ�
	abstract void work(); //���� �ְ� �ִ�.
}
class Sedan implements Car{
	public void work() {
					//�������̽����� �޼ҵ� ������ �ݵ�� public�� �ʿ��ϴ�. �� ������ error
					//�������̵�
		System.out.println("�¿����� ��� �¿��");
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Sedan s=new Sedan(); 
//		Car s=new Sedan();		//up casting <-�̷��Ե� �����ϴ�!
		s.work();
	}
}
//�¿����� ��� �¿��
*/

//�������̽��� ���� �� void,int ���� ��ȯ���� �������� �ʴ´�.
//��ȯ���� �޼ҵ�, �Լ��� !
//final Ŭ���� ������ ���� ������ ���������� ������ �Ұ����ϴ�


/*
//Car1.java ���Ͽ��� ����
 
class Sedan implements Car1{
	public void work() {
					//�������̽����� �޼ҵ� ������ �ݵ�� public�� �ʿ��ϴ�. �� ������ error
					//�������̵�
		System.out.println("�¿����� ��� �¿��");
	}
}
public class study12 {
	public static void main(String[] args) {
	
		Sedan s=new Sedan(); 
//		Car s=new Sedan();		//up casting <-�̷��Ե� �����ϴ�!
		s.work();
	}
}
*/

//�ڹٴ� ���� ����� ������� �ʴ´�.
//�� ������� �������̽��� ���� ����� ����Ѵ�.
//�������̽����� �Լ� ���� �����ϴ�
//default�� �տ� �ٿ��ָ� �����ϴ�.
//�������̽��� �߻� �޼ҵ带 �ϼ��� ���� public�� ���δ�.

public class study12 {
	public static void main(String[] args) {
	
	}
}