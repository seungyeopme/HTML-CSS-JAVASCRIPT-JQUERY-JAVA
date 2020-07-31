package y2020.month7.ncs;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class num7 extends JFrame {
	num7() {
		Container c=getContentPane();
		JButton j[]=new JButton[9];
		c.setLayout(new GridLayout(3,3));
		
		for(int i=0; i<j.length; i++) {
			String s=Integer.toString(i+1);
			j[i]=new JButton(s);
			c.add(j[i]);
		}
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		
		new num7();
	}
}