package teamp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Sub extends JFrame {
   int n = 1;
   HashMap<Integer, Book> hms = new HashMap<Integer, Book>();

   Sub(Book book) throws IOException {
      setLayout(new FlowLayout());
      JLabel j1 = new JLabel("제목" + book.book_name);
      JLabel j2 = new JLabel("저자" + book.writer);
      JLabel j3 = new JLabel("출판사" + book.publisher);
      ImageIcon im = new ImageIcon(book.book_img);
      JLabel j4 = new JLabel(im);
      JLabel j5 = new JLabel("줄거리" + book.book_story);
      add(j1);
      add(j2);
      add(j3);
      add(j4);
      add(j5);

      ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("save.dat"));
      JButton bt1 = new JButton("대여목록 추가");
      bt1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            try {
               oo.writeObject(book);
               oo.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
            dispose();
         }
      });
      add(bt1);
      setSize(500, 500);
      setVisible(true);
   }
}

class Lo extends MouseAdapter {
   Book book;

   Lo(Book book) {
      this.book = book;
   }

   public void mouseClicked(MouseEvent arg0) {
      try {
         Sub s1 = new Sub(book);
      } catch (IOException e) {
         e.printStackTrace();
      }

   }
}

public class Book {
	   int book_id;// 북 아이디 Hashmap의 키 값으로 사용 and DB 기본키로 사용
	   String book_name;// 이름
	   String writer;// 작사
	   String publisher;// 출판사
	   String book_story;// 줄거리
	   String book_img = "기본 이미지 파일 경로";// 이미지 등록 안 했을시 기본 이미지
	   int genre; // 장르별 코드 ex> 1. 로맨스 2. 스포츠 3.호러.....

	   Book(int book_id, String book_name, String writer, String publisher, String book_story, String book_img,
	         int genre) {
	      this.book_id = book_id;
	      this.book_img = book_img;
	      this.book_name = book_name;
	      this.writer = writer;
	      this.publisher = publisher;
	      this.book_story = book_story;
	      this.genre = genre;
	   }

	   public int getBook_id() {
	      return book_id;
	   }

	   public String getBook_name() {
	      return book_name;
	   }

	   public String getWriter() {
	      return writer;
	   }

	   public String getPublisher() {
	      return publisher;
	   }

	   public String getBook_story() {
	      return book_story;
	   }

	   public String getBook_img() {
	      return book_img;
	   }

	   public int getGenre() {
	      return genre;
	   }
	}