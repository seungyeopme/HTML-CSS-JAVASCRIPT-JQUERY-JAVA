package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
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
	
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	
	j.add(b1);
	j.add(b2);
	
	b1.addItemListener(new ItemListener() {		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED)
				b1.setVisible(false);
			else
				b1.setVisible(true);
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


