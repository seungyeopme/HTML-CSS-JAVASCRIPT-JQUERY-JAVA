package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



//연산자 하나(하나의 문자) 입력받아
//두 개 정수 입력받아 연산자대로 (+, -)출력
/*		
public class study22 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        float num1;    //실수형
        float num2;
        String oper; //문자열
        String con;
        boolean a; //논리값
        
        do{
            System.out.print("숫자 입력 : ");
            num1 = sc.nextFloat();
            a = true;
            do {
                System.out.print("연산자 입력 : ");
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
                        System.out.print("연산자를 다시 입력해주세요 \n ");                
                    }                
                }while(a);
                
            System.out.print("숫자 입력 : ");
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
                System.out.print("처음부터 다시 입력해주세요 \n ");
                continue;              
            }
        
            System.out.print("계산을 계속 하시려면  y 혹은 Y를 입력해 주세요 : ");
            con = sc.next();
            if(con.equals("y") || con.equals("Y") ){
                continue;
                }
                else{
                    System.out.println("종료합니다.");
                    break;
                }    
            }while(true);
    }
 }
*/



//콘손 창에 입력해주세요 -> inputStreamreader
//파일 명은 마음대로
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
		//p1은 상속받아 출력
	}
}
*/
//10
//20 juli

/*
public class study22 {
	public static void main(String[] args) {

	//버튼 두개 만들어
	//제목은 임의로 주고
	//하나의 버튼 누르면 안보이게
	//하나의 버튼 누르면 버튼의 위치 값 getx, gety
	
	JFrame j= new JFrame("jframe");
	j.setSize(500,500);
	j.setLayout(new FlowLayout());
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	
	j.add(b1);
	j.add(b2);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			b1.setVisible(false);
			
		}
	}); 	
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(b2.getX());
			System.out.println(b2.getY());
			
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
		//1 옆에 뜨도록
		this.add(j1);
		
		this.setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new study22();
	}
}
*/


//ArrayList에 문자열 세개 추가
//가장 긴 단어 출력
/*
public class study22{
	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		s.add("오하요고자이마스");
		s.add("곤니찌와");
		s.add("곰방와");
		
		int max=0;
		for(int i=1; i<s.size(); i++) {
			if(s.get(i).length()>s.get(max).length()) {
				max=i;
			}
		}
		System.out.println(s.get(max));//오하요고자이마스
	}
}
*/

/*
public class study22 extends JFrame {
	JButton j=new JButton("Cal");	//전역
	JLabel jl=new JLabel("계산 출력");	//전역
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
				a.setVisible(true); //다이어로그
				}
		});
	}
		class Aa extends JDialog{
			JTextField f1=new JTextField(15);
			JTextField f2=new JTextField(15);
			
			JButton j2=new JButton("ADD");
			Aa() {
				setLayout(new FlowLayout());
				add(new JLabel("두 수를 더합니다"));
				add(f1);
				add(f2);
				add(j2);
				setSize(350,250);
				j2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						setVisible(false);//다이어로그창은 종료됨
					
						//텍스트 필드에 적은 값 가져와서 두 수 더함
						//더한 후 프레임에 띄우기
						
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
1. 다음 main()을 보고 pr함수와 show함수를 작성해라.(Number는 클래스명)
Main(){

Number.pr(100);

Number n=new Number();

n.show(3.14);}
*/
//static 메소드 문제
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
2. 프레임에 임의의 정수(1~50)범위에서 수 하나를 띄우고, 
버튼 “+5”, “-5”, “/5”버튼을 만들어 +5를 누르면 임의의 수에서 +5한값을 띄우고, 
나머지 버튼도 알맞은 연산을 하도록 구현해라. 버튼은 단 한번밖에 못누른다.
*/
//첫번째 방법
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
//두번째 방법
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
		c.add(j);	//임의의 정수 부착
		setVisible(true);
		this.setSize(500,500);
		
		Aa a=new Aa();
		for(int i=0;i<3;i++) {
			jb[i]=new JButton(str[i]);
			//버튼 세개에 이름부착
			jb[i].addActionListener(a);
			c.add(jb[i]);//컨테이너에 버튼 세개 부착
		}
		
}
class Aa implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		
		int num=Integer.parseInt(j.getText());//임의의 정수 갖고옴
		
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

//[JAVA] Comparable과 Comparator를 이용한 오름차순 
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
		t.add(new Stu("미미",96));
		t.add(new Stu("두두",100));
		t.add(new Stu("히히",50));
		//오름차순으로 정렬해서 출력
		
		 Iterator<Stu> iterator = t.iterator();
	        while(iterator.hasNext()){
	            Stu s = iterator.next();
	            System.out.println(s.getName() + "  :  " + s.getAge());
	        }
	}
}
*/
//히히  :  50
//미미  :  96
//두두  :  100

/*
3. HashMap인터페이스 구조(이름, 성적)<String, Integer>로 설정해 임의의 값 3개 해쉬맵에 저장한다. 
      저장 후 평균 점수와 최고점수, 최고 점수를 받은 이름을 출력해라.

(entrySet, getKey, getValue 메소드 이용)
*/
/*
public class study22{
	public static void main(String[] args) {
		
		HashMap<String, Integer> h= new HashMap<String,Integer>();
		
		h.put("김자바",new Integer (90));
		h.put("강자바",new Integer (85));
		h.put("이자바",new Integer (55));

		Set set= h.entrySet(); // 키 와 값을 set형태로 저장
		Iterator it = set.iterator();

		while(it.hasNext()){
		Map.Entry e = (Map.Entry)it.next();

		System.out.println("이름: " +e.getKey() +", 점수 : "+e.getValue());


		}

		set=h.keySet(); // 키를 set값에 저장
		System.out.println("참가자 명단 : " +set);

		Collection v = h.values(); //값을 컬랙션으로 저장한다.
		it = v.iterator();

		int total = 0;

		while (it.hasNext())
		{
		Integer i = (Integer)it.next();
		total += i;// total += i.intValues(); 같은말
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total/set.size());
		System.out.println("최고점수 : " + Collections.max(v));
		System.out.println("최저점수 : " + Collections.min(v));
	}
}
*/
/*
이름: 김자바, 점수 : 90
이름: 강자바, 점수 : 85
이름: 이자바, 점수 : 55
참가자 명단 : [김자바, 강자바, 이자바]
총점 : 230
평균 : 76.666664
최고점수 : 90
최저점수 : 55
*/
/*
public class study22{
	public static void main(String[] args) {
		
		HashMap<String, Integer> m= new HashMap<String,Integer>();
		
		m.put("aa",new Integer (90));
		m.put("bb",new Integer (70));
		m.put("cc",new Integer (80));
		
		int max=0;
		int sum=0;
		String name=null;
		
		Set<Map.Entry<String, Integer>> es=m.entrySet();
		
		//한번 다 돈다.(es->전체 해시맵)
		for(Map.Entry<String, Integer> e:es) {
			if(e.getValue()>max) {
				max=e.getValue();
				name=e.getKey();
			}
			sum+=e.getValue();
		}
		double avg=sum/3.0;
		
		System.out.println(avg);
		System.out.println(max);
		System.out.println(name);
	} 
}
*/
/*
80.0
90
aa
*/

/*
4. Double b[](wrapper클래스)에 실수 2개를 넣고 for-each문으로 출력해라.

 Double b[];
*/
/*
public class study22{
	public static void main(String[] args) {
		
		Double b[] = new Double[2];
		
		b[0]=new Double(1.5);
		b[1]=new Double(2.5);
		
		for(double i: b) {
			System.out.println(i);
		}
	}
}
*/
//1.5
//2.5

/*
public class study22{
	public static void main(String[] args) {
	
		Double b[]= {1.5,2.5};
		
		for(Double c:b) {
		System.out.println(c);
		}
	}
}
*/
//1.5
//2.5

/*
class Coffee{
	int price;
	int num;
	
	Coffee(int p, int n) {
		price=p;
		num=n;
	}
	int total() {
		return price*num;
	}
}
public class study22{
	public static void main(String[] args) {
	
		//객체배열 요소가 3개 [3]이면서 커피의 총합 출력 
		//total 함수에 접근해주면 된다.
		
		Coffee c[]=new Coffee[3];
		int a[] = {5000,4000,3000};
		int b[] = {1,2,3};
		
		int sum=0;
		for(int i=0; i<3;i++) {
			c[i]=new Coffee(a[i],b[i]);
			sum+=c[i].total();
		}
		System.out.println(sum);	//22000
	}
}
*/

/*
class Str implements Comparator<String>{
	
	public int compare(String str1, String str2) {
		
		if(str1.length()>str2.length()) {
			return 1;
		}
		else if(str1.length()<str2.length()) {
			return -1;
		}
		else return 0;
	}
}
public class study22{
	public static void main(String[] args) {
	
		TreeSet<String> t=new TreeSet<String>();
		t.add("aa");
		t.add("aaaaa");
		t.add("aaa");
		
		Iterator<String> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
aa
aaa
aaaaa
*/

//Comparable=> compareTo()
//Comparator=> compare()
/*
class Str implements Comparator<String>{
	
	public int compare(String str1, String str2) {
		
		if(Integer.parseInt(str1)>str2.length()) {
			return 1;
		}
		else if(Integer.parseInt(str1)<str2.length()) {
			return -1;
		}
		else return 0;
	}
}
public class study22{
	public static void main(String[] args) {
	
		TreeSet<String> t=new TreeSet<String>();
		t.add("aa");
		t.add("dd");
		t.add("cc");
		
		Iterator<String> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
*/
/*
aa
cc
dd
*/


/*
5. 다음 클래스와 main()을 보고 쓰레드를 생성하는 Student클래스를 작성해라

출력이 10,20,30,……10씩 증가시키게끔 해라.(add메소드를 조금 바꿔라)-동기화

class Sh {
	
	private int num = 0;

	public void add() {
		int n = num;
		Thread.yield();
		n += 10;
		num = n;
		System.out.println(num);
	}
}
----------------------

Main(){

Sh sh = new Sh();
		
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);

		th1.start();
		th2.start();
*/
//첫번째 방법
/*
class Sh {
	
	private int num = 0;

	public void add() {
		int n = num;
		Thread.yield();
		for(int i=1; i<10; i++) {
			n += 10;
			num = n;
			System.out.println(num);
		}
	}
}
class Student extends Thread{
	
	String name;
	Sh sh;
	
	Student(String n, Sh sh){
		this.name=n;
		this.sh=sh;
	}
	
	public void run() {
		sh.add();
	}
}
public class study22{
	public static void main(String[] args) {
	
		Sh sh = new Sh();
		
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);

		th1.start();
		th2.start();
	}	
}
*/
/*
10
10
20
30
40
50
60
70
80
90
20
30
40
50
60
70
80
90
*/

//두번째 방법
/*
class Sh {
	
	private int num = 0;

	public synchronized void add() {	//synchronized => 충돌 방지
		int n = num;
		Thread.yield();
		for(int i=1; i<10; i++) {
			n += 10;
			num = n;
			System.out.println(num);
		}
	}
}
class Student extends Thread{
	String a;
	Sh s;
	
	Student(String a, Sh s){
		this.a=a;
		this.s=s;
	}
	public void run() {
		s.add();
	}
}
public class study22{
	public static void main(String[] args) {
	
		Sh sh = new Sh();
		
		Student th1 = new Student("jack",sh);
		Student th2 = new Student("tom", sh);

		th1.start();
		th2.start();
	}	
}
*/
/*
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
160
170
180
*/

//하나의 문자열을 입력해서
//한 라인으로 읽어 공백으로 분리된 수가 몇개 인지 출력..
/*
public class study22{
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("문자열 입력하세요");
		
		String str=s.nextLine();
		StringTokenizer stk=new StringTokenizer(str," ");
		System.out.println(str);
		System.out.println();
			
		System.out.println("공백으로 분리된 수:"+stk.countTokens());		
	}
}
*/
/*
문자열 입력하세요
안녕1 안녕2 안녕3
안녕1 안녕2 안녕3

공백으로 분리된 수:3
*/