package y2020.month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





/*
1. 이름과 id를 입력받아 Person클래스 작성하고 입력한 값 다 출력해라.(객체 배열의 개수는 3개)

1.2 1번에 이어 다음과 같은 실행결과가 나오도록 코드를 추가해라. (Person객체 배열 사용해라.)

실행결과)

이름, id입력: 홍길동 111

이름, id입력: 김길동 222

이름, id입력: 박길동 333

이름뭐니? 홍길동

답: 111

이름뭐니? 최길동

이름없다.

이름뭐니? Stop
*/
//첫번째 방법
/*
class Person{
	String str;
	int a;
	
	Person(String str, int a) {
		this.str=str;
		this.a=a;
	}
}
public class study23 {
	public static void main(String[] args) {
		//객체배열 [3]
		Person[] p=new Person[3];
		Scanner s=new Scanner(System.in);
		
		for (int i = 0;i<p.length;i++) {
			System.out.println("이름, id 입력: ");
				String a=s.next();
				int b=s.nextInt();
				p[i] = new Person(a,b);
		}
		while(true) {
			System.out.println("이름은?");
			String name=s.next();
			
				if(name.equals("stop")) {
					break;
				}
				for(int i=0;i<3;i++) {
					if(name.equals(p[i].str)) {
						System.out.println("id는"+p[i].a);
						break;
				}
				
			}
		}
	}
}
*/
/*
이름, id 입력: 
aa 11
이름, id 입력: 
bb 22
이름, id 입력: 
cc 33
이름은?
aa
id는11
이름은?
bb
id는22
이름은?
cc
id는33
이름은?
stop
*/

//두번째 방법
/*
class Person {
	String a;
	int b;
Person(String a, int b) {
	this.a = a;
	this.b = b;
}
public String toString(){
	return a+" "+b;
	}
}
public class study23 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		String a=null;
		int b=0;

		Person[] p = new Person[3];
		HashMap<String,Integer> h=new HashMap<>();

		for(int i=0;i<p.length;i++) {
			System.out.println("이름");
			a=s.next();	
			System.out.println("아이디");
			b=s.nextInt();
			p[i]=new Person(a,b);
			System.out.println(p[i]);
			h.put(a,b);
		}
		while(true) {
			System.out.println("이름뭐니?");
			String c=s.next();
			
			if(h.containsKey(c)) {
				System.out.println(h.get(c));
			}
			else if(c.equals("stop")) {
				break;
			}
			else {
				System.out.println("이름없다");
			}
		}
	}
}
*/
/*
이름
aa
아이디
11
aa 11
이름
bb
아이디
22
bb 22
이름
cc
아이디
33
cc 33
이름뭐니?
aa
11
이름뭐니?
bb
22
이름뭐니?
cc
33
이름뭐니?
stop
*/

/*
interface In{
	int big(int a, int b);	//a,b 두수 중 큰 값 리턴
	default void pr() {
		System.out.println("인터페이스");
	}
}
class Ini implements In{

	public int big(int a, int b) {	//인터페이스 상속 받을 시에는 무조건 public 붙이는 거 잊지 말자!
		if (a>b) {
			return a;
		}
		return b;
		//return a>b?a:b;
	}
}
public class study23 {
	public static void main(String[] args) {
		
		In in=new Ini();
		System.out.println(in.big(15,78));
		in.pr();
	}
}
/*
78
인터페이스
*/

/*
public class study23 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		HashMap<String, Integer> h=new HashMap<String,Integer>();
		h.put("아메리카노", 4500);
		h.put("카푸치노", 5000);
		h.put("카페라떼", 5500);
		
		//무한반복으로 이름을 입력하면 가격이 출력된다.
		//그만 입력하며 종료해!!
		
		while(true) {
			Set<String> key=h.keySet();
			Iterator<String> it=key.iterator();
			System.out.println("주문해라");
			String str=s.next();
			if(str.equals("그만")) {
				break;
			}
			while(it.hasNext()) {
				String st=it.next();
				if(str.equals(st)) {
					System.out.println(str+"는"+h.get(st));
					break;
				}
			}
		}
	}
}
*/
/*
주문해라
아메리카노
아메리카노는4500
주문해라
카푸치노
카푸치노는5000
주문해라
카페라떼
카페라떼는5500
주문해라
그만
*/

//Jlabel을 사용하여 문자(자바!!)하나 주고,
//마우스로 문자열을 클릭할 때 문자(디비!!)로 바뀌는 프레임
/*
public class study23 extends JFrame {
	study23(){

		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setSize(500,500);
		
		JLabel j1=new JLabel("자바");
		
		c.add(j1);
		
		j1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				j1.setText("디비");
			}
		});
		
		setVisible(true);
	
	}
	public static void main(String[] args) {
		
		new study23();
	}
}
*/

//키오스크
/*
public class study23 {
	  
	int count = 0;
	String show = "";
	 
	public study23() {
		// 디자인단
		// 프레임 설정단
		JFrame frame = new JFrame("햄버거 자동 판매기");
	    frame.setBounds(0, 0, 625, 1000);
	    frame.setBackground(Color.black);
	 
	    // 폰트
	    Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
	    Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
	 
	    // 북쪽
	    Panel pNorth = new Panel();
	    pNorth.setBackground(new Color(255, 255, 215));
	    pNorth.setLayout(null);
	    pNorth.setSize(0, 500);
	    pNorth.setFont(font);
	 
	    // 배열 설정 부분
	    String menu[] = { "빅맥버거", "싸이버거", "더블버거", "맘마버거", "김치버거", "새우버거", "라면버거", "치킨버거" };
	    int price[] = { 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500 };
	    JButton bt[] = new JButton[menu.length];
	    TextField suja[] = new TextField[menu.length];
	    Button minus[] = new Button[menu.length];
	    Button plus[] = new Button[menu.length];
	    JButton ok[] = new JButton[menu.length];
	    Label l[] = new Label[menu.length];
	    ImageIcon icon[] = new ImageIcon[menu.length];
	 
	    // 버튼 설정 부분
	    for (int i = 0; i < menu.length; i++) {
	 
	    	// 햄버거 버튼
	    	bt[i] = new JButton(menu[i]);
	    		if (i < 4) {
	    			bt[i].setBounds(25 + i * 150, 50, 100, 100);
	    		} else {
	    			bt[i].setBounds(25 + (i - 4) * 150, 300, 100, 100);
	    		}
	    		icon[i] = new ImageIcon(i + ".png");
	    		bt[i].setIcon(icon[i]);
	 
	        // 숫자 txt 버튼
	        suja[i] = new TextField("0");
	        suja[i].setBackground(Color.white);
	        suja[i].setEditable(false);	// 편집 불가능
	        //setBounds() 메서드를 사용하여 절대 위치와 크기 지정 - setBounds(x, y, w, h);
	        suja[i].setBounds(bt[i].getX() + 30, bt[i].getY() + 130, 40, 20);
	 
	        // "-" 버튼
	        minus[i] = new Button("-");
	        minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 20);
	        minus[i].setEnabled(false);
	 
	        // "+" 버튼
	        plus[i] = new Button("+");
	        plus[i].setBounds(bt[i].getX() + (100 - 20), suja[i].getY(), 20, 20);
	        plus[i].setEnabled(false);
	 
	        // 가격
	        l[i] = new Label(price[i] + "원");
	        l[i].setBounds(bt[i].getX() + 20, suja[i].getY() - 25, 100, 20);
	 
	        // 확인 버튼
	        ok[i] = new JButton("확인");
	        ok[i].setBounds(bt[i].getX(), suja[i].getY() + 30, 100, 20);
	        ok[i].setEnabled(false);
	 
	        pNorth.add(bt[i]);
	        pNorth.add(suja[i]);
	        pNorth.add(minus[i]);
	        pNorth.add(plus[i]);
	        pNorth.add(l[i]);
	        pNorth.add(ok[i]);
	        }
	 
	        // 중앙
	        TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
	        //SCROLLBARS_VERTICAL_ONLY
	        //Create and display vertical scrollbar only.
	        ta.setText("   상품명        단가        수량        합계\n\n");
	        ta.setBackground(Color.white);
	        ta.setEditable(false);
	        ta.setFont(font1);
	 
	        // 남쪽
	        Panel pSouth = new Panel();
	        pSouth.setFont(font);
	        pSouth.setBackground(new Color(255, 255, 215));
	 
	        Button bt1 = new Button("주문");
	        Button bt2 = new Button("초기화");
	        Button bt3 = new Button("닫기");
	        pSouth.add(bt1);
	        pSouth.add(bt2);
	        pSouth.add(bt3);
	 
	        // 주문버튼
	        bt1.addActionListener(new ActionListener() {
	 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
	                for (int i = 0; i < menu.length; i++) {
	                    bt[i].setEnabled(true);
	                    minus[i].setEnabled(false);
	                    plus[i].setEnabled(false);
	                    suja[i].setText("0");
	                    ta.setText("   상품명        단가        수량        합계\n\n");
	 
	                }
	            }
	        });
	 
	        // 초기화 버튼
	        bt2.addActionListener(new ActionListener() {
	 
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                for (int i = 0; i < menu.length; i++) {
	                    bt[i].setEnabled(true);
	                    minus[i].setEnabled(false);
	                    plus[i].setEnabled(false);
	                    suja[i].setText("0");
	                    ta.setText("   상품명        단가        수량        합계\n\n");
	 
	                }
	            }
	        });
	 
	 
	        //bt3 닫기버튼
	        
	        bt3.addActionListener(new ActionListener() {
	            
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
	 
	 
	        // 컴포넌트
	        frame.add(pNorth, BorderLayout.NORTH);
	        frame.add(ta, BorderLayout.CENTER);
	        frame.add(pSouth, BorderLayout.SOUTH);
	        frame.setVisible(true);
	 
	        // 이벤트단
	        for (int i = 0; i < menu.length; i++) {
	            int j = i;
	 
	            // 햄버그 버튼 이벤트
	            bt[i].addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    minus[j].setEnabled(true);
	                    plus[j].setEnabled(true);
	                    bt[j].setEnabled(false);
	                    ok[j].setEnabled(true);
	 
	                    count = 0;
	                }
	            });
	 
	            // "-" 버튼 이벤트
	            minus[i].addActionListener(new ActionListener() {
	 
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    if (count > 0) {
	                        count = count - 1;
	                        suja[j].setText(count + "");
	                        ok[j].setEnabled(true);
	                    } else {
	                        minus[j].setEnabled(false);
	                    }
	                }
	            });
	            
	            // "+" 버튼 이벤트
	            plus[i].addActionListener(new ActionListener() {
	 
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    count = count + 1;
	                    suja[j].setText(count + "");
	                    ok[j].setEnabled(true);
	                    if (count > 0) {
	                        minus[j].setEnabled(true);
	                    }
	                }
	            });
	            
	            //확인 버튼 이벤트
	            ok[i].addActionListener(new ActionListener() {
	 
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    show = bt[j].getActionCommand();
	                    ta.append("   " + show + "       " + price[j] + "        " 
	                    + count + "         " + price[j] * count+ "원" + "\n");
	                    ok[j].setEnabled(false);
	                }
	            });
	 
	        }
	 
	        // 끄기
	        frame.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        });
	    }
public static void main(String[] args) {
		
		new study23();
	}
}
*/

/*
public class study23 {
	public static void main(String[] args) {
	
		Set<String> set=new HashSet<String>();
		
		set.add("aa");
		set.add("bbb");
		set.add("aa");
		set.add("cccc");
		
		System.out.println(set); //전체출력 
		
		Iterator it = set.iterator();// Iterator 사용
		while(it.hasNext()) {//값이 있으면 true 없으면 false
		    System.out.println(it.next());
		}
	}
}
*/
/*
[aa, bbb, cccc]
aa
bbb
cccc
*/