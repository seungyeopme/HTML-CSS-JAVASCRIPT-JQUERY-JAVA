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

public class Book extends JFrame{
   
   int i=0;
   
   Book(){
      
      String name[]=new String[20];
      String phone1[]=new String[20]; //연락처 가운데 4자리
      String phone2[]=new String[20]; //연락처 마지막 4자리
      //String age[]=new String[20];
      //String addr[]=new String[20];
      //String phone[]=new String[20];
      
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
        JLabel label19 = new JLabel("-");//연락처 첫번째 -
        JLabel label20 = new JLabel("-");//연락처 두번째 -
        
        
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
        
        String[] city = {
        		"서울특별시","부산광역시","대구광역시","인천광역시","광주광역시",
        		"대전광역시","울산광역시","제주특별자치도","세종특별자치시","수원시",
        		"고양시","용인시","성남시","화성시","부천시","남양주시","안산시",
        		"안양시","평택시","시흥시","파주시","의정부시","김포시","광주시",
        		"광명시","하남시","군포시","오산시","양주시","이천시","구리시",
        		"안성시","의왕시","포천시","양평군","여주시","동두천시","가평군",
        		"과천시","연천군","춘천시","원주시","강릉시","동해시","태백시",
        		"속초시","삼척시","홍천군","횡성군","영월군","평창군","정선군",
        		"철원군","화천군","양구군","인제군","고성군","양양군","청주시",
        		"충주시","제천시","보은군","옥천군","영동군","증평군","진천군",
        		"괴산군","음성군","단양군","천안시","공주시","보령시","아산시",
        		"서산시","논산시","계룡시","당진시","금산군","부여군","서천군",
        		"청양군","홍성군","예산군","태안군","전주시","익산시","군산시",
        		"정읍시","남원시","김제시","완주군","고창군","부안군","임실군",
        		"순창군","진안군","무주군","장수군","목포부","무안군","나주군",
        		"화순군","곡성군","담양군","여수군","제주군","함평군","영광군",
        		"광주군","광양군","고흥군","보성군","강진군","해남군","장성군",
        		"구례군","장흥군","완도군","진도군","순천군","영암군","대구부",
        		"달성군","경산군","영천군","경주군","영일군","영덕군","영양군",
        		"청송군","안동군","의성군","군위군","칠곡군","김천군","김천군",
        		"상주군","예천군","영주군","봉화군","문경군","성주군","고령군",
        		"청도군","선산군","울도군","부산부","마산부","울산군","동래군",
        		"창녕군","사천군","하동군","거창군","고성군","통영군","함양군",
        		"합천군","의령군","함안군","산청군","창원군","진주군","김해군",
        		"밀양군","양산군","남해군"
        		};
        JComboBox box4 = new JComboBox(city);
        
        String[] gu = {
        		"종로구","중구","용산구","성동구","광진구","동대문구","중랑구",
        		"성북구","강북구","도봉구","노원구","은평구","서대문구","마포구",
        		"양천구","강서구","구로구","금천구","영등포구","동작구","관악구",
        		"서초구","강남구","송파구","강동구"
        		};
        JComboBox box5 = new JComboBox(gu);
        
        String[] dong = {
        		"청운효자동","사직동","삼청동","부암동","평창동","무악동","교남동",
        		"가회동","종로1234가동","종로56가동","이화동","혜화동","창신제1동",
        		"창신제2동","창신제3동","숭인제1동","숭인제2동"
        };
        JComboBox box6 = new JComboBox(dong);
        
        String[] phone_number = {
        		"010","011","017","016","018","019"
        };
        JComboBox box7 = new JComboBox(phone_number);
        
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
        //JTextField tf4 = new JTextField(); //텍스트 필드 주소 삭제 완료
        JTextField tf6 = new JTextField(); //대여일
        JTextField tf7 = new JTextField(); //반납일
        JTextField tf8 = new JTextField(); //(도서신청)도서 이름
        JTextField tf9 = new JTextField(); //(도서신청)출판사
        JTextField tf0 = new JTextField(); //(도서신청)작가
        JTextField tf10 = new JTextField(); //연락처1 가운데 4자리
        JTextField tf11 = new JTextField(); //연락처2 마지막 4자리
        
        //JButton 생성
        JButton btn1 = new JButton("검색");//검색
        //JButton btn2 = new JButton("OK");//연락처
        JButton btn3 = new JButton("OK");//반납일
        JButton btn4 = new JButton("대여");//대여
        JButton btn5 = new JButton("취소");//취소
        JButton btn6 = new JButton("OK");//대여일
        //JButton btn7 = new JButton("OK");//버튼주소 삭제 완료
        JButton btn8 = new JButton("신청");//신청
        
        
        btn4.addActionListener(new ActionListener() {
         
         public void actionPerformed(ActionEvent e) {
          if(tf2.getText().equals("")/*||tf3.getText().equals("")||tf4.getText().equals("")*/||tf10.getText().equals("")||tf11.getText().equals("")) {
             JOptionPane.showMessageDialog(null,"필수 입력칸이 비어있습니다.","ERROR",JOptionPane.PLAIN_MESSAGE);  
          }
          else {
          name[i]=tf2.getText();
          phone1[i]=tf10.getText();//연락처 가운데 4자리
          phone2[i]=tf11.getText();//연락처 마지막 4자리
          //age[i]=tf3.getText();
          //addr[i]=tf4.getText();//텍스트 필드 주소 삭제 완료
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
        label3.setBounds(240, 60, 100, 50); //이름
        label4.setBounds(240, 90, 100, 50); //생년월일
        label5.setBounds(240, 120, 100, 50); //주소
        label6.setBounds(240, 150, 100, 50); //연락처
        //label7.setBounds(240, 180, 100, 50); //연락처
        label8.setBounds(240, 190, 100, 50); //<신간 요청>
        label9.setBounds(10,310, 65, 50); //<대여 목록>
        label10.setBounds(240, 338, 65, 50); //대여일
        label11.setBounds(240, 368, 65, 50); //반납일
        label12.setBounds(240, 460, 65, 50); //<대여 현황>
        label13.setBounds(240,210,100,50); //도서 이름
        label14.setBounds(240,240,100,50); //출판사
        label15.setBounds(240,270,100,50); //작가
        label16.setBounds(350,90,100,50); //년
        label17.setBounds(420,90,100,50); //월
        label18.setBounds(490,90,100,50); //일
        label19.setBounds(330,168,10,10); //연락처 첫번째 -
        label20.setBounds(376,168,10,10); //연락처 두번째 -
        
        //JTextArea 위치와 크기 설정
        ta1.setBounds(10, 40, 220, 270); //도서 목록
        //ta2.setBounds(245, 250, 270, 60); //<신간 요청>
        ta3.setBounds(10, 350, 220, 270); //<대여 목록>
        ta4.setBounds(240, 500, 300, 120); //<대여 현황>
        
        //JTextField 위치와 크기 설정
        tf1.setBounds(270, 45, 200, 20); //검색
        tf2.setBounds(270, 75, 80, 20); //이름
        //tf3.setBounds(270, 105, 80, 20); //생년월일
        //tf4.setBounds(270, 135, 210, 20); //텍스트 필드 주소 삭제 완료
        tf6.setBounds(280, 355, 200, 20); //대여일
        tf7.setBounds(280, 385, 200, 20); //반납일
        tf8.setBounds(295, 225, 180, 20); //<신간 요청> 도서 이름
        tf9.setBounds(295, 255, 180, 20); //<신간 요청> 출판사
        tf0.setBounds(295, 285, 180, 20); //<신간 요청> 작가
        tf10.setBounds(338, 166, 35, 20);  //연락처1 가운데 4자리
        tf11.setBounds(385, 166, 35, 20);  //연락처2 마지막 4자리
        
        //JComboBox 위치와 크기 설정
        box1.setBounds(295, 105, 53,20);//년(year)
        box2.setBounds(365, 105, 53,20);//월(month)
        box3.setBounds(435, 105, 53,20);//일(day)
        box4.setBounds(280, 135, 85,20);//city
        box5.setBounds(370, 135, 61,20);//gu
        box6.setBounds(435, 135, 85,20);//dong
        box7.setBounds(280, 165, 46,20);//phone_number
        
        
        //JButton 위치와 크기 설정
        btn1.setBounds(475, 45, 58, 20); //검색
        //btn2.setBounds(485, 195, 58, 20); //연락처
        btn3.setBounds(485, 385, 58, 20); //반납일
        btn4.setBounds(280, 425, 58, 20); //대여
        btn5.setBounds(420, 425, 58, 20); //취소
        btn6.setBounds(485, 355, 58, 20); //대여일
        //btn7.setBounds(485, 165, 58, 20); //버튼주소 삭제 완료
        btn8.setBounds(485, 285, 58, 20); //신청 버튼
        
        
        
        //JTextArea 툴팁
        ta1.setToolTipText("도서 목록");
        
        
        
        //프레임에다가 JLabel 추가
        frm.getContentPane().add(label1); //지금 책 대여 대여?
        frm.getContentPane().add(label2); //검색
        frm.getContentPane().add(label3); //이름
        frm.getContentPane().add(label4); //생년월일
        frm.getContentPane().add(label5); //주소
        frm.getContentPane().add(label6); //연락처
        //frm.getContentPane().add(label7); //연락처
        frm.getContentPane().add(label8); //<신간 요청>
        frm.getContentPane().add(label9); //<대여 목록>
        frm.getContentPane().add(label10); //대여일
        frm.getContentPane().add(label11); //반납일
        frm.getContentPane().add(label12); //<대여 현황>
        frm.getContentPane().add(label13);//(도서신청)도서  이름
        frm.getContentPane().add(label14);//(도서신청)출판사
        frm.getContentPane().add(label15);//(도서신청)작가
        frm.getContentPane().add(label16);//년
        frm.getContentPane().add(label17);//월
        frm.getContentPane().add(label18);//일
        frm.getContentPane().add(label19);//연락처 첫번째 -
        frm.getContentPane().add(label20);//연락처 두번째-
        
        //프레임에다가 JTextField 추가
        frm.getContentPane().add(tf1);//검색
        frm.getContentPane().add(tf2);//이름
        //frm.getContentPane().add(tf3);//생년월일
        //frm.getContentPane().add(tf4);//텍스트 필드 주소 삭제 완료
        frm.getContentPane().add(tf6);//대여일
        frm.getContentPane().add(tf7);//반납일
        frm.getContentPane().add(tf8);
        frm.getContentPane().add(tf9);
        frm.getContentPane().add(tf0);
        frm.getContentPane().add(tf10);//연락처 가운데 4자리
        frm.getContentPane().add(tf11);//연락처 마지막 4자리
        
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
        //frm.getContentPane().add(btn7);//버튼주소 삭제 완료
        frm.getContentPane().add(btn8);//신간요청버튼
        
        //프레임에다가 JRadioButton 추가
        
        //프레임에다가 JComboBox 추가
        frm.getContentPane().add(box1);//year
        frm.getContentPane().add(box2);//month
        frm.getContentPane().add(box3);//day
        frm.getContentPane().add(box4);//city
        frm.getContentPane().add(box5);//gu
        frm.getContentPane().add(box6);//dong
        frm.getContentPane().add(box7);//phone_number
        
        
            
        // 프레임이 보이도록 설정
        frm.setVisible(true);
    }
   public static void main(String[] args) {
      new Book(); 
      }
}