package y2020.month8.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class gui2 extends JFrame {
	gui2() {
		  JPanel panel = new JPanel();
		  JLabel label = new JLabel("ID : ");
		  JLabel pswrd = new JLabel("PassWord : ");
		  JTextField txtID= new JTextField(10);
		  JPasswordField txtPass = new JPasswordField(10);
		  JButton logBtn = new JButton("Log in");
	 
		  panel.add(label);
	      panel.add(txtID);
	      panel.add(pswrd);
	      panel.add(txtPass);
	      panel.add(logBtn);
	 
	      logBtn.addActionListener( new ActionListener() {
	    	  public void actionPerformed(ActionEvent e) {
	    		  String id = "ididid";
	              String pass = "1234";
	              
	              if(id.equals(txtID.getText()) &&  pass.equals(txtPass.getText())) {
	            	  JOptionPane.showMessageDialog( null, "you have logged in successfully" );
	              } else {
	            	  JOptionPane.showMessageDialog( null , " you failed to log in ");
	              }
	    	  }
	      } );
	      
	      add(panel);
	      setVisible(true);
	      setSize( 600 , 400);
	      setLocationRelativeTo(null);
	      setResizable(false);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	 	
		new gui2();
	}
}
	 
	 
