package teamp;

import java.awt.Container;
import java.awt.Font;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Sub extends JFrame implements Serializable{
	int n = 1;
	Book book;
	HashMap<Integer, Book> hms = new HashMap<Integer, Book>();

	Sub(Book book) throws IOException {
		this.book=book;
		Container c = getContentPane();
		c.setLayout(null);
		JLabel j0 = new JLabel("√•_NO : " + book.book_id);
		JLabel j1 = new JLabel("¡¶∏Ò : " + book.book_name);
		JLabel j2 = new JLabel("¿˙¿⁄ : " + book.writer);
		JLabel j3 = new JLabel("√‚∆«ªÁ : " + book.publisher);
		ImageIcon im = new ImageIcon(book.book_img);
		JLabel j4 = new JLabel(im);
		JLabel j5 = new JLabel("¡Ÿ∞≈∏Æ");
		JLabel j6 = new JLabel(book.book_story);
		
		
		JTextArea text=new JTextArea(20,30);//≈ÿΩ∫∆Æ √¢
        
		JScrollPane scroll=new JScrollPane(text);//Ω∫≈©∑—
        
        scroll.setViewportView(text);
        text.setLineWrap(true);
        text.setFont(new Font(null,1,20));
        text.setText(""+book.book_story);
        c.add("Center",scroll);
        scroll.setBounds(20,320,440,120);
		
		j0.setFont(new Font("",1,24));
		j1.setFont(new Font("",1,24));
		j2.setFont(new Font("",1,24));
		j3.setFont(new Font("",1,24));
		j5.setFont(new Font("",1,24));
		j6.setFont(new Font("",1,20));
		
		j0.setBounds(20,40,200,30);
		j1.setBounds(20,90,200,30);
		j2.setBounds(20,140,200,30);
		j3.setBounds(20,190,200,30);
		j4.setBounds(280,20,198,290);//¿ÃπÃ¡ˆ
		j5.setBounds(20,240,200,30);//¡Ÿ∞≈∏Æ ∂Û∫ß
//		j6.setBounds(20,240,400,200);//¡Ÿ∞≈∏Æ ≥ªøÎ
		
		c.add(j0);
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);
		c.add(j5);
		c.add(j6);
		setSize(500, 500);
		setVisible(true);
	}
}