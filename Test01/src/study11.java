import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
public class Ŭ�����̸� {

	// ��� ����, �ʵ�, �ν��Ͻ� ����
	int a;
    int b;
    
    // ������
    Ŭ�����̸�(){
    	a=10;
        b=15;
    }

	// �޼���
	public static void main(String[] args){
    //���α׷� ���� ���� 
    }
}
*/

/*
class Car{
	String name;
	int gas;
	Car(String n, int gas) {	//������ .. Ŭ�����̸��̶� �����ϰ�
		name=n;
		this.gas=gas;
	}
	Car(String n){	//������ .. Ŭ�����̸��̶� �����ϰ�
		name=n;
	}
}

public class study11 {

	public static void main(String[] args) {
		
		Car c=new Car("���Ǵ�Ƽ", 100);
		Car c1=new Car("�׷���");
	}
}
*/

/*
class Cal{	//Ŭ����
	public static int max(int a, int b) {	//�޼ҵ�
		return (a>b)?a:b;
	}
	public static int min(int a, int b) {	//�޼ҵ�
		return (a<b)?a:b;
	}
}
public class study11 {
	public static void main(String[] args) {
		
		Cal c=new Cal();	//��ü ����
		System.out.println(c.min(6, 8)); // ��ü�� ���ٵ� ����
		System.out.println(Cal.max(3,8));//static�̱� ������ Ŭ������ ���� ����
	}
}
//6
//8
*/

// ��ü ����
// ��ü�� ���Ͽ� ����� �� �� ����
// ��� =>ObjectOutputStream
// �Է� =>ObjectInputStream

// Serializable ��ü ����ȭ(�������̽�) �ʿ�

/*
//��ü �����ϴ� �۾�  Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream os=null;
		try {
			os=new ObjectOutputStream(new FileOutputStream("ob.dat"));
			
			Stu s=new Stu(); //��ä ����
			s.setName("��");
			s.setId("123");
			s.setAge(22);
			os.writeObject(s);
	
		}catch(Exception e) {}
		os.close();
	}
}
*/

/*
//��ü �о���̴� �۾� Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
	
		ObjectInputStream is=null;
		
		try {
			is=new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s=(Stu)is.readObject();	//Ŭ���� ����ȯ
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
		}catch(Exception e) {}
		is.close();
	}
}	
//��
//123
//22
*/


// Ŭ������ ���
// ����, �θ�, ����, ����
// �ڼ�, �ڽ�, ����, ����

// �θ� Ŭ������ private���� ����Ǿ��ٸ�
// ����� �Ұ��ϴ�.

/*
class Sports{	//�θ� Ŭ����
	String player;
	int number;
}
class Soccer extends Sports{	//���, �ڽ� Ŭ����
	int salary;
}
public class study11 {
	public static void main(String[] args) {
	
		Sports s=new Sports();	//��ü ����
		Soccer so=new Soccer();	//��ü ����
		so.salary=200000;
		so.player="�����";	//��� �޾ұ� ������ ������ �����ϴ�
		so.number=12; 		//��� �޾ұ� ������ ������ �����ϴ�.
		
		s.player="������"; 
//		s.salary=300000;	//�θ� Ŭ�����κ��� �ڽ��� �ʵ�, �޼ҵ� ���� �Ұ�
	}
}
*/

/*
class XY{
	private int x,y;
	void set(int x, int y) {
		this.x=x;	//�ʱ�ȭ,, �Լ�(�޼ҵ�)����  �ʱ�ȭ ����
		this.y=y;	//�ʱ�ȭ,, (�Ű������� �ʵ尪�� ����)
	}
	void show() {	//����̴ϱ� void 
		System.out.println(x+" "+y);	//4 8
	}
}

class XYZ extends XY{	//�ڽ�	�θ� 		//XYZ(�ڽ�)�� XY(�θ�)�� ��ӹ޾Ҵ�
						//set(),show()�� ���� ���� private�� ���� �Ұ�
	private String name;
	void setname(String name) {
		this.name=name;
	}
	void pr() {
		System.out.println(name);
		show();	//�Լ� ȣ��(��� ����)
	}
}
public class study11 {
	public static void main(String[] args) {
		//�θ�
		XY x = new XY();
		x.set(4, 8);
		x.show();
		
		//�ڽ�
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

//�ٸ� ������ ȣ�� => this
//�θ� Ŭ������ �����ڸ� ȣ��=> super()
//super()�� ����� �� ������ ���� ���� Ŭ������ ������ �ڵ� �߿���
//ù ��° �࿡ ���;� �Ѵ�.

//�������� ���
//���� ���� �����ڰ� ���� �� ���� Ŭ������ ������ ȣ��

/*
class Car{
	Car() {	//�⺻ ������ ���� ��� //�θ� Ŭ������ �⺻ �����ڸ� ��� ����
		System.out.println("���� Ŭ����");
	}
	Car(String str) {	//��� �ȵ�
		System.out.println("���� Ŭ���� super"+str);
	}
}
class Sedan extends Car{
	Sedan(String str) {
		super(str);	//������ ����Ŭ������ �����ڸ� ȣ���ϴ� �޼ҵ� super()
		System.out.println("���� Ŭ����"+str);
	}
}
public class study11 {
	public static void main(String[] args) {
		Sedan sedan1=new Sedan("�����!!");
	}
}
//���� Ŭ����
//���� Ŭ���������!!

//���� Ŭ���� super�����!!
//���� Ŭ���������!!
*/

/*
class Person{  //�θ�
	private String name;	//�ʵ�
	Person(String name) {	//������
		this.name=name;
	}
	void name() {	//����̴ϱ� ���� ���� void	�Լ�
		System.out.println(name);
	}
}
class Student extends Person{ //�ڽ�
	private String major;
	private String school;
	
	Student(String name, String major, String school) {
		super(name);	//�θ� ������ ȣ��!!!  �θ� ������ ���
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
		//Person p=new Person("����");	// Person()=> ������
		Student s=new Student("����","��ǻ��","�İ�");
		s.name();	//����
		s.show();
	}
}
//����
//��ǻ��
//�İ�
//����
*/


//�������� �⺻ ������ ���� ȣ��� �� �ڽ� Ŭ���� ��µȴ�.
//private�� ���̸�  ��� �Ұ���!
//����� ������ Ŭ������ ��Ű�� �ܿ��� �������� ���ϵ��� �����ϴ� ���� 
//protected ���� ���� ���ľ��̴�.
//protected�� �ڽ��� Ŭ���� �Ǵ� ��Ű�������� ������ �����ϴ�.

//���������� ���� ��� 
//public > protected > default > private 

/*
class Book{
	String title;
	Book(){
		title="�Ű�";
	}
}

public class study11 {
	public static void main(String[] args) {
	
		Book b=new Book();
	}
}
*/


// �޼ҵ� �����ε�(����ϴ� �򰥸� �� �ִ�

// �޼ҵ� �������̵�(���) =>�Ⱒ�ϴ�, ~���� �߿��ϴ� , ��ȿȭ�ϴ� �۾�
// �޼ҵ� �������̵� => ���� Ŭ������ �޼ҵ带 ���� Ŭ�������� ������ �ϴ� ���� ���Ѵ�.
// �θ𿡰� �������� ���� �����ؼ� ����ϴ� ���� ���Ѵ�.

/*
class Employee{
	   
     String name;
     int age;
   
    // print() �޼ҵ�
    void print(){
        System.out.println("����� �̸��� "+this.name+ "�̰�, ���̴�" + this.age+"�Դϴ�.");
    }   
}

//Employee ���
class Manager extends Employee{

	String jobOfManage;

 // print() �޼ҵ� �������̵�
 public void print(){
     System.out.println("����� �̸��� "+this.name + "�̰�, ���̴�" + this.age + "�Դϴ�.");
     System.out.println("������ "+this.name+"�� "+this.jobOfManage+" ����Դϴ�.");
 	}
}

public class study11 {
	public static void main(String[] args) {
		// Manager ��ü ����
	     Manager lee = new Manager();
	     
	     // ���� ����   
	     lee.name = "���̾�";
	     lee.age = 30;
	     lee.jobOfManage="������Ʈ �Ŵ���";
	        
	// Overriding�� Manager��ü�� print()ȣ��
	      lee.print();	
	}
}
//����� �̸��� ���̾��̰�, ���̴�30�Դϴ�.
//������ ���̾��� ������Ʈ �Ŵ��� ����Դϴ�.
*/

/*
class AAA{
	
	public void ride() {	// public�� �����ϸ� default�� �����ȴ�. //�������̵�
		System.out.println("�������̵�AAA");
	}
	public void load() {
		System.out.println("�����ε�AAA");
	}
}
class BBB extends AAA{	//���
	public void ride() {	
		System.out.println("�������̵�BBB");	//������ , �Լ��� �ٽ� �����ϰ� �ִ�.
	}
	public void load(int n) {	//�Լ��� �̸��� �Ȱ����� �Ű������� ���� �ٸ���.
		System.out.println("�����ε�BBB");
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
//�������̵�AAA
//�����ε�AAA
//�������̵�BBB
//�����ε�BBB
*/

// ���� Ŭ������ �޼ҵ� ȣ��
// ���� Ŭ�������� ���� Ŭ������ �޼ҵ带 ������ ȣ���Ϸ��� 'super.�޼ҵ��̸�()'���� ȣ���Ѵ�. 

//�޼ҵ� �������̵��� ����:final =>�� ���� ���� ���ϵ��� 
//�̷��� �ϸ� �ش� �޼ҵ�� ���� Ŭ�������� �������̵��� �� �� ���� ���� Ŭ�������� ������ ��� ����ؾ� �Ѵ�.
//final�� �ʵ� �տ� ���̸� �� �ʵ��� ������ ������ �� ����.
//�Ϲ������� final�� ���̴� �ʵ�� ���ó�� ������ �����̸�
//�ַ� static�� �Բ� Ŭ���� ������ ���ó�� �����ϴ� �� ���ȴ�.

/*
class B{
	static final double pi=3.14;
	//pi=pi+1; ������ ���̱� ������ ������ �� ����. ����
	double r;
	
	B(double r) { //������ ����
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
//		b.pi=3.14; <-���� �Ұ���
	}
}
//94.985
*/

//�޼ҵ忡 final�� ���̸� ������ �޼ҵ尡 �ǹǷ� �������̵�(������) �� �� ����.
//���� �ʵ忡 final�� ���̸� ������ ���� ���� ���� ������ ���� �� �� ����

/*
//�ڹ� ���α׷��� for Beginner
//p468
//02.���� �ڵ�� � ��� ����� �����°�?
class Book{
	Book() {
		System.out.println("Book Ŭ���� ������ ~~");
	}
}

class ComputerBook extends Book {
	ComputerBook() {
		System.out.println("ComputerBook Ŭ���� ������ ~~");
	}
}
public class study11 {
	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook();
	}
}
//Book Ŭ���� ������ ~~
//ComputerBook Ŭ���� ������ ~~
*/


//�ڹ� ���α׷��� for Beginner
//p469
//03.�������� 2���� �ڵ带 �����Ͽ� ������ ���� ����� �������� Book Ŭ������ ComputerBook Ŭ������ 
//	 �ϼ��Ͻÿ�. ��, Book Ŭ������ �����ڴ� 2��, ComputerBook Ŭ������ �����ڴ� 1���� �Ѵ�.

//public class Exam {
//	public static void main(String[] args) {
//		ComputerBook sedan1 = new ComputerBook("�� �ڹ�");
//	}
//}

/*
// ��°��
// Book Ŭ���� ������ ~~ (�Ķ���� ����)
// Book Ŭ���� ������ ->�� �ڹ�
// ComputerBook Ŭ���� ������ ~~
 
class Book{
	Book(){
		System.out.println("Book Ŭ���� ������ ~~ (�Ƕ���� ����)");
	}
	Book(String n){
		this();
			System.out.println("Book Ŭ���� ������ ��>"+n);
	}
}
class ComputerBook extends Book{
	public static String n;
	
	ComputerBook(String n){
		super(n);
		System.out.println("ComputerBook Ŭ���� ������ ~~~");
	}
}
public class study11 {
	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook("�� �ڹ� ");
	}
}
//Book Ŭ���� ������ ~~ (�Ƕ���� ����)
//Book Ŭ���� ������ ��>�� �ڹ� 
//ComputerBook Ŭ���� ������ ~~~
*/

/*
//���� ó�� ���α׷�
//�̸�	 ���� 	����		����	 	���� 		���
//���	 
//����
//�츲
//����

class Score{
	double avg(int a[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return (double)sum/a.length;
	}
	void show(int a[][]) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
			System.out.println(avg(a[i]));
		}
	}
}
public class study11 {
	public static void main(String[] args) {
	
		int [][] grade = {{90,100,80},
						  {70,95,87},
						  {80,90,70},
						  {90,100,100}};
		
		Score s= new Score();	//��ü ����
		s.show(grade);
	}
}
//90
//100
//80
//90.0	//�� �࿡ ���� ���
//70
//95
//87
//84.0  //�� �࿡ ���� ���
//80
//90
//70
//80.0  //�� �࿡ ���� ���
//90
//100
//100
//96.66666666666667  //�� �࿡ ���� ���
 */

/*
//0 1 2 3
//1 2 3 4
//2 3 4 5

//[i][j] 
//[0,0]=>0
//[0,1]=>1
//[1,0]=>1
//[1,1]=>2
//[2,0]=>2

//ary[i][j] =i+j;

public class study11 {
	public static void main(String[] args) {
		 int ary[][] = new int[3][4];
	        int n=0;
	        for(int i=0; i<3; i++) {
	        	for(int j=0;j<4;j++) {
	        		ary[i][j] =i+j;
	        		System.out.print(ary[i][j]);
	        	}
	        	System.out.println();
	      }
	}
}
*/
//0123
//1234
//2345

/*
public class study11 {
	static int exp(int a, int b) {
		int m=1;
		for(int i=1; i<=b; i++) {
			m*=a;
		}
		return m;
	}
	public static void main(String[] args) {
		
		int a=exp(3,10); //3*3*3*3*3*... 10��
		System.out.println(a);	//59049
	}
}
*/

/*
//�����ε�
class Number{
	static void show(int n) {
		System.out.println(n);
	}
	void show(double n) {
		System.out.println(n);
	}
}

public class study11 {
	public static void main(String[] args) {
	
		Number.show(20);  //Ŭ���� �̸��� ����� ù���ڴ� �빮��!
						  //Ŭ������.�޼ҵ�-> static
		Number n=new Number();
		n.show(3.14);
	}
}
//20
//3.14
*/

/*
//1. while���� �̿��� �Ǽ��� ���� �� �Է¹ް� ��� ���.
//(-1�� �ԷµǸ� �Է��� ������Ѷ�.)
//ù��° ���
public class study11 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double sum = 0;
	int count=0;
	
	while (true) {
		double a = sc.nextDouble();
		if (a == -1)
			break;
			sum += a;
			count++;
	}
		System.out.println("���"+(sum/count));
	}
}
//10.7 5.7 2.5 -1
//���6.3
*/

/*
//�ι�° ���
public class study11 {
	public static void main(String[] args) {
		
		int n=0,sum=0,cnt=0;
		Scanner s=new Scanner(System.in);
		while((n=s.nextInt())!=-1) {
			sum+=n;
			cnt++;
		}
		System.out.println(sum/cnt);
	}
}
*/

/*
//2.  Hi 
//���� �ڹٸ� �����ϰ� ���մϴ�.
//������ �� ������ ������ ���Դϴ�.
//�� ���ڿ��� test01.txt ���Ͽ� �����ض�.

public class study11 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("test01.txt"));
		bw.write("Hi");
		bw.newLine();
		bw.write("���� �ڹٸ� �����ϰ� ���մϴ�.");
		bw.newLine();
		bw.write("������ �� ������ ������ ���Դϴ�.");
		bw.close();
	}
}
*/


//3. Scanner�� �Է� ���� �̸�(���ڿ�), id(���ڿ�)�� �� �ٸ��� ����(test02.txt)�� �����ض�.
//���׸��� �Է��ϸ� ������Ѷ�. ���׸��� �Է��ϱ� �������� ���ڿ��� ���Ͽ� �����ض�.(break, FileWriter ���)
//���� ���) ȫ�浿 hong    
//         �̱浿 lee
//         �׸�

//ù��° ���
/*
public class study11 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("test02.txt"));
		String brr = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
		String d = br.readLine();
		bw1.write(d);
		bw1.newLine();
		if (d.contains("�׸�")) {
		break;
		}
		System.out.println(d);
		}
		br.close();
		bw1.close();
	}
}
*/

/*
//�ι�° ���
public class study11 {
	public static void main(String[] args) {
		FileWriter f=null;
		
		Scanner s=new Scanner(System.in);
		String name="",id="";

		try {
				f=new FileWriter("test02_1.txt");
				
				while(true) {
					System.out.println("�̸�, id");
					name=s.next();
					
					if(name.equals("�׸�")) {
						break;
					}
					
					id=s.next();
					f.write(name +" "+id);
				}
				f.close();
			}catch(Exception e) {}
	}
}
*/


//3. 1���� ���Ͽ� ������ �����͵��� ȭ�鿡 ����ض�.
//(FileReader���, int������ �ʱ�ȭ�ض�)

/*
//ù��° ���
public class study11 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader
				(new FileReader("test02.txt"));
				
				int r;
				
				while((r=br.read()) != -1) {
					System.out.print((char)r);
				}
				br.close();
		}
}
//ȫ�浿 hong
//�̱浿 lee
//�׸�
*/

/*
//�ι�° ���
public class study11 {
	public static void main(String[] args) throws IOException {
	
		FileReader fr=null;
		try {
			fr=new FileReader("test02.txt");
			int r=0;
			while((r=fr.read())!=-1) {
				System.out.print((char)r);
			}
		}catch(Exception e) {}
		fr.close();
	}
}
//ȫ�浿 hong
//�̱浿 lee
//�׸�
*/


//4. ���� main()�� ���� Ŭ���� �ۼ��ض�.
//   main(){
//   Rectangle rec = new Rectangle();
//   rec.width=5;
//   rec.height=6;
//   System.out.println(���簢�� ������ + rec.area( ));

/*
class Rectangle {
	int width;		//�ʵ�
	int height;		//�ʵ�
	
	int area() {	
		int a = width * height;
		return a;
	}
}
public class study11 {
	public static void main(String[] args) {
		 
		Rectangle rec = new Rectangle();
		rec.width=5;
		rec.height=6;
		System.out.println("�簢�� ����" + rec.area());
	}
}
*/


//5. main()�� ���� SongŬ������ �ۼ��ض�.
//main(){
//Song s1 = new Song(��On��);
//Song s2 = new Song(��00:00��);
//System.outprintln(�������ϴ� �뷡�� + s1.getsong());
//System.outprintln(���� �뷡 �� + s2.getsong());
//���� ���) �����ϴ� �뷡 On
//         �� �뷡 00:00

/*
//ù��° ���
class Song{
	private String song="";
	Song(String song){
		this.song = song;
	}
	String getsong() {
		return this.song;
	}
}
public class study11 {
	public static void main(String[] args) {
		Song s1 = new Song("On");
		Song s2 = new Song("00:00");
		System.out.println("�����ϴ� �뷡" + s1.getsong());
		System.out.println("�� �뷡 " + s2.getsong());
	}
}
//�����ϴ� �뷡On
//�� �뷡 00:00
*/

//�ι��� ���
/*
class Song{
	String title="";
	Song(String title){
		this.title=title;
	}
	String getsong() {
		return title;
	}
}
public class study11 {
	public static void main(String[] args) {
		Song s1 = new Song("On");	//��ȣ �ȿ� ����ִ� �����ڸ� ���ƾ� �Ѵ�.
		Song s2 = new Song("00:00");
		System.out.println("�����ϴ� �뷡" + s1.getsong());
		System.out.println("�� �뷡 " + s2.getsong());
	}
}
//�����ϴ� �뷡On
//�� �뷡 00:00
*/

/*
class Car{
	public int gas;	//�ʵ�, �ν��Ͻ� ����
	public void up() { //�޼ҵ�, �Լ�
		gas+=1;
	}
	public final void stop() {
		System.out.println("stop");
		gas=0;
	}
}

class SportsCar extends Car{	//�ڽ�	�θ�
	public void up() {	//�������̵� <= �θ� Ŭ���� �����޾Ƽ� ������ ����!
		gas+=100;
	}
	
	
//	public void stop() {//final�̱� ������ ���� �Ұ���,,�� �������̵� �� �� ����!
//		System.out.println("������ī");
//		gas=0;
}

public class study11 {
	public static void main(String[] args) {
		//CarŬ������ ��ü ����
		Car c=new Car();
		c.gas=0;
		c.stop();
		c.up();
		
		SportsCar s=new SportsCar();
		s.stop();	//�ι��κ��� ���, ������ �����Ǵ� �ȵ�(final)
	}
}
//stop
//stop
*/

/*
public class study11 {
	public static void main(String[] args) {
	
	}
}
*/
