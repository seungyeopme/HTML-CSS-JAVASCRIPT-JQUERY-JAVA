package y2020.month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.*;







/*
class Stu{
	String a,b;
	Stu(String a, String b) {
		this.a=a;
		this.b=b;
	}
	public String toString() { //��ü�� ���ڿ��� ����ϴ� �Լ�
		return a+" "+b;
	}
}
public class study18 {
	public static void main(String[] args) {
	
		Stu s=new Stu("pink", "juli");
		System.out.println(s); //s�� ��ü
	}
}
*/
//pink juli

/*
abstract class Mul{
	int a,b;
	abstract int multi(int a, int b);
}
class M extends Mul{
	int a,b;
	int multi(int a, int b) {
		this.a=a;
		this.b=b;
		int mul=1;
		for(int i=1; i<=b; i++) {
			mul*=a;
		}
		return mul;
	}
}

public class study18 {
	public static void main(String[] args) {
		//Mul�� �߻� Ŭ����
		Mul m=new M();
		System.out.println(m.multi(2,10));
		//2�� 10��
	}
}
*/

/*
public class study18 {
	public static void main(String[] args) {
		//���ѹݺ��� �ȿ� 1~3������ �� ������ �ְ�
		//���� �� ���� �� ���� ���� ��������ּ���
		int ary[]=new int[3];
		while(true) {
			for(int i=0; i<ary.length;i++) {
				ary[i]=(int)(Math.random()*3)+1;
				System.out.print(ary[i]);	
			}
			System.out.println();
			if(ary[0]==ary[1]&&ary[1]==ary[2]) {
				break;
			}
		}
	}
}
*/
/*
122
311
313
232
112
113
232
111
*/

/*
class Text implements ActionListener{
	JTextArea jt;
	Text(JTextArea jt){
		this.jt=jt;
	}
	public void actionPerformed(ActionEvent e) {
		jt.setText("������! ");
		jt.append("���� �Է�: "); //JTextArea�� ����
	}
}
public class study18 {
	public static void main(String[] args) {

		JFrame j=new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt=new JTextArea(10,20);
		jt.append("���� �Է�: ");
		jt.setLineWrap(true);//�ڵ� �� �ٲ� ���� ����
		
		JButton b=new JButton("���� ��ư");
		b.addActionListener(new Text(jt));
		
		j.add(b);
		j.add(jt);
		
		j.setVisible(true);
	}
}
*/
//error
/*
class study18 extends JFrame{
    String[] fruits={"apple", "banana", "kiwi", 
    				"mango", "pear", "peach", 
    				"berry", "strawberry", "blackberry"};
    ImageIcon[] images={new ImageIcon("C://Users//Administrator//Desktop"
										+ "/JAVA.jpg"), 
    					new ImageIcon("C://Users//Administrator//Desktop"
								+ "/PYTHON.jfif"), 
    					new ImageIcon("C://Users//Administrator//Desktop"
								+ "/NODE.png"), 
    					new ImageIcon("C://Users//Administrator//Desktop"
								+ "/DJANGO.png")};
    study18(){
        this.setTitle("����Ʈ ����� ����");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        JList strList = new JList(fruits);
        this.add(strList);
        
        JList imageList = new JList(images);
        this.add(imageList);
        
        JList scrollList = new JList(fruits);
        this.add(new JScrollPane(scrollList));
        
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setVisible(true);
    }
}
*/

/*
public class study18 extends JFrame {
	String[]s = {"ġŲ","���","�ڹ�"};
	ImageIcon[] im = {new ImageIcon("C://Users//Administrator//Desktop"
			+ "/chiken.jpg"), 
					new ImageIcon("C://Users//Administrator//Desktop"
			+ "/ramen.jfif"),
			new ImageIcon("C://Users//Administrator//Desktop"
			+ "/JAVA.jpg")
	};
	
	JLabel j=new JLabel(im[0]);
	study18() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox com=new JComboBox(s);
		
		c.add(com); c.add(j);
		
		com.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox c=(JComboBox)e.getSource();//�ٿ�ĳ���� 
													//getSource�� Object Ŭ����
				int i=c.getSelectedIndex();//�޺��ڽ��� ���õ� ������ �ε��� �˾Ƴ���
				j.setIcon(im[i]);//�׸� ���� �� setIcon.. ���� ���� �� setText
				
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
        new study18();
    }
}
*/

/*
1. ���� main�Լ��� ���� �ۼ��ض�.
main(){

   Thread th1=new MovieThread();

   th1.start();

   Thread th2=new Thread(new MusicThread());

   th2.start();

������) ��ȭ�� ����մϴ�.��ȭ�� ����մϴ�. ��ȭ�� ����մϴ�.

                 ������ ����մϴ�. ������ ����մϴ�. ������ ����մϴ�.

(th2�� ���� ���ü��� ����, ������ ���)
*/
/*
class MovieThread extends Thread {
public void run() {
	for (int i = 0; i < 3; i++) {
		System.out.print("��ȭ�� ����մϴ�.");
	}
	System.out.println();
	}
}
class MusicThread implements Runnable {
public void run() {
	for (int i = 0; i < 3; i++) {
		System.out.print("������ ����մϴ�.");
	}
	System.out.println();
	}
}
public class study18 extends Thread {
	public static void main(String[] args) {
		 //��Ƽ ������ ����
		 Thread th1=new MovieThread(); //�Ű������� ������ Thread ��ӹ޾Ƽ� ����
		 th1.start();
		 Thread th2=new Thread(new MusicThread()); //�Ű������� ���� �ÿ��� Runnable�� ����
		 th2.start();
	}
}
*/
//��ȭ�� ����մϴ�.��ȭ�� ����մϴ�.��ȭ�� ����մϴ�.
//������ ����մϴ�.������ ����մϴ�.������ ����մϴ�.


/*
2. ���ڿ� ��1+2+3+4+5���� ��+���� �����ؼ� ���� 15�� ����ض�

(StringTokenizer,parseInt, trim() �� ���)
*/
/*
public class study18 extends Thread {
	public static void main(String[] args) {
		
		String source = "1+2+3+4+5";
		StringTokenizer st = new StringTokenizer(source, "+");
		int total = 0;
		while(st.hasMoreTokens()) {
			String a=st.nextToken();
			String b=a.trim();
		//"1 2 3 4 5"
			
			total+=Integer.parseInt(b);
		}
		
		System.out.printf("�� �������� ����: %d\n", total);
	}
}
*/
//�� �������� ����: 15

/*
3. 1~100���� �������Է¹޾� 3,6,9 �� �ϳ��� �ִ� ��� ��¦��, �� �� �ִ� ��� ��¦¦��,
�ϳ��� ������ ������������ض�.

(�������� 39��� �� ��, n/10=3, n%10=6 �� ���´�.   (/, % ������ Ȱ��))

���� ���) �Է�:39               

¦¦
*/
/*
public class study18  {
	public static void main(String[] args) {

		int j;
		for(j=0;j<100;j++){//j�� 0���� 100���� ���� ��� �Ʒ� ������ �ݺ��Ѵ�.

			if((j==3||j==6||j==9)|| //j�� 3�̰ų� 6�̰ų� 9�϶�
					((j%10==3||j%10==6||j%10==9)&&(j/10!=3&&j/10!=6&&j/10!=9))||
					//�Ǵ� j�� 1�� �ڸ��� 3�̰ų� 6�̰ų� 9�̰� 10�� �ڸ��� 3,6,9�� �ƴҶ�
					((j/10==3||j/10==6||j/10==9)&&(j%10!=3&&j%10!=6&&j%10!=9))){
				//�Ǵ� j�� 10�� �ڸ��� 3�̰ų� 6�̰ų� 9�̰� 1�� �ڸ��� 3,6,9�� �ƴҶ�
				System.out.println(j+".¦!!"); // �׶��� j ���� �ڼ� �ѹ�!! �� ����Ѵ�.
			}

			else if((j%10==3||j%10==6||j%10==9)&&(j/10==3||j/10==6||j/10==9)){
				// j�� 1,10�� �ڸ��� ��� 3,6,9 �� �ϳ��϶�
				System.out.println(j+".¦¦!!");
				// �׶��� j ���� �ڼ� �ι�!! �� ����Ѵ�.
		
			}else {
				System.out.println(j+".��!!");
			}
		}
	}
}
*/
/*
public class study18  {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		int a=n/10;//3
		int b=n%10;//9
		
		if(a%3==0 || b%3==0) {
			if(a%3==0 && a!=0) {
				System.out.println("¦");
			}
			else if(b%3==0 && b!=0) {
				System.out.println("¦");
			}
		else if(b%3==0 && b!=0)
			System.out.println("��");
		}}}

*/
/*
4.  ����Ʈ���� ������ ���������� �ϰ�, Ok, Cancel ��ư�������� frame�ϳ� ������

 Ok��ư�� ������ ��Ȯ�Ρ�, Cancel�� ������ ��ư�� ��Ȱ��ȭ ���Ѷ�.

(MouseAdapter�� ����)

*/
/*
public class study18 extends JFrame{
	public static void main(String[] args) {
	
		JFrame j=new JFrame();
		j.setSize(500,500);
		Container c=j.getContentPane();
		j.setLayout(new FlowLayout());
		c.setBackground(Color.red);
		JButton b=new JButton("Ok");
		JButton b1=new JButton("Cancel");
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Ȯ��");
			}
		});
		b1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				b1.setEnabled(false);
			}
		});
		j.add(b); 
		j.add(b1);

		j.setVisible(true);
	}
}
*/

/*
5. ������ư �̸��� ��magenta��, ��red�� �ΰ��� �����ϰ�magenta�� ������ ��ư�� ���� magenta��, 
red�� ������ red������ �����ض�
*/
/*
public class study18 extends JFrame{
	public static void main(String[] args) {
	
		JFrame j=new JFrame();
		j.setSize(500,500);
		Container c=j.getContentPane();
		j.setLayout(new FlowLayout());
		
		JRadioButton b=new JRadioButton("magenta");
		JRadioButton b1=new JRadioButton("red");
		
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				b.setBackground(Color.magenta);
			}
		});
		b1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				b1.setBackground(Color.red);
			}
		});
		j.add(b); 
		j.add(b1);

		j.setVisible(true);
	}
}
*/

/*
6. JLabel j=new JLabel(��Hi);

���� j�� ���콺�� Ŭ���ϸ� ���ȳ硱�̶�� �ٲٴ� �ڵ带 �ۼ��ض�.
*/
/*
public class study18 extends JFrame{
	
	study18(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		setSize(500,300);
		
		JLabel j=new JLabel("Hi");
		j.addMouseListener(new MouseListener() {

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			j.setText("�ȳ�");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			}
		});
		
		c.add(j);
		setVisible(true);
}
public static void main(String[] args) {

	new study18();
	}
}
*/
/*
7. main()�Լ��� ����Ŭ���� Book�� �����ض�.

 main(){

   Book b1=new Book(���ڹ١�);

   b1.title();            //�ڹٴ� 40000��

   Book b2=new Book(�����̽㡱, 30000);

   b2.title();           //���̽� 30000��

 }
*/
/*
class Book{
	String a;
	int b;
	Book(String a){
		this(a,40000);
	}
	Book(String a, int b){
		this.a=a;
		this.b=b;
	}
	void title(){
		System.out.println(a+" "+b+"��");
	}
}
public class study18{
	public static void main(String[] args) {

		Book b1=new Book("�ڹ�");
		b1.title();            //�ڹٴ� 40000��

		Book b2=new Book("���̽�", 30000);
		b2.title();           //���̽� 30000��
	}
}
*/
//�ڹ� 40000��
//���̽� 30000��

/*
public class study18 extends JFrame{
	study18() {
		JLabel j=new JLabel("hi",SwingConstants.CENTER);
		
		j.setHorizontalAlignment(j.LEFT);	//JLabel ��ġ ����
		j.setHorizontalTextPosition(j.LEFT);
		this.add(j);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new study18();
	}
}
*/

/*
class A implements Runnable{
	public void run() {
		System.out.println("������ ����");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
public class study18 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("�ƹ��ų� �Է��ض�");
		s.next();
		
		Thread t = new Thread(new A());//�Ű������� ���� �ÿ��� Runnable�� ����
		t.start();
	}
}
*/

//Thread Ŭ���� ��� �޾�
//������� 10�� �Ŀ� �ڵ����� �����ϴ� �����带 �ۼ��϶�.
//yellow -> 10����  -> red 
/*
public class study18 extends JFrame {
	study18() {
		setVisible(true);	//JFram�� �����ִ�!
		Th t=new Th();	//�Ű������� ������ Thread ��� �޾Ƽ� ����
		t.start();
	}
	class Th extends Thread{
		public void run() {
			//����Ʈ �� yellow
			getContentPane().setBackground(Color.yellow);
			try {
				sleep(10000); //10��
			}catch(Exception e) {
				return;
			}
			getContentPane().setBackground(Color.red);
		}
	}
	public static void main(String[] args) {
	
		new study18();
	}	
}
*/

/*
public class study18 extends JFrame{
	
	public study18() {
		// TODO �ڵ� ������ ������ ����
		setTitle("�̺�Ʈ");// Ÿ��Ʋ 
		setSize(1280,720); //â�� ũ��
		setVisible(true); //â�� ȭ�鿡 ���̰� ����
		setResizable(false); //â�� ũ�⸦ �������� ���ϰ� ����
		setLocationRelativeTo(null); // â�� �����Ҷ� ��� ��Ÿ���� ����
		JButton b1=new JButton("�����̴� ��ư"); //��ư�� �ϳ� ����
		setLayout(null);
		//��ư�� �����̰� ����
		addKeyListener(new KeyAdapter() { //Ű �̺�Ʈ
			@Override
			public void keyPressed(KeyEvent e) { //Ű ��������
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {//Ű �ڵ�� ����ġ
				case KeyEvent.VK_DOWN: //����Ű(�Ʒ�) ��������
					b1.setLocation(b1.getX(), b1.getY()+10);
					break;
				case KeyEvent.VK_UP: //����Ű(��)��������
					b1.setLocation(b1.getX(), b1.getY()-10);
					break;
				case KeyEvent.VK_LEFT:// ����Ű(��)��������
					b1.setLocation(b1.getX()-10, b1.getY());
					break;
				case KeyEvent.VK_RIGHT:// ����Ű(����)��������
					b1.setLocation(b1.getX()+10, b1.getY());
					break;
				default:
					break;
				}
			}
		});
		b1.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ
			@Override
			public void mouseEntered(MouseEvent e) { // ���콺 ��������
			}

			@Override
			public void mouseExited(MouseEvent e) { // ���콺 ��������
			}

			@Override
			public void mousePressed(MouseEvent e) { // Ŭ��������
				System.exit(0);
			}
		});
		b1.setBounds(0, 0, 150, 30); //��ư�� ũ�� ��ġ ����
		add(b1); //��ư�� �����ӿ� �߰�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//â�� ���������� ����ǰ� ����
	}
	public static void main(String[] args) {
		new study18(); //����
	}
}
*/

/*
class Ex5 extends JFrame{
    Ex5(){
        this.setTitle("��� ����");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GamePanel p = new GamePanel();
        this.add(p);
        
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        this.setResizable(false);
        this.setVisible(true);
        p.startGame();
    }
}

class GamePanel extends JPanel{
    TargetThread targetThread;
    JLabel base = new JLabel();
    JLabel bullet = new JLabel();
    JLabel target;
    //AudioClip sound;
    GamePanel(){
        this.setLayout(null);
        base.setSize(40,40);
        base.setOpaque(true);
        base.setBackground(Color.black);
        
        ImageIcon img = new ImageIcon("C://Users//Administrator//Desktop/chicken.jpg");
        target = new JLabel(img);
        //�̹��� ũ�⸸ŭ ���̺� ũ�� ����
        target.setSize(img.getIconWidth(),img.getIconHeight());
        
        bullet.setSize(10,10);
        bullet.setOpaque(true);
        bullet.setBackground(Color.red);
        this.add(base);
        this.add(target);
        this.add(bullet);
        
        //URL url = Ex5.class.getResource("LASER.wav");
        //sound = Applet.newAudioClip(url);
    }
    public void startGame(){
        base.setLocation(this.getWidth()/2-20, this.getHeight()-40);
        bullet.setLocation(this.getWidth()/2-5, this.getHeight()-50);
        target.setLocation(0, 0);
        
        //Ÿ���� �����̴� ������
        targetThread = new TargetThread(target);
        targetThread.start();
        
        //���̽��� ������ �ΰ� ����Ű �Է¿� ���� bullet������ ����
        base.requestFocus();
        base.addKeyListener(new KeyListener(){
            BulletThread bulletThread = null;
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyChar()==KeyEvent.VK_ENTER){
                    //�����尡 �׾��ִ� �������� Ȯ��
                    if(bulletThread==null || !bulletThread.isAlive()){
                        //sound.play();
                        //�Ѿ˷� Ÿ���� ������� Ȯ���ϱ� ���� 2���� ���̺�� Ÿ�ٽ����带 �Ѱ��ش�.
                        bulletThread = new BulletThread(bullet,target,targetThread);
                        bulletThread.start();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
            
        });
    }
    
    class TargetThread extends Thread{
        JLabel target;
        TargetThread(JLabel target){
            this.target=target;
            target.setLocation(0, 0);
        }
        public void run(){
            while(true){
                int x=target.getX()+5;//5�ȼ��� �̵�
                int y=target.getY();
                
                //������ ������ �������
                if(x>GamePanel.this.getWidth())
                    target.setLocation(0, 0);
                //������ �ȿ� ������� 5�ȼ��� �̵�
                else
                    target.setLocation(x, y);
                
                //0.02�ʸ��� �̵�
                try{
                    sleep(20);
                }
                //�����尡 �װԵǸ� �ʱ� ��ġ�� ��ġ�ϰ�, 0.5�ʸ� ��ٸ���.
                catch(Exception e){
                    target.setLocation(0, 0);
                    try{
                        sleep(500);
                    }
                    catch(Exception e2){}
                }
            }
        }
    }
    
    class BulletThread extends Thread{
        JLabel bullet,target;
        Thread targetThread;
        
        public BulletThread(JLabel bullet, JLabel target, Thread targetThread){
            this.bullet=bullet;
            this.target=target;
            this.targetThread=targetThread;
        }
        
        public void run(){
            while(true){
                if(hit()){//Ÿ���� �¾Ҵٸ�
                    targetThread.interrupt();//Ÿ�� �����带 ���δ�.
                    //�Ѿ��� ���� ��ġ�� �̵�
                    bullet.setLocation(bullet.getParent().getWidth()/2-5, bullet.getParent().getHeight()-50);
                    return;//�Ѿ� �����嵵 ���δ�.
                }
                else{
                    int x=bullet.getX();
                    int y=bullet.getY()-5;//5�ȼ��� ���� �̵��Ѵ�.=�Ѿ� �ӵ��� 5�ȼ�
                    //�Ѿ��� ������ ������ ������ ��
                    if(y<0){
                        //�Ѿ� ���� ��ġ�� �̵�
                        bullet.setLocation(bullet.getParent().getWidth()/2-5, bullet.getParent().getHeight()-50);
                        return;//�Ѿ� �����带 ���δ�.
                    }
                    //�Ѿ��� ������ �ȿ� ������ 5�ȼ��� �̵��Ѵ�.
                    else
                        bullet.setLocation(x, y);
                }
                //0.02�ʸ��� 5�ȼ��� �̵�
                try{
                    sleep(20);
                }
                
                catch(Exception e){}
            }
        }
        
        private boolean hit(){
            int x=bullet.getX();
            int y=bullet.getY();
            int w=bullet.getWidth();
            int h=bullet.getHeight();
            
            if(targetContains(x,y)
                    ||targetContains(x+w-1,y)
                    ||targetContains(x+w-1,y+h-1)
                    ||targetContains(x,y+h-1))
                return true;
            else
                return false;
        }
        private boolean targetContains(int x, int y){
            //Ÿ���� x��ǥ�� �Ѿ� x��ǥ���� �۰ų� ������ �Ѿ� x��ǥ���� Ÿ�� x��ǥ + Ÿ���� ���� ���̰� ũ�� 
            if(((target.getX()<=x)&&(x<target.getX()+target.getWidth()))   
                    //Ÿ���� y��ǥ�� �Ѿ� y��ǥ���� �۰ų� ������ �Ѿ� y��ǥ���� Ÿ�� y��ǥ + Ÿ���� ���� ���̰� ũ��
                    &&((target.getY()<=y)&&(y<target.getY()+target.getHeight())))
                return true;
            
            else
                return false;
        }
    }
}
public class study18 {
    public static void main(String[] args) {
        new Ex5();
    }
}
*/

/*
public class study18 extends JFrame{
	JLabel j=new JLabel("���ڿ�");
	study18(){
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus();//����Ʈ �ҿ� ��Ŀ�� ����
						 //Ű �Է� �����ϵ���
		
	}
	class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int a=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			int c=(int)(Math.random()*256);
			
			switch(e.getKeyChar()) {
			//�Էµ� �ϳ��� ���� ����
			case '\n':
				j.setText(a+" "+b);
				getContentPane().setBackground(new Color(a,b,c));
				
				break;
			case 'p':
				System.exit(0);	//���α׷� ����
			}
		}
	}
    public static void main(String[] args) {
    	new study18();
    }
}
*/

//�˾� ���̾�α�

//1)�Է� ���̾�α�
//JOptionPane.showInputDialog()
//"Ok"��ư�� ������ �Է��� ���� ����
//"Cancel"�� �����ų� â�� ������ null�� ����
/*
public class study18 extends JFrame{
	study18(){
		JTextField j=new JTextField();
		//�˾� ���̾�α�
		String name=JOptionPane.showInputDialog("�̸���?");
		j.setText(name);
		setVisible(true);
	}
	 public static void main(String[] args) {
		 new study18();
	 }
}
*/

//�˾� ���̾�α�

//1)�Է� ���̾�α�
//JOptionPane.showInputDialog()
//"Ok"��ư�� ������ �Է��� ���� ����
//"Cancel"�� �����ų� â�� ������ null�� ����

//2)Ȯ�� ���̾�α�
//JOptionPane.showConfirmDialog()

//2)�޽��� ���̾�α�
//JOptionPane.showMessageDialog()

/*
public class study18 extends JFrame{
	study18(){
		setTitle("���̾�α�"); //Ÿ��Ʋ ����
		Container c = getContentPane();
		c.add(new Dia(), BorderLayout.NORTH);
		setVisible(true);
	}
	class Dia extends Panel { 
		JButton j = new JButton("�̸� �Է�"); //��ư��: �̸� �Է�
		JTextField j1=new JTextField(10);
		JButton j2 = new JButton("Ȯ��");
		JButton j3 = new JButton("�޽���");
		
		Dia() {
			setBackground(Color.blue);
			add(j);
			add(j1);
			add(j2);
			add(j3);
			
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=
						JOptionPane.showInputDialog("�̸� �Է�");
				if(name!=null) {	//�̸��� �Է��ߴ�.
					j1.setText(name);
				}
				
			}
		});
		
		j2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int r= JOptionPane.showConfirmDialog
						(null, "��� �� �̴ϱ�?", "Ȯ��", 
								JOptionPane.YES_NO_OPTION);
				if(r==JOptionPane.CLOSED_OPTION) {
					j1.setText("���� ���߽��ϴ�.");
				}
				else if(r==JOptionPane.YES_OPTION) {
					j1.setText("��");
				}
				else
					j1.setText("�ƴϿ�");
			}
		});
		j3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog
				(null, "���","�޽���",JOptionPane.ERROR_MESSAGE);
			}
		});
		
		}
	}
	 public static void main(String[] args) {
		 new study18();
	 }
}
*/


//���׸�(������) -> ���ø�(������)
//generic < > 
//< > => angle blancket�̶�� �θ���.

//�÷��� �����ӿ�ũ(Vector, ArrayList, Map, Set)
/*
class Java{
	String title;
	Java(String t){
		title=t;
	}
	void show() {
		System.out.println(title);
	}
}
class DB{
	int n;
	DB(int n){
		this.n=n;
	}
	void pr() {
		System.out.println(n);
	}
}
class Program<T>{	//������ <> : ���׸� ��ȣ
	T t; 
	void in(T t) {	//void in\(A a) 
		this.t=t;
	}
	T get() {	//��ȯ���� T
		return t;
	}
}
public class study18{
	 public static void main(String[] args) {
		 
		 Program<Java> p=new Program<Java>();
		 p.in(new Java("java"));
		 Java j=p.get();	//j�� Java Ŭ������ ��ü
		 j.show();	//java
	
		 Program<DB> d=new Program<DB>();
		 d.in(new DB(3));
		 DB dd=d.get();
		 dd.pr();	//3
	 }
}
*/

/*
class AA{
	public String toString() {
		return "AA";
	}
}
class BB{
	public String toString() {
		return "BB";
	}	
}
class In{
	<T> void show(T t) {	//Ŭ������ ��ü�� 	//���ʸ� �޼ҵ�
		System.out.println(t);
	}
	void show() {	
		System.out.println("generic");
	}
}
public class study18{
	 public static void main(String[] args) {
		 //���׸�  Ŭ����, ���׸� �޼ҵ�
		 AA a=new AA();
		 BB b=new BB();
		 In i=new In();
		 
		 i.<AA>show(a);
		 i.<BB>show(b);
		 i.show();	
	}
}
*/
//AA
//BB
//generic

//���׸��� �迭 ���
/*
public class study18{
	static <T> void show(T[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
	 
		 String[] str=new String[] 
				 {"java", "db", "c++"};
		 show(str);
	}
}
*/
//java db c++ 

/*
class Cont<T>{
	T t;
	
	void set(T t) {
		this.t=t;
	}
	T get() {
		return t;
	}	
}
public class study18{
	public static void main(String[] args) {
	
		Cont<String> c1=new Cont<String>();
		c1.set("����");
		String s=c1.get();
		System.out.println(s);//����
		
		Cont<Integer> c2=new Cont<Integer>();
		c2.set(5);
		int s2=c2.get();
		System.out.println(s2);//5	
	}
}
*/
//����
//5

/*
public class study18{
	public static void main(String[] args) {
	
		Stack<String> stack = new Stack<String>(); //Generics�� �̿��Ͽ� Collection�� ������ ������ Ÿ�� ����
		for(int i=0;i<3;i++)
			stack.push("Hi-"+i); //stack�� �����͸� �����ϴ� ����
		
		//stack = ["Hi-0", "Hi-1", "Hi-2"], top=2
		
		System.out.println(stack.pop()); //������ ����� ���� ��ȯ�ϰ� �����Ѵ�.             Hi-2
		System.out.println(stack.peek()); //������ ����� ���� ��ȯ�Ѵ�.                  Hi-1
		System.out.println(stack.search("Hi-1")); //���� �����ϸ� 1, �ƴϸ� -1�� ����Ѵ�.    1
		System.out.println(stack.isEmpty()); //������ ��������� true�� ����Ѵ�.         false
		System.out.println(stack);			//[Hi-0, Hi-1]
	}
}
*/

/*
public class study18{
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(3); //3
		stack.push(2); //3, 2
		System.out.println(stack.pop()); //2�� ���, ���ÿ��� 3
		stack.push(6); //3, 6
		stack.push(8); //3, 6, 8
		System.out.println(stack.peek()); //���� �ֱٿ� ������ ���� 8 
		System.out.println(stack.search(6));//�� ��° ������ �����
		while(stack.empty()==false){
			System.out.println(stack.pop());//8, 6, 3 ������ ����
		}
	}
}
*/
//2
//8
//2
//8
//6
//3

/*
class St<T>{
	int i;
	Object [] ary;
	St() {
		i=0;
		ary=new Object[10]; //�迭 10�� ����
	}
	void push(T t) {
		if(i==10) {	//�ε����� �� �� ������ 
			return;	//����
		}
		ary[i]=t;
		i++;
	}
	T pop() {
		if(i==0) {	//������ ����־� ������ ���� ����
			return null; 	//�ƹ��͵� �������� �ʴ´�.
		}
		i--;	//���ÿ� ���� ������
		return (T)ary[i]; //Object���� T������ �ٿ� ĳ����
	}
}
public class study18{
	public static void main(String[] args) {

		St<String> s= new St<String>();
		s.push("abcd");
		s.push("efgh");
		s.push("ijkl");
		for(int i=0; i<3; i++) {
			System.out.println(s.pop());
		}
	}
}
*/
//ijkl
//efgh
//abcd

/*
class St<T>{
	int i;
	Object [] ary;
	St() {
		i=0;
		ary=new Object[10]; //�迭 10�� ����
	}
	void push(T t) {
		if(i==10) {	//�ε����� �� �� ������ 
			return;	//����
		}
		ary[i]=t;
		i++;
	}
	T pop() {
		if(i==0) {	//������ ����־� ������ ���� ����
			return null; 	//�ƹ��͵� �������� �ʴ´�.
		}
		i--;	//���ÿ� ���� ������
		return (T)ary[i]; //Object���� T������ �ٿ� ĳ����
	}
}
public class study18{
	public static void main(String[] args) {

		St<Double> s= new St<Double>();
		s.push(1.5);
		s.push(2.5);
		s.push(3.5);
		for(int i=0; i<3; i++) {
			System.out.println(s.pop());
		}
	}
}
*/
//3.5
//2.5
//1.5

/*
class study18 extends JFrame {
    JProgressBar progress;
     
// JProgressBar Ŭ���� Ư¡ 1.���� �ð��� �ɸ��� �۾��� �Ҷ� ���� �����Ȳ�� �ð������� ǥ���ϱ� ���� 
//�뵵�� ���Ǵ� Ŭ�����̴�.
     
    public study18() {
        setLayout(new FlowLayout());// ��ġ������ ����
        progress = new JProgressBar();
        // �ּҰ��� 0,�ִ밪�� 100���� ǥ��
        // progress.setValue(0);//0���� ����.���� ��������
        // ǥ��
        progress.setStringPainted(true);
        // true�� �����ϸ� ���� �����Ȳ�� %�� ǥ����.
        add(progress);// ���� �����������쿡 ���α׷�����
        // ��ġ
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
        progress_start();// progress_start()�޼��带
        // ȣ��
    }// ������ ����
 
    public void progress_start() {
        int i;
        try {
            for (i = 1; i <= 100; i++) {
                progress.setValue(i);
                Thread.sleep(37);// �и������� ������
                // �����ð��� ����.
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }// progress_start()��
public static void main(String[] args) {
        new study18();// �����ڸ� ȣ��
    }
}
*/
