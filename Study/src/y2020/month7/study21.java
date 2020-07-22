package y2020.month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;





/*
public class study21 {
	public static void main(String[] args) throws IOException {
		
		InputStream i=null;	//Stream���� ������ ���� ����Ʈ ����
		OutputStream o=null;
		
		byte [] b = new byte[]{1,2,3};
		i=new ByteArrayInputStream(b);
		o=new FileOutputStream("a.txt");
		
		int r=-1;
		while((r=i.read())!=-1) {
			o.write(r);
		}
		o.close();
		i.close();
	}
}
*/

/*
public class study21 {
	public static void main(String[] args) {
	
		HashMap<Integer,String> h
			= new HashMap<Integer,String>();
		h.put(4,"bb");
		h.put(5,"cc");
		h.put(8,"bb");
		
		Scanner s=new Scanner(System.in);
		//Ű���� �Է¹޾� 4 bb
		//Ű���� �Է¹޾� 7 ���� ����
		for(int i=0;i<3;i++) {
			int n=s.nextInt();
			String str=h.get(n);
			if(str==null) {
				System.out.println("���� ����");
		}
		else 
			System.out.println(str);
		}
	}
}
*/
/*
8
bb
5
cc
7
���� ����
*/

//�̹��� ������
/*
public class study21 extends JFrame {
	study21() {
		Container c=getContentPane();
		ImageIcon i=new ImageIcon("C://Users//Administrator//Desktop/chicken.jpg");
		JLabel j=new JLabel(i);
		c.add(j);
	
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new study21();
	}
}
*/

/*
class Person{
	private String name;
	private int id;
	
	Person(String n, int i) {
		name=n;
		id=i;
	}
	//getname, getid
	String getname(){
		return name;
	}
	int getid(){
		return id;
	}
	public boolean equals(Object obj) {
		//Person��ü
		Person p=(Person)obj; //down casting
		 if((p.getid()==this.id)&&(p.getname().equals(this.name))){
				return true;
		 		}
				return false;
		} 
}
class Game{
	Scanner s=new Scanner(System.in);
	//Person Ŭ���� vector
	Vector<Person> v=new Vector<Person>(5);
	Game() {	//�ʱ�ȭ ����
		v.add(new Person("����",123));
		v.add(new Person("����",456));
		v.add(new Person("��ö",789));
		v.add(new Person("����",112));
	}
	void in() {
		while(true) {
			System.out.println("�̸�, id �Է�");
			String name=s.next();
			if(name.equals("stop")) {
				break;
			}
			int id=s.nextInt();
			Person pp=new Person(name,id);	//��ü ����
			
//			contains(Object o)
//			Returns true if this vector contains the specified element.
			if(v.contains(pp)) {	//vector �ȿ� pp��� ��ü�� ������
				System.out.println(pp.getname()+"�� �̹� �ִ�.");
			}
			else
				v.add(pp);	
		}
	}	//���Ϳ� ���� ������
	void out() {
		while(true) {
			Random r=new Random();
			int n=r.nextInt(v.size());
			Person p=v.get(n);
			String str=p.getname();
			
			System.out.println(str+"id��?");
			int id=p.getid();
			Scanner s=new Scanner(System.in);
			int i=s.nextInt();
			if(i==-1) {
				break;
			}
			if(i==p.getid()){
				System.out.println("����");
			}
			else
				System.out.println("���� �ƴ�");
		}
	}
	void end() {
		System.out.println("����");
		System.exit(0); //���α׷� ����
	}
}
public class study21{
	public static void main(String[] args) {
		
		Game g=new Game();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("1,2,3");
			//1: �Է�(in �Լ�)
			//2: out�Լ�
			//3: end
			int select=s.nextInt();
			switch(select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}
	}
}
*/

/*
public class study21 {
	public static void main(String[] args) {
		
		Set<Integer> s=
				new HashSet<Integer>();
		
		s.add(new Integer(3));	//������ �̷��� �����־�� ������
		s.add(4);	//�ڵ� ��ڽ� ����� �־ �̷��Ե� �����ϴ�!
		s.add(3);
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
//�ߺ� ���� �� ����!! HashSet�� Ư¡
/*
3
4
*/

//TreeSet�̶�?
/*
TreeSet�� �����˻�Ʈ����� �ڷᱸ���� ���·� �����͸� �����ϴ� �÷��� Ŭ�����̴�. ���� �˻� Ʈ����
����, �˻�, �����˻��� ���� ������ ���̴� ������ TreeSet�� ���� �˻� Ʈ���� ������
����Ų ����-��-Ʈ���� �����Ǿ� �ִ�. �׸��� Set �������̽��� �����߱� ������ �ߺ���
�������� ������ ������� ������, ���ĵ� ��ġ�� �����ϹǷ� ���� ������ ���������� �ʴ´�.
*/

/*
1. LinkedList�� "one","two","three"�� �����Ѵ�. 
���� �� Iterator�� �ݺ��� ��(while) ��three����� �ܾ ���̸�(comepareTo�Լ� ���) �����ض�.
*/
/*
public class study21 {
	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		
		Iterator<String> it = li.iterator(); //Iterator ���� 
		while(it.hasNext()){//�������� �ִ��� üũ
		    String str=it.next();
			if (str.compareTo("three")==0) {
				it.remove();
			}
		}
		it=li.iterator();
		while(it.hasNext()) {
		
			System.out.println(it.next()); //�� ���
		}
	}
}
*/
//one
//two

/*
2. HashMap�� (1,"one"),(2,"two"),(3,"three")�� �����Ͽ� Ű, ���� �� ����Ѵ�.��� ��, 
1�� �Է��ϸ� one, 2�� �Է��ϸ� two, 3�� �Է��ϸ� three�� ��µ� �� �ְԲ� �ڵ带 �ۼ��ض�.
*/
/*
public class study21 {
	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();//HashMap����
	
		map.put(1,"one"); //�� �߰�
		map.put(2,"two"); //�� �߰�
		map.put(3,"three"); //�� �߰�
		
		System.out.println(map); //��ü ��� //{1=one, 2=two, 3=three}
		
		Scanner s=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int i=s.nextInt();
		
		if(i==1) {
			System.out.println(map.get(1));
			}else if(i==2) {
				System.out.println(map.get(2));
			}else if(i==3) {
				System.out.println(map.get(3));
			}
	}
}
*/

/*
public class study21 {
	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();//HashMap����
	
		map.put(1,"one"); //�� �߰�
		map.put(2,"two"); //�� �߰�
		map.put(3,"three"); //�� �߰�
		
		System.out.println(map); //��ü ��� //{1=one, 2=two, 3=three}
		
		Scanner s=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int i=s.nextInt();
		
		Set<Integer> key=map.keySet();
		
		Iterator<Integer> it=key.iterator();
		
		while(it.hasNext()) {
			String oo=map.get(i);
			System.out.println(oo);
			break;
		}
	}
}
*/
/*
{1=one, 2=two, 3=three}
���� �Է��ϼ���
1
one
*/

/*
3. File �޴��� �޴� ������ ������ ������.(Load, Hide, Exit)

Load�� �����ϸ� �̹���(����)�� ����, Hide�� �����ϸ� �̹����� ������ �ʰ��Ѵ�. Exit�� �����ϸ� ���α׷��� �����ϵ��� �ۼ��ض�.
*/
/*
public class study21 extends JFrame{
	study21(){
		setSize(500,500);
		setLayout(new FlowLayout());
		
		JMenuBar m=new JMenuBar();
		
		JMenu mn=new JMenu("File");
		String str[]= {"Load","Hide","Exit"};

		JMenuItem mi[]=new JMenuItem[3];

		for(int i=0;i<mi.length;i++) {
			mi[i]=new JMenuItem(str[i]);
			mn.add(mi[i]);
		}

		setJMenuBar(m);
		m.add(mn);
		ImageIcon i=
				new ImageIcon("C://Users//Administrator//Desktop/chicken.jpg");

		JLabel l=new JLabel(i);
		
		add(l); 
		l.setVisible(false);

		mi[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setVisible(true);
			}
		});
		mi[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.setVisible(false);
			}
		});
		mi[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
}
	static int[] make() {
		int ary[];
		
		return ary=new int[]{0,1,2,3,4};
	}

public static void main(String[] args) {
	new study21();	
	}
}
*/

/*
4. 1���� ���� �迭[5]�� �����Ͽ� �����ϴ� make()�� �ۼ��ض�.

main(){

 int ary[];

 ary=make();

 for(int i=0;i<ary.length;i++){

   System.out.print(ary[i] + �� ��); }

������) 0 1 2 3 4 ���
*/
/*
public class study21 {
	
	static int[] make() {
		int ary[] = {0,1,2,3,4};
		return ary;
	}
	public static void main(String[] args) {
	
		 int ary[];

		 ary=make();

		 for(int i=0;i<ary.length;i++){

		   System.out.print(ary[i] +" "); }
	}
}
*/
//0 1 2 3 4 

/*
5. HashSet�� Person��ü�� �����Ѵ�. �й��� ������ ������ Person��ü�� �Ǵ��ϰ� �ߺ� ������ ���� �ʵ��� �ϰ� 
      �ڵ带 �ۼ��ض�.
Set<Person> s=new HashSet<Person>();

s.add(new Person(12, ��ȫ�浿��));

s.add(new Person(23, ����浿��));

s.add(new Person(12, ���̱浿��));

Iterator<Person> it=s.iterator();

while(it.hasNext()){

 Person p=it.next();

 System.out.println(p.num + �� �� + p.name);

}
*/
/*
class Person{
	int num;
	String name;
	Person(int num, String name) {
		this.num=num;
		this.name=name;
	}
	public int hashCode() {
		return num;
	}
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		return num==p.num;
	}
}
public class study21 {
	public static void main(String[] args) {
		Set<Person> s=new HashSet<Person>();

		s.add(new Person(12, "ȫ�浿"));
		s.add(new Person(23, "��浿"));
		s.add(new Person(12, "�̱浿"));

		Iterator<Person> it=s.iterator();

		while(it.hasNext()){

		 Person p=it.next();
		 System.out.println(p.num +" "+ p.name);
		}
	}
}
*/
//23 ��浿
//12 ȫ�浿


/*
6. Main()�� ���� �ڵ带 �ۼ��ض�.(c�� 1~5���� ��, d�� 1~10���� ��)
 int a[]={1,2,3,4,5};

 int b[]={6,7,8,9,10};

int c=add(a,5);

int d=add(a,5,b);

 System.out.println(c);

 System.out.println(d);
*/
//ù��° ���
/*
public class study21 {
	static int add(int a[], int b) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	static int add(int a[], int b, int c[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		for(int i=0; i<b; i++) {
			sum += c[i];
		}
		return sum;
	}
	public static void main(String[] args) {

		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		
		int c=add(a,5);
		int d=add(a,5,b);
		
		System.out.println(c);
		System.out.println(d);
	}
}
*/
//15
//55

//�ι�° ���
/*
public class study21 {
	static int add(int a[], int b) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	static int add(int a[], int b, int c[]) {
		return add(a,b)+add(c,b);
	}
	public static void main(String[] args) {

		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		
		int c=add(a,5);
		int d=add(a,5,b);
		
		System.out.println(c);
		System.out.println(d);
	}
}
*/
//15
//55

/*
7. Runnable�������̽��� �̿��Ͽ� �����带 �����ض�. ��������۵� 10�� �� �����ϰԲ� �ۼ��ض�.
*/
/*
class Th implements Runnable{
	String str;
	
	Th(String str){
		this.str=str;
	}
	public void run() {
		try {
			System.out.println(str);
			Thread.sleep(10000);
			System.exit(0);
		}catch (Exception e) {}
	}
}
public class study21 {
	public static void main(String[] args) {

		Th s=new Th("10�� �� ����");
		Thread t=new Thread(s);
		t.start();
	}
}
*/
//10�� �� ����

/*
8. GridLayout4�� 3���� ��ġ�ϰ� JLabel �� 12�� �����Ѵ�. 
       �ʱ� ������ �Ͼ������ �����ϰ�, ���̺� ���� ���콺�� Ŭ���ϸ� ���� �����ϰ� ä�������� ���α׷��� �ۼ��ض�. 
       ���� �ڵ带 �̿��ض�.

 int r=(int)(Math.random()*256);
 int g=(int)(Math.random()*256);
 int b=(int)(Math.random()*256);

*/
//GUI 1��° ���
/*
public class study21 {
	public static void main(String[] args) {
	
		JFrame j=new JFrame();
		j.setSize(500,500);
		j.setLayout(new GridLayout(4,3));
		
		Container c=j.getContentPane();
		c.setBackground(Color.white);
		
		JLabel l[]=new JLabel[12];
		
		for(int i=0;i<l.length;i++) {
			l[i]=new JLabel(Integer.toString(i));
			
			j.add(l[i]);
			
			l[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Container cc=j.getContentPane();
					
					int a=(int)(Math.random() * 256);
					int b=(int)(Math.random() * 256);
					int c=(int)(Math.random() * 256);
					
					cc.setBackground(new Color(a,b,c));
				}
			});
			j.setVisible(true);
		}
	}
}
*/

//GUI 2��° ���
/*
class ac extends MouseAdapter {
	int r = (int) (Math.random() * 256);
	int g = (int) (Math.random() * 256);
	int b = (int) (Math.random() * 256);

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel j = (JLabel) e.getSource();
		j.setBackground(new Color(r, g, b));
	}
}
class study21 extends JFrame {

	study21() {
		setLayout(new GridLayout(4, 3));

		JLabel[] j = new JLabel[12];
		
		Container c = getContentPane();

		for (int i = 0; i < 12; i++) {
			j[i]=new JLabel();
			j[i].setOpaque(true);
			j[i].setBackground(Color.WHITE);
			j[i].addMouseListener(new ac());
			c.add(j[i]);
		}

		setVisible(true);
	}

public static void main(String[] args) {

	new study21();
	}
}
*/

//GUI 3��° ���
/*
public class study21 extends JFrame {
	JLabel jl[]=new JLabel[12];
	int r,g,b;
	study21(){
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,3));
		this.setSize(500,500);
		for(int i=0; i<12; i++) {
			jl[i]=new JLabel(Integer.toString(i));
			jl[i]=new JLabel("���ڿ�");
			jl[i].setBackground(Color.white);
			
			jl[i].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JLabel la=(JLabel)e.getSource();
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				la.setOpaque(true);//���� ����
				
				la.setBackground(new Color(r,g,b));
			}
		});
			c.add(jl[i]);
			setVisible(true);
		}
	}
public static void main(String[] args) {

		new study21();
	}
}
*/

/*
public class study21{
	public static void main(String[] args) {
	//IP�ּ� ���� Ŭ����
		try {
			InetAddress i=InetAddress.getLocalHost();//getLocalHost()//ip �ּ� Ȯ��
			System.out.println("IP :"+i.getHostAddress());
		
			InetAddress[] ary=InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress a:ary) {
				System.out.println(a.getHostAddress());
			}
			
		}catch(Exception e) {}
	}
}
*/
/*
IP :172.16.7.69 //���� pc�� IP �ּ�
125.209.222.142 //���̹� IP �ּ�
125.209.222.141 //���̹� IP �ּ�
*/

//=========================================
// ���� 							Ŭ���̾�Ʈ

// ���������� ��������				���� ����
// Ŭ���̾�Ʈ�� ���� ��û�� ��ٸ�			���� ��û

// ���� ��û ����(accept())	
// ���� ����
//==========================================
// OutputStream					InputStream

/*
public class study21 extends JFrame{
	study21() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel j=new JLabel("������ ȭ����");
		c.add(j);
		
		j.setFont(new Font("����",Font.PLAIN,20));
		
		j.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()=='+') {
					JLabel j1=(JLabel)e.getSource();
					Font fo=j1.getFont();
					int s=fo.getSize(); //���� ũ�� �˾Ƴ�
					if(s<=3) 
						return;
					j1.setFont(new Font("����",Font.PLAIN,s-3));
				}
			}
		});
		j.setFocusable(true); //���ڿ��� ��Ŀ�� ���� �� �ֵ���
		j.requestFocus(); 	 //���ڿ��� Ű �Է� ��Ŀ�� ����
		
		this.setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new study21();
	}
}
*/
//+Ű�� ������ ���ڰ� �۾����� ����