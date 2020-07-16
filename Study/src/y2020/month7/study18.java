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
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

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
	public String toString() { //객체를 문자열로 출력하는 함수
		return a+" "+b;
	}
}
public class study18 {
	public static void main(String[] args) {
	
		Stu s=new Stu("pink", "juli");
		System.out.println(s); //s는 객체
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
		//Mul은 추상 클래스
		Mul m=new M();
		System.out.println(m.multi(2,10));
		//2의 10승
	}
}
*/

/*
public class study18 {
	public static void main(String[] args) {
		//무한반복문 안에 1~3까지의 수 범위를 주고
		//정수 세 개가 다 같은 수면 종료시켜주세요
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
		jt.setText("삭제됨! ");
		jt.append("내용 입력: "); //JTextArea에 부착
	}
}
public class study18 {
	public static void main(String[] args) {

		JFrame j=new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt=new JTextArea(10,20);
		jt.append("내용 입력: ");
		jt.setLineWrap(true);//자동 줄 바꿈 여부 설정
		
		JButton b=new JButton("삭제 버튼");
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
        this.setTitle("리스트 만들기 예제");
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
	String[]s = {"치킨","라면","자바"};
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
				JComboBox c=(JComboBox)e.getSource();//다운캐스팅 
													//getSource는 Object 클래스
				int i=c.getSelectedIndex();//콤보박스의 선택된 아이템 인덱스 알아내기
				j.setIcon(im[i]);//그림 넣을 때 setIcon.. 문자 넣을 때 setText
				
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
1. 다음 main함수를 보고 작성해라.
main(){

   Thread th1=new MovieThread();

   th1.start();

   Thread th2=new Thread(new MusicThread());

   th2.start();

실행결과) 영화를 재생합니다.영화를 재생합니다. 영화를 재생합니다.

                 음악을 재생합니다. 음악을 재생합니다. 음악을 재생합니다.

(th2가 먼저 나올수도 있음, 세번씩 출력)
*/
/*
class MovieThread extends Thread {
public void run() {
	for (int i = 0; i < 3; i++) {
		System.out.print("영화를 재생합니다.");
	}
	System.out.println();
	}
}
class MusicThread implements Runnable {
public void run() {
	for (int i = 0; i < 3; i++) {
		System.out.print("음악을 재생합니다.");
	}
	System.out.println();
	}
}
public class study18 extends Thread {
	public static void main(String[] args) {
		 //멀티 스레드 구현
		 Thread th1=new MovieThread(); //매개변수가 없으면 Thread 상속받아서 구현
		 th1.start();
		 Thread th2=new Thread(new MusicThread()); //매개변수가 있을 시에는 Runnable로 구현
		 th2.start();
	}
}
*/
//영화를 재생합니다.영화를 재생합니다.영화를 재생합니다.
//음악을 재생합니다.음악을 재생합니다.음악을 재생합니다.


/*
2. 문자열 “1+2+3+4+5”를 “+”로 구분해서 총합 15를 출력해라

(StringTokenizer,parseInt, trim() 다 사용)
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
		
		System.out.printf("총 데이터의 합은: %d\n", total);
	}
}
*/
//총 데이터의 합은: 15

/*
3. 1~100안의 정수를입력받아 3,6,9 중 하나가 있는 경우 “짝”, 두 개 있는 경우 “짝짝”,
하나도 없으면 “땡”을출력해라.

(정수값이 39라고 할 때, n/10=3, n%10=6 이 나온다.   (/, % 연산자 활용))

실행 결과) 입력:39               

짝짝
*/
/*
public class study18  {
	public static void main(String[] args) {

		int j;
		for(j=0;j<100;j++){//j를 0부터 100보다 작을 경우 아래 과정을 반복한다.

			if((j==3||j==6||j==9)|| //j가 3이거나 6이거나 9일때
					((j%10==3||j%10==6||j%10==9)&&(j/10!=3&&j/10!=6&&j/10!=9))||
					//또는 j의 1의 자리가 3이거나 6이거나 9이고 10의 자리가 3,6,9가 아닐때
					((j/10==3||j/10==6||j/10==9)&&(j%10!=3&&j%10!=6&&j%10!=9))){
				//또는 j의 10의 자리가 3이거나 6이거나 9이고 1의 자리가 3,6,9가 아닐때
				System.out.println(j+".짝!!"); // 그때의 j 값과 박수 한번!! 을 출력한다.
			}

			else if((j%10==3||j%10==6||j%10==9)&&(j/10==3||j/10==6||j/10==9)){
				// j의 1,10의 자리가 모두 3,6,9 중 하나일때
				System.out.println(j+".짝짝!!");
				// 그때의 j 값과 박수 두번!! 을 출력한다.
		
			}else {
				System.out.println(j+".땡!!");
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
				System.out.println("짝");
			}
			else if(b%3==0 && b!=0) {
				System.out.println("짝");
			}
		else if(b%3==0 && b!=0)
			System.out.println("땡");
		}}}

*/
/*
4.  컨텐트팬의 배경색을 빨간색으로 하고, Ok, Cancel 버튼을부착한 frame하나 만들어라

 Ok버튼을 누르면 “확인”, Cancel을 누르면 버튼을 비활성화 시켜라.

(MouseAdapter로 접근)

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
				System.out.println("확인");
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
5. 라디오버튼 이름을 “magenta”, ”red” 두개로 설정하고magenta를 누르면 버튼의 색을 magenta로, 
red를 누르면 red색으로 변경해라
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
6. JLabel j=new JLabel(“Hi);

에서 j를 마우스로 클릭하면 “안녕”이라고 바꾸는 코드를 작성해라.
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
			j.setText("안녕");
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
7. main()함수를 보고클래스 Book을 구현해라.

 main(){

   Book b1=new Book(“자바”);

   b1.title();            //자바는 40000원

   Book b2=new Book(“파이썬”, 30000);

   b2.title();           //파이썬 30000원

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
		System.out.println(a+" "+b+"원");
	}
}
public class study18{
	public static void main(String[] args) {

		Book b1=new Book("자바");
		b1.title();            //자바는 40000원

		Book b2=new Book("파이썬", 30000);
		b2.title();           //파이썬 30000원
	}
}
*/
//자바 40000원
//파이썬 30000원

/*
public class study18 extends JFrame{
	study18() {
		JLabel j=new JLabel("hi",SwingConstants.CENTER);
		
		j.setHorizontalAlignment(j.LEFT);	//JLabel 위치 지정
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
		System.out.println("스레드 시작");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
public class study18 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("아무거나 입력해라");
		s.next();
		
		Thread t = new Thread(new A());//매개변수가 있을 시에는 Runnable로 구현
		t.start();
	}
}
*/

//Thread 클래스 상속 받아
//실행시작 10초 후에 자동으로 종료하는 쓰레드를 작성하라.
//yellow -> 10초후  -> red 
/*
public class study18 extends JFrame {
	study18() {
		setVisible(true);	//JFram을 보여주는!
		Th t=new Th();	//매개변수가 없으니 Thread 상속 받아서 구현
		t.start();
	}
	class Th extends Thread{
		public void run() {
			//컨탠트 팬 yellow
			getContentPane().setBackground(Color.yellow);
			try {
				sleep(10000); //10초
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
		// TODO 자동 생성된 생성자 스텁
		setTitle("이벤트");// 타이틀 
		setSize(1280,720); //창의 크기
		setVisible(true); //창이 화면에 보이게 해줌
		setResizable(false); //창의 크기를 변경하지 못하게 해줌
		setLocationRelativeTo(null); // 창을 실행할때 가운데 나타나게 해줌
		JButton b1=new JButton("움직이는 버튼"); //버튼을 하나 만듬
		setLayout(null);
		//버튼이 움직이게 해줌
		addKeyListener(new KeyAdapter() { //키 이벤트
			@Override
			public void keyPressed(KeyEvent e) { //키 눌렀을때
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {//키 코드로 스위치
				case KeyEvent.VK_DOWN: //방향키(아래) 눌렀을때
					b1.setLocation(b1.getX(), b1.getY()+10);
					break;
				case KeyEvent.VK_UP: //방향키(위)눌렀을때
					b1.setLocation(b1.getX(), b1.getY()-10);
					break;
				case KeyEvent.VK_LEFT:// 방향키(왼)눌렀을때
					b1.setLocation(b1.getX()-10, b1.getY());
					break;
				case KeyEvent.VK_RIGHT:// 방향키(오른)눌렀을때
					b1.setLocation(b1.getX()+10, b1.getY());
					break;
				default:
					break;
				}
			}
		});
		b1.addMouseListener(new MouseAdapter() { // 마우스 이벤트
			@Override
			public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때
			}

			@Override
			public void mouseExited(MouseEvent e) { // 마우스 나왔을때
			}

			@Override
			public void mousePressed(MouseEvent e) { // 클릭했을때
				System.exit(0);
			}
		});
		b1.setBounds(0, 0, 150, 30); //버튼의 크기 위치 지정
		add(b1); //버튼을 프레임에 추가
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 정상적으로 종료되게 해줌
	}
	public static void main(String[] args) {
		new study18(); //실행
	}
}
*/

/*
class Ex5 extends JFrame{
    Ex5(){
        this.setTitle("사격 게임");
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
        //이미지 크기만큼 레이블 크기 설정
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
        
        //타겟을 움직이는 스레드
        targetThread = new TargetThread(target);
        targetThread.start();
        
        //베이스에 초점을 두고 엔터키 입력에 따라 bullet스레드 실행
        base.requestFocus();
        base.addKeyListener(new KeyListener(){
            BulletThread bulletThread = null;
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyChar()==KeyEvent.VK_ENTER){
                    //스레드가 죽어있는 상태인지 확인
                    if(bulletThread==null || !bulletThread.isAlive()){
                        //sound.play();
                        //총알로 타겟을 맞췄는지 확인하기 위해 2개의 레이블과 타겟스레드를 넘겨준다.
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
                int x=target.getX()+5;//5픽셀씩 이동
                int y=target.getY();
                
                //프레임 밖으로 나갈경우
                if(x>GamePanel.this.getWidth())
                    target.setLocation(0, 0);
                //프레임 안에 있을경우 5픽셀씩 이동
                else
                    target.setLocation(x, y);
                
                //0.02초마다 이동
                try{
                    sleep(20);
                }
                //스레드가 죽게되면 초기 위치에 위치하고, 0.5초를 기다린다.
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
                if(hit()){//타겟이 맞았다면
                    targetThread.interrupt();//타겟 스레드를 죽인다.
                    //총알은 원래 위치로 이동
                    bullet.setLocation(bullet.getParent().getWidth()/2-5, bullet.getParent().getHeight()-50);
                    return;//총알 스레드도 죽인다.
                }
                else{
                    int x=bullet.getX();
                    int y=bullet.getY()-5;//5픽셀씩 위로 이동한다.=총알 속도가 5픽셀
                    //총알이 프레임 밖으로 나갔을 때
                    if(y<0){
                        //총알 원래 위치로 이동
                        bullet.setLocation(bullet.getParent().getWidth()/2-5, bullet.getParent().getHeight()-50);
                        return;//총알 스레드를 죽인다.
                    }
                    //총알이 프레임 안에 있으면 5픽셀씩 이동한다.
                    else
                        bullet.setLocation(x, y);
                }
                //0.02초마다 5픽셀씩 이동
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
            //타겟의 x좌표가 총알 x좌표보다 작거나 같으며 총알 x좌표보다 타겟 x좌표 + 타겟의 가로 길이가 크고 
            if(((target.getX()<=x)&&(x<target.getX()+target.getWidth()))   
                    //타겟의 y좌표가 총알 y좌표보다 작거나 같으며 총알 y좌표보다 타겟 y좌표 + 타겟의 세로 길이가 크면
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



