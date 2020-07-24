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
		
		//문자열 입력해서 얻어냄
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
	
	String[] name = {"삽입","찾기"};
	
	JTextArea ta;
	
	study24() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		
		
		f1=new JTextField(10);
		f2=new JTextField(10);
		
		ta=new JTextArea(10,20);
		
		c.add(new JLabel("영어"));
		c.add(f1);
		c.add(new JLabel("한글"));
		c.add(f2);
		
		for(int i=0; i<2; i++) {
			b[i]=new JButton(name[i]);
			c.add(b[i]);
			
			b[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton b1=(JButton)e.getSource();
					
					if(b1==b[0]) {	//삽입 버튼 누르면
						if(h.containsKey(f1.getText())) {
							//영어단어
							h.put(f1.getText(), f2.getText());//두 개의 값을 해시맵에 삽입
						}
						else { //텍스트필드에 삽입할 값이 안들어 있을 경우
							h.put(f1.getText(), f2.getText());
							ta.setText(ta.getText()+"삽입"+
							f1.getText()+","+f2.getText()+"\n");
						}
					}
					else { //찾기 버튼 눌렀을 때
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
	public String toString() {	//객체를 문자열로 반환
		return str;	
	}
}
public class study24{
	public static void main(String[] args) {
		
		ArrayList<Per> al=new ArrayList<Per>();
		
		al.add(new Per ("aa"));
		al.add(new Per("bb"));
		al.add(new Per("cc"));
		
		//aa, bb, cc 전부 출력
		Iterator it = al.iterator(); //Iterator 선언 
		while(it.hasNext()){//다음값이 있는지 체크
		    System.out.println(it.next()); //값 출력
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
 
    void drive() { //운전하는 기능
        System.out.println("drive, brrrr~");
    }
 
    void stop() { // 멈추는 기능
        System.out.println("stop!!!");
    }
}
 
 
class FireEngine extends Car {  // 소방차
    void water() {              // 물 뿌리는 기능
        System.out.println("warter!!!");
    }
}
 
class Ambulance extends Car {  // 앰뷸런스
    void siren() {             // 사이렌을 울리는 기능
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
	
		//상속 받아서 구현
		Man m1=new Man(40);
		Man m2=new Man1(20,"홍길순");
		
		m1.show(); //40
		m2.show(); //20, 홍길순
	}
}
*/

/*
 무한루프 안에 두 정수를 입력받아 합을 구하고, 실수를 입력하면 "실수는 안된다"라고 출력하고,
 다시 두 정수를 입력받는 코드를 작성해라.
 
 실행결과) 두 정수 입력: 3 3.5
                 실수는 안된다.
                 두 정수 입력: 3 5
 */
/*
public class study24{
	public static void main(String[] args) {
		
		while(true) {
			Scanner s=new Scanner(System.in);
			
			System.out.println("두 정수 입력");
			
			try {
				int a=s.nextInt();
				int b=s.nextInt();
				
				int result=a+b;
				System.out.println("결과:"+result);
				break;
			}
			catch(Exception e){
				System.out.println("실수는 안된다");
			}
		}
		
	}
}
*/
/*
두 정수 입력
10 1.5
실수는 안된다
두 정수 입력
10 20
결과:30
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
				System.out.println("실수 안됨");
				s.nextLine();
				continue;
			}
		}
	}
}
*/
/*
1.5 2
실수 안됨
1 5
6
*/

/*
 저는 자바를 좋아하고 잘합니다.
 
 이 문자열을 test03.txt 파일에 저장하라.
 */
/*
public class study24{
	public static void main(String[] args) {
		
		try {
		    OutputStream output = new FileOutputStream("test03.txt");
		    String str ="저는 자바를 좋아하고 잘합니다.";
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
		
		//객체 배열[3]까지 생성
		//반지름 입력받아서 배열에 저장한 후 면적 출력
		
		Circle[] c=new Circle[3];//객체배열: 객체가 많을 때 묶어줌!
		
		Scanner s=new Scanner(System.in);
		
		for (int i=0; i<c.length;i++) {
			c[i]=new Circle(s.nextDouble());//반지름 입력받아서 저장하는 작업(3번 입력)
			System.out.println(c[i].area());//면적 값 구함
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
		
		
		Double a= new Double(5.5); // 실수 5.5를 박싱
		String s=Double.toString(a);// 박싱된 5.5를 문자열로 변경
		Double b=new Double(s); // 문자열 5.5를 언박싱
		
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
	public boolean equals(Object obj) { //필드 값 비교할 때 사용하는 메소드
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
			System.out.println("같다");
		else 
			System.out.println("다르다");
	}
}
*/
//같다

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
		
		//인터페이스  Poi
		//추상메소드는 show
		
		Poi p=new Point();
		p.show("방탄",50000);
		p.show("BTS");	
	}
}
*/
//방탄50000
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

		At a=new At(1,10); //1~10까지 출력
		Bt b=new Bt(11,20);	//1~20까지 출력
		
		//strart 쓰기
		try {
		a.start();
		a.join();	//쓰레드 끼어들지 못하도록 실행
		
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

//컴퓨터공학 20
//obj.txt에 객체 저장
//객체 직렬화 ObjectOutputStream
/*
class Student implements Serializable{
	String a;
	int b;
	
	Student(String a, int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+" "+b); //컴퓨터공학 20
	}
}
public class study24 {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		// ObjectOutputStream 을 이용한 객체 파일 저장
		ObjectOutputStream o=
				new ObjectOutputStream(new FileOutputStream("obj.txt"));
		
		//Student에 학과 나이를 입력하여 객체 생성
		Student s=new Student("컴퓨터공학",20);
		
		o.writeObject(s); //Student의 객채 s 저장
		s.show();
		o.close();
	}
}
*/

//j1 => 초록
//j2 => 파란
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
		int m=0;//최대값 변수 초기화
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
		//2행 3열로 임의의 값으로 초기화
		int [][] score = {{1,2,3},
						  {4,5,6}};
		int high=get(score);
		System.out.println("최대값"+high);//최대값6
	}
}
*/
