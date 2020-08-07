package y2020.month8.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gui3 extends JFrame{
	gui3(){
		super("Java Programming");
		Container c=getContentPane();
		c.setLayout(new FlowLayout());

		JLabel j=new JLabel("Password : ");
		c.add(j);

		JTextField jt=new JTextField(10);
		c.add(jt);

		JButton jb=new JButton("OK");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jt.setText("비밀번호~");
			}
		});
		JButton jb1=new JButton("Reset");
		c.add(jb);
		c.add(jb1);

		setVisible(true);
		setSize(400,100);
	}
public static void main(String[] args) {
	new gui3();
	}
}