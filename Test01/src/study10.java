import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Character.toUpperCase(ch);	// �빮��
Character.isLowerCase(ch);	// �ҹ���
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		
		
		//system.dat ������ ����
		FileWriter f=new FileWriter("system.dat");
		
		f.write("�������̳׿�\n");
		f.write("ȭ����~\n");
		f.write("�ڹٰ���");
		}
}
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		
		//system.dat ������ ����
		FileWriter f=new FileWriter("system.dat");
		BufferedWriter b=new BufferedWriter(f);
	
		b.write("�������̳׿�");
		b.newLine();
		b.write("ȭ����~");
		b.newLine();
		b.write("�ڹٰ���");
		b.close();
		}
}
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("system.dat");
		BufferedWriter b=new BufferedWriter(f);
		
		char a[] = new char[] {'��', '��', '��'}; //������
	
		b.write(a);
		b.close();
		}
}
*/

/*
class AA{
		int a;
		double b;
		void show() {
			System.out.println(a+ " "+b); //10 3.5
		}
	}
public class study10 {
	public static void main(String[] args) {
		
		AA aa=new AA();
		aa.a=10;
		aa.b=3.5;
		aa.show();
	}
}
*/

/*
class Food{
	String menu;	//�ʵ�
	int price;		//�ʵ�
	
	void pp(int p) {	//���� �߰� �Լ�(�޼ҵ�)
		price+=p;
	}
	void show() {		//�޼ҵ�
		System.out.println(price+ " "+menu);	//10000 pizza
	}
}

public class study10 {
	public static void main(String[] args) {
	//��ü����
		Food f = new Food();
		f.menu="pizza";
		f.price=0;
		f.pp(10000);
		f.show();
		
		Food f1=new Food();
		f1.menu="pasta";
		f1.pp(10000);
		f1.show();
		
	}
}
*/

/*
class Anidog{
	String kind;
	int age;
	String name;
	
	public void print() {
		System.out.println(kind+ " "+age+" "+name);
	}
}
public class study10 {
	public static void main(String[] args) {
		Anidog ad= new Anidog();
		ad.kind = "������";
		ad.age = 1;
		ad.name="�Ҹ�";
		ad.print();
	}
}
*/

/*
class Student
{
    int m_nKor;
    int m_nEng;
    int m_nMat;
    
    // static 
    static String g_strTeacher = "�豸";
}
public class study10 {
	public static void main(String[] args) {
		Student obj = new Student();
        // obj.m_nKor = 30;
        // �ν��Ͻ� ������ �ʱ�ȭ ���� ������ �ڵ����� 0�� ���� ������
        // �ݵ�� ��ü �̸����θ� ȣ���ؾ� �մϴ�.
        obj.m_nEng = 40;
        obj.m_nMat = 50;
        System.out.println("obj�� �������� = " + obj.m_nKor);
        System.out.println("obj�� �������� = " + obj.m_nMat);
        System.out.println("obj�� �������� = " + obj.m_nEng);
        
        // Ŭ������ ���� ����
        System.out.println("Student�� ������= " + Student.g_strTeacher);
        // ��ü ������ ���� ����
        System.out.println("obj�� ������= " + obj.g_strTeacher);
        // Ŭ������ ���� �����Ͽ� �� �ٲٱ�
        Student.g_strTeacher = "���߱�";
        System.out.println("obj�� ������= " + obj.g_strTeacher);
	}
}
//obj�� �������� = 0
//obj�� �������� = 50
//obj�� �������� = 40
//Student�� ������= �豸
//obj�� ������= �豸
//obj�� ������= ���߱�
*/

/*
class Student
{
    // ��� ����
    int m_nKor;
    int m_nEng;
    int m_nMat;
    
    // ��� ������ ���� �����ִ� set �޼ҵ�
    public void set(int a, int b, int c)
    {
        m_nKor = a;
        m_nEng = b;
        m_nMat = c;
    }
    
    // ���������ڰ� public�̰�
    // ��ȯ���� double����
    // ��, ��, ���� ����� ���ϴ� �Լ�
    public double calc()
    {
        double avg;
        avg = (m_nKor + m_nEng + m_nMat) / 3.0;
        return avg;
    }
    
    // ���������ڰ� public�̰�
    // ��ȯ ���� ����
    // ����� ������ִ� ��
    public void disp()
    {
        System.out.println("����� " + calc() + "�Դϴ�.");
    }
}

public class study10 {
	public static void main(String[] args) {
		Student obj = new Student();    // ��ü ����
        
        // ��, ��, �� ���� ���ϱ�
        obj.set(80, 65, 85);
        
        //��� ���
        obj.disp();
	}
}
//����� 76.66666666666667�Դϴ�.
*/


//1.	FileOutputStream�� �̿��Ͽ� byte[] �迭 �ӿ� ����ִ� ���� test.txt���Ͽ� �����ض�.
//byte b[]={4,6,7,8,-1,24};
/*
public class study10 {
	public static void main(String[] args) throws IOException {
		byte b[] = {4,6,7,8,-1,24};
		
		
			FileOutputStream f=new FileOutputStream("test.txt");
			
			for(int i=0; i<b.length; i++) {
				f.write(b[i]);
			}
	}
}
*/

	

//2	FileInputStream�� �̿��Ͽ� test.txt������ �о� byte[] �ӿ� �����ϰ� ȭ�鿡 ����ض�.
/* ù��° ���
public class study10 {
	public static void main(String[] args) {
		try (
                FileReader rw = new FileReader("test.txt");
                BufferedReader br = new BufferedReader( rw );
			)
		
		{
			//���� ������ ���� ��� br�� null�� �����Ѵ�.
            String readLine = null ;
            while( ( readLine =  br.readLine()) != null ){
                System.out.println(readLine);
            }
        }	catch ( IOException e ) {
            System.out.println(e);
        }
	}
}
//4 6 7 8 -1 24
*/

// �ι�° ��� ����
/*
public class study10 {
	public static void main(String[] args) throws IOException {
		byte b[] = {4,6,7,8,-1,24};
		
		
			FileOutputStream f=new FileOutputStream("test1.txt");
			
			for(int i=0; i<b.length; i++) {
				f.write(b[i]);
			}
	}
}
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("test1.txt");
		int r, i=0;
		byte[] a=new byte[6];
		
		while((r=in.read())!=-1) {
			a[i]=(byte)r;	//byte �迭 �о�ͼ� �� ���� �ٽ� byte �迭�� ����
			//4 6 7 8 -1 24
			i++;
		}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
		in.close();
	}
}
*/
//�ι�° ��� ��

/*
//3. ������ ��ȣ�� ��÷�� ������ ��ȣ�� Ȯ���Ͽ� ��ġ�ϴ� ��ȣ�� ������ ����ϴ� ���α׷�. 
//   �迭�� main�Լ��� �����ϰ� �� �迭���� ��ġ�ϴ� ��ȣ�� ã�� �� ������ ��ȯ�ض�.
//main(){
//int lottop[]={4,10,25,30,45,47};
//int my[]={1,4,7,26,45,48};
//int r;

//r=same(lotto,my);
//System.out.println(����ġ�ϴ� ��ȣ�� ����:%d\n��, r);}

public class study10 {
	static int same(int a[],int b[]) {
		int cnt=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
public static void main(String[] args) {

	int lotto[]={4,10,25,30,45,47};
	int my[]={1,4,7,26,45,48};
	int r;

	r=same(lotto,my);
	System.out.printf("��ġ�ϴ� ��ȣ�� ����:%d\n", r);
	}
}
//��ġ�ϴ� ��ȣ�� ����:2
*/

/*
//4. show()�Լ��� �迭�� �������� ����ϴ� �Լ��� �����ض�.
//main(){
// int ary[]{6,2,8,4,9};
// show(ary);}

public class study10 {
	static void show(int[] a) {
		
		int temp;
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
			System.out.println();
	}
	
	public static void main(String[] args) {
		
		 int ary[]={6,2,8,4,9};
		 show(ary);
	}
}
//94826
*/

/*
//5.	���� �迭�� ��ü �հ� ��� ���(�Ҽ��� ù°�ڸ�����)
//main(){
//  int [][]ary ={{43,97},{34,77,87},{100,95,38,89}}; }

public class study10 {
	public static void main(String[] args) {
		int [][]ary ={{43,97},{34,77,87},{100,95,38,89}}; 
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				sum+=ary[i][j];
				cnt++;
			}
		}
		avg=sum/cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
//660
//73.0
*/

/*
//6. �ټ����� �л��� ������ �Է��Ͽ� ��ȿ������ ��� ����ϴ� ���α׷�
//��ȿ������ �ְ����� �������� ������ �����̸� ����� ��ȿ������ ����ض�.
//(for-if�� ��ø, contine���)
//������) 5�� �л� ���� �Է� : 1 2 3 4 5
//        ��ȿ ����: 2 3 4
//        ���: 3.0

public class study10 {
	public static void main(String[] args) {
	
		int score[]=new int[5];
		int max,min,sum=0;
		int maxindex,minindex;
		double avg;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("5�� �л� ���� �Է�");
		for(int i=0; i<score.length;i++) {
			score[i]=s.nextInt();
		}	//80 90 100 60 90
		max=min=score[0];
		maxindex=minindex=0;
		
		for(int i=1; i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
				maxindex=i;	//�ְ����� �ִ� ��ġ�� ����
			}
			if(score[i]<min) {
				min=score[i];
				minindex=i;	//�������� �ִ� ��ġ�� ����
			}
		}
		System.out.println("��ȿ ����: ");
		for(int i=0; i<5;i++) {
			if(i==maxindex || i==minindex) {
				continue;	//�ְ�, ������ �ִ� �ε��� ����
			}
			else {
				sum+=score[i];
			}
		}
		System.out.println(sum/3.0);
	}
}
//5�� �л� ���� �Է�
//100 50 70 21 44
//��ȿ ����: 
//54.666666666666664
*/


/*
//7. Sample.txt���Ͽ� ������ �ڹٸ� �����մϴ١��� �����ϰ� ������ �о� ȭ�鿡 ����ض�.
//(String [] �迭�� �ʱ�ȭ�ؼ� for������ �б�)

//sample.txt�� ����
public class study10 {
	public static void main(String[] args) throws IOException {
		BufferedWriter b=
				new BufferedWriter(new FileWriter("sample.txt"));
		
		String a="���� �ڹٸ� �����մϴ�";
		b.write(a);
		b.close();
	}
}
*/

/*
//ȭ�� ���
public class study10 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=
				new BufferedReader
				(new FileReader("sample.txt"));
		String b[]=new String[1];
		for(int i=0; i<b.length;i++) {
			b[i]=in.readLine();
			System.out.println(b[i]);	//���� �ڹٸ� �����մϴ�
		}
	}
}
*/

/*
class Aa{
	private int age;
	public double ki;
	protected String name;
	int id;
}
public class study10 {
	public static void main(String[] args) {
	
		Aa a=new Aa();
//		a.age=10; age�� private���� ���� �ȵ�
		a.ki=177.7;
		a.name="ȫ�浿";
		a.id=123;
	}	
}
*/

/*
//ù��° ���
public class study10 {
	public static void main(String[] args) throws IOException {
		
		// �Է¹��� �ؽ�Ʈ�� tt.txt�� �����ϴ� ���α׷�
		// ���
		InputStreamReader in=
				new InputStreamReader(System.in);
		FileWriter fout=null;
		fout=new FileWriter("tt.txt");
		int r;
		
		while((r=in.read())!=-1) {
			fout.write(r);
		}
		in.close();
		fout.close();
	}
}
*/

/*
//�ι�° ���
public class study10 {
	public static void main(String[] args) throws IOException {
		// �Է¹��� �ؽ�Ʈ�� tt.txt�� �����ϴ� ���α׷�
		// ���
				BufferedReader in
					= new BufferedReader(new InputStreamReader(System.in));
				FileWriter fout=null;
				fout=new FileWriter("tt.txt");
				String r;
				
				while((r=in.readLine())!=null) {
					fout.write(r);
				}
				in.close();
				fout.close();
	}
}
*/

/*
class Car{
	private String color;
	private int speed;

	Car(){					//������
		color = "����";
		speed = 0;
	}
	public String getColor() {
		return color;		//�޼ҵ�
}
	public int getSpeed() {
		return speed;		//�޼ҵ�
	}
}

public class study10 {
	public static void main(String[] args) {
	
	// ������ = �Լ� ������ ���
	// ��ȯ���� ����.
	// Ŭ���� �̸��� �����ϴ�.
	
		Car c1=new Car();	//��ü ������ ���ÿ� ������ ȣ��
		Car c2=new Car();	//��ü ������ ���ÿ� ������ ȣ��
		
		System.out.println(c1.getColor()+""+c1.getSpeed());
		System.out.println(c2.getColor()+""+c1.getSpeed());
	}
}
*/

//this ->  1.�ʵ� �̸�, �Ű������� �̸��� ���� �� �����ϴ� Ű����
//		   2.this() -> �ٸ� ������ ȣ��

/*
class Car {
	private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
   
    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public String getModel() {
        return this.modelYear + "��� " + this.modelName + " " + this.color;
    }
}
public class study10 {
	public static void main(String[] args) {
		Car myCar = new Car("�ƹݶ�", 2016, "���", 200); // �������� ȣ��
		System.out.println(myCar.getModel()); // �����ڿ� ���� �ʱ�ȭ�Ǿ������� Ȯ����.
	}
}
//2016��� �ƹݶ� ���
*/

/*
//	*�޼ҵ� �����ε�*
//	���� Ŭ���� ������ �޼ҵ��� �̸��� ���Ƶ� �Ķ������ ������ ������ ���ĸ� �ٸ��� �������� ������ �� �ִ� ���� ���Ѵ�.
//	�����ڵ� �޼ҵ��� �����̹Ƿ� �޼ҵ� �����ε��� �� �� �ִ�. 

class Book{
	String title;	//�ʵ�
	int price;		//�ʵ�
	
	void show() {	//�޼ҵ�
		System.out.println(title+ " " +price);
	}
	
	Book() {			//�⺻ ������
		this("",0);		//�ٸ� ������ ȣ�� (�Ű����� 2���� �ִ�)
		System.out.println("������ ȣ��!");	//�����ڰ� ȣ��� �� �⺻ �����ڰ� ���� ���� ȣ��ȴ�! ��ü�� ������� �ʴ� �̻�!
	}
	Book(String title){	//������
		this(title, 0);	//this => �ٸ� ������ ȣ��(�Ű����� 2���� �ִ�)
	}
	Book(String title, int price){	//������
		this.title=title;
		this.price=price;
	}	
}
public class study10 {
	public static void main(String[] args) {
		
		Book b=new Book("�����", 30000);
		Book b1=new Book("�Ű�");
		Book b2=new Book();
		
		b.show();
		b1.show();
		b2.show();
	}
}
*/

/*
class Tv{
	String company;
	int size;
	void show() {
		System.out.println(company+ " " +size+"��ġtv");	//�Ｚ 20��ġtv
	}
}
public class study10 {
	public static void main(String[] args) {
		
		Tv t=new Tv();
		t.company="�Ｚ";	//�ʵ�
		t.size=20;		//�ʵ�
		t.show();	//�Ｚ 20��ġ tv
		
		//Ŭ���� �̸�? Tv
		//��ü �̸�? t
		//�Լ� �̸�? show
	}
}
*/

/*
class Tv{
	String company;
	int size;
	//������: �ʱ�ȭ ����
		Tv(String company, int size) {
			this.company=company;
			this.size=size;
		}//������ ���� �ʵ忡 �ʱ�ȭ�ϴ� ����
			void show() {
				System.out.println(company+ " " +size+"��ġtv");	//�Ｚ 20��ġtv
			}
		}
public class study10 {
	public static void main(String[] args) {
		Tv t=new Tv("�Ｚ",20);
		t.show();	//�Ｚ 20��ġ tv
	}
}
*/

/*
class Music{
	String title;	
	
	Music(String title){
		this.title=title;
	}
}
public class study10 {
	public static void main(String[] args) {
	
		Music m=new Music("a");
		System.out.println(m.title);	//a
	}
}
*/

/*
class Pet{
	String type;	//�ֿϵ��� ����
	int age;		//�ֿϵ��� ���� ��
	
	void move() {
		System.out.println(this.type+"�� �����Դϴ�.");
	}
	
	int getAge() {
		return this.age;
	}
}

public class study10 {
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.type = "������";
		pet1.age = 8;
		
		Pet pet2 = new Pet();
		pet1.type = "�����";
		pet1.age = 13;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.type + "�� " + pet1.age + "�����Դϴ�.");
		System.out.println(pet2.type + "�� " + pet2.age + "�����Դϴ�.");
	}
}
//����̰� �����Դϴ�.
//null�� �����Դϴ�.
//����̴� 13�����Դϴ�.
//null�� 0�����Դϴ�.
*/

/*
class Music{
	String title;
	Music(String title) {
		this.title=title;
	}
}
public class study10 {
	public static void main(String[] args) {
		
		Music m1=new Music("on");
		Music m2=new Music("dna");
		System.out.println(m1.title);
		System.out.println(m2.title);
	}
}
//on
//dna
*/

/*
class Circle{
	double a;
	Circle(double a){
		this.a=a;
	}
	public void area() {
		System.out.println(3.14*a*a);	//7.0649999999999995
	}
}
public class study10 {
	public static void main(String[] args) {
	
		Circle c1=new Circle(1.5);	//������
		c1.area();					//�� ���� 3.14*1.5*1.5
	}
}
*/


/*
class Profile{
	String a,b;
	
	Profile(String a, String b){
		this.a=a;
		this.b=b;
	}
}
public class study10 {
	public static void main(String[] args) {
		//��� ������ ���
		Profile p1=new Profile("010-1234-5678","����");
		Profile p2=new Profile("010-2345-7890","����");
		
		System.out.println(p1.a + " "+p1.b);
		System.out.println(p2.a + " "+p2.b);
	}
}
//010-1234-5678 ����
//010-2345-7890 ����
*/


/*
class Pro{
	String name;
	
	Pro(String name){
		this.name=name;
	}

	public String get() {
	return name;
	}
}
public class study10 {
	public static void main(String[] args) {
		
		Pro p1=new Pro("����");
		Pro p2=new Pro("����");
		//1. Ŭ���� �����
		//2. ���ڿ� �ʵ�
		//3. ������
		//4. �̸� ��ȯ�޴� get
		System.out.println("�̸��� "+p1.get());
		System.out.println("�̸��� "+p2.get());
	}
}
//�̸��� ����
//�̸��� ����
*/

/*
public class study10 {
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	
	public study10(int x1, int y1) {
		this(x1, y1, 30, 40);
	}
	
	public study10(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public static void main(String[] args) {
		study10 cal = new study10(10,20);
		
		System.out.println("x1 : " + cal.x1);
		System.out.println("y1 : " + cal.y1);
		System.out.println("x2 : " + cal.x2);
		System.out.println("y2 : " + cal.y2);
	}
}
//x1 : 10
//y1 : 20
//x2 : 30
//y2 : 40
*/

/*
class Rec{
	int a,b; //�ν��Ͻ� ���� or �ʵ�
	Rec(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void area(){
	System.out.println(a*b);
}

}
public class study10 {
	public static void main(String[] args) {
		
		Rec r1=new Rec(4,7);
		Rec r2=new Rec(7,9);
		
		r1.area();	//4*7
		r2.area();	//7*9
	}
}
//28
//63
*/

/*
class AA{
	static int n=0;	//Ŭ���� ����
	AA(){	//������
		in();	//�޼ҵ� ȣ��
	}
	void in() {	//�޼ҵ�
		n++;	//1
	}
}
public class study10 {
	public static void main(String[] args) {
		
		AA a=new AA();	//������ ȣ�� n=1
		a.n++;	//n=2
		AA.n++; //n=3 <-Ŭ���� ������ Ŭ���������� ���� �����ϴ�.
		System.out.println(AA.n);	//3
	}
}
*/

/*
// �ν��Ͻ� ����
// �ν��Ͻ� ������ ����ϱ� ���ؼ��� ��ü�� �����ؾ� �Ѵ�!!
public class study10{
	int x=3; 	//�ν��Ͻ� ����
	int y; 		//�ν��Ͻ� ����

	public static void main(String[] args) {
		study10 ivd = new study10();
		ivd.y = 5;
	
		System.out.println(ivd.x);
		System.out.println(ivd.y);
	}
}
//3
//5
*/

/*
class RadioOption{
	static String color = "white"; // Ŭ���� ����
	int volume = 5; 		//�ν��Ͻ� ����
	boolean power = false; 	//�ν��Ͻ� ����
}

public class study10{
	static int x = 10; //Ŭ���� ����
	public static void main(String[] args) {
		System.out.println(RadioOption.color); //Ŭ���� ������ �ν��Ͻ�ȭ ���� �ʰ� ��� ����
		//System.out.println(RadioOption.volume); //����!!
		
		RadioOption ro = new RadioOption();
		ro.power = true;
		System.out.println(ro.power);
		
		int x = 100;	//��������
		
		System.out.println(x);
	}
}
//white
//true
//100

// 1.Ŭ���� ������ ���������� �̸��� ���Ƶ� �˴ϴ�.
// 2.���� ������ �̸��� x�� ����� �� ���� ������ ���������� �ִٸ� ���������� ���
// 3.Ŭ���� ������ ���� �� �׻� Ŭ�����̸�.Ŭ�������� �������� ����ϱ�

//�� ������ ������ �޸𸮿� �ö���� �ñⰡ �ٸ���
// 1.Ŭ���� ������ Ŭ������ �޸𸮿� �ö�� �� ����
// 2.�ν��Ͻ� ������ ��ü�� ���� �� �� (new�� ����� �޸𸮸� �Ҵ� �� ��)����
// 3.���� ������ ������ ���� �� �� �����˴ϴ�.
*/
