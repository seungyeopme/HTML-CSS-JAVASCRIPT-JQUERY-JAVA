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
		System.out.println("마우스 드래그");
	}
	public void mouseMoved(MouseEvent e) {}
}
public class study19 extends JFrame{

	study19() {
		setTitle("드래깅"); //super("드래깅");
		Container c = getContentPane();
		c.addMouseMotionListener(new Aa());
		
		setVisible(true);
	}
	public static void main(String[] args) {

		//title -> 드래깅
		//컨테이너 드래깅 -> "마우스 드래그"
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
		
		j.setMajorTickSpacing(20); //큰 눈금 간격
		j.setPaintLabels(true);
		j.setPaintTicks(true);
		
		j1.setHorizontalAlignment(JLabel.CENTER); //문자열 위치를 중앙에 위치
		j1.setOpaque(true);	//투명도 설정
		j1.setBackground(Color.magenta);
		j1.setText(Integer.toString(j.getValue()));//눈금 정수값을 문자열로 변경해서 프레임에 띄운다.
		
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
		setTitle("메뉴 만들기");
		
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
		setTitle("툴바 만들기");
		
		this.setLayout(new FlowLayout());
		Container c =getContentPane();
		JToolBar j=new JToolBar();
		JButton j1=new JButton("끝");
		
		j1.addActionListener(new Jt());
		j.add(j1);
		c.add(j,BorderLayout.NORTH);//툴바는 반드시 BorderLayout에 설정해야 한다.
		
		this.setSize(400,200);
		setVisible(true);
		
	}
	class Jt implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int r=JOptionPane.showConfirmDialog(null, "정말로 종료하시겠습니까?", 
										"툴바",JOptionPane.YES_NO_OPTION);
			if(r==JOptionPane.CLOSED_OPTION) {
				return; //아무것도 선택하지 않을 경우 빠져나가겠다.
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
1. 5부터 10까지의 정수형 데이터를 입력 받아5~10 이외의 정수형이 입력되면 “다시 입력”이라고 출력 한다. 
      입력 받은 정수 값을 Calc class의 calculate()함수를 이용하여 
   1부터 입력 받은 숫자까지 홀수만 더하는 프로그램을 작성 해라. (calculate()함수는int형
        정수를 입력 받아 1부터 입력 받은 숫자까지 홀수의 합을 구하여 리턴하는 함수)
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
				System.out.println("다시 입력");
				continue;
			}
			System.out.println("1부터 입력한 숫자까지 홀수의 합은 : "+c.calculate(n));
		}
	}
}
*/
/*
1
다시 입력
5
1부터 입력한 숫자까지 홀수의 합은 : 9
10
1부터 입력한 숫자까지 홀수의 합은 : 25
*/

/*
2. main(){
int[][] ary=new int[3][3];

high(ary,3,3);

} 주고 정수 입력받아high라는 함수안에서 입력한 수 중 최대값 구해라.
*/
//첫번째 방법
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
900//여기까지 입력 값
900//제일 큰 값 출력
*/

//두번째 방법
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
3. 다음 main()을 보고 코드를 작성해라. (Cal은 인터페이스, a,b,는 두 정수를 입력받아 a부터 b까지 총합)
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
14	//2부터 5까지의 총합
*/

/*
4. 다음 main()을 보고 Gen클래스를 만들어라.
Gen<String> g=new Gen<String>(“seoul”,”busan”);

System.out.println(g.one());   //seoul 출력

System.out.println(g.two());   //busan 출력

System.out.println(g.three());  //false 출력 (두 문자열 비교)
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
	System.out.println(g.one()); //seoul 출력
	System.out.println(g.two()); //busan 출력
	System.out.println(g.three()); //false 출력 (두 문자열 비교)
	}
}
*/
//seoul
//busan
//false

/*
5. FileOutputStream을 이용하여 byte[]배열 속에 들어있는 바이너리 값을 fi.txt파일에 저장해라. 
   (byte b[]={1,2,3,4,5}; 로초기화)
/*
public class study19 {
public static void main(String[] args) {
	
	byte b[]={1,2,3,4,5};
	try {
        FileOutputStream fout = new FileOutputStream("fi.txt"); //파일 출력 스트림 생성
        	
        	for (int i=0; i<b.length; i++)//파일 쓰기
        		fout.write(b[i]);
        	fout.close();//파일 스트림 닫기
		} catch(IOException e) {}
		System.out.println("fi.txt를 저장했습니다.");
	}
}
*/
/*
5.1 저장한 후 값을 읽어와서 출력해라.
*/
/*
public class study19 {
public static void main(String[] args) {

	byte b[] = new byte[5];
    try {
        FileInputStream fin = new FileInputStream("fi.txt"); // 입력 파일 스트림 열기
        int n = 0, c; //파일 읽기
        
        while ((c = fin.read()) != -1) { //파일 읽기
            b[n] = (byte) c;
            n++;
        }
        System.out.println("fi.txt에서 읽은 배열을 출력합니다."); // 읽은 파일 콘솔에 출력하기
       
        for (int i = 0; i < b.length; i++) // 읽은 파일 콘솔에 출력하기
            System.out.print(b[i] + " ");
        	System.out.println();

        	fin.close(); // 파일 입력 스트림 닫기
    	} catch (IOException e) { // 예회처리
    	}
	}
}
*/
//fi.txt에서 읽은 배열을 출력합니다.
//1 2 3 4 5 


/*
6.이미지 세개를 다운받아프레임에 부착해라.(for문 사용해서 부착)
*/
/*
public class study19 extends JFrame{
	
	ImageIcon[] ii= {
			new ImageIcon("C://Users//Administrator//Desktop/chicken.jpg"),
			new ImageIcon("C://Users//Administrator//Desktop/DJANGO.png"),
			new ImageIcon("C://Users//Administrator//Desktop/ramen.jfif")};
		
	study19() {
	setTitle("이미지 for문 구현");
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
7. Main()을 보고 함수 구현해라. ( 배열 요소합 출력)



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
		setTitle("랜덤게임");
		setVisible(true);
		
		JButton btn1 = new JButton(""+num1);
		JButton btn2 = new JButton(""+num2);
		JButton btn3 = new JButton(""+num3);
		JLabel jl = new JLabel("결과 : ");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(jl);
		
		c.requestFocus(); //키 이벤트를 받을 컴포넌트르 강제로 설정
		c.setFocusable(true); //키 이벤트의 포커스를 받을 수 있는 컴포넌트가 여러 개 있을 때 우선적으로
							  //입력받기 위해 설정
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
						jl.setText("결과 :당첨 ");
					}else {
						jl.setText("결과 :꽝 ");
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
		v.add(new Integer(5));	//기본 정수 5를 객체화 시켜 벡터에 저장
		v.add(5); //이렇게 적어도 자동 박싱된다.
		v.add(10);
		v.add(0,20); //인덱스 0에 20을 넣겠다.
		System.out.println(v.size()); //사이즈 출력
		
		for(int i=0;i<v.size();i++) {
			int n=v.get(i);	//벡터에서 꺼낼 때
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
	public String toString() {	//객체를 문자열로 변경하는 함수
		return x+" "+y;
	}
}
public class study19{
	public static void main(String[] args) {
		
		//angle blacket => <클래스명>
		Vector<Xy> v =
				new Vector<Xy>();
		v.add(new Xy(4,7));		//0
		v.add(new Xy(5,9));		//1
		v.add(new Xy(10,11));	//2
		v.remove(2); //인덱스 값  //v.add(new Xy(10,11)); 출력 안됨
		
		for(int i=0;i<v.size();i++) {
			 Xy x=v.get(i);	//벡터에서 꺼낼 때
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
		a.add("윤혁");
		a.add("수정");
		a.add("두희");
		
		for(int i=0; i<a.size(); i++) {
			String b=a.get(i);
			System.out.println(b);
		}
	}
}
*/
//윤혁
//수정
//두희

/*
public class study19{
	public static void main(String[] args) {

		ArrayList<String> a=
				new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			String str=s.next();
			a.add(str);//이름 삽입 ArrayList에
			String st=a.get(i);
			System.out.println(st);
		}
	}
}
*/
/*
오하요
오하요
곤니찌와
곤니찌와
곰방와
곰방와
*/

//5개 정수 값을 입력받아 벡터에 저장한다.
//저장한 값 중 가장 작은 값을 출력한다.
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
			int n=s.nextInt(); //몇 개 입력할 것인지
			v.add(n);	//벡터에 삽입
			
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
1 //제일 작은 min 값 출력
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
		System.out.println("벡터 내의 요소 객체 수: "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		
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
벡터 내의 요소 객체 수: 3
벡터의 현재 용량: 10
Hello
4
3.14
*/


//Iterator 란?
//Iterator는 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화 하였는데 
//그 중 하나가 Iterator이다.

//Iterator는 인터페이스인데 그 구성을 살펴보자.
/*
public interface Iterator {

boolean hasNext();

Object next();

void remove();

}
*/
/*
boolean hasNext() 메소드는 읽어 올 요소가 남아있는지 확인하는 메소드이다. 
있으면 true, 없으면 false를 반환한다.

Object next() 메소드는 읽어 올 요소가 남아있는지 확인하는 메소드이다. 
있으면 true, 없으면 false를 반환한다.

void remove() 메소드는 next()로 읽어 온 요소를 삭제한다.
next() 를 호출한 다음에 remove() 를 호출해야 한다. (선택적 기능이라 사용해도 그만 사용하지 않아도 그만이다)


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
			int n=it.next();	//다음 데이터를  n에 대입
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
		//데이터 추가해서 iterator로 출력
		LinkedList<String> li=
				new LinkedList<String>();
		
		li.add("안녕");
		li.add("오하요");
		li.add("곤니찌와");
		li.add("곰방와");
		
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
안녕
오하요
곤니찌와
곰방와
*/

//(학점("A", "B", "C")을 입력받아(String) 5
//ArrayList에 저장하다.
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

//vector에다 정수 3개 임의로 저장하고 총합 출력해라. (iterator 사용)
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
		h.put(1,"승철");
		h.put(2,"효준");
	
		System.out.println(h.get(1)); //key값을 적어주면 value 값 출력
		System.out.println(h.get(2)); //key를 기준으로 값 출력
	}
}
*/
//승철
//효준

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
		
		h.put("물","water");
		h.put("커피","coffee");
		h.put("티","tea");
	
		Set<String> keys=h.keySet();//모든 키를 set컬렉션에서 받아오겠다. 물 , 커피, 티
									//{물,커피,티} 집합형태로 저장하겠다.
		Iterator<String> it=
				keys.iterator();
		
		while(it.hasNext()) {
			String a=it.next();	//키
			String b=h.get(a);	//키에 맞는 값
			System.out.println(a+" "+b);
		}
	}
}
*/
/*
티 tea
커피 coffee
물 water
*/

/*
public class study19{
	public static void main(String[] args) {
	
		Map<String,String> map=new HashMap<>(); 
		map.put("id_0123","1234"); 
		map.put("id_0124","1234"); 
		map.put("id_0125","4567"); 
		map.put("id_0126","0515"); 
		//사용자로부터 id와 비밀번호를 입력받은 후 값을 확인하여 
		//메세지 화면에 뿌리기 
		Scanner sc=new Scanner(System.in); 
		while(true) { 
			System.out.println("id와 passwd 입력해주세요"); 
			System.out.println("id : "); 
			String id=sc.nextLine(); 
			System.out.println("passwd : "); 
			String passwd=sc.nextLine(); 
			
			if(!map.containsKey(id)) { 
				System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요"); 
				continue; 
			}else { 
				if(!(map.get(id)).equals(passwd)) { 
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요"); 
				}else { 
					System.out.println("id와 비밀번호 일치"); 
					break; 
				} 
			}
		}
	}
}
*/
/*
id와 passwd 입력해주세요
id : 
id_0123
passwd : 
1234
id와 비밀번호 일치
*/


//id, 비밀번호 두개 정도 넣어서 => hashmap
//비밀번호만 (두개)출력
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
				new HashMap<String, Integer>();//업캐스팅.. Map(부모) HashMap(자식)
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

		// 해시 테이블에 키와 값 집어 넣기
		ht.put("abc", 1);
		ht.put("abc1", 2);
		ht.put("abc2", 3);


		// 해시 테이블에 있는 값 꺼내오기
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
			System.out.println("id, pw 입력하세요 ");
			String id = s.next();
			String pw = s.next();
			if(!h.containsKey(id)) { //해시맵에 id가 들어있는지 확인 //containsKey
				System.out.println("id가 존재하지 않네요");
				continue;//id다시 입력함.. 위로 올라감!!
			}
			else {	//id가 있을 경우 //equals, get
				if(!(h.get(id)).equals(pw)) {
					System.out.println("비빌번호가 일치하지 않네요");
				}
				else {//비밀번호 짝에 맞게 입력함
					System.out.println("로그인");
				}
				break;
			}	
		}
	}
}
*/
/*
id, pw 입력하세요 
jun
123
로그인
*/
/*
id, pw 입력하세요 
aa
123
id가 존재하지 않네요
id, pw 입력하세요 
*/
/*
id, pw 입력하세요 
jun
456
비빌번호가 일치하지 않네요
*/

//hashmap<a,123>
//       <b,234>
//두개 넣기
//단어 입력: 키 값 입력
//키에 맞는 값이 나오도록 출력 
//키 값이 해시맵에 들어있지 않으면 없는 단어
/*
public class study19{
	public static void main(String[] args) {
	
		HashMap<String, String> h = new HashMap<String, String>();
		
		h.put("해리", "h");
		h.put("론", "r");
		h.put("강호동", "k");
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			String str=s.next();
			String st=h.get(str);
			
			if(st==null) {
				System.out.println("없는 단어");
			}
			System.out.println(st);
		}
	}
}
*/
/*
해리
h
*/
/*
a
없는 단어
null
*/


