package y2020.month8.gui;

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

public class gui1 extends JFrame {

		//키오스크
		   int count = 0;
		   String show = "";
		    
		   public gui1() {
		      // 디자인단
		      // 프레임 설정단
		      JFrame frame = new JFrame("햄버거 자동 판매기");
		       frame.setBounds(0, 0, 625, 1000);//가로위치, 세로위치, 가로길이, 세로길이
		       frame.setBackground(Color.black);
		    
		       // 폰트
		       Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		       Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
		    
		       // 북쪽
		       Panel pNorth = new Panel();
		       pNorth.setBackground(new Color(255, 255, 215));// red, green, blue
		       pNorth.setLayout(null);
		       pNorth.setSize(0, 500); //북쪽 패널 사이즈 설정
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
		           suja[i].setEditable(false);   // 편집 불가능
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
		                     //showMessageDialog
		                     /*Component, parentComponent
								
								이 값은 null 이 될 수 있습니다. 부모 컴포넌트를 지정하는데. 
								이 경우 선택된 컴포넌트는 다이어로그가 닫히기 전까지
								활성화 될 수 없습니다. 
								
								예를들어 이곳에 프레임을 주고 다이어로그를 띄우면 
								다이어로그가 끝날 때 까지 프레임을 활성화 할 수는 없죠 */
		                   
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
		      
		      new gui1();
		   }
		
	}
