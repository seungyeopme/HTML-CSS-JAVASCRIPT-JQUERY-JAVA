package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



/*
class Aa implements MouseMotionListener{
	public void mouseDragged(MouseEvent e) {
		System.out.println("���콺 �巡��");
	}
	public void mouseMoved(MouseEvent e) {}
}
public class study19 extends JFrame{

	study19() {
		setTitle("�巡��"); //super("�巡��");
		Container c = getContentPane();
		c.addMouseMotionListener(new Aa());
		
		setVisible(true);
	}
	public static void main(String[] args) {

		//title -> �巡��
		//�����̳� �巡�� -> "���콺 �巡��"
		new study19();
	}
}
*/

/*
public class study19 extends JFrame{
	
	JSlider j = new JSlider(100,200,150); //JSlider(int min, int max, int value)
	JLabel j1 = new JLabel(" ");
	
	
	study19() {
		setTitle("JSlider"); //super("JSlider");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());//FlowLayout
		c.add(j); c.add(j1);
		
		j.setMajorTickSpacing(20); //ū ���� ����
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER); //���ڿ� ��ġ�� �߾ӿ� ��ġ
		j1.setOpaque(true);	//���� ����
		j1.setBackground(Color.magenta);
		j1.setText(Integer.toString(j.getValue()));//���� �������� ���ڿ��� �����ؼ� �����ӿ� ����.
		
		j.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider s=(JSlider)e.getSource();
				j1.setText(Integer.toString(j.getValue()));
				
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {

		new study19();
	}
}
*/

/*
public class study19 extends JFrame{
	study19(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�޴� �����");
		
		this.setLayout(new FlowLayout());
		
		JMenuBar j=new JMenuBar();
		
		JMenu j1 = new JMenu("Search");
		JMenu j2 = new JMenu("Project");
		
		JMenuItem j3 = new JMenuItem("Open");
		JMenuItem j4 = new JMenuItem("Open File...");
		
		setJMenuBar(j);
		j.add(j1);
		j.add(j2);
		
		j2.add(j3);
		j2.add(j4);
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new study19();
	}
}
*/

/*
public class study19 extends JFrame{
	study19(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� �����");
		
		this.setLayout(new FlowLayout());
		Container c =getContentPane();
		JToolBar j=new JToolBar();
		JButton j1=new JButton("��");
		
		j1.addActionListener(new Jt());
		j.add(j1);
		c.add(j,BorderLayout.NORTH);//���ٴ� �ݵ�� BorderLayout�� �����ؾ� �Ѵ�.
		
		this.setSize(400,200);
		setVisible(true);
		
	}
	class Jt implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int r=JOptionPane.showConfirmDialog(null, "������ �����Ͻðڽ��ϱ�?", 
										"����",JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.CLOSED_OPTION) {
				return; //�ƹ��͵� �������� ���� ��� ���������ڴ�.
			}
			else if(r==JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			else 
				return;	//not exit
		}
	}
	public static void main(String[] args) {
		
		new study19();
	}
}
*/

/*
1. 5���� 10������ ������ �����͸� �Է� �޾�5~10 �̿��� �������� �ԷµǸ� ���ٽ� �Է¡��̶�� ��� �Ѵ�. 
      �Է� ���� ���� ���� Calc class�� calculate()�Լ��� �̿��Ͽ� 
   1���� �Է� ���� ���ڱ��� Ȧ���� ���ϴ� ���α׷��� �ۼ� �ض�. (calculate()�Լ���int��
        ������ �Է� �޾� 1���� �Է� ���� ���ڱ��� Ȧ���� ���� ���Ͽ� �����ϴ� �Լ�)
*/

/*
class Calc{
	int calculate(int n) {
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		return sum;
	}
}
public class study19{
	public static void main(String[] args) {
		
		
		Calc c= new Calc();
		Scanner s=new Scanner(System.in);
		int n;
		while(true) {
			n=s.nextInt();
			if(n<5 || n>10) {
				System.out.println("�ٽ� �Է�");
				continue;
			}
			System.out.println("1���� �Է��� ���ڱ��� Ȧ���� ���� : "+c.calculate(n));
		}
	}
}
*/
/*
1
�ٽ� �Է�
5
1���� �Է��� ���ڱ��� Ȧ���� ���� : 9
10
1���� �Է��� ���ڱ��� Ȧ���� ���� : 25
*/

/*
2. main(){
int[][] ary=new int[3][3];

high(ary,3,3);

} �ְ� ���� �Է¹޾�high��� �Լ��ȿ��� �Է��� �� �� �ִ밪 ���ض�.
*/
//ù��° ���
/*
public class study19{
	static int high(int ary[][]) {

		int max;

		Scanner s=new Scanner(System.in );
		
		for(int i=0; i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {

				ary[i][j]=s.nextInt();
			}
		}
		max = ary[0][0];
			
			for(int k=0; k<ary.length;k++) {
				for(int g=1;g<ary[k].length;g++) {
					if(max<ary[k][g]) {
						max=ary[k][g];
					}
				}
			}
			return max;
}
public static void main(String[] args) {

	int[][] ary = new int[3][3];
	System.out.println(high(ary));
	}
}
*/
/*
100
200
300
400
500
600
700
800
900//������� �Է� ��
900//���� ū �� ���
*/

//�ι�° ���
/*
public class study19{
	static void high(int [][]a, int b, int c) {

		int max=0;
		
		for(int i=0;i<b;i++) {
			for(int j=0;j<c;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
}

public static void main(String[] args) {

	int[][] ary=new int[3][3];
	Scanner s=new Scanner(System.in);
	
	for(int i=0;i<ary.length;i++) {
		for(int j=0;j<ary[i].length;j++) {
			ary[i][j]=s.nextInt();
		}
	}
	high(ary,3,3);
	}
}
*/
/*
1
2
3
4
5
6
7
8
9
9
*/
/*
3. ���� main()�� ���� �ڵ带 �ۼ��ض�. (Cal�� �������̽�, a,b,�� �� ������ �Է¹޾� a���� b���� ����)
Cal c= new Show();

System.out.println(c.cal(a,b));
*/
/*
interface Cal{
	abstract int cal(int a, int b);
}
class Show implements Cal {
	int sum=0;
	
	public int cal(int a, int b) {
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}
}
public class study19{
	public static void main(String[] args) {
		int a,b;
		Cal c= new Show();
		
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		b= s.nextInt();
		System.out.println(c.cal(a,b));
	}
}
*/
/*
2
5
14	//2���� 5������ ����
*/

/*
4. ���� main()�� ���� GenŬ������ ������.
Gen<String> g=new Gen<String>(��seoul��,��busan��);

System.out.println(g.one());   //seoul ���

System.out.println(g.two());   //busan ���

System.out.println(g.three());  //false ��� (�� ���ڿ� ��)
*/
/*
class Gen<T>{
	T a,b;
	
	Gen(T a ,T b){
		this.a=a;
		this.b=b;
	}
	T one() {
		return a;
	}
	T two() {
		return b;
	}
	boolean three() {
		return a.equals(b);
	}	
}
public class study19 {
public static void main(String[] args) {

	Gen<String> g=new Gen<String>("seoul","busan");
	System.out.println(g.one()); //seoul ���
	System.out.println(g.two()); //busan ���
	System.out.println(g.three()); //false ��� (�� ���ڿ� ��)
	}
}
*/
//seoul
//busan
//false

/*
5. FileOutputStream�� �̿��Ͽ� byte[]�迭 �ӿ� ����ִ� ���̳ʸ� ���� fi.txt���Ͽ� �����ض�. 
   (byte b[]={1,2,3,4,5}; ���ʱ�ȭ)
/*
public class study19 {
public static void main(String[] args) {
	
	byte b[]={1,2,3,4,5};
	try {
        FileOutputStream fout = new FileOutputStream("fi.txt"); //���� ��� ��Ʈ�� ����
        	
        	for (int i=0; i<b.length; i++)//���� ����
        		fout.write(b[i]);
        	fout.close();//���� ��Ʈ�� �ݱ�
		} catch(IOException e) {}
		System.out.println("fi.txt�� �����߽��ϴ�.");
	}
}
*/
/*
5.1 ������ �� ���� �о�ͼ� ����ض�.
*/
/*
public class study19 {
public static void main(String[] args) {

	byte b[] = new byte[5];
    try {
        FileInputStream fin = new FileInputStream("fi.txt"); // �Է� ���� ��Ʈ�� ����
        int n = 0, c; //���� �б�
        
        while ((c = fin.read()) != -1) { //���� �б�
            b[n] = (byte) c;
            n++;
        }
        System.out.println("fi.txt���� ���� �迭�� ����մϴ�."); // ���� ���� �ֿܼ� ����ϱ�
       
        for (int i = 0; i < b.length; i++) // ���� ���� �ֿܼ� ����ϱ�
            System.out.print(b[i] + " ");
        	System.out.println();

        	fin.close(); // ���� �Է� ��Ʈ�� �ݱ�
    	} catch (IOException e) { // ��ȸó��
    	}
	}
}
*/
//fi.txt���� ���� �迭�� ����մϴ�.
//1 2 3 4 5 


/*
6.�̹��� ������ �ٿ�޾������ӿ� �����ض�.(for�� ����ؼ� ����)
*/
/*
public class study19 extends JFrame{
	
	ImageIcon[] ii= {
			new ImageIcon("C://Users//Administrator//Desktop/chicken.jpg"),
			new ImageIcon("C://Users//Administrator//Desktop/DJANGO.png"),
			new ImageIcon("C://Users//Administrator//Desktop/ramen.jfif")};
		
	study19() {
	setTitle("�̹��� for�� ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
		
	//ImageIcon in[] = new ImageIcon[3];
	JLabel j[]=new JLabel[3];
		for (int i=0; i<j.length; i++) {
		j[i]=new JLabel(ii[i]);
		
		c.add(j[i]);
		
		setVisible(true);
		setSize(500,400);
		}	
}
public static void main(String[] args) {
	
	new study19();
	}
}
*/

/*
7. Main()�� ���� �Լ� �����ض�. ( �迭 ����� ���)



 int [] arr={1,2,3,4,5};

 int [] r;

 r=add(arr,5)
*/
/*
public class study19 {
	static int[] add(int ary[],int a) {
		int sum =0;
			for(int i =0; i< a; i++) {
				sum+=ary[i];
			}
			System.out.println(sum);	//15
			return ary;
		}
	public static void main(String[] args) {
	
		int [] arr={1,2,3,4,5};
		int [] r;
		r=add(arr,5);
	}
}
*/
/*
public class study19 extends JFrame{
	int num1, num2, num3;
	
	study19(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		setSize(300,300);
		setTitle("��������");
		setVisible(true);
		
		JButton btn1 = new JButton(""+num1);
		JButton btn2 = new JButton(""+num2);
		JButton btn3 = new JButton(""+num3);
		JLabel jl = new JLabel("��� : ");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(jl);
		
		c.requestFocus(); //Ű �̺�Ʈ�� ���� ������Ʈ�� ������ ����
		c.setFocusable(true); //Ű �̺�Ʈ�� ��Ŀ���� ���� �� �ִ� ������Ʈ�� ���� �� ���� �� �켱������
							  //�Է¹ޱ� ���� ����
		setVisible(true);
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					num1 = (int)(Math.random()*5);
					btn1.setText(""+num1);
					
					num2 = (int)(Math.random()*5);
					btn2.setText(""+num2);
					
					num3 = (int)(Math.random()*5);
					btn3.setText(""+num3);
					
					int temp = (num1&num2)&num3;
					
					if(num1==num2&&num1==num3) {
						jl.setText("��� :��÷ ");
					}else {
						jl.setText("��� :�� ");
					}
				}
			}
		});
	}
	public static void main(String[] args) {
		new study19();
	}
}
*/

/*
public class study19{
	public static void main(String[] args) {
		
		Vector<Integer> v=
				new Vector<Integer>();
		v.add(new Integer(5));	//�⺻ ���� 5�� ��üȭ ���� ���Ϳ� ����
		v.add(5); //�̷��� ��� �ڵ� �ڽ̵ȴ�.
		v.add(10);
		v.add(0,20); //�ε��� 0�� 20�� �ְڴ�.
		System.out.println(v.size()); //������ ���
		
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);	//���Ϳ��� ���� ��
			System.out.println(n);
		}
	}
}
*/
/*
4
20
5
5
10
*/

/*
class Xy{
	private int x,y;
	Xy(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {	//��ü�� ���ڿ��� �����ϴ� �Լ�
		return x+" "+y;
	}
}
public class study19{
	public static void main(String[] args) {
		
		//angle blacket => <Ŭ������>
		Vector<Xy> v =
				new Vector<Xy>();
		v.add(new Xy(4,7));		//0
		v.add(new Xy(5,9));		//1
		v.add(new Xy(10,11));	//2
		v.remove(2); //�ε��� ��  //v.add(new Xy(10,11)); ��� �ȵ�
		
		for(int i=0;i<v.size();i++) {
			 Xy x=v.get(i);	//���Ϳ��� ���� ��
			System.out.println(x);
		}
	}
}
*/
//4 7
//5 9

/*
public class study19{
	public static void main(String[] args) {
		
		ArrayList<String> a=
				new ArrayList<String>();
		a.add("����");
		a.add("����");
		a.add("����");
		
		for(int i=0; i<a.size(); i++) {
			String b=a.get(i);
			System.out.println(b);
		}
	}
}
*/
//����
//����
//����

/*
public class study19{
	public static void main(String[] args) {

		ArrayList<String> a=
				new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			String str=s.next();
			a.add(str);//�̸� ���� ArrayList��
			String st=a.get(i);
			System.out.println(st);
		}
	}
}
*/
/*
���Ͽ�
���Ͽ�
������
������
�����
�����
*/

//5�� ���� ���� �Է¹޾� ���Ϳ� �����Ѵ�.
//������ �� �� ���� ���� ���� ����Ѵ�.
/*
public class study19{
	static void big(Vector<Integer> v) {
		int min=v.get(0);
		for(int i=1;i<v.size();i++) {
			if(min>v.get(i)) {
				min=v.get(i);
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {

		Vector<Integer> v = 
				new Vector<Integer>();
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int n=s.nextInt(); //�� �� �Է��� ������
			v.add(n);	//���Ϳ� ����
			
		}
		big(v);	
	}
}
*/
/*
1
2
3
4
5
1 //���� ���� min �� ���
*/

/*
public class study19{
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
	    	v.add(1);
	        v.add(2);
	        v.add(3);
	        v.add(4);
	        v.add(5);
	        
	        for(int i=0; i<v.size(); i++) {
	            System.out.println(v.get(i));
	        }
		}    
}
*/
/*
1
2
3
4
5
*/

/*
public class study19{
	public static void main(String[] args) {

		  Vector<Integer> v = new Vector<Integer>();
	        v.add(1);
	        v.add(2);
	        v.add(3);
	        v.add(4);
	        v.add(5);
	        
	        v.remove(1);
	        
	        for(int i=0; i<v.size(); i++) {
	            System.out.println(v.get(i));
	        }
	}
}
*/
/*
1
3
4
5
*/

/*
public class study19{
	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("Hello");
		v.add(new Integer(4));
		v.add(new Double(3.14));
		System.out.println("���� ���� ��� ��ü ��: "+v.size());
		System.out.println("������ ���� �뷮: "+v.capacity());
		
		for(int i=0; i<v.size();i++) {
			Object obj=v.get(i);
			if(obj instanceof String) {
				String str = (String)obj;
				System.out.println(str);
			}
			else if(obj instanceof Integer) {
				Integer x = (Integer)obj;
				int n= x.intValue();
				System.out.println(n);
			}
			else if(obj instanceof Double) {
				Double y= (Double)obj;
				double d = y.doubleValue();
				System.out.println(d);
			}
		}
	}
}
*/
/*
���� ���� ��� ��ü ��: 3
������ ���� �뷮: 10
Hello
4
3.14
*/


//Iterator ��?
//Iterator�� �ڹ��� �÷��� �����ӿ����� �÷��ǿ� ����Ǿ� �ִ� ��ҵ��� �о���� ����� ǥ��ȭ �Ͽ��µ� 
//�� �� �ϳ��� Iterator�̴�.

//Iterator�� �������̽��ε� �� ������ ���캸��.
/*
public interface Iterator {

boolean hasNext();

Object next();

void remove();

}
*/
/*
boolean hasNext() �޼ҵ�� �о� �� ��Ұ� �����ִ��� Ȯ���ϴ� �޼ҵ��̴�. 
������ true, ������ false�� ��ȯ�Ѵ�.

Object next() �޼ҵ�� �о� �� ��Ұ� �����ִ��� Ȯ���ϴ� �޼ҵ��̴�. 
������ true, ������ false�� ��ȯ�Ѵ�.

void remove() �޼ҵ�� next()�� �о� �� ��Ҹ� �����Ѵ�.
next() �� ȣ���� ������ remove() �� ȣ���ؾ� �Ѵ�. (������ ����̶� ����ص� �׸� ������� �ʾƵ� �׸��̴�)


/*
public class study19{
	public static void main(String[] args) {

		Vector<Integer> v=
				new Vector<Integer>();
		v.add(3);
		v.add(4);
		v.add(6);
		
		Iterator<Integer> it=v.iterator();
		while(it.hasNext()) {
			int n=it.next();	//���� �����͸�  n�� ����
			System.out.println(n);
		}
	}
}
*/
/*
3
4
6
*/

/*
public class study19{
	public static void main(String[] args) {
		//������ �߰��ؼ� iterator�� ���
		LinkedList<String> li=
				new LinkedList<String>();
		
		li.add("�ȳ�");
		li.add("���Ͽ�");
		li.add("������");
		li.add("�����");
		
		Iterator<String> it = li.iterator();
        while(it.hasNext())
        {
            String n = it.next();
            System.out.println(n);
        }
	}
}
*/
/*
�ȳ�
���Ͽ�
������
�����
*/

//(����("A", "B", "C")�� �Է¹޾�(String) 5
//ArrayList�� �����ϴ�.
//"A" -> good
//"B" -> not bad
//"C" -> bad
/*
public class study19{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		ArrayList<String> a = 
				new ArrayList<String>(); 
		
		for(int i=0;i<5;i++) {
			a.add(s.next());
		}
		for(int i=0;i<a.size();i++) {
			switch(a.get(i)) {
			case "A":
				System.out.println("good");
				break;
			case "B":
				System.out.println("not bad");
				break;
			case "C":
				System.out.println("bad");
				break;
			}
		}
	}
}
*/
/*
A
A
B
B
C
good
good
not bad
not bad
bad
*/

//vector���� ���� 3�� ���Ƿ� �����ϰ� ���� ����ض�. (iterator ���)
/*
public class study19{
	public static void main(String[] args) {
		
		 Vector<Integer> v = new Vector<Integer>();
		 
		 v.add(1);
		 v.add(2);
		 v.add(3);
		 
		 
		Iterator<Integer> it = v.iterator();
	    int total = 0;  
		while(it.hasNext())
	        {
	            int n = it.next();
	            total+=n;
	        }
		 	System.out.println(total);//6
		}
}
*/

/*
public class study19{
	public static void main(String[] args) {

		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", 1);
		fruits.put("banana", 2);
		fruits.put("kiwi", 3);

		System.out.println("get(apple): " + fruits.get("apple"));
		System.out.println("get(kiwi): " + fruits.get("kiwi"));
		System.out.println("get(undefined): " + fruits.get("undefined"));

		// get(apple): 1
		// get(kiwi): 3
		// get(undefined): null
	}
}
*/

/*
public class study19{
	public static void main(String[] args) {
		
		HashMap<Integer, String> h=
				new HashMap<Integer, String>();
		h.put(1,"��ö");
		h.put(2,"ȿ��");
	
		System.out.println(h.get(1)); //key���� �����ָ� value �� ���
		System.out.println(h.get(2)); //key�� �������� �� ���
	}
}
*/
//��ö
//ȿ��

/*
public class study19{
	public static void main(String[] args) {

		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", 1);
		fruits.put("banana", 2);
		fruits.put("kiwi", 3);

		System.out.println("remove(apple): " + fruits.remove("apple"));
		System.out.println("remove(kiwi): " + fruits.remove("kiwi"));
		System.out.println("remove(undefined): " + fruits.remove("undefined"));
		System.out.println("fruits: " + fruits);

		// remove(apple): 1
		// remove(kiwi): 3
		// remove(undefined): null
		// fruits: {banana=2}
	}
}
*/

/*
public class study19{
	public static void main(String[] args) {

		HashMap<String, String> h=
				new HashMap<String, String>();
		
		h.put("��","water");
		h.put("Ŀ��","coffee");
		h.put("Ƽ","tea");
	
		Set<String> keys=h.keySet();//��� Ű�� set�÷��ǿ��� �޾ƿ��ڴ�. �� , Ŀ��, Ƽ
									//{��,Ŀ��,Ƽ} �������·� �����ϰڴ�.
		Iterator<String> it=
				keys.iterator();
		
		while(it.hasNext()) {
			String a=it.next();	//Ű
			String b=h.get(a);	//Ű�� �´� ��
			System.out.println(a+" "+b);
		}
	}
}
*/
/*
Ƽ tea
Ŀ�� coffee
�� water
*/

/*
public class study19{
	public static void main(String[] args) {
	
		Map<String,String> map=new HashMap<>(); 
		map.put("id_0123","1234"); 
		map.put("id_0124","1234"); 
		map.put("id_0125","4567"); 
		map.put("id_0126","0515"); 
		//����ڷκ��� id�� ��й�ȣ�� �Է¹��� �� ���� Ȯ���Ͽ� 
		//�޼��� ȭ�鿡 �Ѹ��� 
		Scanner sc=new Scanner(System.in); 
		while(true) { 
			System.out.println("id�� passwd �Է����ּ���"); 
			System.out.println("id : "); 
			String id=sc.nextLine(); 
			System.out.println("passwd : "); 
			String passwd=sc.nextLine(); 
			
			if(!map.containsKey(id)) { 
				System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�. �ٽ� �Է��� �ּ���"); 
				continue; 
			}else { 
				if(!(map.get(id)).equals(passwd)) { 
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���"); 
				}else { 
					System.out.println("id�� ��й�ȣ ��ġ"); 
					break; 
				} 
			}
		}
	}
}
*/
/*
id�� passwd �Է����ּ���
id : 
id_0123
passwd : 
1234
id�� ��й�ȣ ��ġ
*/


//id, ��й�ȣ �ΰ� ���� �־ => hashmap
//��й�ȣ�� (�ΰ�)���
/*
public class study19{
	public static void main(String[] args) {
	
		HashMap<String, Integer> h =
				new HashMap<String, Integer>();
		h.put("aa", 1234);
		h.put("bb", 5678);
		System.out.println(h.get("aa"));
		System.out.println(h.get("bb"));
	}
}
*/
//1234
//5678

/*
public class study19{
	public static void main(String[] args) {
	
		Map<String, Integer> h =
				new HashMap<String, Integer>();//��ĳ����.. Map(�θ�) HashMap(�ڽ�)
		h.put("aa", 1234);
		h.put("bb", 5678);
		System.out.println(h.get("aa"));
		System.out.println(h.get("bb"));
	}
}
*/
//1234
//5678

/*
public class study19{
	public static void main(String[] args) {
	
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		// �ؽ� ���̺� Ű�� �� ���� �ֱ�
		ht.put("abc", 1);
		ht.put("abc1", 2);
		ht.put("abc2", 3);


		// �ؽ� ���̺� �ִ� �� ��������
		Enumeration en = ht.keys();

		while(en.hasMoreElements())
		{
		String key = en.nextElement().toString();
		System.out.println(key + " : "+ht.get(key));
		}
	}
}
*/
/*
abc2 : 3
abc1 : 2
abc : 1
*/

/*
public class study19{
	public static void main(String[] args) {

		HashMap h=new HashMap();
		h.put("jun", "123");
		h.put("jihye", "234");
		h.put("sangwoon", "345");
		
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("id, pw �Է��ϼ��� ");
			String id = s.next();
			String pw = s.next();
			if(!h.containsKey(id)) { //�ؽøʿ� id�� ����ִ��� Ȯ�� //containsKey
				System.out.println("id�� �������� �ʳ׿�");
				continue;//id�ٽ� �Է���.. ���� �ö�!!
			}
			else {	//id�� ���� ��� //equals, get
				if(!(h.get(id)).equals(pw)) {
					System.out.println("�����ȣ�� ��ġ���� �ʳ׿�");
				}
				else {//��й�ȣ ¦�� �°� �Է���
					System.out.println("�α���");
				}
				break;
			}	
		}
	}
}
*/
/*
id, pw �Է��ϼ��� 
jun
123
�α���
*/
/*
id, pw �Է��ϼ��� 
aa
123
id�� �������� �ʳ׿�
id, pw �Է��ϼ��� 
*/
/*
id, pw �Է��ϼ��� 
jun
456
�����ȣ�� ��ġ���� �ʳ׿�
*/

//hashmap<a,123>
//       <b,234>
//�ΰ� �ֱ�
//�ܾ� �Է�: Ű �� �Է�
//Ű�� �´� ���� �������� ��� 
//Ű ���� �ؽøʿ� ������� ������ ���� �ܾ�
/*
public class study19{
	public static void main(String[] args) {
	
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("�ظ�", "h");
		h.put("��", "r");
		h.put("��ȣ��", "k");
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			String str=s.next();
			String st=h.get(str);
			
			if(st==null) {
				System.out.println("���� �ܾ�");
			}
			System.out.println(st);
		}
	}
}
*/
/*
�ظ�
h
*/
/*
a
���� �ܾ�
null
*/


