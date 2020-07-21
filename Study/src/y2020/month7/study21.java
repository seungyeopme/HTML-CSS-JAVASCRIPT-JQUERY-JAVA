package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;



/*
public class study21 {
	public static void main(String[] args) throws IOException {
		
		InputStream i=null;	//Stream으로 끝나는 것은 바이트 단위
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
		//키값을 입력받아 4 bb
		//키값을 입력받아 7 문자 없음
		for(int i=0;i<3;i++) {
			int n=s.nextInt();
			String str=h.get(n);
			if(str==null) {
				System.out.println("문자 없음");
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
문자 없음
*/

//이미지 아이콘
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
		//Person객체
		Person p=(Person)obj; //down casting
		 if((p.getid()==this.id)&&(p.getname().equals(this.name))){
				return true;
		 		}
				return false;
		} 
}
class Game{
	Scanner s=new Scanner(System.in);
	//Person 클래스 vector
	Vector<Person> v=new Vector<Person>(5);
	Game() {	//초기화 과정
		v.add(new Person("동혁",123));
		v.add(new Person("주희",456));
		v.add(new Person("승철",789));
		v.add(new Person("원영",112));
	}
	void in() {
		while(true) {
			System.out.println("이름, id 입력");
			String name=s.next();
			if(name.equals("stop")) {
				break;
			}
			int id=s.nextInt();
			Person pp=new Person(name,id);	//객체 생성
			
//			contains(Object o)
//			Returns true if this vector contains the specified element.
			if(v.contains(pp)) {	//vector 안에 pp라는 객체가 있으면
				System.out.println(pp.getname()+"은 이미 있다.");
			}
			else
				v.add(pp);	
		}
	}	//벡터에 값을 저장함
	void out() {
		while(true) {
			Random r=new Random();
			int n=r.nextInt(v.size());
			Person p=v.get(n);
			String str=p.getname();
			
			System.out.println(str+"id는?");
			int id=p.getid();
			Scanner s=new Scanner(System.in);
			int i=s.nextInt();
			if(i==-1) {
				break;
			}
			if(i==p.getid()){
				System.out.println("정답");
			}
			else
				System.out.println("정답 아님");
		}
	}
	void end() {
		System.out.println("종료");
		System.exit(0); //프로그램 종료
	}
}
public class study21{
	public static void main(String[] args) {
		
		Game g=new Game();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("1,2,3");
			//1: 입력(in 함수)
			//2: out함수
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
		
		s.add(new Integer(3));	//원래는 이렇게 적어주어야 하지만
		s.add(4);	//자동 언박싱 기능이 있어서 이렇게도 가능하다!
		s.add(3);
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
*/
//중복 값이 안 나옴!! HashSet의 특징
/*
3
4
*/

//TreeSet이란?
/*
TreeSet은 이진검색트리라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스이다. 이진 검색 트리는
정렬, 검색, 범위검색에 높은 성능을 보이는 구조로 TreeSet은 이진 검색 트리의 성능을
향상시킨 레드-블랙-트리로 구현되어 있다. 그리고 Set 인터페이스를 구현했기 때문에 중복된
데이터의 저장을 허용하지 않으며, 정렬된 유치에 저장하므로 저장 순서를 유지하지도 않는다.
*/

/*
1. LinkedList에 "one","two","three"를 저장한다. 
저장 후 Iterator로 반복한 후(while) “three”라는 단어가 보이면(comepareTo함수 사용) 삭제해라.
*/
/*
public class study21 {
	public static void main(String[] args) {
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		
		Iterator<String> it = li.iterator(); //Iterator 선언 
		while(it.hasNext()){//다음값이 있는지 체크
		    String str=it.next();
			if (str.compareTo("three")==0) {
				it.remove();
			}
		}
		it=li.iterator();
		while(it.hasNext()) {
		
			System.out.println(it.next()); //값 출력
		}
	}
}
*/
//one
//two

/*
2. HashMap에 (1,"one"),(2,"two"),(3,"three")를 저장하여 키, 값을 다 출력한다.출력 후, 
1을 입력하면 one, 2를 입력하면 two, 3을 입력하면 three가 출력될 수 있게끔 코드를 작성해라.
*/
/*
public class study21 {
	public static void main(String[] args) {
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();//HashMap생성
	
		map.put(1,"one"); //값 추가
		map.put(2,"two"); //값 추가
		map.put(3,"three"); //값 추가
		
		System.out.println(map); //전체 출력 //{1=one, 2=two, 3=three}
		
		Scanner s=new Scanner(System.in);
		System.out.println("값을 입력하세요");
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
	
		HashMap<Integer,String> map = new HashMap<Integer,String>();//HashMap생성
	
		map.put(1,"one"); //값 추가
		map.put(2,"two"); //값 추가
		map.put(3,"three"); //값 추가
		
		System.out.println(map); //전체 출력 //{1=one, 2=two, 3=three}
		
		Scanner s=new Scanner(System.in);
		System.out.println("값을 입력하세요");
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
값을 입력하세요
1
one
*/

/*
3. File 메뉴에 메뉴 아이템 세개를 만들어라.(Load, Hide, Exit)

Load를 선택하면 이미지(사진)을 띄우고, Hide를 선택하면 이미지를 보이지 않게한다. Exit을 선택하면 프로그램을 종료하도록 작성해라.
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
4. 1차원 정수 배열[5]을 생성하여 리턴하는 make()를 작성해라.

main(){

 int ary[];

 ary=make();

 for(int i=0;i<ary.length;i++){

   System.out.print(ary[i] + “ “); }

실행결과) 0 1 2 3 4 출력
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

public class study21 {
	public static void main(String[] args) {
		
	}
}
