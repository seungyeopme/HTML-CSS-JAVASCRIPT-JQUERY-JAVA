package y2020.month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
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
  
		JLabel j=new JLabel("おはようございます");
  
		ImageIcon i=new ImageIcon
				("C://Users//Administrator//Desktop"
								+ "/JAVA.jpg");
		JLabel j1=new JLabel(i);
		JLabel j2=new JLabel("수요일이네요",SwingConstants.CENTER);
  
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

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;






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
//	  JButton j1=new JButton("버튼 1");
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
	    //컨테이너 red
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
		
		JCheckBox j=new JCheckBox("커피");
		JCheckBox j1=new JCheckBox("티");
		
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
	//객체배열
	String [] menu = {"라떼", "아메리카노", "그린티"};
	JLabel total;	//총합 계산
	
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
		total.setText("현재"+sum+"원");
	}
}
public static void main(String[] args){ 
	  new study17();
	}
}
*/
/*
1.다음을 한줄의 코드로 작성해라.
1.1Boolean 값 false를 “false”라는 문자열로 변환해라.
1.2 문자열 “36.5”를 double 타입 실수로 변환해라.
1.3 문자열 “35”를 정수 35로 변환해라.
*/
/*
//첫번째 방법
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
//두번째 방법
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

2. 컨텐트팬의 배경색을 blue색으로 하고, Ok, Cancel, Get 버튼을 부착한 프로그램 작성해라.
*/
/*
public class study17 extends JFrame{
    public study17()
    {
        //content pane에 대한 reference변수를 잡고
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.blue);
        contentPane.setLayout(new FlowLayout());
        //버튼을 만듬
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
2.1 Ok 버튼을 누르면 컨텐트팬 색을 orange, Cancel 버튼을 누르면 버튼을 비활성화시키고 Get 
     버튼을 누르면 버튼의 위치(x,y)값을 출력해라.
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
3. Main()를 보고 main()에 Object In, OutputStream을 만들고, 클래스도 따로 구현해라.
	Person p=new Person(“Jack”, “computer”, 20, 123);
	p.show();   //데이터 다 출력하는 함수
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
		p.show();   //데이터 다 출력하는 함수
	
		o.close();*/
		
		/*ObjectInputStream i=	//읽어 오는 과정
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
4. 3개의 Circle 객체 배열을 만들고 x, y, r값을 읽어 3개의 Circle객체를 만들어show()함수에서 다 출력해라.
class Circle{

   private double x,y;

   private int r;

   Circle(double x, double y, int r){

          this.x=x;  this.y=y; this.r=r; }

   void show(){

     System.out.println(x + “ “ +y + “ “ +r);}}

실행결과) x,y,r : 1.0 1.0 4

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

//Java transient이란?
//transient는 Serialize하는 과정에 제외하고 싶은 경우 선언하는 키워드입니다.

/*
5. 다음은 Person인터페이스이다. Worker, Student클래스 작성해라.
interface Person{

    String work(); }



public class 클래스명{

 static void pr(Person p){

    System.out.println(p.work()); }

main(){

pr(new Worker());     // 일한다

pr(new Student());    //공부한다 출력
*/
/*
interface Person{
	String work(); 
}
class Worker implements Person{
	public String work() {
		return "일한다";
	}
}
class Student implements Person{
	public String work() {
		return "공부한다";
	}
}
public class study17 {
	
	static void pr(Person p){
		System.out.println(p.work()); 
	}
	
	public static void main(String[] args) {
	
		pr(new Worker());     // 일한다
		pr(new Student());    //공부한다 출력
	}
}
*/
//일한다
//공부한다

/*
6. 다음 main()를 보고 추상 클래스와추상메소드 작성해라.
   (total 함수는 배열 값(1,2,3,4,5) 총합 리턴받는 함수)

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
		
		Ab c=new Cd(); //Ab 부모 Cd 자식   //업캐스팅..자식을 부모 쪽으로!!*/
		
		/*
		P p=new P();  //부모
		A a=new A();  //자식
		a=(A)p;       //다운 캐스팅..부모에서 자식 쪽으로!! 하려면 앞에 클래스명을 붙여준다.(형변환)
		*/
		
		
//		System.out.println(c.total(new int []{1,2,3,4,5}));	//15
//	}
//}


/*
interface Stack{
    int length();
    Object pop(); //삭제
    boolean push(Object ob); //삽입
}
 
class StringStack implements Stack{
    private String[] element;
    private int index;
 
    public StringStack(){ //초기화
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

//인터페이스로
//total함수는 추상메소드로 하지 말고 일반 메소드로 구현
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
    	Ab c=new Cd(); //Ab 부모 Cd 자식   //업캐스팅..자식을 부모 쪽으로!!
    	System.out.println(c.total(new int []{1,2,3,4,5}));	//15
    }
}
*/

/*
//JRadioButton 중복 선택 불가능
public class study17 extends JFrame{
	study17(){
		JRadioButton j1= new JRadioButton("짜장면");
		JRadioButton j2= new JRadioButton("짬뽕");
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
	 JRadioButton j1=new JRadioButton("짜장면");
	 JRadioButton j2=new JRadioButton("탕수육");

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
			System.out.println("짜장면");
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
