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
import java.util.Scanner;

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