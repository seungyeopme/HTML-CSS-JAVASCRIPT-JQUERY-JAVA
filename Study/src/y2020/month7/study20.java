package y2020.month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//ArrayList ����
//������ ������ ������

//ArrayList ����
//����� �뷮�� �ø��� �������� �ð��� ���� �ҿ��!
//������ �ʿ��� ������ ���!

//�̷��� �������� 
//LinkedList 
//�迭�� ����ϴ� ��� ���μ��� ����� ������� �����͸� ������
//����� �뷮�� �ø��� �������� �ð��� ���� �ҿ� �ȵ�!
//������ ������ �ſ� ����
//������ ������ �����ϴ�.


/*
public class study20 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=
				new ArrayList<Integer>();
		a.add(3);
		a.add(0);
		a.add(3);
		
		Iterator<Integer> i= a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
*/
/*
3
0
3
*/

/*
class Box<T> {
	Box<T> next;	//next ���׸� Ŭ������ ��ü
	T t;
	void in(T t) {
		this.t=t;
	}
	T out() {
		return t;
	}
}
public class study20 {
	public static void main(String[] args) {

		//Integer
		Box<Integer> b=
				new Box<Integer>();
		b.in(30);
		
		b.next=new Box<Integer>();
		b.next.in(40); //��ü�� �ѹ� �� ����
		
		b.next.next=new Box<Integer>();
		b.next.next.in(50);
		
		Box<Integer> tmp;
		tmp=b.next;

		System.out.println(tmp.out());//40
	}
}
*/

/*
public class study20 {
	public static void main(String[] args) {

		ArrayList<String> ary = 
				new ArrayList<String>();
		LinkedList<String> li =
				new LinkedList<>();
		long start;
		long end;
		
		start=System.nanoTime();//nanoTime() ��ȯ���� long
		for(int i=0; i<1000; i++) {
			ary.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		
		System.out.println(end-start);//ArrayList
		
		start=System.nanoTime();//nanoTime() ��ȯ���� long
		for(int i=0; i<1000; i++) {
			li.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		
		System.out.println(end-start);//LinkedList
	}
}
*/
//�˰������� ������ �� ArrayList ���� LinkedList�� �� ������!
//LinkedList�� �ӵ��� �� �������� ������ ��Ʊ� ������
//ArrayList�� �� ���� ����Ѵ�!!

/*
class Profile{
	String id;
	int age;
	Profile(String i, int a) {
		id=i;
		age=a;
	}
	public String toString(){
		return id +" " +age;
	}
}
//ArrayList�� ����ؼ� �����͸� 2~3�� ����
//for������ ��� -> size, get
public class study20 {
	public static void main(String[] args) {
		ArrayList<Profile> list = new ArrayList<Profile>();
		list.add(new Profile("����", 23));
		list.add(new Profile("����", 20));
		list.add(new Profile("����", 25));
		
		for(int i=0; i<list.size(); i++) {
			Profile p=list.get(i);//��ü�� ���� �ʵ忡 ����
			System.out.println(p.age +" "+p.id);
			//toString�� ����ص� �ȴ�.
		}
		System.out.println();
		for(Profile i : list) {
			System.out.println(i.toString());
		}
	}
}
*/
/*
23 ����
20 ����
25 ����

���� 23
���� 20
���� 25
*/

/*
public class study20 {
	public static void main(String[] args) {
	
		ArrayList<Integer> arrayList = new ArrayList<>();
		 
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
 
        for(int i : arrayList)
        {
            System.out.println("�� : " + i );
        }
	}
}
*/
/*
�� : 0
�� : 1
�� : 2
�� : 3
�� : 4
*/

//������ ���� �ڵ带 �ۼ��ض�.
/*
1- A. Ŭ���� Prob1: Rectangle
�ʵ�� int �� �ʺ� (width)�� ���� (height)�� �ְ�, 
���private���� �����϶�. �����ڴ� �������� ���� �޼ҵ�� Ŭ�������� �ʿ��� ������ �Ǵ��Ͽ������϶�. 
*/
/*
2- B. Ŭ���� Prob2: Rectagle Ŭ�������̿��ϴ� �������α׷�
Main �޼ҵ忡�� Ű���忡�� �簢���� �ʺ�� ���� ���� �Է¹޴´�. Ű���� �Է°��� int �� �ƴ� ��� ����ó���� �ϰ�, ��ȿ�� ���� �Էµ� ��������� �Է¹ް� �Ѵ�. 
Ű���� �Է°��� ��ȿ�� ���� ��� �ش� ������ ���� Rectangle ��ü�� ����� ȭ�鿡������ Rectangle ��ü�� ������ ����ϰ� ���α׷��� �����Ѵ�.
*/
//ù��° ���
/*
class Rectangle{
	private int width; 
	private int height; 
		
	void in(int a, int b) {
		width = a;
		height = b;
	}
	void show() {
		System.out.println(width * height);
	}
}
public class study20 {
	public static void main(String[] args) {
	
		Rectangle r = new Rectangle();
		Scanner s = new Scanner(System.in);
		
		while(true){
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				
				r.in(a,b);
			}catch(Exception e) {
				System.out.println("��ȿ�� ���� �Է��ϼ���");
				s.next();
				continue;
			}
			r.show();
		}
	}
}
*/
//�ι�° ���
/*
class Rectangle{
	private int width; 
	private int height; 
		
	void area(int width, int height) {
		System.out.println(width*height);
	}
}
public class study20 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		while(true){
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				r.area(a, b);
				break;
			}catch(Exception e) {
				System.out.println("�ٽ� �Է�");
				s.nextLine();//�߸� �Է����� �� ��ū ����� �۾�
				continue;
			}
		}
	}
}
*/
/*
2 2.5
�ٽ� �Է�
2 5
10
*/
//����° ���
/*
class Rectangle{
	private int width; 
	private int height; 
		
	int area(int width, int height) {
		return width*height;
	}
}
public class study20 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		while(true){
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println(r.area(a, b));
				break;
			}catch(Exception e) {
				System.out.println("�ٽ� �Է�");
				s.nextLine();//�߸� �Է����� �� ��ū ����� �۾�
				continue;
			}
		}
	}
}
*/
/*
2 2.5
�ٽ� �Է�
2 5
10
*/

/*
3.  ���� class�� ���� �ڵ带 �ۼ��ض�.

class Profile{

  String name,id;

  Profile(String name, String id){

    this.name=name; this.id=id;

  }

  String getname(){ return name;}

  String getid(){ return id;}

}

A. main() Prob1: main()���� �ο����� �Է¹޾� �ο����� Profile�� ���Ѱ�ü �迭 ������ �����Ѵ�. 
�̸������̵� �Է¹޾� ��ü �迭�� ������ �� ����ض�.
*/
//ù��° ���
/*
class Profile{

	  String name,id;

	  Profile(String name, String id){
		  this.name=name; 
		  this.id=id;
	  }
	  String getname(){ 
		  return name;
	  }
	  String getid(){ 
		  return id;
	  }
}
public class study20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ο� ���� �Է����ּ���");
		
		Profile[] p = new Profile[s.nextInt()];
		
		for(int i=0; i<p.length; i++) {
			System.out.println("�̸�, ���̵� �Է�");
			p[i] = new Profile(s.next(),s.next());
			System.out.println(p[i].name+ " "+p[i].id);
		}
	}
}
*/
/*
�ο� ���� �Է����ּ���
3
�̸�, ���̵� �Է�
���� js
���� js
�̸�, ���̵� �Է�
�μ� ms
�μ� ms
�̸�, ���̵� �Է�
���� jm
���� jm
*/
//�ι��� ���
/*
class Profile{

	  String name,id;

	  Profile(String name, String id){
		  this.name=name; 
		  this.id=id;
	  }
	  String getname(){ 
		  return name;
	  }
	  String getid(){ 
		  return id;
	  }
}
public class study20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ο� ���� �Է����ּ���");
		Profile[] p = new Profile[s.nextInt()];
		
		for(int i=0; i<p.length; i++) {
			System.out.println("�̸�, ���̵� �Է�");
			p[i] = new Profile(s.next(),s.next());
			System.out.println(p[i].getname()+ " "+p[i].getid());
		}
	}
}
*/
/*
�ο� ���� �Է����ּ���
2
�̸�, ���̵� �Է�
12 aa
12 aa
�̸�, ���̵� �Է�
34 bb
34 bb
*/

/*
4.  JTextField�� ����� id, pw�� �� �� �ֵ��Ϸα��� â�� ������.

(��enter���� �Է��ϴ� ���� id�� ��µȴ�.)
*/
/*
public class study20 {
	public static void main(String[] args) {
	
		JFrame j=new JFrame();
		j.setSize(500,500);
		j.setLayout(new FlowLayout());

		JTextField jt=new JTextField(10);
		JTextField jp=new JTextField(10);
		
		j.add(jt); 
		j.add(jp);
		j.setVisible(true);
		
		jt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jp.requestFocus();//requestFocus() ������ ���콺 ��Ŀ���ֱ�
			}
		});
		jp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(jt.getText());
				//getText() returns previous string value ���� ���ڿ� ��ȯ
			}
		});
	}
}
*/

/*
5. ���� �ڵ带 ���� �ۼ��ض�.

Color c[]={Color.RED, Color.Orange, Color.Yellow, Color.GREEN, Color.BLUE};

A.  ��ġ�����ڸ� GridLayout���� 1��5���� �����Ѵ�. 5���� ��ư�� ��ü �迭���·� �����

������ �� ���� ���� ��ư�� ������ �����̳ʿ� �����Ѵ�.
*/
//ù��° ���
/*
public class study20 extends JFrame {
	study20() {
		Color c[]={Color.RED, Color.orange, Color.yellow, 
				Color.GREEN, Color.BLUE};
		JButton j[] = new JButton[5];
		for(int i=0; i<c.length;i++) {
			j[i] = new JButton();
			j[i].setBackground(c[i]);
			this.add(j[i]);
		}
		
		setLayout(new GridLayout(1,5));
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {

		new study20();
	}
}
*/
//�ι��� ���
/*
public class study20 extends JFrame {
	study20() {
		Color c[]={Color.RED, Color.orange, Color.yellow, 
				Color.GREEN, Color.BLUE};
		Container con=getContentPane();
		con.setLayout(new GridLayout(1,5));
		
		
		for(int i=0; i<5;i++) {
			JButton j = new JButton();
			j.setBackground(c[i]);
			con.add(j);
		}
		
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {

		new study20();
	}
}
*/
/*
6. ArrayList�� 0~100������������ ���� 10���� �����ϰ� ��� ����ض�. 
����Ҷ��� Iterator�������̽��� ����ؼ� ����ض�.
*/
/*
public class study20 {
	public static void main(String[] args) {
	
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<10;i++) {
		a.add((int)(Math.random()*100)+1);
		}
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}
}
*/
/*
54
27
46
83
21
9
94
42
70
81
*/

/*
7. ���� �ڵ带 ���� �ۼ��ض�. �����尡����� �� ȭ�鿡 1�ʴ����������� ����ϰԲ� ������. 
(����0���� �����Ͽ� �����ӿ� ������ ���ڿ��� �����ؼ� �ְ� try���ȿ���1�ʾ� �����ϰԲ� ������ 
  ���� �߻��ϸ� ������� ����ȴ�.(return)

Public class ������ Ŭ������ extends JFrame{

   ������ Ŭ������(){

        Container c=getContentPane();

        c.setLayout(new FlowLayout());

        JLable j=new JLabel();

        c.add(j);

    

        Th t=new Th(j);         //������ ��ü ����

        setVisible(true);

        t.start();               //������ ����

}

Main(){

   New ������ Ŭ������();

}

}
*/
/*
class Th extends Thread{
	
	JLabel j;
	Th(JLabel j){
		this.j=j;
	}
	public void run() {
		int n=0;
		while(true) {
			j.setText(Integer.toString(n));//���� ��ü�� ���ڷ� �����ؼ� �ְڴ�.
			n++;
			try {
				sleep(1000); //1��
			}catch(Exception e) {
				return;
			}
		}
	}
}
public class study20 extends JFrame {
	
	study20(){

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j=new JLabel();
        c.add(j);

        Th t=new Th(j);         //������ ��ü ����
        t.start();               //������ ����

        setVisible(true);
}
public static void main(String[] args) {
		
		new study20();
	}
}
*/

 
/*
8.  Map����� �̸�, ���������ؼ� �̸��� ��ġ�ϴ� ���� ����ض�.
*/
/*
public class study20{
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("AA", 10);
		hm.put("BB", 20);
		hm.put("CC", 30);
		hm.put("DD", 40);
		
		System.out.println(hm.get("AA"));
		System.out.println(hm.get("BB"));
		System.out.println(hm.get("CC"));
		System.out.println(hm.get("DD"));
	}
}
*/
/*
10
20
30
40
*/

//set
//3, 5, 7, 10, 26, 33

//1. hashCode �޼ҵ�(���� ����)
//2. equals�޼ҵ� (������ Ȯ��)

//=>���� �˻� �ӵ�!!
/*
public class study20{
	public static void main(String[] args) {
		
		HashSet<String> h=
				new HashSet<String>();
		
		h.add("��ǻ��");
		h.add("���콺");
		h.add("��ǻ��");

		System.out.println(h.size()); //2 
									  //�ߺ� ��� ���� �ʱ� ������ ��ǻ�� 2���� 1���� �ν�
		
		Iterator<String> i=h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
//2
//���콺
//��ǻ��

//=>��� �� �� ������ �������� ��µȴ�!!
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	public String toString(){	//��ü�� ���ڿ��� ����ϴ� ���
		//return n+""; 
		return String.valueOf(n);
	}
}
public class study20{
	public static void main(String[] args) {
		
		HashSet<Num> h=
				new HashSet<Num>();
		
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(60));
		
		Iterator<Num> i=h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
*/
//40
//30
//60

//=>������ ������ �������� �ʰ� �������� ��µȴ�!


//3���� �̸��� ���̸� �Է¹޾�
//�ؽøʿ� �����ؼ�
//���� ���̰� ���� ����� �̸���
//������ּ���
/*
public class study20{
	public static void main(String[] args) {
		HashMap<String,Integer> h = 
				new HashMap<String,Integer>();
		
		Scanner s=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			String name=s.next();
			int age=s.nextInt();
			h.put(name, age);
		}
		//���� ���̰� ���� ����� �̸� ���
		Set<String> key=h.keySet();
		Iterator<String> it=key.iterator();
		
		int max=0; 
		String str="";
		while(it.hasNext()) {
			String name=it.next();
			int age=h.get(name);
			if(max<age) {
				max = age;
				str = name;
			}
		}
		System.out.println(str + " "+max);
		
	}
}
*/
/*
aa 30
bb 20
cc 10
aa 30
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	public String toString(){
		//return n +" ";
		return String.valueOf(n);//�������� ���ڿ��� ����
	}
}
public class study20{
	public static void main(String[] args) {

		HashSet<Num> h=
				new HashSet<Num>();
		h.add(new Num(3));
		h.add(new Num(7));
		h.add(new Num(11));
		
		Iterator<Num> it=h.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
/*
7
3
11
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	public String toString(){
		//return n +" ";
		return String.valueOf(n);//�������� ���ڿ��� ����
	}
	public int hashCode() {
		return n%3;	//1.������ ���ؼ� �׷���
	}
	public boolean equals(Object obj) {
		Num num=(Num)obj; //down casting
		if(num.n==n) {
			return true;
		}
		return false;//3�̶� 3�� ���� �׷��̴ϱ� �ߺ��Ǵ� 3 �ϳ� ����!!
	}
}
public class study20{
	public static void main(String[] args) {

		HashSet<Num> h=
				new HashSet<Num>();
		h.add(new Num(3));
		h.add(new Num(7));
		h.add(new Num(3));
		
		Iterator<Num> it=h.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
/*
3
7
*/
//�ߺ� �� �� �����ϰ� ���

//ù��° ���
/*
class Stu{
	String a;
	int b;
	Stu(String a, int b) {
		this.a=a;
		this.b=b;
	}
	public int hashCode() {
		return a.hashCode()+b;	//1.������ ���ؼ� �׷���  //�̸��� �Ȱ����� �ؽ��ڵ� ���� ����
	}
	public boolean equals(Object obj) {
		if(obj instanceof Stu) {
			Stu s=(Stu)obj;
			return s.a.equals(a) && s.b==b; 
		}
		else 
			return false;
	}
}
public class study20{
	public static void main(String[] args) {
	
		Set<Stu> s=
				new HashSet<Stu>();
		s.add(new Stu("�뼮",24));
		s.add(new Stu("����",22));
		s.add(new Stu("����",22));
		//�̸�, ���� �� ��ġ�ؾ� �ߺ� ��� �ȵ�
		System.out.println(s.size());
	}
}
*/
//2

//�ι�° ���
/*
class Stu{
	String a;
	int b;
	Stu(String a, int b) {
		this.a=a;
		this.b=b;
	}
	public int hashCode() {
		return a.hashCode()+b;	//1.������ ���ؼ� �׷���  //�̸��� �Ȱ����� �ؽ��ڵ� ���� ����
	}
	public boolean equals(Object obj) {
			Stu s=(Stu)obj;
			return s.a.equals(a) && s.b==b; 
	}
}
public class study20{
	public static void main(String[] args) {
	
		Set<Stu> s=
				new HashSet<Stu>();
		s.add(new Stu("�뼮",24));
		s.add(new Stu("����",22));
		s.add(new Stu("����",22));
		//�̸�, ���� �� ��ġ�ؾ� �ߺ� ��� �ȵ�
		System.out.println(s.size());
	}
}
*/
//2

/*
equals() �� hashcode()
equals �� �� ��ü�� ������ ������, ���(equality) �� ���ϴ� ������
hashCode �� �� ��ü�� ���� ��ü����, ���ϼ�(identity) �� ���ϴ� ������
*/

/*
Comparable<T> �������̽�
Comparable �������̽��� ��ü�� �����ϴ� �� ���Ǵ� �޼ҵ��� compareTo() �޼ҵ带 �����ϰ� �ֽ��ϴ�.

�ڹٿ��� ���� Ÿ���� �ν��Ͻ��� ���� ���ؾ߸� �ϴ� Ŭ�������� ��� Comparable �������̽��� �����ϰ� �ֽ��ϴ�.

���� Boolean�� ������ ���� Ŭ������ String, Time, Date�� ���� Ŭ������ �ν��Ͻ��� ��� ���� �����մϴ�.

�̶� �⺻ ���� ������ ���� ������ ū ������ ���ĵǴ� ���������� �˴ϴ�.
*/

/*
public class study20{
	public static void main(String[] args) {
		
		TreeSet<Integer> t=
				new TreeSet<Integer>();	
		//TreeSet�� ������������ ����Ѵ�!!
		
		t.add(84);
		t.add(6);
		t.add(84);
		t.add(55);	
		t.add(100);	
		
		Iterator<Integer> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
*/
/*
6
55
84
100
*/

/*
class Pro implements Comparable<Pro>{
	
	String name;
	int id;
	Pro(String n, int i) {
		name=n;id=i;
	}
	void show() {
		System.out.println(name+" "+id);
	}
	public int compareTo(Pro p) {
		if(id>p.id) //��������
			return 1;
		else if(id<p.id) 
			return -1;
		else
			return 0;
	}
}
public class study20{
	public static void main(String[] args) {
	
		TreeSet<Pro> t=
				new TreeSet<Pro>();
		//2,3�� ���� ����
		t.add(new Pro("aa",33));
		t.add(new Pro("bb",22));
		t.add(new Pro("cc",11));
		
		Iterator<Pro> it=t.iterator();
		while(it.hasNext())
			it.next().show();
	}	
}
*/
/*
cc 11
bb 22
aa 33
*/

/*
class Pro implements Comparable<Pro>{
	
	String name;
	int id;
	Pro(String n, int i) {
		name=n;id=i;
	}
	void show() {
		System.out.println(name+" "+id);
	}
	public int compareTo(Pro p) {
		if(id<p.id) //��������
			return 1;
		else if(id<p.id) 
			return -1;
		else
			return 0;
	}
}
public class study20{
	public static void main(String[] args) {
	
		TreeSet<Pro> t=
				new TreeSet<Pro>();
		//2,3�� ���� ����
		t.add(new Pro("aa",33));
		t.add(new Pro("bb",22));
		t.add(new Pro("cc",11));
		
		Iterator<Pro> it=t.iterator();
		while(it.hasNext())
			it.next().show();
	}	
}
*/
/*
aa 33
bb 22
cc 11
*/

/*
public class study20{
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<String>();
		set.add("one"); // ������ ����(�߰�)
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("4");
		set.add("5");
		set.add("six");

		System.out.println("����� ������ �� : " + set.size()); // ������ �� ���

		Iterator<String> it = set.iterator(); // Iterator(�ݺ���) ����

		while (it.hasNext()) { // hasNext() : �����Ͱ� ������ true ������ false
			System.out.println(it.next()); // next() : ���� ������ ����
		}

		System.out.println("--------------------");

		set.remove("three"); // ������ ����
		System.out.println("����� ������ �� : " + set.size()); // ����� ������ �� ���
		it = set.iterator(); // �ݺ��� �����(���� �ݺ������� next �޼���� �����͸� �� �����Ա� ������ �������
								// �ؾ���)

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------");
	}
}
*/
/*
����� ������ �� : 6
six
4
5
one
two
three
--------------------
����� ������ �� : 5
six
4
5
one
two
--------------------
*/

/*
public class study20{
	public static void main(String[] args) {
		
		TreeSet<Integer> grade=
				new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(100);
		grade.add(50);
	
		Integer i;
		i=grade.first();//first()
						//Returns the first (lowest) element currently in this set.
		System.out.println(i);//30
	}
}
*/

/*
public class study20{
	public static void main(String[] args) {
		
		TreeSet<Integer> grade=
				new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(100);
		grade.add(50);
	
		Integer i;
		i=grade.first();//first()
		//Returns the first (lowest) element currently in this set.
		System.out.println(i);//30
		
		i=grade.last();//last()
		//Returns the last (highest) element currently in this set.
		System.out.println(i);//100
		
		i=grade.lower(new Integer(80));//lower(E e)
		//Returns the greatest element in this set strictly less than 
		//the given element, or null if there is no such element.
		System.out.println(i); //50
		
		i=grade.higher(new Integer(80));//higher(E e)
		//Returns the least element in this set strictly greater than 
		//the given element, or null if there is no such element.
		System.out.println(i); //100
	}
}
*/

/*
class Food{
	void show() {
		System.out.println("����"); //����
	}
}
//food ��ӹ޾� Ŭ���� �̸� ����
class Pizza extends Food{
	void show() {	//�������̵�  
		super.show(); //����
		System.out.println("����"); //����
	}
}
class Fo<T>{
	T t;
	void in(T t) {
		this.t=t;
	}
	T out() {
		return t;
	}
}
public class study20{
	
	static void pr(Fo<? extends Food> f) {//Ŭ���� ����
		//out()���� ������ ���
		Food fo=f.out();
	    fo.show();
	}
	public static void main(String[] args) {

		Fo<Food> f=
				new Fo<Food>();
		f.in(new Food());
		pr(f);
		
		Fo<Pizza> f1=
				new Fo<Pizza>();
		f1.in(new Pizza());
		pr(f1);
		
		//in�� ����
		//�ٸ� Ŭ���� �����ؼ� ���� ��
		//pr �޼ҵ� ȣ���ؼ� ���	
	}
}
*/
/*
����
����
����
*/

//���͸� �̿��� �޺��ڽ� ����
/*
class My{
	String name;
	int age;
	My(String a, int b) {
		name=a;
		age=b;
	}
	public String toString() {
		return name+" "+age;
	}	
}
public class study20{
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		Vector<My> v=
				new Vector<My>();
		//���Ϳ� ���ڿ�, ������ 
		v.add(new My("����",20));
		v.add(new My("��ȣ",23));
		v.add(new My("����",22));
	
		//�޺��ڽ� �����
		JComboBox j= new JComboBox(v);
		f.add(j);
		f.setVisible(true);
	}
}
*/

/*
class Me implements Comparable<Me>{
	String name;
	Me(String n) {
		name=n;
	}
	int get() {
		return name.length();
	}
	public int compareTo(Me m) {
		if(get()<m.get())
			return -1;
		else if(get() > m.get())
			return 1;
		else 
			return 0;
	}
	public String toString() {
		return name;
	}
	
}
public class study20{
	public static void main(String[] args) {
	
		TreeSet<Me> t=
				new TreeSet<Me>();
		t.add(new Me("����"));
		t.add(new Me("�ڹٰ���"));
		t.add(new Me("������"));
		t.add(new Me("���ϴ��׳�"));
		t.add(new Me("���̿쿡��īŰ������"));
		
		
		Iterator<Me> it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
/*
����
������
�ڹٰ���
���ϴ��׳�
���̿쿡��īŰ������
*/

//�ڹ� ���� GUI ���� ����
/*
public class study20 extends JFrame {
	 
	study20() {
		Container c = getContentPane();
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();
		
		j1.setBackground(Color.gray);
		j2.setLayout(new GridLayout(4,4));
		j3.setBackground(Color.yellow);
		
		c.add(j1,BorderLayout.NORTH);
		c.add(j2);
		c.add(j3,BorderLayout.SOUTH);
		
		JLabel jl=new JLabel("�Է�");
		JTextField jf=new JTextField(10);
		j1.add(jl);
		j1.add(jf);
		
		JLabel ja=new JLabel("���");
		JTextField jt=new JTextField(10);
		j3.add(ja);
		j3.add(jt);
		
		for(int i=0; i<16;i++) {
			JButton b=new JButton();
			String []s= {"+","-","*","/","���","CE"};
			j2.add(b);
			if(i<10) { //0~9
				//������ ���ڿ��� �����ؼ� �����ӿ� ����
				b.setText(Integer.toString(i));
			}
			else {	//10~15
				b.setText(s[i-10]);//"+","-","*","/","���"
			}
		}
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new study20();
	}
}
*/

//����Ʈ ��Ʈ��(Byte Stream)
//�������� ������ ����,�׸�,������ ���� ����Ʈ ����� ��� ����ϴ� Ŭ������ ����Ʈ ������ ������� �����Ѵ�.

/*
InputStream
OutputStream 
������� ���� ����Ʈ ��Ʈ���� �ֻ��� �߻� Ŭ����
*/

/*
FileInputStream
FileOutputStream
 ���� ������� ���� ����Ʈ ��Ʈ�� Ŭ����
*/

/*
DataInputStream
DataOutputStream
�ڹ� �⺻��(primitive) �����͸� ����� �ϱ� ���� Ŭ����
*/

/*
BufferedInputStream
BufferedOutputStream
 ����� ��Ʈ���� ���۸� ����� �߰��� Ŭ����
*/

/*
PrintStream 
System.out�� ���� �ַܼ� ����ϱ� ���� Ŭ����
*/

/*
public class study20{
	public static void main(String[] args) {

		for(byte i=32; i<127; i++){

			System.out.write(i);

			System.out.write('\t');
		}
	}
}
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	int get() {
		return n;
	}
	
	public String toString(){
		return n +" ";
	}
}
public class study20{
	public static void main(String[] args) {
		//��ü �����ؼ� �� 3�� �� ��
		//for-each������ ���� 
		Num num[] = new Num[] {new Num(3), new Num(4), new Num(5)};
		
		int sum=0;
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + "");
		}
		System.out.println();
		for (Num n : num) {
			sum+=n.get();
		}
		System.out.println(sum);
	}
}
*/
//3 4 5 
//12