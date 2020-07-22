package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



//������ �ϳ�(�ϳ��� ����) �Է¹޾�
//�� �� ���� �Է¹޾� �����ڴ�� (+, -)���
/*		
public class study22 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        float num1;    //�Ǽ���
        float num2;
        String oper; //���ڿ�
        String con;
        boolean a; //����
        
        do{
            System.out.print("���� �Է� : ");
            num1 = sc.nextFloat();
            a = true;
            do {
                System.out.print("������ �Է� : ");
                oper = sc.next();
                
                switch(oper) {
                    case "+":
                        a=false;
                        break;
                    case "-":
                        a=false;
                        break;
                    case "*":
                        a=false;
                        break;
                    case "/":
                        a=false;
                        break;
                    default:
                        System.out.print("�����ڸ� �ٽ� �Է����ּ��� \n ");                
                    }                
                }while(a);
                
            System.out.print("���� �Է� : ");
            num2 = sc.nextFloat();
            
            switch(oper) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.print("ó������ �ٽ� �Է����ּ��� \n ");
                continue;              
            }
        
            System.out.print("����� ��� �Ͻ÷���  y Ȥ�� Y�� �Է��� �ּ��� : ");
            con = sc.next();
            if(con.equals("y") || con.equals("Y") ){
                continue;
                }
                else{
                    System.out.println("�����մϴ�.");
                    break;
                }    
            }while(true);
    }
 }
*/



//�ܼ� â�� �Է����ּ��� -> inputStreamreader
//���� ���� �������
/*
public class study22 {
	public static void main(String[] args) throws IOException {
	
		InputStreamReader r=new InputStreamReader(System.in);
		FileWriter f = null;
		
		int i;
		
		try {
			f=new FileWriter("test.txt");
			while((i=r.read())!=-1)
			{
				f.write(i);
			}
			r.close();
			f.close();
		} catch(Exception e) {}
	}
}
*/

/*
class Per{
	int a;
	
	Per(int a){
		this.a=a;
	}
	void pr() {
		System.out.println(a);
	}
}
class Person extends Per{
	String b;
	
	Person(int a, String b){
		super (a);
		this.b=b;
	}
	void pr() {
		//super.pr();
		System.out.println(a+" "+b);
	}
}
public class study22 {
	public static void main(String[] args) {

		Per p=new Per(10);
		Per p1=new Person(20, "juli");
		p.pr();
		p1.pr();
		//p1�� ��ӹ޾� ���
	}
}
*/
//10
//20 juli

/*
public class study22 {
	public static void main(String[] args) {

	//��ư �ΰ� �����
	//������ ���Ƿ� �ְ�
	//�ϳ��� ��ư ������ �Ⱥ��̰�
	//�ϳ��� ��ư ������ ��ư�� ��ġ �� getx, gety
	
	JFrame j= new JFrame("jframe");
	j.setSize(500,500);
	j.setLayout(new FlowLayout());
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	
	j.add(b1);
	j.add(b2);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			b1.setVisible(false);
			
		}
	}); 	
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(b2.getX());
			System.out.println(b2.getY());
			
		}
	}); 		
	j.setVisible(true);
	}
}
*/

/*
public class study22 extends JFrame {
	study22(){
		this.setLayout(null);
		JButton j=new JButton("1");
		j.setBounds(100,50,70,90);
		this.add(j);
		
		JButton j1=new JButton("2");
		j1.setBounds(200,50,70,90);
		//1 ���� �ߵ���
		this.add(j1);
		
		this.setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study22();
	}
}
*/


//ArrayList�� ���ڿ� ���� �߰�
//���� �� �ܾ� ���
/*
public class study22{
	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("���Ͽ�����̸���");
		s.add("������");
		s.add("�����");
		
		int max=0;
		for(int i=1; i<s.size(); i++) {
			if(s.get(i).length()>s.get(max).length()) {
				max=i;
			}
		}
		System.out.println(s.get(max));//���Ͽ�����̸���
	}
}
*/

/*
public class study22 extends JFrame {
	JButton j=new JButton("Cal");	//����
	JLabel jl=new JLabel("��� ���");	//����
	study22(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		c.add(j);
		c.add(jl);
		this.setSize(500,500);
		setVisible(true);
		
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Aa a=new Aa(); //JDialog
				a.setVisible(true); //���̾�α�
				}
		});
	}
		class Aa extends JDialog{
			JTextField f1=new JTextField(15);
			JTextField f2=new JTextField(15);
			
			JButton j2=new JButton("ADD");
			Aa() {
				setLayout(new FlowLayout());
				add(new JLabel("�� ���� ���մϴ�"));
				add(f1);
				add(f2);
				add(j2);
				setSize(350,250);
				j2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);//���̾�α�â�� �����
					
						//�ؽ�Ʈ �ʵ忡 ���� �� �����ͼ� �� �� ����
						//���� �� �����ӿ� ����
						
						int sum=Integer.parseInt(f1.getText())+Integer.parseInt(f2.getText());
						jl.setText(Integer.toString(sum));
					}
				});
			}
}
public static void main(String[] args) {
		
	new study22();
	}
}
*/

/*
1. ���� main()�� ���� pr�Լ��� show�Լ��� �ۼ��ض�.(Number�� Ŭ������)
Main(){

Number.pr(100);

Number n=new Number();

n.show(3.14);}
*/
//static �޼ҵ� ����
/*
class Number{
	int a;
	double b;
	
	static void pr(int a) {
		System.out.println(a);
	}
	void show(double b) {
		this.b=b;
		System.out.println(b);
	}
}
public class study22{
	public static void main(String[] args) {
		
		Number.pr(100);
		Number n=new Number();
		n.show(3.14);
	}
}
*/

/*
2. �����ӿ� ������ ����(1~50)�������� �� �ϳ��� ����, 
��ư ��+5��, ��-5��, ��/5����ư�� ����� +5�� ������ ������ ������ +5�Ѱ��� ����, 
������ ��ư�� �˸��� ������ �ϵ��� �����ض�. ��ư�� �� �ѹ��ۿ� ��������.
*/
//ù��° ���
/*
public class study22 extends JFrame{
	int a=(int)(Math.random()*50+1);
	study22(){
		setSize(500,500);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel jl=new JLabel(Integer.toString(a));
		
		JButton j1=new JButton("+5");
		JButton j2=new JButton("-5");
		JButton j3=new JButton("/5");
		
		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText(Integer.toString(a+5));
			}
		});
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText(Integer.toString(a-5));
			}
		});
		j3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setText(Integer.toString(a/5));
			}
		});
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(jl);
		
		setVisible(true);
		
}
public static void main(String[] args) {
	
	new study22();
	}
}
*/
//�ι�° ���
/*
public class study22 extends JFrame{
	
	String str[] = {"+5", "-5", "/5"};
	JLabel j=new JLabel();
	JButton jb[]=new JButton[3];
	
	study22() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		int n=(int)(Math.random()*50)+1;
		j.setText(Integer.toString(n));
		c.add(j);	//������ ���� ����
		setVisible(true);
		this.setSize(500,500);
		
		Aa a=new Aa();
		for(int i=0;i<3;i++) {
			jb[i]=new JButton(str[i]);
			//��ư ������ �̸�����
			jb[i].addActionListener(a);
			c.add(jb[i]);//�����̳ʿ� ��ư ���� ����
		}
		
}
class Aa implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		int num=Integer.parseInt(j.getText());//������ ���� �����
		
		switch(e.getActionCommand()) {
		case "+5":
			num+=5;
			jb[0].setEnabled(false);
			break;
		case "-5":
			num-=5;
			jb[1].setEnabled(false);
			break;
		case "/5":
			num/=5;
			jb[2].setEnabled(false);
			break;
		}
		j.setText(Integer.toString(num));
	}
}
public static void main(String[] args) {
		
		new study22();
	}
}
*/

/*
public class study22{
	public static void main(String[] args) {
	
		Map<Integer,Double> m=new HashMap<Integer,Double>();
		
		m.put(2, 3.5);
		m.put(3, 5.5);
		m.put(4, 6.5);
		
		Set<Map.Entry<Integer, Double>> s=m.entrySet();
		
		//entrySet()
		//Returns a Set view of the mappings contained in this map.
		
		//keySet()
		//Returns a Set view of the keys contained in this map.
		
		
//		int ary[]= {1,2,3,4,5};
// 		for(int i:ary) {
// 		
//		}
		
		for(Map.Entry<Integer, Double> m1:s) {
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
	}
}
*/
/*
3.5
2
5.5
3
6.5
4
*/

//[JAVA] Comparable�� Comparator�� �̿��� �������� 
/*
class Stu implements Comparable<Stu> {

    private String name;
    private int age;

    public Stu(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Stu o) {
        if(age < o.getAge()) return -1;
        else if(age == o.getAge()) return 0;
        else return 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class study22{
	public static void main(String[] args) {
	
		TreeSet<Stu> t=new TreeSet<Stu>();
		t.add(new Stu("�̹�",96));
		t.add(new Stu("�ε�",100));
		t.add(new Stu("����",50));
		//������������ �����ؼ� ���
		
		 Iterator<Stu> iterator = t.iterator();
	        while(iterator.hasNext()){
	            Stu s = iterator.next();
	            System.out.println(s.getName() + "  :  " + s.getAge());
	        }
	}
}
*/
//����  :  50
//�̹�  :  96
//�ε�  :  100

/*
3. HashMap�������̽� ����(�̸�, ����)<String, Integer>�� ������ ������ �� 3�� �ؽ��ʿ� �����Ѵ�. 
      ���� �� ��� ������ �ְ�����, �ְ� ������ ���� �̸��� ����ض�.

(entrySet, getKey, getValue �޼ҵ� �̿�)
*/
/*
public class study22{
	public static void main(String[] args) {
		
		HashMap<String, Integer> h= new HashMap<String,Integer>();
		
		h.put("���ڹ�",new Integer (90));
		h.put("���ڹ�",new Integer (85));
		h.put("���ڹ�",new Integer (55));

		Set set= h.entrySet(); // Ű �� ���� set���·� ����
		Iterator it = set.iterator();

		while(it.hasNext()){
		Map.Entry e = (Map.Entry)it.next();

		System.out.println("�̸�: " +e.getKey() +", ���� : "+e.getValue());


		}

		set=h.keySet(); // Ű�� set���� ����
		System.out.println("������ ��� : " +set);

		Collection v = h.values(); //���� �÷������� �����Ѵ�.
		it = v.iterator();

		int total = 0;

		while (it.hasNext())
		{
		Integer i = (Integer)it.next();
		total += i;// total += i.intValues(); ������
		}

		System.out.println("���� : " + total);
		System.out.println("��� : " + (float) total/set.size());
		System.out.println("�ְ����� : " + Collections.max(v));
		System.out.println("�������� : " + Collections.min(v));
	}
}
*/
/*
�̸�: ���ڹ�, ���� : 90
�̸�: ���ڹ�, ���� : 85
�̸�: ���ڹ�, ���� : 55
������ ��� : [���ڹ�, ���ڹ�, ���ڹ�]
���� : 230
��� : 76.666664
�ְ����� : 90
�������� : 55
*/
/*
public class study22{
	public static void main(String[] args) {
		
		HashMap<String, Integer> m= new HashMap<String,Integer>();
		
		m.put("aa",new Integer (90));
		m.put("bb",new Integer (70));
		m.put("cc",new Integer (80));
		
		int max=0;
		int sum=0;
		String name=null;
		
		Set<Map.Entry<String, Integer>> es=m.entrySet();
		
		//�ѹ� �� ����.(es->��ü �ؽø�)
		for(Map.Entry<String, Integer> e:es) {
			if(e.getValue()>max) {
				max=e.getValue();
				name=e.getKey();
			}
			sum+=e.getValue();
		}
		double avg=sum/3.0;
		
		System.out.println(avg);
		System.out.println(max);
		System.out.println(name);
	} 
}
*/
/*
80.0
90
aa
*/

/*
4. Double b[](wrapperŬ����)�� �Ǽ� 2���� �ְ� for-each������ ����ض�.

 Double b[];
*/
/*
public class study22{
	public static void main(String[] args) {
		
		Double b[] = new Double[2];
		
		b[0]=new Double(1.5);
		b[1]=new Double(2.5);
		
		for(double i: b) {
			System.out.println(i);
		}
	}
}
*/
//1.5
//2.5

/*
public class study22{
	public static void main(String[] args) {
	
		Double b[]= {1.5,2.5};
		
		for(Double c:b) {
		System.out.println(c);
		}
	}
}
*/
//1.5
//2.5

/*
class Coffee{
	int price;
	int num;
	
	Coffee(int p, int n) {
		price=p;
		num=n;
	}
	int total() {
		return price*num;
	}
}
public class study22{
	public static void main(String[] args) {
	
		//��ü�迭 ��Ұ� 3�� [3]�̸鼭 Ŀ���� ���� ��� 
		//total �Լ��� �������ָ� �ȴ�.
		
		Coffee c[]=new Coffee[3];
		int a[] = {5000,4000,3000};
		int b[] = {1,2,3};
		
		int sum=0;
		for(int i=0; i<3;i++) {
			c[i]=new Coffee(a[i],b[i]);
			sum+=c[i].total();
		}
		System.out.println(sum);	//22000
	}
}
*/

/*
class Str implements Comparator<String>{
	
	public int compare(String str1, String str2) {
		
		if(str1.length()>str2.length()) {
			return 1;
		}
		else if(str1.length()<str2.length()) {
			return -1;
		}
		else return 0;
	}
}
public class study22{
	public static void main(String[] args) {
	
		TreeSet<String> t=new TreeSet<String>();
		t.add("aa");
		t.add("aaaaa");
		t.add("aaa");
		
		Iterator<String> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
aa
aaa
aaaaa
*/

//Comparable=> compareTo()
//Comparator=> compare()
/*
class Str implements Comparator<String>{
	
	public int compare(String str1, String str2) {
		
		if(Integer.parseInt(str1)>str2.length()) {
			return 1;
		}
		else if(Integer.parseInt(str1)<str2.length()) {
			return -1;
		}
		else return 0;
	}
}
public class study22{
	public static void main(String[] args) {
	
		TreeSet<String> t=new TreeSet<String>();
		t.add("aa");
		t.add("dd");
		t.add("cc");
		
		Iterator<String> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
*/
/*
aa
cc
dd
*/


/*
5. ���� Ŭ������ main()�� ���� �����带 �����ϴ� StudentŬ������ �ۼ��ض�

����� 10,20,30,����10�� ������Ű�Բ� �ض�.(add�޼ҵ带 ���� �ٲ��)-����ȭ

class Sh {
	
	private int num = 0;

	public void add() {
		int n = num;
		Thread.yield();
		n += 10;
		num = n;
		System.out.println(num);
	}
}
----------------------

Main(){

Sh sh = new Sh();
		
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);

		th1.start();
		th2.start();
*/
//ù��° ���
/*
class Sh {
	
	private int num = 0;

	public void add() {
		int n = num;
		Thread.yield();
		for(int i=1; i<10; i++) {
			n += 10;
			num = n;
			System.out.println(num);
		}
	}
}
class Student extends Thread{
	
	String name;
	Sh sh;
	
	Student(String n, Sh sh){
		this.name=n;
		this.sh=sh;
	}
	
	public void run() {
		sh.add();
	}
}
public class study22{
	public static void main(String[] args) {
	
		Sh sh = new Sh();
		
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);

		th1.start();
		th2.start();
	}	
}
*/
/*
10
10
20
30
40
50
60
70
80
90
20
30
40
50
60
70
80
90
*/

//�ι�° ���
/*
class Sh {
	
	private int num = 0;

	public synchronized void add() {	//synchronized => �浹 ����
		int n = num;
		Thread.yield();
		for(int i=1; i<10; i++) {
			n += 10;
			num = n;
			System.out.println(num);
		}
	}
}
class Student extends Thread{
	String a;
	Sh s;
	
	Student(String a, Sh s){
		this.a=a;
		this.s=s;
	}
	public void run() {
		s.add();
	}
}
public class study22{
	public static void main(String[] args) {
	
		Sh sh = new Sh();
		
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);

		th1.start();
		th2.start();
	}	
}
*/
/*
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
160
170
180
*/

//�ϳ��� ���ڿ��� �Է��ؼ�
//�� �������� �о� �������� �и��� ���� � ���� ���..
/*
public class study22{
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("���ڿ� �Է��ϼ���");
		
		String str=s.nextLine();
		StringTokenizer stk=new StringTokenizer(str," ");
		System.out.println(str);
		System.out.println();
			
		System.out.println("�������� �и��� ��:"+stk.countTokens());		
	}
}
*/
/*
���ڿ� �Է��ϼ���
�ȳ�1 �ȳ�2 �ȳ�3
�ȳ�1 �ȳ�2 �ȳ�3

�������� �и��� ��:3
*/