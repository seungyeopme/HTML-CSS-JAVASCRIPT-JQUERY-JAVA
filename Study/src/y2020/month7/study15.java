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

		//�̸��� ���̸� �Է¹޾Ƽ� ���
		Scanner s = new Scanner(System.in);
		Name n = new Name(s.next(),s.nextInt());
		System.out.println("�̸��� "+n.getname() + " "+"���̴� "+n.getage());
		
		//Name n = new Name("abc",30);
		//System.out.println("�̸��� "+ n.getname() + " ���̴� "+n.getage()+"�Դϴ�.");
//		ȫ�浿 30
//		�̸��� ȫ�浿 ���̴� 30
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
		
		Book b1=new Book("�ڹ�","DB");
		Book b2=new Book("HTML");
		b1.show();//�ڹ� DB
		b2.show();//HTML CSS
	}
}
*/

/*
public class study15 {
	public static void main(String[] args) {
		
		Double b=new Double(10.5);//10.5f�� �ڽ�(��üȭ)��Ű��
		double d=b.doubleValue();//��ڽ�
	}
}
*/

/*
abstract class Cal{
	protected int a,b;
	abstract int cal();	//�߻� �޼ҵ�
	
	void in() {
		Scanner s=new Scanner(System.in);
		System.out.println("�� �� �Է�");
		 a=s.nextInt();
		 b=s.nextInt();
	}
	void pr() {
		in();
		int r=cal();
		System.out.println("�����"+r);
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
		//Cal Ŭ���� ��� �޾� Multi, Div Ŭ���� ¥��
		Multi m=new Multi();
		Div d=new Div();
		m.pr();
		d.pr();
	}
}
*/
/*
�� �� �Է�
10 5
�����50
�� �� �Է�
10 5
�����2
*/
		
		//compareTo �޼ҵ�
		
		//2���� ��Ʈ���� ���������� ��, ���ڿ� �� �Լ�(���� dictionary ��)
		//A�� B�� ������ 0�� ��ȯ
		//A�� B���� ũ�� ����� ��ȯ
		//A�� B���� ������ ������ ��ȯ
		
			
		//StringBuffer
		
		//������ ������ ���� ���� ũ�⸦ �ڵ����� ������ �� �ִ�.
		//���ڿ��� ��ų� ���ڿ� �۾��� ���� ���
		//StringBuffer sb=new StringBuffer("Java");
		//sb.append(" is very good");//�߰�
		//sb.insert(0,"A ");
		//sb.replace(2, 6, "Html");
		//System.out.println(sb);	//A Java is very good	A Html is very good

/*
1. ���� main�Լ��� ���� �ۼ��ض�.

main(){

 Book b1=new Book(������ �ż��衱, ���ô��� �佽����);

 Book b2=new Book(���� �غ���);

 Book b3=new Book(); }

���� ���) ���� �ż��� �ô��� �佽��

                   �� �غ� �۰� �̻�

                   ������ ȣ��!!
*/
/*
class Book{
	String a,b;
	Book(String a, String b){
		this.a=a;
		this.b=b;
	}
	Book(String a){
		this(a," �۰� �̻�");	//�ٸ� ������ ȣ��!!	// �Ű������� 2�� �ִ� ������ ȣ���ϴ� �۾��̴�!!
	}
	Book(){
		this("������ ȣ��","");	//�ٸ� ������ ȣ��!! �ι�° �Ķ���Ϳ� ������ �����ν� ������ ȣ�⸸ ����Ѵ�!!
	}
	void pr() {
		System.out.println(a+b);
	}
}
public class study15 {
	public static void main(String[] args) {	
		
		Book b1=new Book("���� �ż���", " �ô��� �佽��");
		Book b2=new Book("�� �غ�");
		Book b3=new Book(); 
		b1.pr();
		b2.pr();
		b3.pr();
	}
}
*/

/*
2. FriendŬ������ ��ӹ��� ITFriendŬ�����������ض�.

class Friend{

    private String name;

    private String phone;

Friend(String name, String phone){

    this.name=name;  this.phone=phone; }

String get(){

  return name + �� ��+phone;}

 

Main() {

    ITFriend it=new ITFreind(��ȫ�浿��, ��010-111-1111��, ����ǻ�͡�);

    it.show();            

���� ���) ��ǻ�� ȫ�浿 ��ȣ 010-111-1111
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

		ITFriend it=new ITFriend("ȫ�浿", "010-111-1111", "��ǻ��");
		it.show();
	}
}
*/
/*
3. 5�� ������ �Է¹޾� ���� ���ϴ� ���α׷�.
����, ������ �ƴ� ���ڸ� �Է��� �� �߻��ϴ� InputMismatchException���ܸ� ó���Ͽ� �ٽ� �Է¹޵��� �ۼ��ض�.

���� ���) 1��° ����: 1

         2��° ����: a

         �ٽ� �Է��ض�. �����ƴϴ�.

         2��° ���� : 2

         3��° ���� : 3

         4��° ����: 4

         5��° ����: 5          

         ����: 15
*/
/*
public class study15 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("5�� ������ �Է��ϼ���: ");
		
		while(true) {
			try {
				int a=s.nextInt();
				int b=s.nextInt();
				int c=s.nextInt();
				int d=s.nextInt();
				int e=s.nextInt();
				
				int sum=a+b+c+d+e;
				System.out.println("5�� ������ ���� "+sum+"�Դϴ�.");
				break;
				
			}
			catch(InputMismatchException e) {
				
				s=new Scanner(System.in);
				System.out.println("�߸� �Է��߽��ϴ�. ������ �Է����ּ���!!");
			}
		}
	}
}
*/
/*
 5�� ������ �Է��ϼ���: 
1.1 1.1 1.2 1.2 1.3
�߸� �Է��߽��ϴ�. ������ �Է����ּ���!!
1 2 3 4 5
5�� ������ ���� 15�Դϴ�.
*/
/*
public class study15 {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		int sum=0,n;
		for(int i=0; i<5; i++) {
			System.out.println(i+1+"��° ����: ");
			try {
				n=s.nextInt();
			}
		catch(InputMismatchException e) {
			System.out.println("�ٽ� �Է��ض�. ���� �ƴϴ�.");
			s.next();	//�߸� �Էµ� �� ����� �۾�
			i--;
			continue; //�ٽ� �ݺ��� �ö󰡴� �۾�
		}
		sum+=n;
	}
		System.out.println(sum);
	}
}
*/
/*
1��° ����: 
1
2��° ����: 
2
3��° ����: 
3
4��° ����: 
1.1
�ٽ� �Է��ض�. ���� �ƴϴ�.
4��° ����: 
5
5��° ����: 
2
13
*/

/*
4. �Ǽ� 9.5�� ��üȭ(�ڽ�) ���Ѷ�.

4.1) ��üȭ ��Ų 9.5�� ���ڿ��� �����ض�.

4.2) ���ڿ��� ������ 9.5�� �⺻�������� ��ڽ��ض�.
*/
 /*
public class study15 {
	public static void main(String[] args) {
		double data1= 9.5f;
		Double a=new Double(data1);	//�ڽ�
		System.out.println(a);
		
		String b=a.toString();//���ڿ���
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
5. equals(�� ���� ������ ������ ��),  toString�޼ҵ带 ����Ͽ� �ϼ����Ѷ�.

(�������� 30��)

main(){

Circle a=new Circle(30);

                     Circle b=new Circle(30);

                     System.out.println("������"+a);

                     System.out.println("������"+b);

                     if(a.equals(b)) {

                                System.out.println("���� ��"); }

                     else {

                                System.out.println("�ٸ� ��");} }
*/
//ù��° ���
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

        System.out.println("������"+a);
        System.out.println("������"+b);

        if(a.equals(b)) {
        	System.out.println("���� ��"); }
        else {
        	System.out.println("�ٸ� ��");
        }
	}
}
/*
������30 
������30 
���� ��
*/

//�ι�° ���
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

        System.out.println("������"+a);
        System.out.println("������"+b);

        if(a.equals(b)) {
        	System.out.println("���� ��"); }
        else {
        	System.out.println("�ٸ� ��");
        }
	}
}
*/
/*
������30 
������31 
�ٸ� ��
*/

/*
6. �������̽� Po�� ����� �߻�޼ҵ� pr�� ������. ��ӹ޾� �����ض�.

main(){

Po p=new Point();

           p.pr(30000,"java");  

           p.pr("python"); }

���� ���) javaå��30000��

         python
*/
/*
interface Po{
	void pr(int a, String b);
	void pr(String a); //�����ε�
}
class Point implements Po{
	public void pr(int a, String b) {
		System.out.println(b+"å�� "+a);
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
		
			Ab a=new Aa();//Ab�� �߻� Ŭ����
						  //pr�� �߻� �޼ҵ�
			System.out.println(a.pr("$",10));
			//$$$$$$$$$$
	}
}
*/

/*
class Fruit{
	void fruit() {
		System.out.println("����");
	}
}
class Apple extends Fruit{
	void apple() {
		System.out.println("���");
	}
}
class PineApple extends Apple{
	void pineapple() {
		System.out.println("���ξ���");
	}
}
public class study15 {
	
	static void pr(Fruit fr) {
		//Fruit fr=new Fruit;
		if(fr instanceof PineApple) {
			((PineApple) fr).pineapple();
		}//�ٿ� ĳ���� �� �� Ŭ���� ��Ī ������ �Ѵ�!!!
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
		
		pr(f);//��ü�� ���� �����ϴ� ���� �ƴ϶� ���ΰ� �ۺ� Ŭ���� ���̿� �ִ� �Լ�
		pr(a);
		pr(p);
	}
}
*/
/*
����
���
���ξ���
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
		System.out.println(a+"����");
	}
}

public class study15 {
	public static void main(String[] args) {
		
		Elec e=new Ipad(80);	//Elec �������̽���
								//pr() �߻� �޼ҵ�
		e.pr();	//80����	
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
	Person ary[];	//��ü �迭 ����
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
			if(id.compareTo(ary[i].getid())==0) {	//���ڿ��� ������ 0 return
				return ary[i].getname();
			}
		}
		return null;
	}
}
public class study15 {
	public static void main(String[] args) {

		Profile p=new Per(5);	//��ü 5�� ����
		p.add("��ö","123");
		p.add("����", "345");
		p.add("����", "344");
		
		System.out.println(p.check("123"));
		System.out.println(p.check("345"));
		System.out.println(p.check("344"));
	}
}
*/
/*
��ö
����
����
*/

/*
abstract class A{
	protected int n;
	A(int n) {
		this.n=n;
	}
	abstract boolean even();	//13�� ¦������ Ȧ������
								//¦���̸� true, Ȧ���̸� false ����
}
class C extends A{
	int n;
	C(int n){
		super(n);	//this.n=n;
	}
	boolean even(int n) {
		if(n%2==0) { 
			System.out.println(n+"�� ¦��");
			return true;
		}
	else {
		System.out.println(n+"�� Ȧ��");
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
13�� Ȧ��
false
*/


/*
 �̱� ������
 ��Ƽ������
 
 start() => run()
 
 a.start();
 b.start();
 ---------------------------
 1. join()
 2. synchronized (lock�� �Ǵ�)
 �ϳ��� �޼ҵ忡 ���� ���� �����尡 ������ ��, �޼ҵ� ��״� �۾�
 3. wait(), notify()
 
 */
//public class study15 {
//	public static void main(String[] args) {

		/** �� ������ 5�� ����*/
//		Horse horse1 = new Horse("������", new Rank());
//		Horse horse2 = new Horse("������", new Rank());
//		Horse horse3 = new Horse("������", new Rank());
//		Horse horse4 = new Horse("������", new Rank());
//		Horse horse5 = new Horse("����", new Rank());
//
//		
		/** �� ������ 5�� ����*/
//		horse1.start();
//		horse2.start();
//		horse3.start();
//		horse4.start();
//		horse5.start();


//		Thread myThread = null;
//		for (int i = 1; i <= 5; i++) {
//			myThread = new Horse(i+"��", new Rank());
//			myThread.start();
//		}
		
		
//	} // end of main
//} // end of class

//class Horse extends Thread {
	/** ���� �̸� */
//	String h_name = "";

	/** �ѱ��� */
//	int meter = 100;

	/** ��� �ű� static ���� */
//	static int count = 1;

	/** RankŬ���� */
//	Rank rank;

	/** �⺻������ */
//	public Horse() {
		// TODO Auto-generated constructor stub
//	}

	/** ���� �̸��� ��ü�� ���� Rank���� */
//	public Horse(String h_name, Rank rank) {
//		this.h_name = h_name;
//		this.rank = rank;
//	}

//	@Override
//	public void run() {
		// TODO Auto-generated method stub
//		try {
//			while (true) {
//				/** 1~2000 ������ ���� �߻��� sleep */
//				sleep((int) (Math.random() * 2000 + 1));

//				System.out.println(h_name + " ���� ���� �Ÿ� : " + meter);

//				/** ���� 20���� ������ �̵� */
//				meter -= 20;

//			/** meter�� 0�̵Ǹ� ������̱� ������ rank.finishLine(���� �̸�)���� */
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
//	/** ���� ��� */
//	int rank;

//	public Rank() {
		// TODO Auto-generated constructor stub
//	}

//	public void finishLine(String name) {
//		// TODO Auto-generated method stub
//		rank = Horse.count++;
//		System.out.println(name + " �� " + rank + "������ ����� ����");

//		/** 1�� ���� ��� JOptionPane.showMessageDialog�� ����ش� */

//		if (rank == 1) {
//			/** ù��° �Ű������� Frame�����ε� ���⶧���� �⺻frame�� ���� ������ null���� ����. */
//			JOptionPane.showMessageDialog(null, "1��� " + name + " �Դϴ� !!");
//		}
//	}
//}

/*
//Thread Ŭ���� ���
class Th extends Thread{
	String str;
	Th(String str){
		this.str=str;
	}
	public void run() {		//�������� ���θ޼ҵ�
		for(int i=0;i<10;i++) {
			System.out.println(str);
		try {
			sleep(100); //1000�� 1�� 100�� 0.1��
		}
		catch(Exception e) {}	
		}
	}
}
public class study14 {
	public static void main(String[] args) {
		Th t = new Th("������");
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
		
		Music m=new Music("���� ���");
		m.start(); //10�� ���
		
		Movie m1=new Movie("��ȭ ���");
		Thread t=new Thread(m1);
		t.start(); //��ȭ ��� ���
	
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
		setPriority(n);//������ �켱���� ����
	}
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(str);
			System.out.println(getPriority());//getPriority(); ������ �켱���� ��
		}
	}
}
public class study15 {
	public static void main(String[] args) {
	
		Th t1=new Th("ȿ��",Thread.MAX_PRIORITY);//MAX_PRIORITY =>10
		Th t2=new Th("����",Thread.MIN_PRIORITY);//MIN_PRIORITY =>1
		Th t3=new Th("����",Thread.NORM_PRIORITY);//NORM_PRIORITY =>5
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
*/
/*
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
ȿ��
10
����
5
����
5
����
5
����
5
����
5
����
5
����
5
����
5
����
����
1
����
1
5
����
5
����
1
����
1
����
1
����
1
����
1
����
1
����
1
����
1
*/

/*
class Pr{	//lock�� �Ǵ�
	synchronized void pr(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));//�ڹٴ� ��վ� =>���ڿ� ���� ���
		}
		System.out.println();
	}
}
class Student extends Thread{
	Pr p;	//��ü ����
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
//��Ƽ ������
public class study15 {
	public static void main(String[] args) {
	
		Pr s = new Pr();
		String [] eng = {"computer","book", "apple"};
		String [] kor = {"��ǻ��", "å", "���"};
		
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
��ǻ��
å
���
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
		System.out.println("���� Ƚ��"+cnt);
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
���� Ƚ��2
*/




//GUI ȭ�� ����

//JFrame (�ֻ��� �����̳�)
//Jpanel -> ������Ʈ 
//JFrame Ŭ���� ��ӹ޾Ƽ� �����.
/*
public class study15 extends JFrame {
	study15(){
			
			super("Java");	//���� ���� //setTitle("Java");
			setSize(300,300); //������ ũ�� ����
			setVisible(true); //������ ��� �޼ҵ�
			
			JButton j1 = new JButton("��ư 1");
			JButton j2 = new JButton("��ư 2");
			JButton j3 = new JButton("��ư 3");
			
			Container c=getContentPane();//����Ʈ�� �˾Ƴ���.
			c.add(j1);
			c.add(j2);
			c.add(j3);
			
			c.setLayout(new FlowLayout());		
	}
	public static void main(String[] args) {
		new study15();//������ ȣ��
	}
}
*/


/*
public class study15{
	public static void main(String[] args) {
		
		JFrame j = new JFrame();//��� ���� �ʰ� ���ο� �Ϸ��� ��ü ���� ¥�ָ� �ȴ�!
		j.setLayout(new BorderLayout());
		
		j.add(new JButton("��"),BorderLayout.EAST);//BorderLayout�� ��ġ ���� �ʿ���
		j.add(new JButton("��"),BorderLayout.WEST);//BorderLayout�� ��ġ ���� �ʿ���
		j.add(new JButton("��"),BorderLayout.SOUTH);//BorderLayout�� ��ġ ���� �ʿ���
		j.add(new JButton("��"),BorderLayout.NORTH);//BorderLayout�� ��ġ ���� �ʿ���
		j.add(new JButton("�߾�"),BorderLayout.CENTER);//BorderLayout�� ��ġ ���� �ʿ���
		
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
//��� ����
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
		System.out.println(getSize()+"��ġ "+resolution+"�÷�"); //32��ġ 1024�÷�
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
		System.out.print("���� IPTV�� "+IP+"�ּ��� ");
		super.printProperty();
	}
}
public class study15{
	public static void main(String[] args) {
	
		  IPTV iptv = new IPTV("192.1.1.2 ", 32, 2048); //"192.1.1.2" �ּҿ� 32��ġ, 2048�÷�
		  iptv.printProperty();
		}
}
*/
