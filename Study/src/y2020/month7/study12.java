package y2020.month7;

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

public class study12 {
	public static void main(String[] args) {
	
	}
}
