package teamp;
//프로그램 실행에 필요한 클래스 파일은 5개 
//프로그램 실행은 Fra.java에서 실행!! 

//Book.java
//Fra.java
//Lo.java
//temp1.java
//text.java
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;

class Fra extends JFrame {
   int cx = 1;
   int i = 0;
   int n = 1;

   ImageIcon img1 = new ImageIcon("C:\\Users\\Lee\\Desktop\\스레드.jpg");
   JLabel jim;

   public static void main(String[] args) {
      new Fra();

   }

   Fra() {
      String name[] = new String[20];
      String phone1[] = new String[20]; // 연락처 가운데 4자리
      String phone2[] = new String[20]; // 연락처 마지막 4자리

      HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
      Book bk = new Book(1, "소나기", "황순원", "한빛문고",
            "원로 소설가 황순원 선생의 소설들 가운데 초기 작품"
                  + " 에 속하는 서정적 성장기 소설인 <소나기>, <닭제>, <산골아이>, <별>, <송아지> 등 5편의 단편을 삽화와 함께 실었다.",
            "C:\\Users\\Lee\\Desktop\\img\\소나기.PNG", 1);
      mh.put(bk.book_id, bk);
      Book bk2 = new Book(2, "19세", "이순원", "문의당",
            "작가의 개인적 체험을 바탕으로 13세부터 19세까지 성장해 가는 소년의 내면을 따뜻한 시선으로 그린 성장기 소설. \r\n"
                  + "빨리 어른이 되고 싶어하는 소년의 욕망과 꿈이 오래된 사진첩을 펼쳐 보는 것처럼 정감 어린 어투로 생생하게 묘사되어 있다. \r\n"
                  + "원작의 스토리를 580매로 개작했다.\r\n" + "중학생들과 예비 수험생들이 읽을 만한 우리 소설은 없을까? \r\n"
                  + "1960년대 이후 국내에서 출간된 장편소설 중에서 문학성이 뛰어나고 청소년 정서에 적합한 작품을 선별했다. \r\n"
                  + "원작의 문학성과 작품성이 훼손되지 않는 범위에서 소설의 분량과 이야기 구성을 독자층의 눈높이에 맞추어 작가가 직접 손질한 시리즈.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\19세.png", 1);
      mh.put(bk2.book_id, bk2);
      Book bk3 = new Book(3, "Do it!HTML5+CSS3 웹 표준의 정석", "고경희", "이지스퍼블리싱",
            "《Do it! HTML5+CSS3 웹 표준의 정석》이 전면 개정 2판으로 더욱 새로워졌다. \r\n"
                  + "최신 HTML5, CSS3 표준안 반영은 물론 코딩이 처음인 독자도 쉽고 빠르게 예제를 \r\n"
                  + "따라해 볼 수 있는 실습 환경을 제공하여 웹 개발 환경에 빠르게 적응할 수 있도록 했다.\r\n"
                  + "또한 독자들이 직접 만들면서 실습하고, 배운 내용을 복습하고, 연습문제까지 풀어보는 \r\n"
                  + "학습 설계로 구성되어 있어 한번 배운 내용을 절대로 까먹지 않는다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\자바스크립트.png", 4);
      mh.put(bk3.book_id, bk3);
      Book bk4 = new Book(4, "나의 리틀 포레스트", "박영규", "야옹서가", "한 아버지가 있다. 취업준비생 큰딸, 입시생 작은딸과는 대화가 끊긴 지 오래고, \r\n"
            + "집안 실세인 아내 앞에선 눈치 보는 신세. 가족과 살면서도 왠지 모를 소외감을 느끼던 그에게 \r\n"
            + "뜻밖의 새 가족이 생긴다. 바로 큰딸이 돌보던 길고양이 '야옹이'다.\r\n" + "이 책은 큰딸의 설득에 넘어가 떠밀리듯 고양이 세계에 발을 들인 50대 인문학자가, \r\n"
            + "자신도 모르게 캣대디(길고양이에게 밥 주는 사람)가 되면서 가족애를 회복하고 마음의 평안을 \r\n" + "얻는 과정을 아버지의 시선으로 유쾌하게 그린 가족 드라마다. \r\n"
            + "저자는 야옹이를 돌보며 \"온기 있는 생명을 보살핀다는 건, 자기 자신을 보듬는 일이기도 하다\"는 것을 깨닫는다. \r\n"
            + "\"온기 있는 생물은 모두 의지가 되는 법이야\"라던 영화 [리틀 포레스트] 속 한 장면처럼.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\나의리틀포레스트.png", 3);
      mh.put(bk4.book_id, bk4);
      Book bk5 = new Book(5, "너는 물처럼 내게 밀려오라", "이정하", "문의당",
            "수백만 독자들의 가슴을 적신 시집 <너는 눈부시지만 나는 눈물겹다>로 \r\n" + "사랑하는 사람의 슬픈 이면을 감동적으로 그려 낸 이정하 시인의 시산문집. \r\n"
                  + "그동안 수많은 독자들이 사랑했던 시들과 새로 쓴 시 여러 편, 그리고 왜 이 시를 써야 했는지에 대한 \r\n"
                  + "작가의 시작 노트를 묶어 함께 엮었다. 시로 다할 수 없는 이야기, 시 속에 감춰진 작가의 진솔한 고백들이 담겨 있다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\너는 물처럼 내게 밀려오라.png", 2);
      mh.put(bk5.book_id, bk5);

      Book bk6 = new Book(6, "아무튼,메모", "정혜윤", "위고", "<아무튼, 메모>는 메모는 삶을 위한 재료이자 예열 과정이라고 믿는 한 메모주의자의 기록으로, \r\n"
            + "비메모주의자가 메모주의자가 되고, 꿈이 현실로 부화하고, 쓴 대로 살 게 된 이야기이다.\r\n" + " 그리고 무엇보다 메모장 안에서 더 용감해진 이야기이다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\아무튼메모.PNG", 2);
      mh.put(bk6.book_id, bk6);
      Book bk7 = new Book(7, "아무튼,술", "김혼비", "제철소",
            "아무튼 시리즈의 스무 번째 이야기는 '술'이다. \r\n" + "<우아하고 호쾌한 여자 축구>의 김혼비 작가가 쓴 두 번째 에세이로,\r\n"
                  + " '생각만 해도 좋은 한 가지'에 당당히 \"술!\"이라고 외칠 수 있는 세상 모든 술꾼들을 위한 책이다.\r\n"
                  + " \"술을 말도 안 되게 좋아해서 이 책을 쓰게\" 된 작가는 수능 백일주로 시작해 술과 함께 \r\n"
                  + "익어온 인생의 어떤 부분들, 그러니까 파란만장한 주사(酒史)를 술술 펼쳐놓는다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\아무튼술.png", 2);
      mh.put(bk7.book_id, bk7);
      Book bk8 = new Book(8, "아무튼,스윙", "김선영", "위고",
            "금요일 밤에는 택시를 달려 최대한 빨리 가야 할 곳이 있다.\r\n" + " 흥겨운 재즈 음악이 가득 울리고, 백 명도 넘는 사람들이 다 함께 스윙을 추고 있는 곳. \r\n"
                  + "개구쟁이 같은 표정으로 춤을 추는 댄서들이 이따금 빵 하고 시원한 웃음을 터뜨리는 곳. \r\n"
                  + "<아무튼, 스윙>은 생각이 많아 모든 시작이 어려웠던 편집자가 직장인이 되기 위해 떠났고, \r\n"
                  + "다시 직장인으로 살기 위해 돌아온 스윙에 관한 이야기다. 즐거울 때보다 슬플 때 더 생각나는, \r\n"
                  + "울고 싶은 마음이 들면 떠올리는, 위로와 같은 '댄스'에 관한 이야기.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\아무튼스윙.png", 2);
      mh.put(bk8.book_id, bk8);
      Book bk9 = new Book(9, "우리들의 일그러진 영웅", "이문열", "다림",
            "요즘처럼 왕따가 심한 때에 당하는 아이의 심리와 가하는 아이들의 모습들이 잘 나타나 있다. \r\n"
                  + "불의에 대해 저항도 해보지만 담임 선생님의 무관심에 그 힘은 꺽이고 만다. \r\n"
                  + "당하는 아이의 처절한 굴종과 패배감이 어른이 되어서 어떤 인격체로 자라는가가 마음에 다가온다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\우리들의 일그러진 영웅.png", 2);
      mh.put(bk9.book_id, bk9);
      Book bk10 = new Book(10, "Do it!자바스크립트+제이쿼리 입문", "정인용", "이지스퍼블리싱",
            "4년 연속 베스트셀러, Do it! 자바스크립트 + 제이쿼리 입문의 전면 개정판으로, \r\n" + "자바스크립트, 제이쿼리의 기본부터 실전에 필요한 핵심까지 모두 담았다. \r\n"
                  + "프런트엔드 실무 교육 경력 10년 강사가 엄선한 155개의 예제로 기본부터 실무 활용까지 \r\n" + "완벽하게 대비할 수 있다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\자바스크립트.png", 2);
      mh.put(bk10.book_id, bk10);
      Book bk11 = new Book(11, "정보처리산업기사(필기)", "김정준", "길벗",
            "지금까지 출제된 모든 기출문제를 통계적으로 분석하여 시험에 나오는 것만 골라 172개의 섹션, \r\n"
                  + "701개의 필드로 정리했다. 섹션은 시험에 출제된 비율에 따라 A, B, C, D 등급을 지정하고, \r\n"
                  + "각 필드에는 시험에 나온 출제연도를 표기하여 수험생이 더 효율적으로 공부할 수 있도록 했다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\정처기.png", 2);
      mh.put(bk11.book_id, bk11);
      Book bk12 = new Book(12, "정보처리" + "\r\n" + "산업기사(실기)", "김정준", "길벗",
            "시험에서 한 개의 문제로 출제될 테마를 하나의 섹션으로 구성하여 개념을 이해하고\r\n"
                  + " 문제를 풀 수 있는 능력을 키울 수 있도록 충분한 내용과 자세한 해설을 수록하였다. \r\n"
                  + "또한, 섹션별 내용 설명이 끝날 때마다 ‘예상 문제 은행’을 제공한다. \r\n"
                  + "본문에서 배운 내용이 시험에서 어떻게 출제될 것인지 살펴보고 미리 풀어보면서 연습할 수 있다. \r\n"
                  + "각 섹션은 출제된 비율에 따라 A, B, C, D 등급을 지정하여 중요한 내용을 먼저 볼 수 있다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\정처기2.png", 2);
      mh.put(bk12.book_id, bk12);
      Book bk13 = new Book(13, "청춘의 문장들", "김연수", "마음산책",
            "등단 이후 여섯 권의 소설을 펴냈으며 2003년 동인문학상을 수상한 김연수는 올해 서른다섯이다. \r\n"
                  + "꾸준하게 잰 걸음으로 나아가는 그에게 첫 번째이자 마지막인(작가의 말에 따르면) 이 산문집의 의미는 무엇일까.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\청춘의문장들.png", 2);
      mh.put(bk13.book_id, bk13);
      Book bk14 = new Book(14, "스토너", "존 월리엄스", "민음사",
            "전 세계 수많은 문학 애호가들의 인생 소설로 손꼽히는 명작 《스토너》가 1965년 미국에서 처음 발행됐을 때의 표지로 출간된다. \r\n"
                  + "이번 에디션에서는 기존 판의 문장을 다듬고 문학평론가 신형철의 추천사 전문을 실었다. \r\n" + "또한 초판에 담긴 일러스트레이션을 완벽히 재현했다.\r\n"
                  + "\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\스토너.png", 2);
      mh.put(bk14.book_id, bk14);
      Book bk15 = new Book(15, "너의 낯섦은 나의 낯섦", "아도니스", "민음사",
            "민음사 세계시인선 42권. 아도니스의 대표 시 선집. 매년 유력한 노벨문학상 후보로 꼽히곤 \r\n"
                  + "하는 시인 아도니스에 대한 호기심과 현대 아랍 문학에 대한 전문적인 관심 모두를 충족할 \r\n"
                  + "한 권의 시집이 도착했다. 이번 책은 세계적으로 알려진 작가지만 아직 우리에게는 낯선 이름인\r\n"
                  + " 아도니스, 그의 문학 인생 전반에 걸친 대표시를 뽑아 구성하였다. \r\n"
                  + "문학으로 아랍의 현대화를 위해 평생 애썼던 아도니스의 변혁과 혁신은 현재 진행형이다.\r\n" + "",
            "C:\\Users\\Lee\\Desktop\\img\\너의 낯섦은 나의 낯섦.png", 2);
      mh.put(bk15.book_id, bk15);

      JFrame frm = new JFrame("도서 대여 프로그램");
      Container c = frm.getContentPane();
      c.setBackground(new Color(244, 164, 96));
      // 프레임 크기 설정
      frm.setSize(568, 820);

      // 프레임을 화면 가운데에 배치
      frm.setLocationRelativeTo(null);

      // 프레임을 닫았을 때 메모리에서 제거되도록 설정
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // 레이아웃 설정
      frm.getContentPane().setLayout(null);

      // JLabel 생성
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
      JLabel label19 = new JLabel("-");// 연락처 첫번째 -
      JLabel label20 = new JLabel("-");// 연락처 두번째 -

      // JComboBox 생성
      String[] year = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" };
      JComboBox box1 = new JComboBox(year);

      String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
      JComboBox box2 = new JComboBox(month);

      String[] day = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
            "18", "18", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
      JComboBox box3 = new JComboBox(day);

      String[] city = { "서울특별시", "부산광역시", "대구광역시", "인천광역시", "광주광역시", "대전광역시", "울산광역시", "제주특별자치도", "세종특별자치시", "수원시",
            "고양시", "용인시", "성남시", "화성시", "부천시", "남양주시", "안산시", "안양시", "평택시", "시흥시", "파주시", "의정부시", "김포시", "광주시",
            "광명시", "하남시", "군포시", "오산시", "양주시", "이천시", "구리시", "안성시", "의왕시", "포천시", "양평군", "여주시", "동두천시", "가평군",
            "과천시", "연천군", "춘천시", "원주시", "강릉시", "동해시", "태백시", "속초시", "삼척시", "홍천군", "횡성군", "영월군", "평창군", "정선군", "철원군",
            "화천군", "양구군", "인제군", "고성군", "양양군", "청주시", "충주시", "제천시", "보은군", "옥천군", "영동군", "증평군", "진천군", "괴산군", "음성군",
            "단양군", "천안시", "공주시", "보령시", "아산시", "서산시", "논산시", "계룡시", "당진시", "금산군", "부여군", "서천군", "청양군", "홍성군", "예산군",
            "태안군", "전주시", "익산시", "군산시", "정읍시", "남원시", "김제시", "완주군", "고창군", "부안군", "임실군", "순창군", "진안군", "무주군", "장수군",
            "목포부", "무안군", "나주군", "화순군", "곡성군", "담양군", "여수군", "제주군", "함평군", "영광군", "광주군", "광양군", "고흥군", "보성군", "강진군",
            "해남군", "장성군", "구례군", "장흥군", "완도군", "진도군", "순천군", "영암군", "대구부", "달성군", "경산군", "영천군", "경주군", "영일군", "영덕군",
            "영양군", "청송군", "안동군", "의성군", "군위군", "칠곡군", "김천군", "김천군", "상주군", "예천군", "영주군", "봉화군", "문경군", "성주군", "고령군",
            "청도군", "선산군", "울도군", "부산부", "마산부", "울산군", "동래군", "창녕군", "사천군", "하동군", "거창군", "고성군", "통영군", "함양군", "합천군",
            "의령군", "함안군", "산청군", "창원군", "진주군", "김해군", "밀양군", "양산군", "남해군" };
      JComboBox box4 = new JComboBox(city);

      String[] gu = { "종로구", "중구", "용산구", "성동구", "광진구", "동대문구", "중랑구", "성북구", "강북구", "도봉구", "노원구", "은평구", "서대문구",
            "마포구", "양천구", "강서구", "구로구", "금천구", "영등포구", "동작구", "관악구", "서초구", "강남구", "송파구", "강동구" };
      JComboBox box5 = new JComboBox(gu);

      String[] dong = { "청운효자동", "사직동", "삼청동", "부암동", "평창동", "무악동", "교남동", "가회동", "종로1234가동", "종로56가동", "이화동", "혜화동",
            "창신제1동", "창신제2동", "창신제3동", "숭인제1동", "숭인제2동" };
      JComboBox box6 = new JComboBox(dong);

      String[] phone_number = { "010", "011", "017", "016", "018", "019" };
      JComboBox box7 = new JComboBox(phone_number);

      // JTextArea 생성
      JTextArea ta1 = new JTextArea();// 도서 목록
//      JTextArea ta2 = new JTextArea();// <신간 요청>
      JPanel ta3 = new JPanel();// <대여 목록>
      ta3.setBackground(new Color(240, 248, 255));
      ta3.setLayout(null);
      LineBorder lbta = new LineBorder(new Color(255, 182, 193));
      JLabel ta3jJLabel1 = new JLabel(" 책 제목");
      JLabel ta3jJLabel2 = new JLabel(" 저자");
      JLabel ta3jJLabel3 = new JLabel(" 출판사");
      ta3jJLabel1.setBorder(lbta);
      ta3jJLabel2.setBorder(lbta);
      ta3jJLabel3.setBorder(lbta);
      ta3jJLabel1.setBounds(0, 0, 73, 24);
      ta3jJLabel2.setBounds(73, 0, 73, 24);
      ta3jJLabel3.setBounds(146, 0, 74, 24);
      ta3.add(ta3jJLabel1);
      ta3.add(ta3jJLabel2);
      ta3.add(ta3jJLabel3);

      JTextArea ta4 = new JTextArea();// <대여 현황>
      ta4.setText("대여일을 선택해 주세요.");

      // 대여일(오늘날짜)
      Calendar cal = Calendar.getInstance();
      Date today = cal.getTime();
      // 반납일(오늘로부터 7일 후)
      cal.add(Calendar.DAY_OF_YEAR, 7);
      Date nomal = cal.getTime();
      cal.add(Calendar.DAY_OF_YEAR, 15);
      Date max = cal.getTime();

      // 대여일 (아직 증가하면 반납일도 같이 증가시키는 법을 못 찾아서 증가안되게 정해둠)
      SpinnerDateModel model = new SpinnerDateModel(today, today, null, Calendar.DAY_OF_MONTH);
      // (표기할 날짜,최소,최대,바꿀 부분)
      JSpinner tf6 = new JSpinner(model);

      JSpinner.DateEditor editor = new JSpinner.DateEditor(tf6, "yyyy-MM-dd");
      JFormattedTextField rentday = editor.getTextField();
      rentday.setEditable(false);
      rentday.setHorizontalAlignment(JTextField.CENTER);

      tf6.setEditor(editor);

      // 반납일을 기본적으로 오늘날짜의+7로 설정해두고 대여자가 반납일을 +,-할수있음 최대 15일까지 가능
      SpinnerDateModel model1 = new SpinnerDateModel(nomal, today, max, Calendar.DAY_OF_MONTH);
      JSpinner tf7 = new JSpinner(model1);

      JSpinner.DateEditor editor1 = new JSpinner.DateEditor(tf7, "yyyy-MM-dd");
      JFormattedTextField rentday1 = editor1.getTextField();
      rentday1.setEditable(true);
      rentday1.setHorizontalAlignment(JTextField.CENTER);
      tf7.setVisible(false);

      tf7.setEditor(editor1);
      frm.getContentPane().add(tf6);
      frm.getContentPane().add(tf7);
      // 패널 생성
      JPanel jp1 = new JPanel();
      jp1.setBackground(new Color(240, 248, 255));
      // JRadioButton 생성

      LineBorder lb = new LineBorder(new Color(255, 182, 193));
      // JTextField 생성
      JTextField tf1 = new JTextField(); // 검색
      tf1.setText("도서 검색");// 기본 입력 값 설정
      tf1.setEnabled(true);
      tf1.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
            tf1.setText("");
         }
      });
      tf1.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent arg0) {

            if (arg0.getKeyChar() == (char) 10) {
               jp1.removeAll();
               jp1.repaint();
               String str = "";
               for (int n = 1; n < mh.size(); n++) {
                  if (mh.get(n).book_name.contains(tf1.getText())) {
                     JLabel j = new JLabel();
                     Book b = mh.get(n);
                     JButton jbt = new JButton("√");
                     jbt.setBounds(160, 0, 43, 25);
                     JOptionPane jop = new JOptionPane();
                     jbt.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                           int a = jop.showConfirmDialog(null, "대여 목록에 추가 합니다.", "확인",
                                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                           if (cx >= 5) {
                              jop.showConfirmDialog(null, "한번에 4권까지만 대여 가능합니다.", "확인",
                                    JOptionPane.PLAIN_MESSAGE);
                           } else if (a == 0) {

                              JLabel pl1 = new JLabel(b.getBook_name());
                              JLabel pl2 = new JLabel(b.getWriter());
                              JLabel pl3 = new JLabel(b.getPublisher());
                              pl1.setBounds(0, 24 * cx, 73, 24);
                              pl2.setBounds(73, 24 * cx, 73, 24);
                              pl3.setBounds(146, 24 * cx, 74, 24);
                              ta3.add(pl1);
                              ta3.add(pl2);
                              ta3.add(pl3);
                              jbt.setEnabled(false);
                              ta3.revalidate();
                              ta3.repaint();
                              cx++;
                           }
                        }
                     });
                     j.setBorder(lb);
                     j.setText(b.getBook_name() + " (" + b.getWriter() + ") "
//                     + "[" + b.getPublisher() + "]"
                     );
                     j.setToolTipText(b.book_name + " " + "ⓟ" + b.getPublisher());
                     j.addMouseListener(new Lo(b));

                     j.addMouseListener(new MouseAdapter() {
                        public void mouseExited(MouseEvent e) {
                           j.setForeground(Color.black);
                        }

                        public void mouseEntered(MouseEvent e) {
                           j.setForeground(Color.blue);
                           j.setCursor(new Cursor(HAND_CURSOR));
                        }
                     });
                     jp1.add(j);
                     j.add(jbt);
                     jp1.repaint();
                  }
               }
               if (tf1.getText().equals("")) {
//                  JOptionPane.showMessageDialog(null, "검색어를 입력하셔야 합니다", "ERROR", JOptionPane.INFORMATION_MESSAGE);
               }
            }
            jp1.repaint();
         }
      });

      JTextField tf2 = new JTextField(); // 이름
//      JTextField tf3 = new JTextField(); // 나이
//      JTextField tf4 = new JTextField(); // 주소
//      JTextField tf5 = new JTextField(); // 연락처
//      JTextField tf6 = new JTextField(); // 대여일
//      JTextField tf7 = new JTextField(); // 반납일
      JTextField tf8 = new JTextField(); // (도서신청)도서 이름
      tf8.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent arg0) {
            if (arg0.getKeyChar() == (char) 10) {
               tf8.nextFocus();
            }
         }
      });

      JTextField tf9 = new JTextField(); // (도서신청)출판사
      tf9.addKeyListener(new KeyAdapter() {
         public void keyTyped(KeyEvent arg0) {
            if (arg0.getKeyChar() == (char) 10) {
               tf9.nextFocus();
            }
         }
      });
      JTextField tf0 = new JTextField(); // (도서신청)작가
      JTextField tf10 = new JTextField(); // 연락처1 가운데 4자리
      JTextField tf11 = new JTextField(); // 연락처2 마지막 4자리

      // JButton 생성
      JButton btn1 = new JButton("OK");// 검색

      btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            jp1.removeAll();
            jp1.repaint();
            String str = "";
            for (int n = 1; n < mh.size(); n++) {
               if (mh.get(n).book_name.contains(tf1.getText())) {
                  JLabel j = new JLabel();
                  Book b = mh.get(n);
                  JButton jbt = new JButton("√");
                  jbt.setBounds(160, 0, 43, 25);
                  JOptionPane jop = new JOptionPane();
                  jbt.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent arg0) {
                        int a = jop.showConfirmDialog(null, "대여 목록에 추가 합니다.", "확인",
                              JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if (cx >= 5) {
                           jop.showConfirmDialog(null, "한번에 4권까지만 대여 가능합니다.", "확인", JOptionPane.PLAIN_MESSAGE);
                        } else if (a == 0) {

                           JLabel pl1 = new JLabel(b.getBook_name());
                           JLabel pl2 = new JLabel(b.getWriter());
                           JLabel pl3 = new JLabel(b.getPublisher());
                           pl1.setBounds(0, 24 * cx, 73, 24);
                           pl2.setBounds(73, 24 * cx, 73, 24);
                           pl3.setBounds(146, 24 * cx, 74, 24);
                           ta3.add(pl1);
                           ta3.add(pl2);
                           ta3.add(pl3);
                           jbt.setEnabled(false);
                           ta3.revalidate();
                           ta3.repaint();
                           cx++;
                        }
                     }
                  });
                  j.setBorder(lb);
                  j.setText(b.getBook_name() + " (" + b.getWriter() + ") "
//                  + "[" + b.getPublisher() + "]"
                  );
                  j.setToolTipText(b.book_name + " " + "ⓟ" + b.getPublisher());
                  j.addMouseListener(new Lo(b));

                  j.addMouseListener(new MouseAdapter() {
                     public void mouseExited(MouseEvent e) {
                        j.setForeground(Color.black);
                     }

                     public void mouseEntered(MouseEvent e) {
                        j.setForeground(Color.blue);
                        j.setCursor(new Cursor(HAND_CURSOR));
                     }
                  });
                  jp1.add(j);
                  j.add(jbt);
                  jp1.repaint();
               }
            }
            if (tf1.getText().equals("")) {
//               JOptionPane.showMessageDialog(null, "검색어를 입력하셔야 합니다", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            }
            jp1.repaint();
         }
      });

      JButton btn2 = new JButton("OK");// 연락처

      JButton btn3 = new JButton("OK");// 반납일
      btn3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ta4.setText("<대여>를 눌러주세요.");
            btn3.setEnabled(false);
         }
      });
//대여 버튼 
      ta4.setFont(new Font(null, 1, 20));
      JButton btn4 = new JButton("대여");// 대여
      btn4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (tf2.getText().equals("") || tf10.getText().equals("") || tf11.getText().equals("")
            /* || tf5.getText().equals("") */) {
               JOptionPane.showMessageDialog(null, "필수 입력칸이 비어있습니다.", "알림", JOptionPane.PLAIN_MESSAGE);

            } else {
               name[i] = tf2.getText();
               phone1[i] = tf10.getText();// 연락처 가운데 4자리
               phone2[i] = tf11.getText();// 연락처 마지막 4자리
               i++;
               btn4.setEnabled(false);
               Thread t = new Thread() {
                  public void run() {
                     try {

                        int time = (int) (Math.random() * 1000) + 800;
                        ta4.setText("진행중입니다...");
                        Thread.sleep(time);
                        ta4.setText("잠시만 기다려 주십시오.");
                        Thread.sleep(time);
                        ta4.setText("<대여>가 완료되었습니다." + "\n" + "<반납일>을 지켜주세요.");
                        Thread.sleep(2000);

                        new text();
                        frm.dispose();
                     } catch (InterruptedException e) {
                        ta4.setText("시스템 오류입니다." + "\n" + "처음부터 다시 시작해주세요.");
                     }
                  }
               };
               t.start();
            }
         }
      });

      JButton btn6 = new JButton("OK");// 대여일
      btn6.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {

            btn6.setEnabled(false);
            tf7.setVisible(true);
            ta4.setText("반납일은 대여일로부터 " + "\n" + " 1~15이내에 가능합니다." + "\n" + "반납일을 잘 지켜주세요.");

         }
      });

      JButton btn5 = new JButton("취소");// 취소
      btn5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ta4.setText("<취소>되었습니다." + "\n" + "처음부터 다시 시작해주세요.");

            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn6.setEnabled(true);
         }
      });

      JButton btn7 = new JButton("OK");// 주소
      JButton btn8 = new JButton("신청");// 신청
      btn8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new JOptionPane().showConfirmDialog(null, "도서 신청을 하시겠습니까?", "확인", JOptionPane.OK_CANCEL_OPTION,
                  JOptionPane.INFORMATION_MESSAGE);
         }
      });
      // JComboBox 위치와 크기 설정
      box1.setBounds(295, 105, 53, 20);// 년(year)
      box2.setBounds(365, 105, 53, 20);// 월(month)
      box3.setBounds(435, 105, 53, 20);// 일(day)
      box4.setBounds(280, 135, 85, 20);// city
      box5.setBounds(370, 135, 61, 20);// gu
      box6.setBounds(435, 135, 85, 20);// dong
      box7.setBounds(280, 165, 46, 20);// phone_number

      // JLabel 위치와 크기 설정
//      label1.setBounds(225, 0, 100, 50); // 지금 책 대여 대여?
      label2.setBounds(240, 30, 100, 50); // 검색
      label3.setBounds(240, 60, 100, 50); // 이름
      label4.setBounds(240, 90, 100, 50); // 생년월일
      label5.setBounds(240, 120, 100, 50); // 주소
      label6.setBounds(240, 150, 100, 50); // 연락처
//      label7.setBounds(240, 180, 100, 50); // 연락처
      label8.setBounds(240, 190, 100, 50); // <신간 요청>
      label9.setBounds(10, 310, 85, 50); // <대여 목록>
      label10.setBounds(240, 338, 65, 50); // 대여일
      label11.setBounds(240, 368, 65, 50); // 반납일
      label12.setBounds(240, 460, 90, 50); // <대여 현황>
      label13.setBounds(240, 210, 100, 50); // 도서 이름
      label14.setBounds(240, 240, 100, 50); // 출판사
      label15.setBounds(240, 270, 100, 50); // 작가
      label16.setBounds(350, 90, 100, 50); // 년
      label17.setBounds(420, 90, 100, 50); // 월
      label18.setBounds(490, 90, 100, 50); // 일
      label19.setBounds(330, 168, 10, 10); // 연락처 첫번째 -
      label20.setBounds(376, 168, 10, 10); // 연락처 두번째 -

      // JTextArea 위치와 크기 설정

//      ta2.setBounds(245, 250, 270, 60); // <신간 요청>
      ta3.setBounds(10, 350, 220, 270); // <대여 목록>
      ta4.setBounds(245, 500, 270, 120); // <대여 현황>

      // JTextField 위치와 크기 설정
      tf1.setBounds(270, 45, 195, 20); // 검색
      tf2.setBounds(270, 75, 80, 20); // 이름
//      tf3.setBounds(270, 135, 80, 20); // 나이
//      tf4.setBounds(270, 165, 210, 20); // 주소
//      tf5.setBounds(280, 195, 200, 20); // 연락처
      tf6.setBounds(280, 355, 200, 20); // 대여일
      tf7.setBounds(280, 385, 200, 20); // 반납일
      tf8.setBounds(295, 225, 170, 20); // <신간 요청> 도서 이름
      tf9.setBounds(295, 255, 170, 20); // <신간 요청> 출판사
      tf0.setBounds(295, 285, 170, 20); // <신간 요청> 작가
      tf10.setBounds(338, 166, 35, 20); // 연락처1 가운데 4자리
      tf11.setBounds(385, 166, 35, 20); // 연락처2 마지막 4자리

      // JButton 위치와 크기 설정
      btn1.setBounds(480, 45, 58, 20); // 검색
//      btn2.setBounds(485, 195, 58, 20); // 연락처
      btn3.setBounds(485, 385, 58, 20); // 반납일
      btn4.setBounds(280, 425, 88, 40); // 대여
      btn5.setBounds(390, 425, 88, 40); // 취소
      btn6.setBounds(485, 355, 58, 20); // 대여일
//      btn7.setBounds(485, 165, 58, 20); // 주소
      btn8.setBounds(480, 285, 62, 20); // 신청 버튼

      // 패널 위치 크기 테두리

//      jp1.setBounds(10, 40, 220, 270); // 도서 목록
      jp1.setLayout(new GridLayout(15, 1));
      jp1.setSize(110, 800);
      JScrollPane jsp = new JScrollPane(jp1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      jsp.setBounds(10, 40, 220, 270);
      for (int i = 1; i <= mh.size(); i++) {
         JLabel j = new JLabel();
         Book b = mh.get(i);
         JButton jbt = new JButton("√");
         jbt.setBounds(160, 0, 43, 25);
         JOptionPane jop = new JOptionPane();
         jbt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               int a = jop.showConfirmDialog(null, "대여 목록에 추가 합니다.", "확인", JOptionPane.OK_CANCEL_OPTION,
                     JOptionPane.INFORMATION_MESSAGE);
               if (cx >= 5) {
                  jop.showConfirmDialog(null, "한번에 4권까지만 대여 가능합니다.", "확인", JOptionPane.PLAIN_MESSAGE);
               } else if (a == 0) {

                  JLabel pl1 = new JLabel(b.getBook_name());
                  JLabel pl2 = new JLabel(b.getWriter());
                  JLabel pl3 = new JLabel(b.getPublisher());
                  pl1.setBounds(0, 24 * cx, 73, 24);
                  pl2.setBounds(73, 24 * cx, 73, 24);
                  pl3.setBounds(146, 24 * cx, 74, 24);
                  ta3.add(pl1);
                  ta3.add(pl2);
                  ta3.add(pl3);
                  jbt.setEnabled(false);
                  ta3.revalidate();
                  ta3.repaint();
                  cx++;
               }
            }
         });

         j.setBorder(lb);
         j.setText(b.getBook_name() + " (" + b.getWriter() + ") "
//         + "[" + b.getPublisher() + "]"
         );
         j.setToolTipText(b.book_name + " " + "ⓟ" + b.getPublisher());
         j.addMouseListener(new Lo(b));

         j.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
               j.setForeground(Color.black);
            }

            public void mouseEntered(MouseEvent e) {
               j.setForeground(Color.blue);
               j.setCursor(new Cursor(HAND_CURSOR));
            }
         });
         jp1.add(j);
         j.add(jbt);
      }
      // JTextArea 툴팁
      ta1.setToolTipText("도서 목록");

      // 프레임에다가 JLabel 추가
      frm.getContentPane().add(label1); // 지금 책 대여 대여?
      frm.getContentPane().add(label2); // 검색
      frm.getContentPane().add(label3); // 장르
      frm.getContentPane().add(label4); // 이름
      frm.getContentPane().add(label5); // 나이
      frm.getContentPane().add(label6); // 주소
//      frm.getContentPane().add(label7); // 연락처
      frm.getContentPane().add(label8); // <신간 요청>
      frm.getContentPane().add(label9); // <대여 목록>
      frm.getContentPane().add(label10); // 대여일
      frm.getContentPane().add(label11); // 반납일
      frm.getContentPane().add(label12); // <대여 현황>
      frm.getContentPane().add(label13);// (도서신청)도서 이름
      frm.getContentPane().add(label14);// (도서신청)출판사
      frm.getContentPane().add(label15);// (도서신청)작가
      frm.getContentPane().add(label16);// 년
      frm.getContentPane().add(label17);// 월
      frm.getContentPane().add(label18);// 일
      frm.getContentPane().add(label19);// 연락처 첫번째 -
      frm.getContentPane().add(label20);// 연락처 두번째-

      // 프레임에다가 Jeld 추가
      frm.getContentPane().add(tf1);// 검색
      frm.getContentPane().add(tf2);// 이름
//      frm.getContentPane().add(tf3);// 나이
//      frm.getContentPane().add(tf4);// 주소
//      frm.getContentPane().add(tf5);// 연락처
      frm.getContentPane().add(tf6);// 대여일
      frm.getContentPane().add(tf7);// 반납일
      frm.getContentPane().add(tf8);//
      frm.getContentPane().add(tf9);
      frm.getContentPane().add(tf0);
      frm.getContentPane().add(tf10);// 연락처 가운데 4자리
      frm.getContentPane().add(tf11);// 연락처 마지막 4자리

      // 프레임에다가 TextArea 추가
      frm.getContentPane().add(ta1);// 도서 목록
//      frm.getContentPane().add(ta2);// <신간 요청>
      frm.getContentPane().add(ta3);// <대여 목록>
      frm.getContentPane().add(ta4);// <대여 현황>

      // 프레임에다가 버튼 추가
      frm.getContentPane().add(btn1);// 검색
//      frm.getContentPane().add(btn2);// 연락처
      frm.getContentPane().add(btn3);// 반납일
      frm.getContentPane().add(btn4);// 대여
      frm.getContentPane().add(btn5);// 취소
      frm.getContentPane().add(btn6);// 대여일
      frm.getContentPane().add(btn7);// 주소
      frm.getContentPane().add(btn8);

      // 프레임에다가 JComboBox 추가
      frm.getContentPane().add(box1);// year
      frm.getContentPane().add(box2);// month
      frm.getContentPane().add(box3);// day
      frm.getContentPane().add(box4);// city
      frm.getContentPane().add(box5);// gu
      frm.getContentPane().add(box6);// dong
      frm.getContentPane().add(box7);// phone_number

      // 패널 추가
      JPanel jp = new JPanel();
      frm.add(jp);
      jp.setLayout(new FlowLayout());
      jp.setBounds(10, 650, 510, 85);
      JLabel foot = new JLabel("서울특별시 종로구 Copyright ⓒ 도서관 All rights reserved.");
      jim = new JLabel(img1);
      jp.add(jim);
      jp.setBackground(new Color(240, 248, 255));

      foot.setBounds(25, 740, 400, 30);
      new Thread(new Runnable() {
         public void run() {
            for (;;) {
               int x = jim.getX() + 5;
               int y = jim.getY();
               if (x > jim.getWidth() - 850) {
                  jim.setLocation(-380, 0);
               } else
                  jim.setLocation(x, y);
               try {
                  Thread.sleep(100);
               } catch (Exception e) {
               }
            }
         }
      }).start();
//      frm.add(jp1);
      frm.add("center", jsp);
      frm.add(foot);

      // 프레임이 보이도록 설정
      frm.setVisible(true);
   }
}