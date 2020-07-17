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