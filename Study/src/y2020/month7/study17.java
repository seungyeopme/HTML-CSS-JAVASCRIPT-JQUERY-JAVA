package y2020.month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
/*
public class study17 extends JFrame{
 
	study17(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
  
		JLabel j=new JLabel("���Ϫ誦�������ު�");
  
		ImageIcon i=new ImageIcon
				("C://Users//Administrator//Desktop"
								+ "/JAVA.jpg");
		JLabel j1=new JLabel(i);
		JLabel j2=new JLabel("�������̳׿�",SwingConstants.CENTER);
  
		c.add(j);
		c.add(j1);
		c.add(j2);
		
		setVisible(true);
 }
 public static void main(String[] args){ 
	 new study17();
 	}
}
*/
import java.util.StringTokenizer;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;






//class Mouse implements ActionListener{
//	 public void actionPerformed(ActionEvent e) {
//	  JButton j1=(JButton)e.getSource();
//	  j1.setBackground(Color.red);
//	 }
//}
//	public class study17 extends JFrame{
//	 study17(){
//	  Container c=getContentPane();
//	  c.setLayout(new FlowLayout());
//	  
//	  JButton j1=new JButton("��ư 1");
//	  c.add(j1);
//	  
//	  j1.addActionListener(new Mouse());
	  /*j1.addMouseListener(new MouseAdapter() {
	   public void mouseClicked(MouseEvent e) {
	    j1.setBackground(Color.red);
	   }
	  });*/
	  
	  /*j1.addActionListener(new ActionListener(){
	   public void actionPerformed(ActionEvent e) {
	    //�����̳� red
	    j1.setBackground(Color.red);
	    
	   }
	  });*/

//	  setVisible(true);
//}
//	 public static void main(String[] args){ 
//	  new study17();
//	}
//}

/*
public class study17 extends JFrame {
	study17(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox j=new JCheckBox("Ŀ��");
		JCheckBox j1=new JCheckBox("Ƽ");
		
		j.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("coffee");
				}
				
			}
		});
		c.add(j1);
		setVisible(true);
	}

public static void main(String[] args){ 
	  new study17();
	}
}
*/

/*
public class study17 extends JFrame {
	
	JCheckBox[] cafe = new JCheckBox[3];
	//��ü�迭
	String [] menu = {"��", "�Ƹ޸�ī��", "�׸�Ƽ"};
	JLabel total;	//���� ���
	
	study17(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		Check ch=new Check();
		for(int i=0; i<cafe.length;i++) {
			cafe[i]=new JCheckBox(menu[i]);
			c.add(cafe[i]);
			cafe[i].addItemListener(ch);
		}
		total=new JLabel();
		c.add(total);
		setVisible(true);
	}
	
	class Check implements ItemListener{
		int sum=0;
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==cafe[0]) {
					sum+=5000;
				}
				else if(e.getItem()==cafe[1]) {
					sum+=4000;
				}
				else
					sum+=4500;
			}
		}
		total.setText("����"+sum+"��");
	}
}
public static void main(String[] args){ 
	  new study17();
	}
}
*/
/*
1.������ ������ �ڵ�� �ۼ��ض�.
1.1Boolean �� false�� ��false����� ���ڿ��� ��ȯ�ض�.
1.2 ���ڿ� ��36.5���� double Ÿ�� �Ǽ��� ��ȯ�ض�.
1.3 ���ڿ� ��35���� ���� 35�� ��ȯ�ض�.
*/
/*
//ù��° ���
public class study17{
	public static void main(String[] args){ 
		
		boolean b = false;
		String a = String.valueOf(b);
		
		String c = "36.5";
		double d = Double.valueOf(c); //String -> Double
		
		String e = "35";
		int f = Integer.parseInt(e); //String -> Int
	}
}
*/
//�ι�° ���
/*
public class study17{
	public static void main(String[] args){ 

		boolean b=false;
		String s=Boolean.toString(b);
		
		String a="36.5";
		double c=Double.parseDouble(a);
		
		String s1="35";
		int i=Integer.parseInt(s1);
		int i1=Integer.valueOf(s1);
	}
}
*/
/*

2. ����Ʈ���� ������ blue������ �ϰ�, Ok, Cancel, Get ��ư�� ������ ���α׷� �ۼ��ض�.
*/
/*
public class study17 extends JFrame{
    public study17()
    {
        //content pane�� ���� reference������ ���
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.blue);
        contentPane.setLayout(new FlowLayout());
        //��ư�� ����
        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Cancel");
        JButton getButton = new JButton("Get");
        contentPane.add(okButton);
        contentPane.add(cancelButton);
        contentPane.add(getButton);
        
        this.setSize(400,300);
        this.setTitle("This is JFrame Test"); //optional
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new study17();
    }
}
*/


/*
2.1 Ok ��ư�� ������ ����Ʈ�� ���� orange, Cancel ��ư�� ������ ��ư�� ��Ȱ��ȭ��Ű�� Get 
     ��ư�� ������ ��ư�� ��ġ(x,y)���� ����ض�.
*/
/*
public class study17 extends JFrame{
study17(){
Container c=getContentPane();
c.setLayout(new FlowLayout());
c.setBackground(Color.BLUE);

JButton jb1=new JButton("OK");
JButton jb2=new JButton("Cancel");
JButton jb3=new JButton("Get");

jb1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
c.setBackground(Color.orange);
}
});
jb2.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
jb2.setEnabled(false);
}
});
jb3.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
System.out.println(e.getX()+" "+e.getY());
}
});
c.add(jb1);
c.add(jb2);
c.add(jb3);
setVisible(true);
}
public static void main(String[] args) {
	
	new study17();
	}
}
*/

/*
3. Main()�� ���� main()�� Object In, OutputStream�� �����, Ŭ������ ���� �����ض�.
	Person p=new Person(��Jack��, ��computer��, 20, 123);
	p.show();   //������ �� ����ϴ� �Լ�
*/

/*class Person implements Serializable{
	String a,b;
	int c,d;
	
	Person(String a, String b, int c, int d){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	void show() {
		System.out.println(a+b+c+" "+d);
	}
}
public class study17{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		*/
		/*
		FileOutputStream f=
				new FileOutputStream("pp.txt");
		ObjectOutputStream o = 
				new ObjectOutputStream(f);
		
		Person p=new Person("Jack", "computer", 20, 123);
		o.writeObject(p);
		p.show();   //������ �� ����ϴ� �Լ�
	
		o.close();*/
		
		/*ObjectInputStream i=	//�о� ���� ����
				new ObjectInputStream
				(new FileInputStream("pp.txt"));
		
		Person p1=(Person)i.readObject();
		p1.show();
		i.close();*/
		
//	}
//}

	
/*
class Person implements Serializable{

	String n;
	String com;
	int a, c;

Person(String n, String com, int a, int c) {

	this.n=n;
	this.com=com;
	this.a=a;	
	this.c=c;
}
	
void show() {
	System.out.println(n+com+a+" "+c);

	}
}
public class study17 {

public static void main(String[] args) throws FileNotFoundException, IOException {

	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("pp.txt"));
	}
}
*/

/*
4. 3���� Circle ��ü �迭�� ����� x, y, r���� �о� 3���� Circle��ü�� �����show()�Լ����� �� ����ض�.
class Circle{

   private double x,y;

   private int r;

   Circle(double x, double y, int r){

          this.x=x;  this.y=y; this.r=r; }

   void show(){

     System.out.println(x + �� �� +y + �� �� +r);}}

������) x,y,r : 1.0 1.0 4

        x,y,r : 2.5 3.5 6


        x,y,r : 4.2 1.2 4
*/
/*
class Circle{
	private double x,y;
	private int r;
Circle(double x, double y, int c){
	this.x=x; 
	this.y=y; 
	this.r=c; 
}

void show(){
	System.out.println(x + " " +y + " " +r);
	}
}

public class study17 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Circle c[]=new Circle[3];

		for(int i=0;i<c.length;i++) {
			c[i]=new Circle(s.nextDouble(), s.nextDouble(), s.nextInt());

			
		}
		for(int i=0;i<c.length;i++) {
			c[i].show();
		}
	}
}
*/
/*
1.0 1.0 4
2.5 3.5 2
4.2 1.2 4
1.0 1.0 4
2.5 3.5 2
4.2 1.2 4
*/

//Java transient�̶�?
//transient�� Serialize�ϴ� ������ �����ϰ� ���� ��� �����ϴ� Ű�����Դϴ�.

/*
5. ������ Person�������̽��̴�. Worker, StudentŬ���� �ۼ��ض�.
interface Person{

    String work(); }



public class Ŭ������{

 static void pr(Person p){

    System.out.println(p.work()); }

main(){

pr(new Worker());     // ���Ѵ�

pr(new Student());    //�����Ѵ� ���
*/
/*
interface Person{
	String work(); 
}
class Worker implements Person{
	public String work() {
		return "���Ѵ�";
	}
}
class Student implements Person{
	public String work() {
		return "�����Ѵ�";
	}
}
public class study17 {
	
	static void pr(Person p){
		System.out.println(p.work()); 
	}
	
	public static void main(String[] args) {
	
		pr(new Worker());     // ���Ѵ�
		pr(new Student());    //�����Ѵ� ���
	}
}
*/
//���Ѵ�
//�����Ѵ�

/*
6. ���� main()�� ���� �߻� Ŭ�������߻�޼ҵ� �ۼ��ض�.
   (total �Լ��� �迭 ��(1,2,3,4,5) ���� ���Ϲ޴� �Լ�)

main(){

Ab c=new Cd();

System.out.println(c.total(new int []{1,2,3,4,5}));
*/

/*
abstract class Ab{
	abstract int total(int[] a);
}
class Cd extends Ab{
	int sum = 0;
	int total(int[] a) {
		
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
public class study17 {
	public static void main(String[] args) {
		
		Ab c=new Cd(); //Ab �θ� Cd �ڽ�   //��ĳ����..�ڽ��� �θ� ������!!*/
		
		/*
		P p=new P();  //�θ�
		A a=new A();  //�ڽ�
		a=(A)p;       //�ٿ� ĳ����..�θ𿡼� �ڽ� ������!! �Ϸ��� �տ� Ŭ�������� �ٿ��ش�.(����ȯ)
		*/
		
		
//		System.out.println(c.total(new int []{1,2,3,4,5}));	//15
//	}
//}


/*
interface Stack{
    int length();
    Object pop(); //����
    boolean push(Object ob); //����
}
 
class StringStack implements Stack{
    private String[] element;
    private int index;
 
    public StringStack(){ //�ʱ�ȭ
        element = new String[10];
        index = 0;
    }
 
    public int length(){
        return element.length;
    }
 
    public Object pop(){
        if(element == null) {
            System.out.println("No element in stack.");
            return null;
        }
        else if(index == 0) return null;
        else{
            index --;
            return element[index];
        }
    }
 
    public boolean push(Object ob){
        if(index == length()) return false;
        else {
            element[index] = (String)ob;
            index++;
            return true;
        }
    }
 
}
public class study17 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack stack = new StringStack();
 
        System.out.println("Please input 10 elements.");
        for(int i=0; i<stack.length(); i++){
            if(stack.push(s.next()) == false) break;
        }
 
        System.out.println("Full stack. Now start 'pop'");
        for(int i=0; i<stack.length(); i++){
            System.out.print(stack.pop() + " ");
        }
 
    }
}
*/

/*
public class study17 {
    public static void main(String[] args){
    	
    	String p="1+2+3";
    	StringTokenizer s=
    			new StringTokenizer(p,"+");
    	
    	while(s.hasMoreTokens()) {
    		System.out.print(s.nextToken());//123
    	}
    }
}
*/

//�������̽���
//total�Լ��� �߻�޼ҵ�� ���� ���� �Ϲ� �޼ҵ�� ����
/*
interface Ab{
	default int total(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
    		sum+=a[i];
    	}
    	return sum;
	}
}
class Cd implements Ab{}
public class study17 {
	public static void main(String[] args){
    	Ab c=new Cd(); //Ab �θ� Cd �ڽ�   //��ĳ����..�ڽ��� �θ� ������!!
    	System.out.println(c.total(new int []{1,2,3,4,5}));	//15
    }
}
*/

/*
//JRadioButton �ߺ� ���� �Ұ���
public class study17 extends JFrame{
	study17(){
		JRadioButton j1= new JRadioButton("¥���");
		JRadioButton j2= new JRadioButton("«��");
		this.add(j1);
		this.add(j2);
		
		ButtonGroup g = new ButtonGroup();
		g.add(j1);
		g.add(j2);

		this.setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args){

		new study17();
	}
}
*/

/*
public class study17 extends JFrame{
	 JRadioButton j1=new JRadioButton("¥���");
	 JRadioButton j2=new JRadioButton("������");

	 study17(){
	  
	  Container c=getContentPane();
	  
	  c.add(j1);
	  c.add(j2);
	  c.setLayout(new FlowLayout());
	  
	  ButtonGroup b1=new ButtonGroup();
	  b1.add(j1);
	  b1.add(j2);
	  
	  A a =new A();
	  j1.addItemListener(a);
	  j2.addItemListener(a);
	 
	  setVisible(true);
}
class A implements ItemListener{
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()!=ItemEvent.SELECTED) {
			return;
		}
		if(e.getItem()==j1) {
			System.out.println("¥���");
		}
		else if(e.getItem()==j2) {
			getContentPane().setBackground(Color.pink);
		}
	}
}
public static void main(String[] args) { 
	 
	new study17();
	}
}
*/

/*
class Check implements ItemListener{
	
	JRadioButton j1;
	JRadioButton j2;
	JRadioButton j3;
	
	Check(JRadioButton j1,JRadioButton j2,JRadioButton j3) {
		this.j1=j1;
		this.j2=j2;
		this.j3=j3;
	}
	public void itemStateChanged(ItemEvent e) {
		//üũ�ڽ� ���� ���� �� ������ư�� Ȱ��ȭ
		if(e.getStateChange()==ItemEvent.SELECTED) {
			j1.setEnabled(true);
			j2.setEnabled(true);
			j3.setEnabled(true);
		}
		else {	//üũ�ڽ� ���� ������ ��
			j1.setEnabled(false);
			j2.setEnabled(false);
			j3.setEnabled(false);
		}
	}
}
public class study17{
	public static void main(String[] args) { 
		
		JFrame f=new JFrame();
		f.setLayout(new GridLayout(0,1));
		JCheckBox j= new JCheckBox("���� ����");
		
		JRadioButton b1=new JRadioButton("Java");
		JRadioButton b2=new JRadioButton("Python");
		JRadioButton b3=new JRadioButton("C#");
		
		ButtonGroup g1=new ButtonGroup();
		g1.add(b1);
		g1.add(b2);
		g1.add(b3);
		
		//üũ�ڽ� ���ý� 
		j.addItemListener(new Check(b1,b2,b3));
		f.add(j);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//������ư ��Ȱ��ȭ
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		
		//������ư �̺�Ʈ ó��
		b1.addItemListener(new ItemListener() {
		
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("�ڹ�!!");
				}
			}
		});
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("Python!!");
				}
			}
		});
		b3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
					System.out.println("C#");
				}
			}
		});
		f.setVisible(true);
	}
}
*/

/*
public class study17 extends JFrame{
	study17() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸� "));
		c.add(new JTextField(15));
		
		c.add(new JLabel("�ּ� "));
		c.add(new JTextField(15));
		setVisible(true);
	}
	public static void main(String[] args) { 
		new study17();
	}
}
*/
/*
public class study17 extends JFrame{
	study17() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�̸� "));
		c.add(new JTextField(15));
		
		c.add(new JLabel("�ּ� "));
		c.add(new JTextField(15));
		setVisible(true);
	}
	public static void main(String[] args) { 
		new study17();
	}
}
*/

/*
class Text implements ActionListener{
	JTextField id;
	JPasswordField pw;
	
	//������
	//actionPerformed
	Text(JTextField id, JPasswordField pw){
		this.id=id;
		this.pw=pw;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("���̵�: "+id.getText());
		System.out.println("��й�ȣ: "+new String(pw.getPassword()));	//��ü�� ���ڿ��� ���
	}
}
public class study17{
	public static void main(String[] args) { 
		
		JFrame j=new JFrame();
		//layout 2�� 2��
		j.setLayout(new GridLayout(2,2));
		
		//SwingConstants ���ڿ� ��ġ ����
		JLabel j1=new JLabel("ID : ",SwingConstants.LEFT);
		JTextField j2=new JTextField(10);
		
		JLabel j3=new JLabel("PW : ",SwingConstants.LEFT);
		JPasswordField j4=new JPasswordField(10);
		j4.setEchoChar('*'); //��й�ȣ ���ڸ� ********�� ����
		
		j4.addActionListener(new Text(j2,j4));
		
		j.add(j1);
		j.add(j2);
		j.add(j3);
		j.add(j4);
		
		j.setVisible(true);
	}
}
//���̵�: ididid
//��й�ȣ: pwpwpw
*/

/*
public class study17 extends JFrame{
	public static void main(String[] args) { 
		JFrame j=new JFrame();
		j.setLayout(new GridLayout(3,5));
		
		JCheckBox c1 = new JCheckBox("üũ�ڽ�1");
		JCheckBox c2 = new JCheckBox("üũ�ڽ�2");
		JCheckBox c3 = new JCheckBox("üũ�ڽ�3");
		JCheckBox c4 = new JCheckBox("üũ�ڽ�4");
		JCheckBox c5 = new JCheckBox("üũ�ڽ�5");
		JCheckBox c6 = new JCheckBox("üũ�ڽ�6");
		JCheckBox c7 = new JCheckBox("üũ�ڽ�7");
		JCheckBox c8 = new JCheckBox("üũ�ڽ�8");
		JCheckBox c9 = new JCheckBox("üũ�ڽ�9");
		JCheckBox c10 = new JCheckBox("üũ�ڽ�10");
		JCheckBox c11 = new JCheckBox("üũ�ڽ�11");
		JCheckBox c12 = new JCheckBox("üũ�ڽ�12");
		JCheckBox c13 = new JCheckBox("üũ�ڽ�13");
		JCheckBox c14 = new JCheckBox("üũ�ڽ�14");
		JCheckBox c15 = new JCheckBox("üũ�ڽ�15");
		
		j.add(c1);
		j.add(c2);
		j.add(c3);
		j.add(c4);
		j.add(c5);
		j.add(c6);
		j.add(c7);
		j.add(c8);
		j.add(c9);
		j.add(c10);
		j.add(c11);
		j.add(c12);
		j.add(c13);
		j.add(c14);
		j.add(c15);
		
		j.setVisible(true);
	}
}
*/

/*
public class study17 extends JFrame{
	study17() {
		Container c = getContentPane();
		JCheckBox j[] =new JCheckBox[15];
		c.setLayout(new GridLayout(3,5));
		
		for(int i=0; i<j.length; i++) {
			j[i]=new JCheckBox("üũ�ڽ�"+(i+1));
			c.add(j[i]);
		}
		setVisible(true);
	}
	public static void main(String[] args) { 
		new study17();
	}
}
*/

/*
public class study17 extends JFrame {
	 JTextField j=new JTextField(20);
	 JTextArea j1=new JTextArea(10,20);
	 
	 study17(){
		 Container c=getContentPane();
	 //flow
		 c.setLayout(new FlowLayout());
		 JLabel jl=new JLabel("enter Ű �Է�");
		 c.add(jl);
		 c.add(j);
		 c.add(new JScrollPane(j1));
	  
		 j.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 JTextField jt=(JTextField)e.getSource();
				 j1.append(jt.getText());
				 jt.setText("");
			 }
		 });
	  
		 setVisible(true);
	 }
public static void main(String[] args) {
	  new study17();
	}
}
*/

//üũ�ڽ� 2���� �Ϲݹ�ư 1�� �����

//üũ�ڽ� �ϳ��� "��Ȱ��ȭ"�� �̸��� �ְ�
//üũ�ڽ� �ϳ��� "���߱�"�� �̸��� �ش�.
//�Ϲݹ�ư �̸��� "button"�̶�� �Ѵ�.

//��Ȱ��ȭ üũ�ڽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ
//���߱� üũ�ڽ��� Ŭ���ϸ� �Ϲ� ��ư�� �� ���̰� ����ض�.
/*
public class study17 extends JFrame {

study17(){	
	setSize(500,500);
	setLayout(new FlowLayout());
	
	JCheckBox ch=new JCheckBox("��Ȱ��ȭ");
	JCheckBox ch1=new JCheckBox("���߱�");
	JButton jb=new JButton("button");

	ch.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				jb.setEnabled(false);
		}
			else {
				jb.setEnabled(true);
			}
		}
});

	ch1.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				jb.setVisible(false);}
			else {
				jb.setVisible(true);
			}
		}
});
	add(ch); 
	add(ch1); 
	add(jb);
	
	setVisible(true);
}
public static void main(String[] args) {
	new study17();
	}
}
*/

/*
enum Pro{	//������ 
	JAVA(20),C(10),PYTHON(15);
	int n;
	Pro(int n){
		this.n=n;
	}
	int get() {
		return n;
	}
}


public class study17 {
	public static void main(String[] args) {
		
		System.out.println("���� ����?");
		Scanner s= new Scanner(System.in);
		String n=s.next();
		
		Pro p=Pro.valueOf(Pro.class,n);	//valueOf(���ڿ�) -> ��ü ��ȯ
		
		switch(p) {
		//�������ο� ���
			case C: 
				System.out.println(p.n);
				break;
			case PYTHON: 
				System.out.println(p.n);
				break;
			case JAVA: 
				System.out.println(p.n);
		}
	}
}
*/

/*
enum Day{
	Mon,Tue,Wed;	
}
enum Month{
	Jun,July,Aug;
}
public class study17 {
	static void pr(Month m) {
			switch (m) {
			case Jun: {
				System.out.println("6��");
				break;
		}
	}
}
public static void main(String[] args) {
	
		pr(Month.Jun);
		Month m=Month.Aug;
	}
}
*/			
//6��	

/*
enum Price{
	COM(200), IPAD(100);
	//int COM=200;
	//int IPAD=100;
	int n;
	Price(int n) {
		this.n=n;
	}
	int get() {
		return n;
	}
	
	
}
public class study17 {
	public static void main(String[] args) {
	
	System.out.println(Price.COM.get()); //200
	System.out.println(Price.IPAD.get()); //100
	
	System.out.println(Price.COM);	//COM
	System.out.println(Price.IPAD);	//IPAD
	}
}
*/

/*
enum Day{  
    MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

enum Month{  
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, 
    AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
public class study17 {
	public static void main(String[] args) {
	
		Day day = Day.TUESDAY;

        switch (day) {
        case MONDAY:
            System.out.println("�������Դϴ�.");
            break;
        case TUESDAY:
            System.out.println("ȭ�����Դϴ�.");
            break;
        case WEDNESDAY:
            System.out.println("�������Դϴ�.");
            break;
        }
        
        Month m = Month.FEBRUARY;
        
        switch (m) {
        case JANUARY:
        	System.out.println("1��");
        	break;
        case FEBRUARY:
        	System.out.println("2��");
        	break;
        }
	}
}
*/
//ȭ�����Դϴ�.
//2��

/*
enum Day{	//������ Ŭ�����̱� ������ �ʵ尪�� ��ü�� �ν�
	Mon,Tue,Wed;
}
public class study17{
	public static void main(String[] args) {
		
		Day d = Day.Wed;
		
		System.out.println(d.name());//Wed
		System.out.println(d.name()+2);//Wed2
		
		System.out.println(d.ordinal());//2
		System.out.println(d.ordinal()+100);//102
	}
}
*/

//���� ������ 30, ���� ������ 40�ȼ��̰� LEFT�� ���� ��ġ�ϴ�
//FlowLayout ��ġ�����ڸ� ���� ����Ʈ�ҿ� 5���� ��ư ������Ʈ�� ������ ���� �������α׷��� �ۼ��϶�.
/*
public class study17 extends JFrame { 
	public study17(){ 
		setTitle("BorderLayout Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c=getContentPane(); 
		
		c.setLayout(new BorderLayout(30,40)); 
		c.add(new JButton("Calculate"), BorderLayout.CENTER); 
		c.add(new JButton("add"), BorderLayout.NORTH); 
		c.add(new JButton("sub"), BorderLayout.SOUTH); 
		c.add(new JButton("mul"), BorderLayout.EAST); 
		c.add(new JButton("div"), BorderLayout.WEST); 
		
		setSize(300,200); 
		setVisible(true); 
	} public static void main(String[] args) { 
		new study17(); 
	} 
}
*/

//GridLayout�� ����Ͽ� �������α׷��� ����� ����Ʈ���� 4*2�׸���� �����ϰ� 
//JLabel ������Ʈ�� JTextField ������Ʈ�� �����Ͽ� ������. �� �� ������ ���� ������ 5�ȼ��� �϶�.
/*
public class study17 extends JFrame { 
	String[] str= {"�̸�", "�й�", "�а�", "����"}; 
	study17(){ 
		setTitle("GridLayout Test"); 
		setSize(500,500); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		Container c=getContentPane(); 
		c.setLayout(new GridLayout(4,2,5,5)); 
		for(int i=0; i<8; i++) { // �׸��� �������� ��� ���� ¦������ ���� �Ϳ� �ָ�. 
			if(i%2==0) { 
				JLabel l=new JLabel(str[i/2]); 
				c.add(l); 
			}else { 
				JTextField tf=new JTextField(""); //�� 
				c.add(tf); 
			} 
		} 
		setVisible(true); 
	} 
public static void main(String[] args) { 
	new study17(); 
	} 
}
*/

// ����Ʈ�ҿ� ��ġ�����ڸ� �����ϰ� 9���� ��ư�� �ϳ��� ���ڿ��� ����ϴ� ���α׷��� �ۼ��϶�. 
// "Hello, Press Buttons!" ���ڿ��� JLabel ������Ʈ�� �̿��ϰ�, 
// �� ��ġ�� 130,50�� ũ��� 200*20���� �Ѵ�. ��ư�� ũ��� 50*20�� �Ѵ�.
/*
public class study17 extends JFrame { 
	public study17() { 
		setTitle("Null Container Sample"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container c = getContentPane(); 
		c.setLayout(null); 
		
		JLabel la = new JLabel("Hello, Press Buttons!"); 
		la.setLocation(130, 50); 
		la.setSize(200, 20); 
		
		c.add(la); 
		
		for(int i=1; i<=9; i++) { 
			JButton b = new JButton(Integer.toString(i)); // ��ư ���� 
			
			b.setLocation(i*15, i*15); //x��, y�� ��ġ ����
			b.setSize(50, 20); 
			c.add(b); // ��ư�� ����Ʈ�ҿ� ���� 
		} 
		
		setSize(300, 200); 
		setVisible(true); 
} 
public static void main(String[] args) { 
		new study17(); 
	} 
}
*/