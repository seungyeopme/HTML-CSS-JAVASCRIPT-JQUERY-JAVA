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

public class study15 {
	public static void main(String[] args) {

		
	}
}