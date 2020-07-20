package y2020.month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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


public class study20{
	public static void main(String[] args) {
	
	}
}
