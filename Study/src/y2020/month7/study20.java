package y2020.month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//ArrayList 장점
//데이터 참조가 빠르다

//ArrayList 단점
//저장소 용량을 늘리는 과정에서 시간이 많이 소요됨!
//삭제에 필요한 과정이 길다!

//이러한 단점으로 
//LinkedList 
//배열을 사용하는 대신 서로서로 연결된 방식으로 데이터를 지정함
//저장소 용량을 늘리는 과정에서 시간이 많이 소요 안됨!
//데이터 삭제가 매우 간단
//데이터 참조가 불편하다.


/*
public class study20 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=
				new ArrayList<Integer>();
		a.add(3);
		a.add(0);
		a.add(3);
		
		Iterator<Integer> i= a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
*/
/*
3
0
3
*/

/*
class Box<T> {
	Box<T> next;	//next 제네릭 클래스의 객체
	T t;
	void in(T t) {
		this.t=t;
	}
	T out() {
		return t;
	}
}
public class study20 {
	public static void main(String[] args) {

		//Integer
		Box<Integer> b=
				new Box<Integer>();
		b.in(30);
		
		b.next=new Box<Integer>();
		b.next.in(40); //객체에 한번 더 접근
		
		b.next.next=new Box<Integer>();
		b.next.next.in(50);
		
		Box<Integer> tmp;
		tmp=b.next;

		System.out.println(tmp.out());//40
	}
}
*/

/*
public class study20 {
	public static void main(String[] args) {

		ArrayList<String> ary = 
				new ArrayList<String>();
		LinkedList<String> li =
				new LinkedList<>();
		long start;
		long end;
		
		start=System.nanoTime();//nanoTime() 반환형이 long
		for(int i=0; i<1000; i++) {
			ary.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		
		System.out.println(end-start);//ArrayList
		
		start=System.nanoTime();//nanoTime() 반환형이 long
		for(int i=0; i<1000; i++) {
			li.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		
		System.out.println(end-start);//LinkedList
	}
}
*/
//알고리즘으로 보았을 때 ArrayList 보다 LinkedList가 더 빠르다!
//LinkedList가 속도가 더 빠르지만 참조가 어렵기 때문에
//ArrayList를 더 많이 사용한다!!

/*
class Profile{
	String id;
	int age;
	Profile(String i, int a) {
		id=i;
		age=a;
	}
	public String toString(){
		return id +" " +age;
	}
}
//ArrayList를 사용해서 데이터를 2~3개 삽입
//for문으로 출력 -> size, get
public class study20 {
	public static void main(String[] args) {
		ArrayList<Profile> list = new ArrayList<Profile>();
		list.add(new Profile("유미", 23));
		list.add(new Profile("지수", 20));
		list.add(new Profile("지민", 25));
		
		for(int i=0; i<list.size(); i++) {
			Profile p=list.get(i);//객체로 부터 필드에 접근
			System.out.println(p.age +" "+p.id);
			//toString을 사용해도 된다.
		}
		System.out.println();
		for(Profile i : list) {
			System.out.println(i.toString());
		}
	}
}
*/
/*
23 유미
20 지수
25 지민

유미 23
지수 20
지민 25
*/

/*
public class study20 {
	public static void main(String[] args) {
	
		ArrayList<Integer> arrayList = new ArrayList<>();
		 
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
 
        for(int i : arrayList)
        {
            System.out.println("값 : " + i );
        }
	}
}
*/
/*
값 : 0
값 : 1
값 : 2
값 : 3
값 : 4
*/

//다음을 보고 코드를 작성해라.
/*
1- A. 클래스 Prob1: Rectangle
필드는 int 형 너비 (width)와 높이 (height)가 있고, 
모두private으로 선언하라. 생성자는 구현하지 말고 메소드는 클래스에서 필요한 내용을 판단하여구현하라. 
*/
/*
2- B. 클래스 Prob2: Rectagle 클래스를이용하는 응용프로그램
Main 메소드에서 키보드에서 사각형의 너비와 높이 값을 입력받는다. 키보드 입력값이 int 가 아닌 경우 예외처리를 하고, 유효한 값이 입력될 때까지계속 입력받게 한다. 
키보드 입력값이 유효한 값인 경우 해당 내용을 갖는 Rectangle 객체를 만들고 화면에생성한 Rectangle 객체의 면적을 출력하고 프로그램을 종료한다.
*/
//첫번째 방법
/*
class Rectangle{
	private int width; 
	private int height; 
		
	void in(int a, int b) {
		width = a;
		height = b;
	}
	void show() {
		System.out.println(width * height);
	}
}
public class study20 {
	public static void main(String[] args) {
	
		Rectangle r = new Rectangle();
		Scanner s = new Scanner(System.in);
		
		while(true){
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				
				r.in(a,b);
			}catch(Exception e) {
				System.out.println("유효한 값을 입력하세요");
				s.next();
				continue;
			}
			r.show();
		}
	}
}
*/
//두번째 방법
/*
class Rectangle{
	private int width; 
	private int height; 
		
	void area(int width, int height) {
		System.out.println(width*height);
	}
}
public class study20 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		while(true){
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				r.area(a, b);
				break;
			}catch(Exception e) {
				System.out.println("다시 입력");
				s.nextLine();//잘못 입력했을 때 토큰 지우는 작업
				continue;
			}
		}
	}
}
*/
/*
2 2.5
다시 입력
2 5
10
*/
//세번째 방법
/*
class Rectangle{
	private int width; 
	private int height; 
		
	int area(int width, int height) {
		return width*height;
	}
}
public class study20 {
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		while(true){
			try {
				int a = s.nextInt();
				int b = s.nextInt();
				System.out.println(r.area(a, b));
				break;
			}catch(Exception e) {
				System.out.println("다시 입력");
				s.nextLine();//잘못 입력했을 때 토큰 지우는 작업
				continue;
			}
		}
	}
}
*/
/*
2 2.5
다시 입력
2 5
10
*/

/*
3.  다음 class를 보고 코드를 작성해라.

class Profile{

  String name,id;

  Profile(String name, String id){

    this.name=name; this.id=id;

  }

  String getname(){ return name;}

  String getid(){ return id;}

}

A. main() Prob1: main()에서 인원수를 입력받아 인원수를 Profile에 대한객체 배열 개수로 설정한다. 
이름과아이디도 입력받아 객체 배열에 저장한 후 출력해라.
*/
//첫번째 방법
/*
class Profile{

	  String name,id;

	  Profile(String name, String id){
		  this.name=name; 
		  this.id=id;
	  }
	  String getname(){ 
		  return name;
	  }
	  String getid(){ 
		  return id;
	  }
}
public class study20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("인원 수를 입력해주세요");
		
		Profile[] p = new Profile[s.nextInt()];
		
		for(int i=0; i<p.length; i++) {
			System.out.println("이름, 아이디 입력");
			p[i] = new Profile(s.next(),s.next());
			System.out.println(p[i].name+ " "+p[i].id);
		}
	}
}
*/
/*
인원 수를 입력해주세요
3
이름, 아이디 입력
지수 js
지수 js
이름, 아이디 입력
민수 ms
민수 ms
이름, 아이디 입력
지민 jm
지민 jm
*/
//두번재 방법
/*
class Profile{

	  String name,id;

	  Profile(String name, String id){
		  this.name=name; 
		  this.id=id;
	  }
	  String getname(){ 
		  return name;
	  }
	  String getid(){ 
		  return id;
	  }
}
public class study20 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("인원 수를 입력해주세요");
		Profile[] p = new Profile[s.nextInt()];
		
		for(int i=0; i<p.length; i++) {
			System.out.println("이름, 아이디 입력");
			p[i] = new Profile(s.next(),s.next());
			System.out.println(p[i].getname()+ " "+p[i].getid());
		}
	}
}
*/
/*
인원 수를 입력해주세요
2
이름, 아이디 입력
12 aa
12 aa
이름, 아이디 입력
34 bb
34 bb
*/

/*
4.  JTextField를 사용해 id, pw가 뜰 수 있도록로그인 창을 만들어라.

(“enter”를 입력하는 순간 id가 출력된다.)
*/
/*
public class study20 {
	public static void main(String[] args) {
	
		JFrame j=new JFrame();
		j.setSize(500,500);
		j.setLayout(new FlowLayout());

		JTextField jt=new JTextField(10);
		JTextField jp=new JTextField(10);
		
		j.add(jt); 
		j.add(jp);
		j.setVisible(true);
		
		jt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jp.requestFocus();//requestFocus() 강제로 마우스 포커스주기
			}
		});
		jp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(jt.getText());
				//getText() returns previous string value 이전 문자열 반환
			}
		});
	}
}
*/

/*
5. 다음 코드를 보고 작성해라.

Color c[]={Color.RED, Color.Orange, Color.Yellow, Color.GREEN, Color.BLUE};

A.  배치관리자를 GridLayout으로 1행5열로 설정한다. 5개의 버튼을 객체 배열형태로 만들어

위에서 준 색을 각각 버튼에 입히고 컨테이너에 부착한다.
*/
//첫번째 방법
/*
public class study20 extends JFrame {
	study20() {
		Color c[]={Color.RED, Color.orange, Color.yellow, 
				Color.GREEN, Color.BLUE};
		JButton j[] = new JButton[5];
		for(int i=0; i<c.length;i++) {
			j[i] = new JButton();
			j[i].setBackground(c[i]);
			this.add(j[i]);
		}
		
		setLayout(new GridLayout(1,5));
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {

		new study20();
	}
}
*/
//두번재 방법
/*
public class study20 extends JFrame {
	study20() {
		Color c[]={Color.RED, Color.orange, Color.yellow, 
				Color.GREEN, Color.BLUE};
		Container con=getContentPane();
		con.setLayout(new GridLayout(1,5));
		
		
		for(int i=0; i<5;i++) {
			JButton j = new JButton();
			j.setBackground(c[i]);
			con.add(j);
		}
		
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {

		new study20();
	}
}
*/
/*
6. ArrayList에 0~100사이의임의의 정수 10개를 삽입하고 모두 출력해라. 
출력할때는 Iterator인터페이스를 사용해서 출력해라.
*/
/*
public class study20 {
	public static void main(String[] args) {
	
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<10;i++) {
		a.add((int)(Math.random()*100)+1);
		}
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}
}
*/
/*
54
27
46
83
21
9
94
42
70
81
*/

/*
7. 다음 코드를 보고 작성해라. 쓰레드가실행될 때 화면에 1초단위로정수를 출력하게끔 만들어라. 
(정수0부터 시작하여 프레임에 정수를 문자열로 변경해서 넣고 try문안에서1초씩 정지하게끔 만들어라 
  예외 발생하면 쓰레드는 종료된다.(return)

Public class 여러분 클래스명 extends JFrame{

   여러분 클래스명(){

        Container c=getContentPane();

        c.setLayout(new FlowLayout());

        JLable j=new JLabel();

        c.add(j);

    

        Th t=new Th(j);         //쓰레드 객체 생성

        setVisible(true);

        t.start();               //쓰레드 실행

}

Main(){

   New 여러분 클래스명();

}

}
*/
/*
class Th extends Thread{
	
	JLabel j;
	Th(JLabel j){
		this.j=j;
	}
	public void run() {
		int n=0;
		while(true) {
			j.setText(Integer.toString(n));//정수 객체를 문자로 변경해서 넣겠다.
			n++;
			try {
				sleep(1000); //1초
			}catch(Exception e) {
				return;
			}
		}
	}
}
public class study20 extends JFrame {
	
	study20(){

        Container c=getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j=new JLabel();
        c.add(j);

        Th t=new Th(j);         //쓰레드 객체 생성
        t.start();               //쓰레드 실행

        setVisible(true);
}
public static void main(String[] args) {
		
		new study20();
	}
}
*/

 
/*
8.  Map만들어 이름, 나이저장해서 이름과 일치하는 나이 출력해라.
*/
/*
public class study20{
	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("AA", 10);
		hm.put("BB", 20);
		hm.put("CC", 30);
		hm.put("DD", 40);
		
		System.out.println(hm.get("AA"));
		System.out.println(hm.get("BB"));
		System.out.println(hm.get("CC"));
		System.out.println(hm.get("DD"));
	}
}
*/
/*
10
20
30
40
*/

//set
//3, 5, 7, 10, 26, 33

//1. hashCode 메소드(기준 정함)
//2. equals메소드 (같은지 확인)

//=>빠른 검색 속도!!
/*
public class study20{
	public static void main(String[] args) {
		
		HashSet<String> h=
				new HashSet<String>();
		
		h.add("컴퓨터");
		h.add("마우스");
		h.add("컴퓨터");

		System.out.println(h.size()); //2 
									  //중복 허용 하지 않기 때문에 컴퓨터 2개를 1개로 인식
		
		Iterator<String> i=h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
//2
//마우스
//컴퓨터

//=>출력 될 때 순서가 무작위로 출력된다!!
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	public String toString(){	//객체를 문자열로 출력하는 방법
		//return n+""; 
		return String.valueOf(n);
	}
}
public class study20{
	public static void main(String[] args) {
		
		HashSet<Num> h=
				new HashSet<Num>();
		
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(60));
		
		Iterator<Num> i=h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
*/
//40
//30
//60

//=>여전히 순서는 유지되지 않고 무작위로 출력된다!


//3개의 이름과 나이를 입력받아
//해시맵에 저장해서
//가장 나이가 많은 사람의 이름을
//출력해주세요
/*
public class study20{
	public static void main(String[] args) {
		HashMap<String,Integer> h = 
				new HashMap<String,Integer>();
		
		Scanner s=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			String name=s.next();
			int age=s.nextInt();
			h.put(name, age);
		}
		//가장 나이가 많은 사람의 이름 출력
		Set<String> key=h.keySet();
		Iterator<String> it=key.iterator();
		
		int max=0; 
		String str="";
		while(it.hasNext()) {
			String name=it.next();
			int age=h.get(name);
			if(max<age) {
				max = age;
				str = name;
			}
		}
		System.out.println(str + " "+max);
		
	}
}
*/
/*
aa 30
bb 20
cc 10
aa 30
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	public String toString(){
		//return n +" ";
		return String.valueOf(n);//정수값을 문자열로 변경
	}
}
public class study20{
	public static void main(String[] args) {

		HashSet<Num> h=
				new HashSet<Num>();
		h.add(new Num(3));
		h.add(new Num(7));
		h.add(new Num(11));
		
		Iterator<Num> it=h.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
/*
7
3
11
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	public String toString(){
		//return n +" ";
		return String.valueOf(n);//정수값을 문자열로 변경
	}
	public int hashCode() {
		return n%3;	//1.기준을 정해서 그룹핑
	}
	public boolean equals(Object obj) {
		Num num=(Num)obj; //down casting
		if(num.n==n) {
			return true;
		}
		return false;//3이랑 3이 같은 그룹이니까 중복되는 3 하나 제외!!
	}
}
public class study20{
	public static void main(String[] args) {

		HashSet<Num> h=
				new HashSet<Num>();
		h.add(new Num(3));
		h.add(new Num(7));
		h.add(new Num(3));
		
		Iterator<Num> it=h.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
/*
3
7
*/
//중복 된 값 제외하고 출력

//첫번째 방법
/*
class Stu{
	String a;
	int b;
	Stu(String a, int b) {
		this.a=a;
		this.b=b;
	}
	public int hashCode() {
		return a.hashCode()+b;	//1.기준을 정해서 그룹핑  //이름이 똑같으면 해시코드 값이 같음
	}
	public boolean equals(Object obj) {
		if(obj instanceof Stu) {
			Stu s=(Stu)obj;
			return s.a.equals(a) && s.b==b; 
		}
		else 
			return false;
	}
}
public class study20{
	public static void main(String[] args) {
	
		Set<Stu> s=
				new HashSet<Stu>();
		s.add(new Stu("용석",24));
		s.add(new Stu("유강",22));
		s.add(new Stu("유강",22));
		//이름, 나이 다 일치해야 중복 허용 안됨
		System.out.println(s.size());
	}
}
*/
//2

//두번째 방법
/*
class Stu{
	String a;
	int b;
	Stu(String a, int b) {
		this.a=a;
		this.b=b;
	}
	public int hashCode() {
		return a.hashCode()+b;	//1.기준을 정해서 그룹핑  //이름이 똑같으면 해시코드 값이 같음
	}
	public boolean equals(Object obj) {
			Stu s=(Stu)obj;
			return s.a.equals(a) && s.b==b; 
	}
}
public class study20{
	public static void main(String[] args) {
	
		Set<Stu> s=
				new HashSet<Stu>();
		s.add(new Stu("용석",24));
		s.add(new Stu("유강",22));
		s.add(new Stu("유강",22));
		//이름, 나이 다 일치해야 중복 허용 안됨
		System.out.println(s.size());
	}
}
*/
//2

/*
equals() 와 hashcode()
equals 는 두 객체의 내용이 같은지, 동등성(equality) 를 비교하는 연산자
hashCode 는 두 객체가 같은 객체인지, 동일성(identity) 를 비교하는 연산자
*/

/*
Comparable<T> 인터페이스
Comparable 인터페이스는 객체를 정렬하는 데 사용되는 메소드인 compareTo() 메소드를 정의하고 있습니다.

자바에서 같은 타입의 인스턴스를 서로 비교해야만 하는 클래스들은 모두 Comparable 인터페이스를 구현하고 있습니다.

따라서 Boolean을 제외한 래퍼 클래스나 String, Time, Date와 같은 클래스의 인스턴스는 모두 정렬 가능합니다.

이때 기본 정렬 순서는 작은 값에서 큰 값으로 정렬되는 오름차순이 됩니다.
*/

/*
public class study20{
	public static void main(String[] args) {
		
		TreeSet<Integer> t=
				new TreeSet<Integer>();	
		//TreeSet은 오름차순으로 출력한다!!
		
		t.add(84);
		t.add(6);
		t.add(84);
		t.add(55);	
		t.add(100);	
		
		Iterator<Integer> it=t.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
*/
/*
6
55
84
100
*/

/*
class Pro implements Comparable<Pro>{
	
	String name;
	int id;
	Pro(String n, int i) {
		name=n;id=i;
	}
	void show() {
		System.out.println(name+" "+id);
	}
	public int compareTo(Pro p) {
		if(id>p.id) //오름차순
			return 1;
		else if(id<p.id) 
			return -1;
		else
			return 0;
	}
}
public class study20{
	public static void main(String[] args) {
	
		TreeSet<Pro> t=
				new TreeSet<Pro>();
		//2,3개 정도 삽입
		t.add(new Pro("aa",33));
		t.add(new Pro("bb",22));
		t.add(new Pro("cc",11));
		
		Iterator<Pro> it=t.iterator();
		while(it.hasNext())
			it.next().show();
	}	
}
*/
/*
cc 11
bb 22
aa 33
*/

/*
class Pro implements Comparable<Pro>{
	
	String name;
	int id;
	Pro(String n, int i) {
		name=n;id=i;
	}
	void show() {
		System.out.println(name+" "+id);
	}
	public int compareTo(Pro p) {
		if(id<p.id) //내림차순
			return 1;
		else if(id<p.id) 
			return -1;
		else
			return 0;
	}
}
public class study20{
	public static void main(String[] args) {
	
		TreeSet<Pro> t=
				new TreeSet<Pro>();
		//2,3개 정도 삽입
		t.add(new Pro("aa",33));
		t.add(new Pro("bb",22));
		t.add(new Pro("cc",11));
		
		Iterator<Pro> it=t.iterator();
		while(it.hasNext())
			it.next().show();
	}	
}
*/
/*
aa 33
bb 22
cc 11
*/

/*
public class study20{
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<String>();
		set.add("one"); // 데이터 저장(추가)
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("4");
		set.add("5");
		set.add("six");

		System.out.println("저장된 데이터 수 : " + set.size()); // 데이터 수 출력

		Iterator<String> it = set.iterator(); // Iterator(반복자) 생성

		while (it.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
			System.out.println(it.next()); // next() : 다음 데이터 리턴
		}

		System.out.println("--------------------");

		set.remove("three"); // 데이터 제거
		System.out.println("저장된 데이터 수 : " + set.size()); // 저장된 데이터 수 출력
		it = set.iterator(); // 반복자 재생성(위의 반복문에서 next 메서드로 데이터를 다 가져왔기 때문에 재생성을
								// 해야함)

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------");
	}
}
*/
/*
저장된 데이터 수 : 6
six
4
5
one
two
three
--------------------
저장된 데이터 수 : 5
six
4
5
one
two
--------------------
*/

/*
public class study20{
	public static void main(String[] args) {
		
		TreeSet<Integer> grade=
				new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(100);
		grade.add(50);
	
		Integer i;
		i=grade.first();//first()
						//Returns the first (lowest) element currently in this set.
		System.out.println(i);//30
	}
}
*/

/*
public class study20{
	public static void main(String[] args) {
		
		TreeSet<Integer> grade=
				new TreeSet<Integer>();
		
		grade.add(30);
		grade.add(100);
		grade.add(50);
	
		Integer i;
		i=grade.first();//first()
		//Returns the first (lowest) element currently in this set.
		System.out.println(i);//30
		
		i=grade.last();//last()
		//Returns the last (highest) element currently in this set.
		System.out.println(i);//100
		
		i=grade.lower(new Integer(80));//lower(E e)
		//Returns the greatest element in this set strictly less than 
		//the given element, or null if there is no such element.
		System.out.println(i); //50
		
		i=grade.higher(new Integer(80));//higher(E e)
		//Returns the least element in this set strictly greater than 
		//the given element, or null if there is no such element.
		System.out.println(i); //100
	}
}
*/

/*
class Food{
	void show() {
		System.out.println("음식"); //음식
	}
}
//food 상속받아 클래스 이름 설정
class Pizza extends Food{
	void show() {	//오버라이딩  
		super.show(); //음식
		System.out.println("피자"); //피자
	}
}
class Fo<T>{
	T t;
	void in(T t) {
		this.t=t;
	}
	T out() {
		return t;
	}
}
public class study20{
	
	static void pr(Fo<? extends Food> f) {//클래스 제한
		//out()으로 꺼내서 출력
		Food fo=f.out();
	    fo.show();
	}
	public static void main(String[] args) {

		Fo<Food> f=
				new Fo<Food>();
		f.in(new Food());
		pr(f);
		
		Fo<Pizza> f1=
				new Fo<Pizza>();
		f1.in(new Pizza());
		pr(f1);
		
		//in에 접근
		//다른 클래스 생성해서 접근 후
		//pr 메소드 호출해서 출력	
	}
}
*/
/*
음식
음식
피자
*/

//벡터를 이용한 콤보박스 생성
/*
class My{
	String name;
	int age;
	My(String a, int b) {
		name=a;
		age=b;
	}
	public String toString() {
		return name+" "+age;
	}	
}
public class study20{
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		
		Vector<My> v=
				new Vector<My>();
		//벡터에 문자열, 정수값 
		v.add(new My("지혜",20));
		v.add(new My("준호",23));
		v.add(new My("원영",22));
	
		//콤보박스 만들기
		JComboBox j= new JComboBox(v);
		f.add(j);
		f.setVisible(true);
	}
}
*/

/*
class Me implements Comparable<Me>{
	String name;
	Me(String n) {
		name=n;
	}
	int get() {
		return name.length();
	}
	public int compareTo(Me m) {
		if(get()<m.get())
			return -1;
		else if(get() > m.get())
			return 1;
		else 
			return 0;
	}
	public String toString() {
		return name;
	}
	
}
public class study20{
	public static void main(String[] args) {
	
		TreeSet<Me> t=
				new TreeSet<Me>();
		t.add(new Me("슬기"));
		t.add(new Me("자바공부"));
		t.add(new Me("최윤혁"));
		t.add(new Me("나니누네노"));
		t.add(new Me("아이우에오카키쿠케코"));
		
		
		Iterator<Me> it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
/*
슬기
최윤혁
자바공부
나니누네노
아이우에오카키쿠케코
*/

//자바 스윙 GUI 계산기 구조
/*
public class study20 extends JFrame {
	 
	study20() {
		Container c = getContentPane();
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();
		
		j1.setBackground(Color.gray);
		j2.setLayout(new GridLayout(4,4));
		j3.setBackground(Color.yellow);
		
		c.add(j1,BorderLayout.NORTH);
		c.add(j2);
		c.add(j3,BorderLayout.SOUTH);
		
		JLabel jl=new JLabel("입력");
		JTextField jf=new JTextField(10);
		j1.add(jl);
		j1.add(jf);
		
		JLabel ja=new JLabel("결과");
		JTextField jt=new JTextField(10);
		j3.add(ja);
		j3.add(jt);
		
		for(int i=0; i<16;i++) {
			JButton b=new JButton();
			String []s= {"+","-","*","/","계산","CE"};
			j2.add(b);
			if(i<10) { //0~9
				//정수를 문자열로 변경해서 프레임에 부착
				b.setText(Integer.toString(i));
			}
			else {	//10~15
				b.setText(s[i-10]);//"+","-","*","/","계산"
			}
		}
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new study20();
	}
}
*/

//바이트 스트림(Byte Stream)
//데이터의 종류가 파일,그림,동영상 등의 바이트 기반인 경우 사용하는 클래스로 바이트 단위로 입출력을 제어한다.

/*
InputStream
OutputStream 
입출력을 위한 바이트 스트림의 최상위 추상 클래스
*/

/*
FileInputStream
FileOutputStream
 파일 입출력을 위한 바이트 스트림 클래스
*/

/*
DataInputStream
DataOutputStream
자바 기본형(primitive) 데이터를 입출력 하기 위한 클래스
*/

/*
BufferedInputStream
BufferedOutputStream
 입출력 스트림에 버퍼링 기능을 추가한 클래스
*/

/*
PrintStream 
System.out을 통해 콘솔로 출력하기 위한 클래스
*/

/*
public class study20{
	public static void main(String[] args) {

		for(byte i=32; i<127; i++){

			System.out.write(i);

			System.out.write('\t');
		}
	}
}
*/

/*
class Num{
	int n;
	Num(int n) {
		this.n=n;
	}
	int get() {
		return n;
	}
	
	public String toString(){
		return n +" ";
	}
}
public class study20{
	public static void main(String[] args) {
		//객체 생성해서 값 3개 준 후
		//for-each문으로 총합 
		Num num[] = new Num[] {new Num(3), new Num(4), new Num(5)};
		
		int sum=0;
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + "");
		}
		System.out.println();
		for (Num n : num) {
			sum+=n.get();
		}
		System.out.println(sum);
	}
}
*/
//3 4 5 
//12