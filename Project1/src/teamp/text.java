package teamp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class text extends JFrame {
	ImageIcon i = new ImageIcon("C:\\Users\\Lee\\Desktop\\close.jpg");
	Image im = i.getImage();

	text() {
		this.setTitle("∞®ªÁ«’¥œ¥Ÿ");

		Background bg = new Background();
		bg.setLayout(null);

		// ∞®ªÁπÆ±∏
		JLabel j1 = new JLabel("¿ÃøÎ«ÿ ¡÷º≈º≠");
		j1.setBounds(135, 55, 200, 50);
		j1.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 28));
		bg.add(j1);

		JLabel j2 = new JLabel("∞®ªÁ«’¥œ¥Ÿ");
		j2.setBounds(150, 95, 200, 50);
		j2.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 28));
		bg.add(j2);

		JLabel j3 = new JLabel("¥Ÿ¿Ωø° ∂« ¿ÃøÎ«ÿ¡÷ººø‰");
		j3.setBounds(70, 135, 300, 50);
		j3.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 28));
		bg.add(j3);
		// πˆ∆∞
		JButton b = new JButton("¥Îø©«œ±‚");
		b.setBounds(110, 220, 100, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setBackground(Color.BLUE);
				new Fra();
				dispose();
			}
		});
		bg.add(b);

		JButton b1 = new JButton("≥™∞°±‚");
		b1.setBounds(240, 220, 100, 50);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bg.add(b1);

		this.add(bg);
		this.setSize(450, 350);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setResizable(false); // √¢≈©±‚ ¡∂¿˝ ∫“∞°
	}

	class Background extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new text();

	}

}