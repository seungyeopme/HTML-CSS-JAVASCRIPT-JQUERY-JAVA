import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
 ��°��
 Book Ŭ���� ������ ~~ (�Ķ���� ����)
 Book Ŭ���� ������ ->�� �ڹ�
 ComputerBook Ŭ���� ������ ~~
 */

class Book{
	Book() {
		System.out.println("Book Ŭ���� ������ ~~ (�Ķ���� ����)");
	}
	Book(String a){
		
	}
}

class ComputerBook extends Book {
	ComputerBook() {
		System.out.println("ComputerBook Ŭ���� ������ ~~");
	}
}
public class study11 {
	public static void main(String[] args) {
		ComputerBook sedan1 = new ComputerBook("�� �ڹ�");
	}
}
