package y2020.month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.JCheckBox;
import javax.swing.JFrame;


//GUI
/*
public class study24 extends JFrame{

	study24() {
		Container c=getContentPane();
		JTextField j=new JTextField(10);
		
		//���ڿ� �Է��ؼ� ��
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(j.getText());
			}
		});
		c.add(j);
		c.setLayout(new FlowLayout());
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		
		new study24();
	}
}
*/

//GUI
/*
public class study24 extends JFrame{

	HashMap<String, String> h=new HashMap<String, String>();
	
	JTextField f1;
	JTextField f2;
	
	JButton [] b=new JButton[2];
	
	String[] name = {"����","ã��"};
	
	JTextArea ta;
	
	study24() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		
		f1=new JTextField(10);
		f2=new JTextField(10);
		
		ta=new JTextArea(10,20);
		
		c.add(new JLabel("����"));
		c.add(f1);
		c.add(new JLabel("�ѱ�"));
		c.add(f2);
		
		for(int i=0; i<2; i++) {
			b[i]=new JButton(name[i]);
			c.add(b[i]);
			
			b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton b1=(JButton)e.getSource();
					
					if(b1==b[0]) {	//���� ��ư ������
						if(h.containsKey(f1.getText())) {
							//����ܾ�
							h.put(f1.getText(), f2.getText());//�� ���� ���� �ؽøʿ� ����
						}
						else { //�ؽ�Ʈ�ʵ忡 ������ ���� �ȵ�� ���� ���
							h.put(f1.getText(), f2.getText());
							ta.setText(ta.getText()+"����"+
							f1.getText()+","+f2.getText()+"\n");
						}
					}
					else { //ã�� ��ư ������ ��
						Set<String> key=h.keySet();
						Iterator<String> it=key.iterator();
						while(it.hasNext()) {
							String k=it.next();
							String value=h.get(k);
							
							if(f1.getText().equals(k)) {
								f2.setText(value);
							}
						}
					}
				}
			});
		}
		c.add(new JScrollPane(ta));
		setSize(500,500);
		setVisible(true);	
	}
	public static void main(String[] args) {
		
		new study24();
	}
}
*/

/*
class Per{
	String str;
	
	Per(String str){
		this.str=str;
	}
	public String toString() {	//��ü�� ���ڿ��� ��ȯ
		return str;	
	}
}
public class study24{
	public static void main(String[] args) {
		
		ArrayList<Per> al=new ArrayList<Per>();
		
		al.add(new Per ("aa"));
		al.add(new Per("bb"));
		al.add(new Per("cc"));
		
		//aa, bb, cc ���� ���
		Iterator it = al.iterator(); //Iterator ���� 
		while(it.hasNext()){//�������� �ִ��� üũ
		    System.out.println(it.next()); //�� ���
		}
	}
}
*/
/*
aa
bb
cc
*/

/*
class Car {
    String color;
    int door;
 
    void drive() { //�����ϴ� ���
        System.out.println("drive, brrrr~");
    }
 
    void stop() { // ���ߴ� ���
        System.out.println("stop!!!");
    }
}
 
 
class FireEngine extends Car {  // �ҹ���
    void water() {              // �� �Ѹ��� ���
        System.out.println("warter!!!");
    }
}
 
class Ambulance extends Car {  // �ں深��
    void siren() {             // ���̷��� �︮�� ���
        System.out.println("siren~~~~");
    }
}
public class study24{
	public static void main(String[] args) {
		 FireEngine f = new FireEngine();
	        Ambulance a = new Ambulance();
	         
	        Instanceof test = new Instanceof();
	        test.doWork(f);
	        test.doWork(a);
	 
	    }
	 
	    public void doWork(Car c) {
	        if (c instanceof FireEngine) {
	            FireEngine f = (FireEngine)c;
	            f.water();
	             
	        } else if (c instanceof Ambulance) {
	            Ambulance a = (Ambulance)c;
	            a.siren();
	        }
	}
}
*/

/*
class Man{

	int n;
	Man(int n) {
		this.n=n;
	}
	void show() {
		System.out.println(n); 	
	}
}
class Man1 extends Man{
	String n;
	String name;
	
	Man1(int n, String na){
		super(n);
		name=na;
	}
	void show() {
		//super.show();
		System.out.print(super.n);
		System.out.println(name);
	}
}
public class study24{
	public static void main(String[] args) {
	
		//��� �޾Ƽ� ����
		Man m1=new Man(40);
		Man m2=new Man1(20,"ȫ���");
		
		m1.show(); //40
		m2.show(); //20, ȫ���
	}
}
*/

/*
 ���ѷ��� �ȿ� �� ������ �Է¹޾� ���� ���ϰ�, �Ǽ��� �Է��ϸ� "�Ǽ��� �ȵȴ�"��� ����ϰ�,
 �ٽ� �� ������ �Է¹޴� �ڵ带 �ۼ��ض�.
 
 ������) �� ���� �Է�: 3 3.5
                 �Ǽ��� �ȵȴ�.
                 �� ���� �Է�: 3 5
 */
/*
public class study24{
	public static void main(String[] args) {
		
		while(true) {
			Scanner s=new Scanner(System.in);
			
			System.out.println("�� ���� �Է�");
			
			try {
				int a=s.nextInt();
				int b=s.nextInt();
				
				int result=a+b;
				System.out.println("���:"+result);
				break;
			}
			catch(Exception e){
				System.out.println("�Ǽ��� �ȵȴ�");
			}
		}
		
	}
}
*/
/*
�� ���� �Է�
10 1.5
�Ǽ��� �ȵȴ�
�� ���� �Է�
10 20
���:30
*/

/*
public class study24{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		while(true) {
			try {
				int a=s.nextInt();
				int b=s.nextInt();
				System.out.println(a+b);
				break;
			}
			catch(Exception e) {
				System.out.println("�Ǽ� �ȵ�");
				s.nextLine();
				continue;
			}
		}
	}
}
*/
/*
1.5 2
�Ǽ� �ȵ�
1 5
6
*/

/*
 ���� �ڹٸ� �����ϰ� ���մϴ�.
 
 �� ���ڿ��� test03.txt ���Ͽ� �����϶�.
 */
/*
public class study24{
	public static void main(String[] args) {
		
		try {
		    OutputStream output = new FileOutputStream("test03.txt");
		    String str ="���� �ڹٸ� �����ϰ� ���մϴ�.";
		    byte[] by=str.getBytes();
		    output.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
	}
}
*/

/*
class Circle{
	private double r;
	
	Circle(double r) {
		this.r=r;
	}
	double area() {
		return 3.14*r*r;
	}
}
public class study24{
	public static void main(String[] args) {
		
		//��ü �迭[3]���� ����
		//������ �Է¹޾Ƽ� �迭�� ������ �� ���� ���
		
		Circle[] c=new Circle[3];//��ü�迭: ��ü�� ���� �� ������!
		
		Scanner s=new Scanner(System.in);
		
		for (int i=0; i<c.length;i++) {
			c[i]=new Circle(s.nextDouble());//������ �Է¹޾Ƽ� �����ϴ� �۾�(3�� �Է�)
			System.out.println(c[i].area());//���� �� ����
		}
	}
}
*/
/*
1.5 2.5 3.5
7.0649999999999995
19.625
38.465
*/

/*
public class study24{
	public static void main(String[] args) {
		
		
		Double a= new Double(5.5); // �Ǽ� 5.5�� �ڽ�
		String s=Double.toString(a);// �ڽ̵� 5.5�� ���ڿ��� ����
		Double b=new Double(s); // ���ڿ� 5.5�� ��ڽ�
		
		Double d=new Double(5.5);
		String a=d.toString();
		double b=Double.parseDouble(a);
	}
}
*/

/*
class Circle{
	int num;
	
	Circle(int num) {
		this.num=num;
	}
	public boolean equals(Object obj) { //�ʵ� �� ���� �� ����ϴ� �޼ҵ�
		Circle c=(Circle)obj;
		if(num==c.num) {
			return true;
		}
		return false;
	}
}
public class study24{
	public static void main(String[] args) {

		Circle a=new Circle(20);
		Circle b=new Circle(20);
		
		if(a.equals(b)) 
			System.out.println("����");
		else 
			System.out.println("�ٸ���");
	}
}
*/
//����

/*
interface Poi{
	void show(String a,int b);
	void show(String a);
}
class Point implements Poi{
	String a;
	int b;
	
	Point() {
		this.a=a;
		this.b=b;	
	}
	public void show(String a, int b) {
		System.out.println(a + b);
	}
	public void show(String a) {
		System.out.println(a);
	}
	
}
public class study24{
	public static void main(String[] args) {
		
		//�������̽�  Poi
		//�߻�޼ҵ�� show
		
		Poi p=new Point();
		p.show("��ź",50000);
		p.show("BTS");	
	}
}
*/
//��ź50000
//BTS

/*
class At extends Thread{
	int a,b;
	 At(int a, int b) {
		 this.a=a;
		 this.b=b;
	 }
	public void run() {
			
			for(int i=a; i<=b; i++) {
				System.out.print(i);
			
			}
			System.out.println();
		}
}
class Bt extends Thread{
	int c,d; 
	Bt(int c, int d) {
		 this.c=c;
		 this.d=d; 
	 }	
	public void run() {
			
			for(int i=c; i<=d; i++) {
				System.out.print(i);
				
			}
		}
}
public class study24 {
	public static void main(String[] args) {

		At a=new At(1,10); //1~10���� ���
		Bt b=new Bt(11,20);	//1~20���� ���
		
		//strart ����
		try {
		a.start();
		a.join();	//������ ������� ���ϵ��� ����
		
		b.start();
		b.join();
		}catch(Exception e) {}
	}
}
*/
/*
12345678910
11121314151617181920
*/

//��ǻ�Ͱ��� 20
//obj.txt�� ��ü ����
//��ü ����ȭ ObjectOutputStream
/*
class Student implements Serializable{
	String a;
	int b;
	
	Student(String a, int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+" "+b); //��ǻ�Ͱ��� 20
	}
}
public class study24 {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// ObjectOutputStream �� �̿��� ��ü ���� ����
		ObjectOutputStream o=
				new ObjectOutputStream(new FileOutputStream("obj.txt"));
		
		//Student�� �а� ���̸� �Է��Ͽ� ��ü ����
		Student s=new Student("��ǻ�Ͱ���",20);
		
		o.writeObject(s); //Student�� ��ä s ����
		s.show();
		o.close();
	}
}
*/

//j1 => �ʷ�
//j2 => �Ķ�
/*
public class study24 extends JFrame{
	study24() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox j1=new JCheckBox("green");
		JCheckBox j2=new JCheckBox("blue");
		
		j1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.green);
			}
		});
		j2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.blue);
			}
		});
		c.add(j1);
		c.add(j2);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study24();
	}
}
*/

/*
public class study24{
	
	static int get(int num[][]) {
		int m=0;//�ִ밪 ���� �ʱ�ȭ
		for(int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length;j++){

               if(m<num[i][j]) {
            	   m=num[i][j];
               }
            }
		}
		return m;
	}
	public static void main(String[] args) {
		//2�� 3���� ������ ������ �ʱ�ȭ
		int [][] score = {{1,2,3},
						  {4,5,6}};
		int high=get(score);
		System.out.println("�ִ밪"+high);//�ִ밪6
	}
}
*/
