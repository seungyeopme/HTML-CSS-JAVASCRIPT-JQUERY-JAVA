package y2020.month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
class Food{
	String menu;
	int price;
	Food(String m){
		menu=m;
		price=100000;
	}
	public String toString() {	//��ü�� ���ڿ���
		return menu; 
	}
}
public class study16 {
	public static void main(String[] args) {

		Food f = new Food("¥���");
		System.out.println(f+" "+f.price+"��");
		//Food Ŭ������ String�� menu,
		//int�� price�� �ش�.
		//�����ڴ� �Ű������� menu��
		//�� �� �ְ� �����ϰ�,
		//price�� 10000������ �ʱ�ȭ�Ѵ�.
	}
}
//¥��� 100000��
*/

/*
interface A{
	double r=3.14;	//final
	default void show() {
		System.out.println("��");
	}
	abstract double area(double ra); //abstract ���� ����
}
class B implements A{
	double ra;
	public double area(double ra) {
		return r*ra*ra;
	}
}
public class study16 {
	public static void main(String[] args) {

		B b = new B();	//��ü ���� 	//��ü ������ A���� interface���� ���� �� �� ����.
		System.out.println(b.area(4.5));	//63.585
	}
}
*/

/*
class Cook{	//�丮 ������
	String food;
	boolean send=false; 
	
	void set(String f) {
		food=f;	//�ʱ�ȭ �ڵ�
		send=true;
		//synchronized void pr()
		synchronized(this) {
			notifyAll();	//���ڰ� �ִ� ������ �� �����!!
	}
}
	String get() {
		if(send=false) {	//���� ������������
			try {
				synchronized (this) {
					wait();	//�մ��� ��ٸ�
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return food;
}
public class study16 {
	public static void main(String[] args) {
	
	}
}
*/

/*
class Cook{ //�丮������
	 String food;
	 boolean send=false;
	 
	 void set(String f) {
		 food=f; //�ʱ�ȭ �ڵ�
		 send=true;
	 //synchronized void pr()
		 synchronized(this) {
			 notifyAll(); //���ڰ� �ִ� ������ �� �����!
		 }
	}
	String get() {
	  if(send==false) { //���� ������������
		  try {
			  synchronized(this) {
				  wait(); //�մ��� ��ٸ�
		}
	  } catch(Exception e) {
		  e.printStackTrace();
	  	}
	  }
	  return food;
	}
}
class Chef extends Thread{  //�丮��
	 Cook c;
	 
	 Chef(Cook c){
	  this.c=c;
	 }
	 public void run() {
	  c.set("����");
	 }
}
class Custumer extends Thread{
	 Cook c;
	 Custumer(Cook c){
		 this.c=c;
	 }
	 public void run() {
		 System.out.println(c.get());
	 }
}
public class study16 {
	public static void main(String[] args) {
	 
		Cook co=new Cook();
		Custumer c1=new Custumer(co);
		Custumer c2=new Custumer(co);
		Chef c3=new Chef(co);
	  
		try {
			c1.start();
			c2.start();
			Thread.sleep(1000);
			c3.start();
	   
			c1.join();
			c2.join();
			c3.join();
		}catch(Exception e) {}s
	}
}
*/
//����
//����

/*
1.	Interface�� ��ӹ��� CalcuŬ������ �ۼ��ض�. Main()���� a,b�� ���� ������ ���� �����ض�.
interface Cal{
   int total(int a, int b); //a���� b������ �� ����
   int big(int a, int b);} //a,b�� ū �� ����
*/
/*
interface Cal{
	   int total(int a, int b); //a���� b������ �� ����
	   int big(int a, int b); //a,b�� ū �� ����
}
class Calcu implements Cal{
	int a,b;
	int sum=0;
	
	Calcu(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int total(int a, int b) {
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}
	public int big(int a, int b) {
		if(a>b) {
			return a;
		}
		else {return b;}
	}
	
}
public class study16 {
	public static void main(String[] args) {
	
		Calcu cal = new Calcu(1,10);
		System.out.println(cal.total(1,10));
		System.out.println(cal.big(67, 3));
	}
}
*/
//55
//67

/*
interface Cal{
	int total(int a, int b); //a���� b������ �� ����
	int big(int a, int b); 	//a,b�� ū �� ����
} 
class Calcu implements Cal{
public int total(int a, int b) {

	int sum=0;

	for(int i=a;i<=b;i++) {
		sum+=i;
	}
	return sum;
}

public int big(int a, int b) {
	int big=0;
	if(a>b) {big=a;}
	else if(a<b) {big=b;}
	return big;
	}
}
public class study16 {
	public static void main(String[] args) {

		Calcu c=new Calcu();
		System.out.println(c.total(2, 3));
		System.out.println(c.big(1, 2));
	}
}
*/
//5
//2

/*
2.	Main()�� ���� ��������1���� ����ض�.
Main(){
  Th t=new Th(�������� 1��);
  Thread th=new Thread(t);
  th.start(); 
*/  
/*  
class Th extends Thread{
	String a;
	
	Th(String a) {
		System.out.println("������1");
		this.a=a;
	}
	public void run() {
		try {
			sleep(100);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class study16 {
	public static void main(String[] args) {
		 
		Th t=new Th("������ 1");
		Thread th=new Thread(t);
		th.start(); 
	}
}
*/
//������1
/*
class Th implements Runnable{
	String str;
	Th(String s) {
		str=s;
	}
	public void run() {
		System.out.println(str);	
	}
}
public class study16 {
	public static void main(String[] args) {
		 
		Th t=new Th("������ 1");
		Thread th=new Thread(t);
		th.start(); 
	}
}
//������ 1
*/

/*
3.	Main()�� ���� Ŭ���� �ۼ��ض�. (0~10���� 1�ʵ��� ���� �� �� ������) 
Main(){
  Timer t = new Timer();
  t.start(); }
*/
/*
class Timer extends Thread {
	public void run() {
		for(int i=0; i<=10;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			}catch(Exception e) {}
		}
	}
}
public class study16  {
	public static void main(String[] args) {
	
		Timer t = new Timer();
		t.start(); 
	}
}
*/
/*
0
1
2
3
4
5
6
7
8
9
10
*/

/*
4.	���� �ڵ带 ���� AThreadŬ������ �ۼ��ض�. (1���� 100���� �� ���)
�� �����尡 �浹���� �ʰ� join()�� Ȱ���ض�.
class Total{
int sum;
Total(){
  sum=0; }
void total(int n){
 sum+=n; }
int get(){
 return sum; }
}
main(){
 Total t=new Total();
 AThread a=new AThread(t, 1, 50);
 AThread b=new AThread(t, 51, 100);
 a.start(); b.start(); }
*/
/*
class Total {
	int sum;

	Total() {
		sum = 0;
	}
	
	void total(int n) {
		sum += n;
	}

	int get() {
		return sum;
	}
}

class AThread extends Thread{
	Total t;
	int a,b;

	AThread(Total t,int a, int b){
		this.t=t;
		this.a=a;
		this.b=b;
}
public void run() {
	int sum=0;

	for(int i=a;i<=b;i++) {
		sum+=i;
	}
		System.out.println(sum);
	}
}
public class study16 {
	public static void main(String[] args) {
		Total t = new Total();
		AThread a = new AThread(t, 1, 50);
		AThread b = new AThread(t, 51, 100);

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		}catch(Exception e) {}
	}
}

//1275
//3775

/*
5.	main()�� �̷��� �ְ�, Figure�������̽� ����� circle_area()���� ������, rec_area()���� �簢�� ���� ����ض�.
Figure f1=new Circle(5);
Figure f2=new Rec(2,5); 
f1.circle_area(); 
f2.rec_area();
*/
/*
interface Figure{
	void circle_area();
	void rec_area();
}
class Circle implements Figure{
	int a;
	
	Circle(int a){
		this.a=a;
	}
public void circle_area() {
	System.out.println(a*a*3.14);
}
@Override
public void rec_area() {
	// TODO Auto-generated method stub
	}
}
class Rec implements Figure{
	int a,b;
	
Rec(int a, int b){
	this.a=a;
	this.b=b;
}
public void rec_area(){
	System.out.println(a*b);
}
@Override
public void circle_area() {
	// TODO Auto-generated method stub
	}
}
public class study16 {
	public static void main(String[] args) {

		Figure f1=new Circle(5);
		Figure f2=new Rec(2,5);
		f1.circle_area();
		f2.rec_area();
	}
}
*/
//78.5
//10

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		//ok, cancel ��ư �ΰ�
		JButton j1 = new JButton("Ok");
		JButton j2 = new JButton("Cancel");
		
		c.add(j1);
		c.add(j2);
		
		setVisible(true);
	}
	//flow
	//���� JFrame
	//����Ʈ�� ���� �˾Ƴ���
	//���� ������
	public static void main(String[] args) {
		new study16();
	}
}
*/

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,3));//�࿭
		//������ �ȿ��� ���ڿ�(�ؽ�Ʈ)�� ����
		for(int i=0; i<9; i++) {
			String str= Integer.toString(i);//wrapper//�������� ���ڿ��� �����ؼ� ���
			JButton j1 = new JButton(str);
			c.add(j1);
		}
		setVisible(true);
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		JButton j1 = new JButton("j1");	
		JButton j2 = new JButton("j2");
		
		c.setLayout(new FlowLayout());
		
		j1.setEnabled(false);	//��ư ��Ȱ��ȭ
		c.add(j1);
		c.add(j2);
		setVisible(true);
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

/*
public class study16 extends JFrame {
	study16(){
		super("JFrame");
		Container c=getContentPane();
		JButton j1 = new JButton("j1");	
		JButton j2 = new JButton("j2");
		
		c.setLayout(new FlowLayout());
		
		//��ư�� ���� �̺�Ʈ ó�� �������̽�
		j1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư 1");
			}
		});
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j2.setBackground(Color.green);
			}
		});
		
		c.add(j1);
		c.add(j2);
		setVisible(true);
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

/*
class Aa implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		JButton b=(JButton)e.getSource();//�̺�Ʈ�� ��𿡼� �߻��ߴ��� �˾Ƴ���.
										   //getSource �޼ҵ�� Object Ŭ���� ��ü�̹Ƿ�
										   //�ٿ� ĳ���� �ؼ� �˾Ƴ���.
		if(b.getText().equals("Java")) {
			b.setText("�ڹ�");
		}
	}
}
public class study16 extends JFrame {
	study16(){
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton j1 = new JButton("Java");
		j1.addActionListener(new Aa());
		
		c.add(j1);
		setVisible(true);
	
	}
public static void main(String[] args) {
	
		new study16();
	}
}
*/

//MouseAdapter Ŭ������ ����ϸ� ���ϴ�. �Ʒ��� ������� ���� �� 5���� �߻� �޼ҵ带 ������� �ϴ� �������� �ִ�.
/*
class Mouse implements MouseListener{
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��!!");
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {
		System.out.println("���콺 ����");
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}

public class study16{
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		//Mouse m = new Mouse();
		
		MouseListener m=new Mouse(); //upcasting
		JButton j1=new JButton("one");
		JButton j2=new JButton("two");
			
		j1.addMouseListener(m);
		j2.addMouseListener(m);
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
	}
}
*/

//��ó�� MouseAdapter Ŭ������ ����ϸ� ���ϴ�.
/*
class Mouse extends MouseAdapter{
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
	}
}
public class study16{
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.addMouseListener(new Mouse());
		
		MouseListener m=new Mouse(); //upcasting
		JButton j1=new JButton("one");
		JButton j2=new JButton("two");
		j1.addMouseListener(new Mouse());
		j2.addMouseListener(new Mouse());
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
	}
}
*/

/*
class Mouse implements MouseMotionListener{
	//���콺 ������
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getX()+" "+e.getY());
	}
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX()+" "+e.getY());
	}
}


public class study16{
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		JButton j1=new JButton("one");
		JButton j2=new JButton("two");
		
		j1.addMouseMotionListener(new Mouse());
		j2.addMouseMotionListener(new Mouse());
		
		f.add(j1);
		f.add(j2);
		f.setVisible(true);
	}
}
*/

/*
public class study16 extends JFrame{
	
	Container con;
		JPanel panel1;
		JPanel panel2;
		
	public study16() {	//������ ����
	
		super("�����̳ʿ� �г��� �̿��Ͽ� ����Ʈ �� �����");	//Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1=new NorthPanel();
		panel2=new CenterPanel();
		
		con=getCon
	}
	public static void main(String[] args) {

		//����Ʈ �� ���� �����ϴ� ������ ����
		
	}
}
*/

/*
//����Ʈ �� ���� �����ϴ� ������ ����
class Mouse extends MouseAdapter implements MouseMotionListener{
	public void mouseDragged(MouseEvent e) {
		//��������� ����
		Container c=(Container)e.getSource();
		c.setBackground(Color.yellow);
	}
	public void mouseMoved(MouseEvent e) {}
	
	public void mouseReleased(MouseEvent e) {
		Container c=(Container)e.getSource();
		c.setBackground(Color.green);
	}	
}

public class study16 extends JFrame{
	study16() {
		Container c=getContentPane();
		c.setBackground(Color.pink);
		
		c.addMouseMotionListener(new Mouse());
		c.addMouseListener(new Mouse());
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new study16();
	}
}
*/

/*
//ù��° ���
public class study16{
	public static void main(String[] args) {

		//��ư 2�� ����(ok, cancel)
		//ok ��ư "ok"��� ���
		//cancel ������ ��ư ��Ȱ��ȭ
		//(setEnable(false))
		
		JFrame j = new JFrame("�ڹ� GUI ����");
		
		j.setSize(350,300);
		
		j.setLocationRelativeTo(null);
		
		j.setLayout(new FlowLayout());
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("ok");
		b1.setText("ok");
		System.out.println("getText: " +b1.getText());
		
		JButton b2 = new JButton("cancel");
		b2.setEnabled(false);
		
		j.add(b1);
		j.add(b2);
		
		j.setVisible(true);
	}
}
*/

/*
//�ι�° ���
public class study16{
	public static void main(String[] args) {

		//��ư 2�� ����(ok, cancel)
		//ok ��ư "ok"��� ���
		//cancel ������ ��ư ��Ȱ��ȭ
		//(setEnable(false))
		
		JFrame j = new JFrame("�ڹ� GUI ����");
		
		j.setSize(350,300);
		
		j.setLocationRelativeTo(null);
		
		j.setLayout(new FlowLayout());
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton b1 = new JButton("ok");
		JButton b2 = new JButton("cancel");
		
		j.setLayout(new FlowLayout());
		j.add(b1);
		j.add(b2);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ok");
				
			}
		});
		b2.setEnabled(false);
		
		j.setVisible(true);
	}
}
*/

/*
public class study16 extends JFrame{
	study16(){
		JLabel j=new JLabel("����");
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		setVisible(true);
	}
	public static void main(String[] args) {
		new study16();
	}
}
*/

//"�ڹٴ�" ���ڿ��� ��� ��
//���콺�� "�ڹٴ�" Ŀ���� �ø���
//mouseEntered�Լ� Ȱ��
//setText�Լ� ����ؼ� "��վ�"��� ����
//���콺�� ������ mouseExited �Լ� Ȱ��
//"�ڹٴ�"�̶�� ����
/*
class Mouse extends MouseAdapter{
	public void mouseEntered(MouseEvent e) {
		JLabel j=(JLabel)e.getSource();
		j.setText("��վ�");
	}
	public void mouseExited(MouseEvent e) {
		JLabel j=(JLabel)e.getSource();
		j.setText("�ڹٴ�");
	}
}
public class study16 extends JFrame{
	study16(){
		JLabel j = new JLabel("�ڹٴ�");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		setVisible(true);
		c.add(j);
		j.addMouseListener(new Mouse());
	}
	public static void main(String[] args) {
		new study16();
	}
}
*/

/*
public class study16 extends JFrame{
	study16() {
		this.setLayout(new FlowLayout());
		ImageIcon i1=new ImageIcon("C://Users//Administrator//Desktop/JAVA.jpg");
		JLabel j1=new JLabel(i1);
		this.add(j1);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study16();
	}
}
*/

//JCheckBox => �ߺ� ���� �����ϴ�.
/*
public class study16 extends JFrame{
	study16() {
		this.setLayout(new FlowLayout());
		
		JCheckBox j1 = new JCheckBox("�ܹ���");
		JCheckBox j2 = new JCheckBox("ġŲ");
		JCheckBox j3 = new JCheckBox("����");
		
		this.add(j1);
		this.add(j2);
		this.add(j3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study16();
	}
}
*/




/*
//Interface ItemListener
The listener interface for receiving item events. 
The class that is interested in processing an item event implements this interface. 
The object created with that class is then registered with a component using 
the component's addItemListener method. When an item-selection event occurs, 
the listener object's itemStateChanged method is invoked.
*/


//JRadioButton => �ߺ� ���� �Ұ����ϴ�.
/*
public class study16 extends JFrame{
	study16() {
		this.setLayout(new FlowLayout());
		
		JRadioButton j1 = new JRadioButton("�ܹ���");
		JRadioButton j2 = new JRadioButton("ġŲ");
		JRadioButton j3 = new JRadioButton("����");
		
		this.add(j1);
		this.add(j2);
		this.add(j3);
		
		ButtonGroup grp = new ButtonGroup();	
		grp.add(j1);
		grp.add(j2);
		grp.add(j3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study16();
	}
}
*/

/*
public class study16 extends JFrame{
	study16(){
		JCheckBox j=new JCheckBox("�ڹ�");
		this.setLayout(new FlowLayout());
		
		j.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("�ڹ� ��մ�");
				}
				
			}
		});
		this.add(j);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new study16();
	}
}
*/

/*
public class study16 extends JFrame{
	study16(){
		JMenuBar j=new JMenuBar();	//1
		JMenu j1=new JMenu("File");
		JMenu j2=new JMenu("Edit");
		JMenu j3=new JMenu("Source");//2
		
		JMenuItem j4=new JMenuItem("New");
		JMenuItem j5=new JMenuItem("Undo");//3
		
		setJMenuBar(j); //�޴��� ����
		j.add(j1);
		j.add(j2);
		j.add(j3);
		
		j1.add(j4);
		j2.add(j5);
		
		j4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("new");				
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study16();	
	}
}
*/

//one, two ��ư �ΰ� �����
//one�� Ŭ���ϸ� ��ư ������
//green������!
//two�� Ŭ���ϸ� ���Ƿ� �̺�Ʈ ����
/*
class Mo implements MouseListener{
	
	public void mouseClicked(MouseEvent e) {
		JButton buttonn = (JButton)e.getSource();
		String str = buttonn.getText();
	
		if(str.equals("1"))
		{
			buttonn.setBackground(Color.green);}
		else if(str.equals("2")) {
			buttonn.setBackground(Color.blue);
		}
		}
	
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
}

public class study16 extends JFrame{
	study16(){
		
		Container c=getContentPane();
		JButton j1=new JButton("1");
		JButton j2=new JButton("2");
		c.setLayout(new FlowLayout());
		setVisible(true);
		c.add(j1);
		c.add(j2);
		
		Mo m=new Mo();
		j1.addMouseListener(m);
		j2.addMouseListener(m);
		
	}
	public static void main(String[] args) {
		new study16();
	}
}
*/