package teamp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class Book extends JFrame{
   
   int i=0;
   
   Book(){
      
      String name[]=new String[20];
      String age[]=new String[20];
      String addr[]=new String[20];
      String phone[]=new String[20];
      
      HashMap<Integer,String> mh = new HashMap<Integer,String>();
         mh.put(1,"소나기");
         mh.put(2,"19세");
         mh.put(3,"가나");
         mh.put(4,"나다");
         mh.put(5,"라마");
         mh.put(6,"바사");
      
      
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
        JLabel label3 = new JLabel("이름");
        JLabel label4 = new JLabel("생년월일");
        JLabel label5 = new JLabel("주소");
        JLabel label6 = new JLabel("연락처");
        
        JLabel label8 = new JLabel("<신간 요청>");
        JLabel label9 = new JLabel("<대여 목록>");
        JLabel label10 = new JLabel("대여일");
        JLabel label11 = new JLabel("반납일");
        JLabel label12 = new JLabel("<대여 현황>");
        JLabel label13 = new JLabel("도서 이름");
        JLabel label14 = new JLabel("출판사");
        JLabel label15 = new JLabel("작가");
        
        JLabel label16 = new JLabel("년");
        JLabel label17 = new JLabel("월");
        JLabel label18 = new JLabel("일");
        
        //JComboBox 생성
        String[] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};
        JComboBox box1 = new JComboBox(year);
        
        String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox box2 = new JComboBox(month);
        
        String[] day = {
        				"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
        				"16","17","18","18","20","21","22","23","24","25","26","27","28",
        				"29","30","31"
        				};
        JComboBox box3 = new JComboBox(day);
        
        //JTextArea 생성
        JTextArea ta1 = new JTextArea();//도서 목록
        //JTextArea ta2 = new JTextArea();//<신간 요청>
        JTextArea ta3 = new JTextArea();//<대여 목록>
        JTextArea ta4 = new JTextArea();//<대여 현황>
        
        //JTextField 생성
        JTextField tf1 = new JTextField(); //검색
        tf1.setEnabled(true);
        JTextField tf2 = new JTextField(); //이름
        //JTextField tf3 = new JTextField(); //생년월일
        JTextField tf4 = new JTextField(); //주소
        JTextField tf5 = new JTextField(); //연락처
        JTextField tf6 = new JTextField(); //대여일
        JTextField tf7 = new JTextField(); //반납일
        JTextField tf8 = new JTextField(); //(도서신청)책이름
        JTextField tf9 = new JTextField(); //(도서신청)출판사
        JTextField tf0 = new JTextField(); //(도서신청)작가
        //JButton 생성
        JButton btn1 = new JButton("검색");//검색
        //JButton btn2 = new JButton("OK");//연락처
        JButton btn3 = new JButton("OK");//반납일
        JButton btn4 = new JButton("대여");//대여
        JButton btn5 = new JButton("취소");//취소
        JButton btn6 = new JButton("OK");//대여일
        JButton btn7 = new JButton("OK");//주소
        JButton btn8 = new JButton("신청");//신청
        
        
        btn4.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent e) {
          if(tf2.getText().equals("")/*||tf3.getText().equals("")*/||tf4.getText().equals("")||tf5.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"필수 입력칸이 비어있습니다.","ERROR",JOptionPane.PLAIN_MESSAGE);  
          }
          else {
          name[i]=tf2.getText();
          //age[i]=tf3.getText();
          addr[i]=tf4.getText();
          phone[i]=tf5.getText();
          i++;
          }
         }
      });
        
        btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String str = "";
            for(int n=1;n<7;n++) {
         if(mh.get(n).contains(tf1.getText())) {
            
            str+=mh.get(n);
            System.out.println();
         }
         }
         ta4.setText(str);
         if(tf1.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "검색어를 입력하셔야 합니다", "ERROR", JOptionPane.INFORMATION_MESSAGE);    
         }
         if(ta4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "검색어를 다시 확인해주세요", "ERROR", JOptionPane.INFORMATION_MESSAGE);
         }
         }
      });
     
        //JLabel 위치와 크기 설정
        label1.setBounds(225, 0, 100, 50); //지금 책 대여 대여?
        label2.setBounds(240, 30, 100, 50); //검색
        label3.setBounds(240, 60, 100, 50); //장르
        label4.setBounds(240, 90, 100, 50); //이름
        label5.setBounds(240, 120, 100, 50); //생년월일
        label6.setBounds(240, 150, 100, 50); //주소
        //label7.setBounds(240, 180, 100, 50); //연락처
        label8.setBounds(350, 180, 100, 50); //<신간 요청>
        label9.setBounds(10,300, 65, 65); //<대여 목록>
        label10.setBounds(240, 330, 65, 65); //대여일
        label11.setBounds(240, 360, 65, 65); //반납일
        label12.setBounds(240, 450, 65, 65); //<대여 현황>
        label13.setBounds(240,220,100,50); //책이름
        label14.setBounds(240,250,100,50); //출판사
        label15.setBounds(240,280,100,50); //작가
        
        label16.setBounds(350,90,100,50); //년
        label17.setBounds(420,90,100,50); //월
        label18.setBounds(490,90,100,50); //일
        
        //JTextArea 위치와 크기 설정
        ta1.setBounds(10, 40, 220, 270); //도서 목록
        //ta2.setBounds(245, 250, 270, 60); //<신간 요청>
        
        ta3.setBounds(10, 350, 220, 270); //<대여 목록>
        ta4.setBounds(245, 500, 270, 120); //<대여 현황>
        
        //JTextField 위치와 크기 설정
        tf1.setBounds(270, 45, 200, 20); //검색
        tf2.setBounds(270, 75, 80, 20); //이름
        //tf3.setBounds(270, 105, 80, 20); //생년월일
        tf4.setBounds(270, 135, 210, 20); //주소
        tf5.setBounds(280, 165, 200, 20); //연락처
        tf6.setBounds(280, 355, 200, 20); //대여일
        tf7.setBounds(280, 385, 200, 20); //반납일
        tf8.setBounds(300, 235, 180, 20); //도서신청책이름
        tf9.setBounds(300, 265, 180, 20); //도서신청 출판사
        tf0.setBounds(300, 295, 180, 20);  //도서신청 작가
        
        //JComboBox 위치와 크기 설정
        box1.setBounds(295, 105, 53,20);//년(year)
        box2.setBounds(365, 105, 53,20);//월(month)
        box3.setBounds(435, 105, 53,20);//일(day)
        
        
        //JButton 위치와 크기 설정
        btn1.setBounds(475, 45, 58, 20); //검색
        //btn2.setBounds(485, 195, 58, 20); //연락처
        btn3.setBounds(485, 385, 58, 20); //반납일
        btn4.setBounds(350, 415, 58, 20); //대여
        btn5.setBounds(350, 445, 58, 20); //취소
        btn6.setBounds(485, 355, 58, 20); //대여일
        btn7.setBounds(485, 165, 58, 20); //주소
        btn8.setBounds(485, 295, 58, 20);
        
        
        
        //JTextArea 툴팁
        ta1.setToolTipText("도서 목록");
        
        
        
        //프레임에다가 JLabel 추가
        frm.getContentPane().add(label1); //지금 책 대여 대여?
        frm.getContentPane().add(label2); //검색
        frm.getContentPane().add(label3); //장르
        frm.getContentPane().add(label4); //이름
        frm.getContentPane().add(label5); //생년월일
        frm.getContentPane().add(label6); //주소
        //frm.getContentPane().add(label7); //연락처
        frm.getContentPane().add(label8); //<신간 요청>
        frm.getContentPane().add(label9); //<대여 목록>
        frm.getContentPane().add(label10); //대여일
        frm.getContentPane().add(label11); //반납일
        frm.getContentPane().add(label12); //<대여 현황>
        frm.getContentPane().add(label13);//(도서신청)책이름
        frm.getContentPane().add(label14);//(도서신청)출판사
        frm.getContentPane().add(label15);//(도서신청)작가
        
        frm.getContentPane().add(label16);//년
        frm.getContentPane().add(label17);//월
        frm.getContentPane().add(label18);//일
        
        //프레임에다가 JTextField 추가
        frm.getContentPane().add(tf1);//검색
        frm.getContentPane().add(tf2);//이름
        //frm.getContentPane().add(tf3);//생년월일
        frm.getContentPane().add(tf4);//주소
        frm.getContentPane().add(tf5);//연락처
        frm.getContentPane().add(tf6);//대여일
        frm.getContentPane().add(tf7);//반납일
        frm.getContentPane().add(tf8);
        frm.getContentPane().add(tf9);
        frm.getContentPane().add(tf0);
        
        //프레임에다가 TextArea 추가
        frm.getContentPane().add(ta1);//도서 목록
        //frm.getContentPane().add(ta2);//<신간 요청>
        frm.getContentPane().add(ta3);//<대여 목록>
        frm.getContentPane().add(ta4);//<대여 현황>
       
        //프레임에다가 버튼 추가
        frm.getContentPane().add(btn1);//검색
        //frm.getContentPane().add(btn2);//연락처
        frm.getContentPane().add(btn3);//반납일
        frm.getContentPane().add(btn4);//대여
        frm.getContentPane().add(btn5);//취소
        frm.getContentPane().add(btn6);//대여일
        frm.getContentPane().add(btn7);//주소
        frm.getContentPane().add(btn8);//신간요청버튼
        
        //프레임에다가 JRadioButton 추가
        
        //프레임에다가 JComboBox 추가
        frm.getContentPane().add(box1);//year
        frm.getContentPane().add(box2);//month
        frm.getContentPane().add(box3);//day
        
            
        // 프레임이 보이도록 설정
        frm.setVisible(true);
    }
   public static void main(String[] args) {
      new Book(); 
      }
}