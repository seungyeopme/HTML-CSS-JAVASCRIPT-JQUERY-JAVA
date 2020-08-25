package teamp;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 헤더 제목: 지금 책 대여 대여?
미들왼쪽: <도서목록>, 
미들오른쪽:<검색창>, <신간요청>, <장르>(라디오 버튼)
푸터왼쪽: <대여목록>
푸터오른쪽: <대여일자>,<반납일>, 
         <대여>, <취소>
                   라벨
                   
제목
저자
출판일
도서번호
출판사
책ID
줄거리

목록추가(버튼) 대여중(버튼)
 */
public class main extends JFrame{
	public static void main(String[] args) {
		
		 JFrame frm = new JFrame("도서 대여 프로그램");
		 
	        // 프레임 크기 설정
	        frm.setSize(568, 680);
	 
	        // 프레임을 화면 가운데에 배치
	        frm.setLocationRelativeTo(null);
	 
	        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
	        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        // 레이아웃 설정
	        frm.getContentPane().setLayout(null);
	 
	        //JLabel 생성
	        JLabel label1 = new JLabel("지금 책 대여 대여?");
	        JLabel label2 = new JLabel("검색");
	        JLabel label3 = new JLabel("장르");
	        JLabel label4 = new JLabel("이름");
	        JLabel label5 = new JLabel("나이");
	        JLabel label6 = new JLabel("주소");
	        JLabel label7 = new JLabel("연락처");
	        JLabel label8 = new JLabel("<신간 요청>");
	        JLabel label9 = new JLabel("<대여 목록>");
	        JLabel label10 = new JLabel("대여일");
	        JLabel label11 = new JLabel("반납일");
	        JLabel label12 = new JLabel("<대여 현황>");
	        
	        //JTextArea 생성
	        JTextArea ta1 = new JTextArea();//도서 목록
	        JTextArea ta2 = new JTextArea();//<신간 요청>
	        JTextArea ta3 = new JTextArea();//<대여 목록>
	        JTextArea ta4 = new JTextArea();//<대여 현황>
	        
	        //JTextField 생성
	        JTextField tf1 = new JTextField(); //검색
	        tf1.setText("도서 검색");//기본 입력  값 설정
	        tf1.setEnabled(true);
	        JTextField tf2 = new JTextField(); //이름
	        JTextField tf3 = new JTextField(); //나이
	        JTextField tf4 = new JTextField(); //주소
	        JTextField tf5 = new JTextField(); //연락처
	        JTextField tf6 = new JTextField(); //대여일
	        JTextField tf7 = new JTextField(); //반납일
	        
	        //JButton 생성
	        JButton btn1 = new JButton("OK");//검색
	        JButton btn2 = new JButton("OK");//연락처
	        JButton btn3 = new JButton("OK");//반납일
	        JButton btn4 = new JButton("대여");//대여
	        JButton btn5 = new JButton("취소");//취소
	        JButton btn6 = new JButton("OK");//대여일
	        JButton btn7 = new JButton("OK");//주소
	        
	        //JRadioButton 생성
	        JRadioButton rb1 = new JRadioButton("소설");
	        JRadioButton rb2 = new JRadioButton("수필");
	        JRadioButton rb3 = new JRadioButton("시");
	        
	        //rb1 라디오버튼 눌러져있도록
	        rb1.setSelected(true);
	        
	        //라디오 버튼을 그룹화 하기 위한 객체 생성
	        ButtonGroup bg = new ButtonGroup();
	        
	        //그룹에 라디오 버튼을 포함시킨다.
	        bg.add(rb1);
	        bg.add(rb2);
            bg.add(rb3);
	 
	        //JLabel 위치와 크기 설정
	        label1.setBounds(225, 0, 100, 50); //지금 책 대여 대여?
	        label2.setBounds(240, 30, 100, 50); //검색
	        label3.setBounds(240, 60, 100, 50); //장르
	        label4.setBounds(240, 90, 100, 50); //이름
	        label5.setBounds(240, 120, 100, 50); //나이
	        label6.setBounds(240, 150, 100, 50); //주소
	        label7.setBounds(240, 180, 100, 50); //연락처
	        label8.setBounds(240, 210, 100, 50); //<신간 요청>
	        label9.setBounds(10,300, 65, 65); //<대여 목록>
	        label10.setBounds(240, 330, 65, 65); //대여일
	        label11.setBounds(240, 360, 65, 65); //반납일
	        label12.setBounds(240, 450, 65, 65); //<대여 현황>
	        
	        //JTextArea 위치와 크기 설정
	        ta1.setBounds(10, 40, 220, 270); //도서 목록
	        ta2.setBounds(245, 250, 270, 60); //<신간 요청>
	        ta3.setBounds(10, 350, 220, 270); //<대여 목록>
	        ta4.setBounds(245, 500, 270, 120); //<대여 현황>
	        
	        //JTextField 위치와 크기 설정
	        tf1.setBounds(270, 45, 200, 20); //검색
	        tf2.setBounds(270, 105, 80, 20); //이름
	        tf3.setBounds(270, 135, 80, 20); //나이
	        tf4.setBounds(270, 165, 210, 20); //주소
	        tf5.setBounds(280, 195, 200, 20); //연락처
	        tf6.setBounds(280, 355, 200, 20); //대여일
	        tf7.setBounds(280, 385, 200, 20); //반납일
	        
	        //JButton 위치와 크기 설정
	        btn1.setBounds(475, 45, 58, 20); //검색
	        btn2.setBounds(485, 195, 58, 20); //연락처
	        btn3.setBounds(485, 385, 58, 20); //반납일
	        btn4.setBounds(350, 415, 58, 20); //대여
	        btn5.setBounds(350, 445, 58, 20); //취소
	        btn6.setBounds(485, 355, 58, 20); //대여일
	        btn7.setBounds(485, 165, 58, 20); //주소
	        
	        //JRadioButton 위치와 크기 설정
	        rb1.setBounds(265, 70, 49, 30); //소설
	        rb2.setBounds(315, 70, 49, 30); //수필
	        rb3.setBounds(365, 70, 49, 30); //시
	        
	        //JTextArea 툴팁
	        ta1.setToolTipText("도서 목록");
	        
	        //프레임에다가 JLabel 추가
	        frm.getContentPane().add(label1); //지금 책 대여 대여?
	        frm.getContentPane().add(label2); //검색
	        frm.getContentPane().add(label3); //장르
	        frm.getContentPane().add(label4); //이름
	        frm.getContentPane().add(label5); //나이
	        frm.getContentPane().add(label6); //주소
	        frm.getContentPane().add(label7); //연락처
	        frm.getContentPane().add(label8); //<신간 요청>
	        frm.getContentPane().add(label9); //<대여 목록>
	        frm.getContentPane().add(label10); //대여일
	        frm.getContentPane().add(label11); //반납일
	        frm.getContentPane().add(label12); //<대여 현황>
	        
	        //프레임에다가 JTextField 추가
	        frm.getContentPane().add(tf1);//검색
	        frm.getContentPane().add(tf2);//이름
	        frm.getContentPane().add(tf3);//나이
	        frm.getContentPane().add(tf4);//주소
	        frm.getContentPane().add(tf5);//연락처
	        frm.getContentPane().add(tf6);//대여일
	        frm.getContentPane().add(tf7);//반납일
	        
	        
	        //프레임에다가 TextArea 추가
	        frm.getContentPane().add(ta1);//도서 목록
	        frm.getContentPane().add(ta2);//<신간 요청>
	        frm.getContentPane().add(ta3);//<대여 목록>
	        frm.getContentPane().add(ta4);//<대여 현황>
	       
	        //프레임에다가 버튼 추가
	        frm.getContentPane().add(btn1);//검색
	        frm.getContentPane().add(btn2);//연락처
	        frm.getContentPane().add(btn3);//반납일
	        frm.getContentPane().add(btn4);//대여
	        frm.getContentPane().add(btn5);//취소
	        frm.getContentPane().add(btn6);//대여일
	        frm.getContentPane().add(btn7);//주소
	        
	        //프레임에다가 JRadioButton 추가
	        frm.getContentPane().add(rb1);
	        frm.getContentPane().add(rb2);
	        frm.getContentPane().add(rb3);
	        	 
	        // 프레임이 보이도록 설정
	        frm.setVisible(true);
	    }
}