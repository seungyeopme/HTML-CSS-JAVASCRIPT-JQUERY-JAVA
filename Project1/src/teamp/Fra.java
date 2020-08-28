package teamp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.LineBorder;

class Fra extends JFrame {
	int cx = 1;
	int i = 0;
	int n = 1;

	ImageIcon img1 = new ImageIcon("C:\\Users\\Lee\\Desktop\\Ω∫∑πµÂ.jpg");
	JLabel jim;

	public static void main(String[] args) {
		new Fra();

	}

	Fra() {
		String name[] = new String[20];
		String phone1[] = new String[20]; // ø¨∂Ù√≥ ∞°øÓµ• 4¿⁄∏Æ
		String phone2[] = new String[20]; // ø¨∂Ù√≥ ∏∂¡ˆ∏∑ 4¿⁄∏Æ

		HashMap<Integer, Book> mh = new HashMap<Integer, Book>();
		Book bk = new Book(1, "º“≥™±‚", "»≤º¯ø¯", "«—∫˚πÆ∞Ì",
				"ø¯∑Œ º“º≥∞° »≤º¯ø¯ º±ª˝¿« º“º≥µÈ ∞°øÓµ• √ ±‚ ¿€«∞"
						+ " ø° º”«œ¥¬ º≠¡§¿˚ º∫¿Â±‚ º“º≥¿Œ <º“≥™±‚>, <¥ﬂ¡¶>, <ªÍ∞Òæ∆¿Ã>, <∫∞>, <º€æ∆¡ˆ> µÓ 5∆Ì¿« ¥‹∆Ì¿ª ª»≠øÕ «‘≤≤ Ω«æ˙¥Ÿ.",
				"C:\\Users\\Lee\\Desktop\\img\\º“≥™±‚.PNG", 1);
		mh.put(bk.book_id, bk);
		Book bk2 = new Book(2, "19ºº", "¿Ãº¯ø¯", "πÆ¿«¥Á",
				"¿€∞°¿« ∞≥¿Œ¿˚ √º«Ë¿ª πŸ≈¡¿∏∑Œ 13ºº∫Œ≈Õ 19ºº±Ó¡ˆ º∫¿Â«ÿ ∞°¥¬ º“≥‚¿« ≥ª∏È¿ª µ˚∂Ê«— Ω√º±¿∏∑Œ ±◊∏∞ º∫¿Â±‚ º“º≥. \r\n"
						+ "ª°∏Æ æÓ∏•¿Ã µ«∞Ì ΩÕæÓ«œ¥¬ º“≥‚¿« øÂ∏¡∞˙ ≤ﬁ¿Ã ø¿∑°µ» ªÁ¡¯√∏¿ª ∆Ó√ƒ ∫∏¥¬ ∞Õ√≥∑≥ ¡§∞® æÓ∏∞ æÓ≈ı∑Œ ª˝ª˝«œ∞‘ π¶ªÁµ«æÓ ¿÷¥Ÿ. \r\n"
						+ "ø¯¿€¿« Ω∫≈‰∏Æ∏¶ 580∏≈∑Œ ∞≥¿€«ﬂ¥Ÿ.\r\n" + "¡ﬂ«–ª˝µÈ∞˙ øπ∫Ò ºˆ«Ëª˝µÈ¿Ã ¿–¿ª ∏∏«— øÏ∏Æ º“º≥¿∫ æ¯¿ª±Ó? \r\n"
						+ "1960≥‚¥Î ¿Ã»ƒ ±π≥ªø°º≠ √‚∞£µ» ¿Â∆Ìº“º≥ ¡ﬂø°º≠ πÆ«–º∫¿Ã ∂ŸæÓ≥™∞Ì √ªº“≥‚ ¡§º≠ø° ¿˚«’«— ¿€«∞¿ª º±∫∞«ﬂ¥Ÿ. \r\n"
						+ "ø¯¿€¿« πÆ«–º∫∞˙ ¿€«∞º∫¿Ã »—º’µ«¡ˆ æ ¥¬ π¸¿ßø°º≠ º“º≥¿« ∫–∑Æ∞˙ ¿Ãæﬂ±‚ ±∏º∫¿ª µ∂¿⁄√˛¿« ¥´≥Ù¿Ãø° ∏¬√ﬂæÓ ¿€∞°∞° ¡˜¡¢ º’¡˙«— Ω√∏Æ¡Ó.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\19ºº.png", 1);
		mh.put(bk2.book_id, bk2);
		Book bk3 = new Book(3, "Do it!HTML5+CSS3 ¿• «•¡ÿ¿« ¡§ºÆ", "∞Ì∞Ê»Ò", "¿Ã¡ˆΩ∫∆€∫Ì∏ÆΩÃ",
				"°∂Do it! HTML5+CSS3 ¿• «•¡ÿ¿« ¡§ºÆ°∑¿Ã ¿¸∏È ∞≥¡§ 2∆«¿∏∑Œ ¥ıøÌ ªı∑Œøˆ¡≥¥Ÿ. \r\n"
						+ "√÷Ω≈ HTML5, CSS3 «•¡ÿæ» π›øµ¿∫ π∞∑– ƒ⁄µ˘¿Ã √≥¿Ω¿Œ µ∂¿⁄µµ Ω±∞Ì ∫¸∏£∞‘ øπ¡¶∏¶ \r\n"
						+ "µ˚∂Û«ÿ ∫º ºˆ ¿÷¥¬ Ω«Ω¿ »Ø∞Ê¿ª ¡¶∞¯«œø© ¿• ∞≥πﬂ »Ø∞Êø° ∫¸∏£∞‘ ¿˚¿¿«“ ºˆ ¿÷µµ∑œ «ﬂ¥Ÿ.\r\n"
						+ "∂««— µ∂¿⁄µÈ¿Ã ¡˜¡¢ ∏∏µÈ∏Èº≠ Ω«Ω¿«œ∞Ì, πËøÓ ≥ªøÎ¿ª ∫πΩ¿«œ∞Ì, ø¨Ω¿πÆ¡¶±Ó¡ˆ «ÆæÓ∫∏¥¬ \r\n"
						+ "«–Ω¿ º≥∞Ë∑Œ ±∏º∫µ«æÓ ¿÷æÓ «—π¯ πËøÓ ≥ªøÎ¿ª ¿˝¥Î∑Œ ±Ó∏‘¡ˆ æ ¥¬¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\¿⁄πŸΩ∫≈©∏≥∆Æ.png", 4);
		mh.put(bk3.book_id, bk3);
		Book bk4 = new Book(4, "≥™¿« ∏Æ∆≤ ∆˜∑πΩ∫∆Æ", "π⁄øµ±‘", "æﬂøÀº≠∞°", "«— æ∆πˆ¡ˆ∞° ¿÷¥Ÿ. √Îæ˜¡ÿ∫Òª˝ ≈´µ˛, ¿‘Ω√ª˝ ¿€¿∫µ˛∞˙¥¬ ¥Î»≠∞° ≤˜±‰ ¡ˆ ø¿∑°∞Ì, \r\n"
				+ "¡˝æ» Ω«ºº¿Œ æ∆≥ª æ’ø°º± ¥´ƒ° ∫∏¥¬ Ω≈ºº. ∞°¡∑∞˙ ªÏ∏Èº≠µµ øÿ¡ˆ ∏∏¶ º“ø‹∞®¿ª ¥¿≥¢¥¯ ±◊ø°∞‘ \r\n"
				+ "∂Êπ€¿« ªı ∞°¡∑¿Ã ª˝±‰¥Ÿ. πŸ∑Œ ≈´µ˛¿Ã µπ∫∏¥¯ ±Ê∞ÌæÁ¿Ã 'æﬂøÀ¿Ã'¥Ÿ.\r\n" + "¿Ã √•¿∫ ≈´µ˛¿« º≥µÊø° ≥—æÓ∞° ∂∞π–∏ÆµÌ ∞ÌæÁ¿Ã ºº∞Ëø° πﬂ¿ª µÈ¿Œ 50¥Î ¿ŒπÆ«–¿⁄∞°, \r\n"
				+ "¿⁄Ω≈µµ ∏∏£∞‘ ƒπ¥Îµ(±Ê∞ÌæÁ¿Ãø°∞‘ π‰ ¡÷¥¬ ªÁ∂˜)∞° µ«∏Èº≠ ∞°¡∑æ÷∏¶ »∏∫π«œ∞Ì ∏∂¿Ω¿« ∆Úæ»¿ª \r\n" + "æÚ¥¬ ∞˙¡§¿ª æ∆πˆ¡ˆ¿« Ω√º±¿∏∑Œ ¿ØƒË«œ∞‘ ±◊∏∞ ∞°¡∑ µÂ∂Û∏∂¥Ÿ. \r\n"
				+ "¿˙¿⁄¥¬ æﬂøÀ¿Ã∏¶ µπ∫∏∏Á \"ø¬±‚ ¿÷¥¬ ª˝∏Ì¿ª ∫∏ªÏ«…¥Ÿ¥¬ ∞«, ¿⁄±‚ ¿⁄Ω≈¿ª ∫∏µÎ¥¬ ¿œ¿Ã±‚µµ «œ¥Ÿ\"¥¬ ∞Õ¿ª ±˙¥›¥¬¥Ÿ. \r\n"
				+ "\"ø¬±‚ ¿÷¥¬ ª˝π∞¿∫ ∏µŒ ¿«¡ˆ∞° µ«¥¬ π˝¿Ãæﬂ\"∂Û¥¯ øµ»≠ [∏Æ∆≤ ∆˜∑πΩ∫∆Æ] º” «— ¿Â∏È√≥∑≥.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\≥™¿«∏Æ∆≤∆˜∑πΩ∫∆Æ.png", 3);
		mh.put(bk4.book_id, bk4);
		Book bk5 = new Book(5, "≥ ¥¬ π∞√≥∑≥ ≥ª∞‘ π–∑¡ø¿∂Û", "¿Ã¡§«œ", "πÆ¿«¥Á",
				"ºˆπÈ∏∏ µ∂¿⁄µÈ¿« ∞°Ωø¿ª ¿˚Ω≈ Ω√¡˝ <≥ ¥¬ ¥´∫ŒΩ√¡ˆ∏∏ ≥™¥¬ ¥´π∞∞„¥Ÿ>∑Œ \r\n" + "ªÁ∂˚«œ¥¬ ªÁ∂˜¿« ΩΩ«¬ ¿Ã∏È¿ª ∞®µø¿˚¿∏∑Œ ±◊∑¡ ≥Ω ¿Ã¡§«œ Ω√¿Œ¿« Ω√ªÍπÆ¡˝. \r\n"
						+ "±◊µøæ» ºˆ∏π¿∫ µ∂¿⁄µÈ¿Ã ªÁ∂˚«ﬂ¥¯ Ω√µÈ∞˙ ªı∑Œ æ¥ Ω√ ø©∑Ø ∆Ì, ±◊∏Æ∞Ì ø÷ ¿Ã Ω√∏¶ Ω·æﬂ «ﬂ¥¬¡ˆø° ¥Î«— \r\n"
						+ "¿€∞°¿« Ω√¿€ ≥Î∆Æ∏¶ π≠æÓ «‘≤≤ ø´æ˙¥Ÿ. Ω√∑Œ ¥Ÿ«“ ºˆ æ¯¥¬ ¿Ãæﬂ±‚, Ω√ º”ø° ∞®√Á¡¯ ¿€∞°¿« ¡¯º÷«— ∞ÌπÈµÈ¿Ã ¥„∞‹ ¿÷¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\≥ ¥¬ π∞√≥∑≥ ≥ª∞‘ π–∑¡ø¿∂Û.png", 2);
		mh.put(bk5.book_id, bk5);

		Book bk6 = new Book(6, "æ∆π´∆∞,∏ﬁ∏", "¡§«˝¿±", "¿ß∞Ì", "<æ∆π´∆∞, ∏ﬁ∏>¥¬ ∏ﬁ∏¥¬ ªÓ¿ª ¿ß«— ¿Á∑·¿Ã¿⁄ øπø≠ ∞˙¡§¿Ã∂Û∞Ì πœ¥¬ «— ∏ﬁ∏¡÷¿«¿⁄¿« ±‚∑œ¿∏∑Œ, \r\n"
				+ "∫Ò∏ﬁ∏¡÷¿«¿⁄∞° ∏ﬁ∏¡÷¿«¿⁄∞° µ«∞Ì, ≤ﬁ¿Ã «ˆΩ«∑Œ ∫Œ»≠«œ∞Ì, æ¥ ¥Î∑Œ ªÏ ∞‘ µ» ¿Ãæﬂ±‚¿Ã¥Ÿ.\r\n" + " ±◊∏Æ∞Ì π´æ˘∫∏¥Ÿ ∏ﬁ∏¿Â æ»ø°º≠ ¥ı øÎ∞®«ÿ¡¯ ¿Ãæﬂ±‚¿Ã¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\æ∆π´∆∞∏ﬁ∏.PNG", 2);
		mh.put(bk6.book_id, bk6);
		Book bk7 = new Book(7, "æ∆π´∆∞,º˙", "±Ë»•∫Ò", "¡¶√∂º“",
				"æ∆π´∆∞ Ω√∏Æ¡Ó¿« Ω∫π´ π¯¬∞ ¿Ãæﬂ±‚¥¬ 'º˙'¿Ã¥Ÿ. \r\n" + "<øÏæ∆«œ∞Ì »£ƒË«— ø©¿⁄ √‡±∏>¿« ±Ë»•∫Ò ¿€∞°∞° æ¥ µŒ π¯¬∞ ø°ºº¿Ã∑Œ,\r\n"
						+ " 'ª˝∞¢∏∏ «ÿµµ ¡¡¿∫ «— ∞°¡ˆ'ø° ¥Á¥Á»˜ \"º˙!\"¿Ã∂Û∞Ì ø‹ƒ• ºˆ ¿÷¥¬ ººªÛ ∏µÁ º˙≤€µÈ¿ª ¿ß«— √•¿Ã¥Ÿ.\r\n"
						+ " \"º˙¿ª ∏ªµµ æ» µ«∞‘ ¡¡æ∆«ÿº≠ ¿Ã √•¿ª æ≤∞‘\" µ» ¿€∞°¥¬ ºˆ¥… πÈ¿œ¡÷∑Œ Ω√¿€«ÿ º˙∞˙ «‘≤≤ \r\n"
						+ "¿ÕæÓø¬ ¿Œª˝¿« æÓ∂≤ ∫Œ∫–µÈ, ±◊∑Ø¥œ±Ó ∆ƒ∂ı∏∏¿Â«— ¡÷ªÁ(Ò–ﬁ»)∏¶ º˙º˙ ∆Ó√ƒ≥ı¥¬¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\æ∆π´∆∞º˙.png", 2);
		mh.put(bk7.book_id, bk7);
		Book bk8 = new Book(8, "æ∆π´∆∞,Ω∫¿Æ", "±Ëº±øµ", "¿ß∞Ì",
				"±›ø‰¿œ π„ø°¥¬ ≈√Ω√∏¶ ¥ﬁ∑¡ √÷¥Î«— ª°∏Æ ∞°æﬂ «“ ∞˜¿Ã ¿÷¥Ÿ.\r\n" + " »Ô∞‹øÓ ¿Á¡Ó ¿Ωæ«¿Ã ∞°µÊ øÔ∏Æ∞Ì, πÈ ∏Ìµµ ≥—¥¬ ªÁ∂˜µÈ¿Ã ¥Ÿ «‘≤≤ Ω∫¿Æ¿ª √ﬂ∞Ì ¿÷¥¬ ∞˜. \r\n"
						+ "∞≥±∏¿Ô¿Ã ∞∞¿∫ «•¡§¿∏∑Œ √„¿ª √ﬂ¥¬ ¥Ìº≠µÈ¿Ã ¿Ãµ˚±› ªß «œ∞Ì Ω√ø¯«— øÙ¿Ω¿ª ≈Õ∂ﬂ∏Æ¥¬ ∞˜. \r\n"
						+ "<æ∆π´∆∞, Ω∫¿Æ>¿∫ ª˝∞¢¿Ã ∏πæ∆ ∏µÁ Ω√¿€¿Ã æÓ∑¡ø¸¥¯ ∆Ì¡˝¿⁄∞° ¡˜¿Â¿Œ¿Ã µ«±‚ ¿ß«ÿ ∂∞≥µ∞Ì, \r\n"
						+ "¥ŸΩ√ ¡˜¿Â¿Œ¿∏∑Œ ªÏ±‚ ¿ß«ÿ µπæ∆ø¬ Ω∫¿Æø° ∞¸«— ¿Ãæﬂ±‚¥Ÿ. ¡Ò∞≈øÔ ∂ß∫∏¥Ÿ ΩΩ«√ ∂ß ¥ı ª˝∞¢≥™¥¬, \r\n"
						+ "øÔ∞Ì ΩÕ¿∫ ∏∂¿Ω¿Ã µÈ∏È ∂∞ø√∏Æ¥¬, ¿ß∑ŒøÕ ∞∞¿∫ '¥ÌΩ∫'ø° ∞¸«— ¿Ãæﬂ±‚.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\æ∆π´∆∞Ω∫¿Æ.png", 2);
		mh.put(bk8.book_id, bk8);
		Book bk9 = new Book(9, "øÏ∏ÆµÈ¿« ¿œ±◊∑Ø¡¯ øµøı", "¿ÃπÆø≠", "¥Ÿ∏≤",
				"ø‰¡Ú√≥∑≥ ø’µ˚∞° Ω…«— ∂ßø° ¥Á«œ¥¬ æ∆¿Ã¿« Ω…∏ÆøÕ ∞°«œ¥¬ æ∆¿ÃµÈ¿« ∏Ω¿µÈ¿Ã ¿ﬂ ≥™≈∏≥™ ¿÷¥Ÿ. \r\n"
						+ "∫“¿«ø° ¥Î«ÿ ¿˙«◊µµ «ÿ∫∏¡ˆ∏∏ ¥„¿” º±ª˝¥‘¿« π´∞¸Ω…ø° ±◊ »˚¿∫ ≤©¿Ã∞Ì ∏∏¥Ÿ. \r\n"
						+ "¥Á«œ¥¬ æ∆¿Ã¿« √≥¿˝«— ±º¡æ∞˙ ∆–πË∞®¿Ã æÓ∏•¿Ã µ«æÓº≠ æÓ∂≤ ¿Œ∞›√º∑Œ ¿⁄∂Û¥¬∞°∞° ∏∂¿Ωø° ¥Ÿ∞°ø¬¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\øÏ∏ÆµÈ¿« ¿œ±◊∑Ø¡¯ øµøı.png", 2);
		mh.put(bk9.book_id, bk9);
		Book bk10 = new Book(10, "Do it!¿⁄πŸΩ∫≈©∏≥∆Æ+¡¶¿Ãƒı∏Æ ¿‘πÆ", "¡§¿ŒøÎ", "¿Ã¡ˆΩ∫∆€∫Ì∏ÆΩÃ",
				"4≥‚ ø¨º” ∫£Ω∫∆Æºø∑Ø, Do it! ¿⁄πŸΩ∫≈©∏≥∆Æ + ¡¶¿Ãƒı∏Æ ¿‘πÆ¿« ¿¸∏È ∞≥¡§∆«¿∏∑Œ, \r\n" + "¿⁄πŸΩ∫≈©∏≥∆Æ, ¡¶¿Ãƒı∏Æ¿« ±‚∫ª∫Œ≈Õ Ω«¿¸ø° « ø‰«— «ŸΩ…±Ó¡ˆ ∏µŒ ¥„æ“¥Ÿ. \r\n"
						+ "«¡∑±∆Æø£µÂ Ω«π´ ±≥¿∞ ∞Ê∑¬ 10≥‚ ∞≠ªÁ∞° æˆº±«— 155∞≥¿« øπ¡¶∑Œ ±‚∫ª∫Œ≈Õ Ω«π´ »∞øÎ±Ó¡ˆ \r\n" + "øœ∫Æ«œ∞‘ ¥Î∫Ò«“ ºˆ ¿÷¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\¿⁄πŸΩ∫≈©∏≥∆Æ.png", 2);
		mh.put(bk10.book_id, bk10);
		Book bk11 = new Book(11, "¡§∫∏√≥∏ÆªÍæ˜±‚ªÁ(« ±‚)", "±Ë¡§¡ÿ", "±Êπ˛",
				"¡ˆ±›±Ó¡ˆ √‚¡¶µ» ∏µÁ ±‚√‚πÆ¡¶∏¶ ≈Î∞Ë¿˚¿∏∑Œ ∫–ºÆ«œø© Ω√«Ëø° ≥™ø¿¥¬ ∞Õ∏∏ ∞Ò∂Û 172∞≥¿« ºΩº«, \r\n"
						+ "701∞≥¿« « µÂ∑Œ ¡§∏Æ«ﬂ¥Ÿ. ºΩº«¿∫ Ω√«Ëø° √‚¡¶µ» ∫Ò¿≤ø° µ˚∂Û A, B, C, D µÓ±ﬁ¿ª ¡ˆ¡§«œ∞Ì, \r\n"
						+ "∞¢ « µÂø°¥¬ Ω√«Ëø° ≥™ø¬ √‚¡¶ø¨µµ∏¶ «•±‚«œø© ºˆ«Ëª˝¿Ã ¥ı »ø¿≤¿˚¿∏∑Œ ∞¯∫Œ«“ ºˆ ¿÷µµ∑œ «ﬂ¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\¡§√≥±‚.png", 2);
		mh.put(bk11.book_id, bk11);
		Book bk12 = new Book(12, "¡§∫∏√≥∏Æ" + "\r\n" + "ªÍæ˜±‚ªÁ(Ω«±‚)", "±Ë¡§¡ÿ", "±Êπ˛",
				"Ω√«Ëø°º≠ «— ∞≥¿« πÆ¡¶∑Œ √‚¡¶µ… ≈◊∏∂∏¶ «œ≥™¿« ºΩº«¿∏∑Œ ±∏º∫«œø© ∞≥≥‰¿ª ¿Ã«ÿ«œ∞Ì\r\n"
						+ " πÆ¡¶∏¶ «Æ ºˆ ¿÷¥¬ ¥…∑¬¿ª ≈∞øÔ ºˆ ¿÷µµ∑œ √Ê∫–«— ≥ªøÎ∞˙ ¿⁄ºº«— «ÿº≥¿ª ºˆ∑œ«œø¥¥Ÿ. \r\n"
						+ "∂««—, ºΩº«∫∞ ≥ªøÎ º≥∏Ì¿Ã ≥°≥Ø ∂ß∏∂¥Ÿ °ÆøπªÛ πÆ¡¶ ¿∫«‡°Ø¿ª ¡¶∞¯«—¥Ÿ. \r\n"
						+ "∫ªπÆø°º≠ πËøÓ ≥ªøÎ¿Ã Ω√«Ëø°º≠ æÓ∂ª∞‘ √‚¡¶µ… ∞Õ¿Œ¡ˆ ªÏ∆Ï∫∏∞Ì πÃ∏Æ «ÆæÓ∫∏∏Èº≠ ø¨Ω¿«“ ºˆ ¿÷¥Ÿ. \r\n"
						+ "∞¢ ºΩº«¿∫ √‚¡¶µ» ∫Ò¿≤ø° µ˚∂Û A, B, C, D µÓ±ﬁ¿ª ¡ˆ¡§«œø© ¡ﬂø‰«— ≥ªøÎ¿ª ∏’¿˙ ∫º ºˆ ¿÷¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\¡§√≥±‚2.png", 2);
		mh.put(bk12.book_id, bk12);
		Book bk13 = new Book(13, "√ª√·¿« πÆ¿ÂµÈ", "±Ëø¨ºˆ", "∏∂¿ΩªÍ√•",
				"µÓ¥‹ ¿Ã»ƒ ø©º∏ ±«¿« º“º≥¿ª ∆Ï≥¬¿∏∏Á 2003≥‚ µø¿ŒπÆ«–ªÛ¿ª ºˆªÛ«— ±Ëø¨ºˆ¥¬ ø√«ÿ º≠∏•¥Ÿº∏¿Ã¥Ÿ. \r\n"
						+ "≤Ÿ¡ÿ«œ∞‘ ¿È ∞…¿Ω¿∏∑Œ ≥™æ∆∞°¥¬ ±◊ø°∞‘ √π π¯¬∞¿Ã¿⁄ ∏∂¡ˆ∏∑¿Œ(¿€∞°¿« ∏ªø° µ˚∏£∏È) ¿Ã ªÍπÆ¡˝¿« ¿«πÃ¥¬ π´æ˘¿œ±Ó.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\√ª√·¿«πÆ¿ÂµÈ.png", 2);
		mh.put(bk13.book_id, bk13);
		Book bk14 = new Book(14, "Ω∫≈‰≥ ", "¡∏ ø˘∏ÆæˆΩ∫", "πŒ¿ΩªÁ",
				"¿¸ ºº∞Ë ºˆ∏π¿∫ πÆ«– æ÷»£∞°µÈ¿« ¿Œª˝ º“º≥∑Œ º’≤≈»˜¥¬ ∏Ì¿€ °∂Ω∫≈‰≥ °∑∞° 1965≥‚ πÃ±πø°º≠ √≥¿Ω πﬂ«‡µ∆¿ª ∂ß¿« «•¡ˆ∑Œ √‚∞£µ»¥Ÿ. \r\n"
						+ "¿Ãπ¯ ø°µº«ø°º≠¥¬ ±‚¡∏ ∆«¿« πÆ¿Â¿ª ¥ŸµÎ∞Ì πÆ«–∆Ú∑–∞° Ω≈«¸√∂¿« √ﬂ√µªÁ ¿¸πÆ¿ª Ω«æ˙¥Ÿ. \r\n" + "∂««— √ ∆«ø° ¥„±‰ ¿œ∑ØΩ∫∆Æ∑π¿Ãº«¿ª øœ∫Æ»˜ ¿Á«ˆ«ﬂ¥Ÿ.\r\n"
						+ "\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\Ω∫≈‰≥ .png", 2);
		mh.put(bk14.book_id, bk14);
		Book bk15 = new Book(15, "≥ ¿« ≥∏º¥¿∫ ≥™¿« ≥∏º¥", "æ∆µµ¥œΩ∫", "πŒ¿ΩªÁ",
				"πŒ¿ΩªÁ ºº∞ËΩ√¿Œº± 42±«. æ∆µµ¥œΩ∫¿« ¥Î«• Ω√ º±¡˝. ∏≈≥‚ ¿Ø∑¬«— ≥Î∫ßπÆ«–ªÛ »ƒ∫∏∑Œ ≤≈»˜∞Ô \r\n"
						+ "«œ¥¬ Ω√¿Œ æ∆µµ¥œΩ∫ø° ¥Î«— »£±‚Ω…∞˙ «ˆ¥Î æ∆∂¯ πÆ«–ø° ¥Î«— ¿¸πÆ¿˚¿Œ ∞¸Ω… ∏µŒ∏¶ √Ê¡∑«“ \r\n"
						+ "«— ±«¿« Ω√¡˝¿Ã µµ¬¯«ﬂ¥Ÿ. ¿Ãπ¯ √•¿∫ ºº∞Ë¿˚¿∏∑Œ æÀ∑¡¡¯ ¿€∞°¡ˆ∏∏ æ∆¡˜ øÏ∏Æø°∞‘¥¬ ≥∏º± ¿Ã∏ß¿Œ\r\n"
						+ " æ∆µµ¥œΩ∫, ±◊¿« πÆ«– ¿Œª˝ ¿¸π›ø° ∞…ƒ£ ¥Î«•Ω√∏¶ ªÃæ∆ ±∏º∫«œø¥¥Ÿ. \r\n"
						+ "πÆ«–¿∏∑Œ æ∆∂¯¿« «ˆ¥Î»≠∏¶ ¿ß«ÿ ∆Úª˝ æ÷ΩË¥¯ æ∆µµ¥œΩ∫¿« ∫Ø«ı∞˙ «ıΩ≈¿∫ «ˆ¿Á ¡¯«‡«¸¿Ã¥Ÿ.\r\n" + "",
				"C:\\Users\\Lee\\Desktop\\img\\≥ ¿« ≥∏º¥¿∫ ≥™¿« ≥∏º¥.png", 2);
		mh.put(bk15.book_id, bk15);

		JFrame frm = new JFrame("µµº≠ ¥Îø© «¡∑Œ±◊∑•");
		Container c = frm.getContentPane();
		c.setBackground(new Color(244, 164, 96));
		// «¡∑π¿” ≈©±‚ º≥¡§
		frm.setSize(568, 820);

		// «¡∑π¿”¿ª »≠∏È ∞°øÓµ•ø° πËƒ°
		frm.setLocationRelativeTo(null);

		// «¡∑π¿”¿ª ¥›æ“¿ª ∂ß ∏ﬁ∏∏Æø°º≠ ¡¶∞≈µ«µµ∑œ º≥¡§
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ∑π¿Ãæ∆øÙ º≥¡§
		frm.getContentPane().setLayout(null);

		// JLabel ª˝º∫
		JLabel label1 = new JLabel("¡ˆ±› √• ¥Îø© ¥Îø©?");
		JLabel label2 = new JLabel("∞Àªˆ");
		JLabel label3 = new JLabel("¿Ã∏ß");
		JLabel label4 = new JLabel("ª˝≥‚ø˘¿œ");
		JLabel label5 = new JLabel("¡÷º“");
		JLabel label6 = new JLabel("ø¨∂Ù√≥");
		JLabel label8 = new JLabel("<Ω≈∞£ ø‰√ª>");
		JLabel label9 = new JLabel("<¥Îø© ∏Ò∑œ>");
		JLabel label10 = new JLabel("¥Îø©¿œ");
		JLabel label11 = new JLabel("π›≥≥¿œ");
		JLabel label12 = new JLabel("<¥Îø© «ˆ»≤>");
		JLabel label13 = new JLabel("µµº≠ ¿Ã∏ß");
		JLabel label14 = new JLabel("√‚∆«ªÁ");
		JLabel label15 = new JLabel("¿€∞°");
		JLabel label16 = new JLabel("≥‚");
		JLabel label17 = new JLabel("ø˘");
		JLabel label18 = new JLabel("¿œ");
		JLabel label19 = new JLabel("-");// ø¨∂Ù√≥ √ππ¯¬∞ -
		JLabel label20 = new JLabel("-");// ø¨∂Ù√≥ µŒπ¯¬∞ -

		// JComboBox ª˝º∫
		String[] year = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" };
		JComboBox box1 = new JComboBox(year);

		String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		JComboBox box2 = new JComboBox(month);

		String[] day = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "18", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		JComboBox box3 = new JComboBox(day);

		String[] city = { "º≠øÔ∆Ø∫∞Ω√", "∫ŒªÍ±§ø™Ω√", "¥Î±∏±§ø™Ω√", "¿Œ√µ±§ø™Ω√", "±§¡÷±§ø™Ω√", "¥Î¿¸±§ø™Ω√", "øÔªÍ±§ø™Ω√", "¡¶¡÷∆Ø∫∞¿⁄ƒ°µµ", "ºº¡æ∆Ø∫∞¿⁄ƒ°Ω√", "ºˆø¯Ω√",
				"∞ÌæÁΩ√", "øÎ¿ŒΩ√", "º∫≥≤Ω√", "»≠º∫Ω√", "∫Œ√µΩ√", "≥≤æÁ¡÷Ω√", "æ»ªÍΩ√", "æ»æÁΩ√", "∆Ú≈√Ω√", "Ω√»ÔΩ√", "∆ƒ¡÷Ω√", "¿«¡§∫ŒΩ√", "±Ë∆˜Ω√", "±§¡÷Ω√",
				"±§∏ÌΩ√", "«œ≥≤Ω√", "±∫∆˜Ω√", "ø¿ªÍΩ√", "æÁ¡÷Ω√", "¿Ã√µΩ√", "±∏∏ÆΩ√", "æ»º∫Ω√", "¿«ø’Ω√", "∆˜√µΩ√", "æÁ∆Ú±∫", "ø©¡÷Ω√", "µøµŒ√µΩ√", "∞°∆Ú±∫",
				"∞˙√µΩ√", "ø¨√µ±∫", "√·√µΩ√", "ø¯¡÷Ω√", "∞≠∏™Ω√", "µø«ÿΩ√", "≈¬πÈΩ√", "º”√ Ω√", "ªÔ√¥Ω√", "»´√µ±∫", "»æº∫±∫", "øµø˘±∫", "∆Ú√¢±∫", "¡§º±±∫", "√∂ø¯±∫",
				"»≠√µ±∫", "æÁ±∏±∫", "¿Œ¡¶±∫", "∞Ìº∫±∫", "æÁæÁ±∫", "√ª¡÷Ω√", "√Ê¡÷Ω√", "¡¶√µΩ√", "∫∏¿∫±∫", "ø¡√µ±∫", "øµµø±∫", "¡ı∆Ú±∫", "¡¯√µ±∫", "±´ªÍ±∫", "¿Ωº∫±∫",
				"¥‹æÁ±∫", "√µæ»Ω√", "∞¯¡÷Ω√", "∫∏∑…Ω√", "æ∆ªÍΩ√", "º≠ªÍΩ√", "≥ÌªÍΩ√", "∞Ë∑ÊΩ√", "¥Á¡¯Ω√", "±›ªÍ±∫", "∫Œø©±∫", "º≠√µ±∫", "√ªæÁ±∫", "»´º∫±∫", "øπªÍ±∫",
				"≈¬æ»±∫", "¿¸¡÷Ω√", "¿ÕªÍΩ√", "±∫ªÍΩ√", "¡§¿æΩ√", "≥≤ø¯Ω√", "±Ë¡¶Ω√", "øœ¡÷±∫", "∞Ì√¢±∫", "∫Œæ»±∫", "¿”Ω«±∫", "º¯√¢±∫", "¡¯æ»±∫", "π´¡÷±∫", "¿Âºˆ±∫",
				"∏Ò∆˜∫Œ", "π´æ»±∫", "≥™¡÷±∫", "»≠º¯±∫", "∞Óº∫±∫", "¥„æÁ±∫", "ø©ºˆ±∫", "¡¶¡÷±∫", "«‘∆Ú±∫", "øµ±§±∫", "±§¡÷±∫", "±§æÁ±∫", "∞Ì»Ô±∫", "∫∏º∫±∫", "∞≠¡¯±∫",
				"«ÿ≥≤±∫", "¿Âº∫±∫", "±∏∑ ±∫", "¿Â»Ô±∫", "øœµµ±∫", "¡¯µµ±∫", "º¯√µ±∫", "øµæœ±∫", "¥Î±∏∫Œ", "¥ﬁº∫±∫", "∞ÊªÍ±∫", "øµ√µ±∫", "∞Ê¡÷±∫", "øµ¿œ±∫", "øµ¥ˆ±∫",
				"øµæÁ±∫", "√ªº€±∫", "æ»µø±∫", "¿«º∫±∫", "±∫¿ß±∫", "ƒ•∞Ó±∫", "±Ë√µ±∫", "±Ë√µ±∫", "ªÛ¡÷±∫", "øπ√µ±∫", "øµ¡÷±∫", "∫¿»≠±∫", "πÆ∞Ê±∫", "º∫¡÷±∫", "∞Ì∑…±∫",
				"√ªµµ±∫", "º±ªÍ±∫", "øÔµµ±∫", "∫ŒªÍ∫Œ", "∏∂ªÍ∫Œ", "øÔªÍ±∫", "µø∑°±∫", "√¢≥Á±∫", "ªÁ√µ±∫", "«œµø±∫", "∞≈√¢±∫", "∞Ìº∫±∫", "≈Îøµ±∫", "«‘æÁ±∫", "«’√µ±∫",
				"¿«∑…±∫", "«‘æ»±∫", "ªÍ√ª±∫", "√¢ø¯±∫", "¡¯¡÷±∫", "±Ë«ÿ±∫", "π–æÁ±∫", "æÁªÍ±∫", "≥≤«ÿ±∫" };
		JComboBox box4 = new JComboBox(city);

		String[] gu = { "¡æ∑Œ±∏", "¡ﬂ±∏", "øÎªÍ±∏", "º∫µø±∏", "±§¡¯±∏", "µø¥ÎπÆ±∏", "¡ﬂ∂˚±∏", "º∫∫œ±∏", "∞≠∫œ±∏", "µµ∫¿±∏", "≥Îø¯±∏", "¿∫∆Ú±∏", "º≠¥ÎπÆ±∏",
				"∏∂∆˜±∏", "æÁ√µ±∏", "∞≠º≠±∏", "±∏∑Œ±∏", "±›√µ±∏", "øµµÓ∆˜±∏", "µø¿€±∏", "∞¸æ«±∏", "º≠√ ±∏", "∞≠≥≤±∏", "º€∆ƒ±∏", "∞≠µø±∏" };
		JComboBox box5 = new JComboBox(gu);

		String[] dong = { "√ªøÓ»ø¿⁄µø", "ªÁ¡˜µø", "ªÔ√ªµø", "∫Œæœµø", "∆Ú√¢µø", "π´æ«µø", "±≥≥≤µø", "∞°»∏µø", "¡æ∑Œ1234∞°µø", "¡æ∑Œ56∞°µø", "¿Ã»≠µø", "«˝»≠µø",
				"√¢Ω≈¡¶1µø", "√¢Ω≈¡¶2µø", "√¢Ω≈¡¶3µø", "º˛¿Œ¡¶1µø", "º˛¿Œ¡¶2µø" };
		JComboBox box6 = new JComboBox(dong);

		String[] phone_number = { "010", "011", "017", "016", "018", "019" };
		JComboBox box7 = new JComboBox(phone_number);

		// JTextArea ª˝º∫
		JTextArea ta1 = new JTextArea();// µµº≠ ∏Ò∑œ
//		JTextArea ta2 = new JTextArea();// <Ω≈∞£ ø‰√ª>
		JPanel ta3 = new JPanel();// <¥Îø© ∏Ò∑œ>
		ta3.setLayout(null);
		LineBorder lbta = new LineBorder(Color.black);
		JLabel ta3jJLabel1 = new JLabel(" √• ¡¶∏Ò");
		JLabel ta3jJLabel2 = new JLabel(" ¿˙¿⁄");
		JLabel ta3jJLabel3 = new JLabel(" √‚∆«ªÁ");
		ta3jJLabel1.setBorder(lbta);
		ta3jJLabel2.setBorder(lbta);
		ta3jJLabel3.setBorder(lbta);
		ta3jJLabel1.setBounds(0, 0, 73, 24);
		ta3jJLabel2.setBounds(73, 0, 73, 24);
		ta3jJLabel3.setBounds(146, 0, 74, 24);
		ta3.add(ta3jJLabel1);
		ta3.add(ta3jJLabel2);
		ta3.add(ta3jJLabel3);

		JTextArea ta4 = new JTextArea();// <¥Îø© «ˆ»≤>
		ta4.setText("¥Îø©¿œ¿ª º±≈√«ÿ ¡÷ººø‰.");

		// ¥Îø©¿œ(ø¿¥√≥Ø¬•)
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		// π›≥≥¿œ(ø¿¥√∑Œ∫Œ≈Õ 7¿œ »ƒ)
		cal.add(Calendar.DAY_OF_YEAR, 7);
		Date nomal = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, 15);
		Date max = cal.getTime();

		// ¥Îø©¿œ (æ∆¡˜ ¡ı∞°«œ∏È π›≥≥¿œµµ ∞∞¿Ã ¡ı∞°Ω√≈∞¥¬ π˝¿ª ∏¯ √£æ∆º≠ ¡ı∞°æ»µ«∞‘ ¡§«ÿµ“)
		SpinnerDateModel model = new SpinnerDateModel(today, today, null, Calendar.DAY_OF_MONTH);
		// («•±‚«“ ≥Ø¬•,√÷º“,√÷¥Î,πŸ≤‹ ∫Œ∫–)
		JSpinner tf6 = new JSpinner(model);

		JSpinner.DateEditor editor = new JSpinner.DateEditor(tf6, "yyyy-MM-dd");
		JFormattedTextField rentday = editor.getTextField();
		rentday.setEditable(false);
		rentday.setHorizontalAlignment(JTextField.CENTER);

		tf6.setEditor(editor);

		// π›≥≥¿œ¿ª ±‚∫ª¿˚¿∏∑Œ ø¿¥√≥Ø¬•¿«+7∑Œ º≥¡§«ÿµŒ∞Ì ¥Îø©¿⁄∞° π›≥≥¿œ¿ª +,-«“ºˆ¿÷¿Ω √÷¥Î 15¿œ±Ó¡ˆ ∞°¥…
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
		// ∆–≥Œ ª˝º∫
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(240, 248, 255));
		// JRadioButton ª˝º∫

		// JTextField ª˝º∫
		JTextField tf1 = new JTextField(); // ∞Àªˆ
		tf1.setText("µµº≠ ∞Àªˆ");// ±‚∫ª ¿‘∑¬ ∞™ º≥¡§
		tf1.setEnabled(true);
		JTextField tf2 = new JTextField(); // ¿Ã∏ß
//		JTextField tf3 = new JTextField(); // ≥™¿Ã
//		JTextField tf4 = new JTextField(); // ¡÷º“
//		JTextField tf5 = new JTextField(); // ø¨∂Ù√≥
//		JTextField tf6 = new JTextField(); // ¥Îø©¿œ
//		JTextField tf7 = new JTextField(); // π›≥≥¿œ
		JTextField tf8 = new JTextField(); // (µµº≠Ω≈√ª)µµº≠ ¿Ã∏ß
		JTextField tf9 = new JTextField(); // (µµº≠Ω≈√ª)√‚∆«ªÁ
		JTextField tf0 = new JTextField(); // (µµº≠Ω≈√ª)¿€∞°
		JTextField tf10 = new JTextField(); // ø¨∂Ù√≥1 ∞°øÓµ• 4¿⁄∏Æ
		JTextField tf11 = new JTextField(); // ø¨∂Ù√≥2 ∏∂¡ˆ∏∑ 4¿⁄∏Æ

		// JButton ª˝º∫
		JButton btn1 = new JButton("OK");// ∞Àªˆ
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jp1.removeAll();
				String str = "";
				for (int n = 1; n < mh.size(); n++) {
					if (mh.get(n).book_name.contains(tf1.getText())) {
						int a = n;
						JLabel j = new JLabel(mh.get(n).book_name);
						jp1.add(j);

						JButton but = new JButton("°Ó");
						but.setBounds(163, 0, 58, 25);
						jp1.add(but);
						but.setBorderPainted(false);
						but.setFocusable(false);

//						ta1.add(but, BorderLayout.PAGE_END);

						// ¥Îø© ∏Ò∑œ √ﬂ∞° πˆ∆∞
						but.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
//								setText(mh.get(a).book_name);
							}
						});

					}
				}
				ta4.setText(str);
				if (tf1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "∞ÀªˆæÓ∏¶ ¿‘∑¬«œº≈æﬂ «’¥œ¥Ÿ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
				}
				jp1.repaint();
			}
		});

		JButton btn2 = new JButton("OK");// ø¨∂Ù√≥

		JButton btn3 = new JButton("OK");// π›≥≥¿œ
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<¥Îø©>∏¶ ¥≠∑Ø¡÷ººø‰.");
				btn3.setEnabled(false);
			}
		});
//¥Îø© πˆ∆∞ 
		ta4.setFont(new Font(null, 1, 20));
		JButton btn4 = new JButton("¥Îø©");// ¥Îø©
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tf2.getText().equals("") || tf10.getText().equals("") || tf11.getText().equals("")
				/* || tf5.getText().equals("") */) {
					JOptionPane.showMessageDialog(null, "« ºˆ ¿‘∑¬ƒ≠¿Ã ∫ÒæÓ¿÷Ω¿¥œ¥Ÿ.", "æÀ∏≤", JOptionPane.PLAIN_MESSAGE);

				} else {
					name[i] = tf2.getText();
					phone1[i] = tf10.getText();// ø¨∂Ù√≥ ∞°øÓµ• 4¿⁄∏Æ
					phone2[i] = tf11.getText();// ø¨∂Ù√≥ ∏∂¡ˆ∏∑ 4¿⁄∏Æ
					i++;
					btn4.setEnabled(false);
					Thread t = new Thread() {
						public void run() {
							try {

								int time = (int) (Math.random() * 1000) + 800;
								ta4.setText("¡¯«‡¡ﬂ¿‘¥œ¥Ÿ...");
								Thread.sleep(time);
								ta4.setText("¿·Ω√∏∏ ±‚¥Ÿ∑¡ ¡÷Ω Ω√ø¿.");
								Thread.sleep(time);
								ta4.setText("<¥Îø©>∞° øœ∑·µ«æ˙Ω¿¥œ¥Ÿ." + "\n" + "<π›≥≥¿œ>¿ª ¡ˆƒ—¡÷ººø‰.");
								Thread.sleep(2000);

								new text();
								frm.dispose();
							} catch (InterruptedException e) {
								ta4.setText("Ω√Ω∫≈€ ø¿∑˘¿‘¥œ¥Ÿ." + "\n" + "√≥¿Ω∫Œ≈Õ ¥ŸΩ√ Ω√¿€«ÿ¡÷ººø‰.");
							}
						}
					};
					t.start();
				}
			}
		});

		JButton btn6 = new JButton("OK");// ¥Îø©¿œ
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btn6.setEnabled(false);
				tf7.setVisible(true);
				ta4.setText("π›≥≥¿œ¿∫ ¥Îø©¿œ∑Œ∫Œ≈Õ " + "\n" + " 1~15¿Ã≥ªø° ∞°¥…«’¥œ¥Ÿ." + "\n" + "π›≥≥¿œ¿ª ¿ﬂ ¡ˆƒ—¡÷ººø‰.");

			}
		});

		JButton btn5 = new JButton("√Îº“");// √Îº“
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta4.setText("<√Îº“>µ«æ˙Ω¿¥œ¥Ÿ." + "\n" + "√≥¿Ω∫Œ≈Õ ¥ŸΩ√ Ω√¿€«ÿ¡÷ººø‰.");

				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn6.setEnabled(true);
			}
		});

		JButton btn7 = new JButton("OK");// ¡÷º“
		JButton btn8 = new JButton("Ω≈√ª");// Ω≈√ª

		// JComboBox ¿ßƒ°øÕ ≈©±‚ º≥¡§
		box1.setBounds(295, 105, 53, 20);// ≥‚(year)
		box2.setBounds(365, 105, 53, 20);// ø˘(month)
		box3.setBounds(435, 105, 53, 20);// ¿œ(day)
		box4.setBounds(280, 135, 85, 20);// city
		box5.setBounds(370, 135, 61, 20);// gu
		box6.setBounds(435, 135, 85, 20);// dong
		box7.setBounds(280, 165, 46, 20);// phone_number

		// JLabel ¿ßƒ°øÕ ≈©±‚ º≥¡§
		label1.setBounds(225, 0, 100, 50); // ¡ˆ±› √• ¥Îø© ¥Îø©?
		label2.setBounds(240, 30, 100, 50); // ∞Àªˆ
		label3.setBounds(240, 60, 100, 50); // ¿Ã∏ß
		label4.setBounds(240, 90, 100, 50); // ª˝≥‚ø˘¿œ
		label5.setBounds(240, 120, 100, 50); // ¡÷º“
		label6.setBounds(240, 150, 100, 50); // ø¨∂Ù√≥
//		label7.setBounds(240, 180, 100, 50); // ø¨∂Ù√≥
		label8.setBounds(240, 190, 100, 50); // <Ω≈∞£ ø‰√ª>
		label9.setBounds(10, 310, 65, 50); // <¥Îø© ∏Ò∑œ>
		label10.setBounds(240, 338, 65, 50); // ¥Îø©¿œ
		label11.setBounds(240, 368, 65, 50); // π›≥≥¿œ
		label12.setBounds(240, 460, 65, 50); // <¥Îø© «ˆ»≤>
		label13.setBounds(240, 210, 100, 50); // µµº≠ ¿Ã∏ß
		label14.setBounds(240, 240, 100, 50); // √‚∆«ªÁ
		label15.setBounds(240, 270, 100, 50); // ¿€∞°
		label16.setBounds(350, 90, 100, 50); // ≥‚
		label17.setBounds(420, 90, 100, 50); // ø˘
		label18.setBounds(490, 90, 100, 50); // ¿œ
		label19.setBounds(330, 168, 10, 10); // ø¨∂Ù√≥ √ππ¯¬∞ -
		label20.setBounds(376, 168, 10, 10); // ø¨∂Ù√≥ µŒπ¯¬∞ -

		// JTextArea ¿ßƒ°øÕ ≈©±‚ º≥¡§

//		ta2.setBounds(245, 250, 270, 60); // <Ω≈∞£ ø‰√ª>
		ta3.setBounds(10, 350, 220, 270); // <¥Îø© ∏Ò∑œ>
		ta4.setBounds(245, 500, 270, 120); // <¥Îø© «ˆ»≤>

		// JTextField ¿ßƒ°øÕ ≈©±‚ º≥¡§
		tf1.setBounds(270, 45, 200, 20); // ∞Àªˆ
		tf2.setBounds(270, 75, 80, 20); // ¿Ã∏ß
//		tf3.setBounds(270, 135, 80, 20); // ≥™¿Ã
//		tf4.setBounds(270, 165, 210, 20); // ¡÷º“
//		tf5.setBounds(280, 195, 200, 20); // ø¨∂Ù√≥
		tf6.setBounds(280, 355, 200, 20); // ¥Îø©¿œ
		tf7.setBounds(280, 385, 200, 20); // π›≥≥¿œ
		tf8.setBounds(295, 225, 180, 20); // <Ω≈∞£ ø‰√ª> µµº≠ ¿Ã∏ß
		tf9.setBounds(295, 255, 180, 20); // <Ω≈∞£ ø‰√ª> √‚∆«ªÁ
		tf0.setBounds(295, 285, 180, 20); // <Ω≈∞£ ø‰√ª> ¿€∞°
		tf10.setBounds(338, 166, 35, 20); // ø¨∂Ù√≥1 ∞°øÓµ• 4¿⁄∏Æ
		tf11.setBounds(385, 166, 35, 20); // ø¨∂Ù√≥2 ∏∂¡ˆ∏∑ 4¿⁄∏Æ

		// JButton ¿ßƒ°øÕ ≈©±‚ º≥¡§
		btn1.setBounds(475, 45, 58, 20); // ∞Àªˆ
//		btn2.setBounds(485, 195, 58, 20); // ø¨∂Ù√≥
		btn3.setBounds(485, 385, 58, 20); // π›≥≥¿œ
		btn4.setBounds(280, 425, 88, 40); // ¥Îø©
		btn5.setBounds(390, 425, 88, 40); // √Îº“
		btn6.setBounds(485, 355, 58, 20); // ¥Îø©¿œ
//		btn7.setBounds(485, 165, 58, 20); // ¡÷º“
		btn8.setBounds(485, 285, 58, 20); // Ω≈√ª πˆ∆∞

		// ∆–≥Œ ¿ßƒ° ≈©±‚ ≈◊µŒ∏Æ
		LineBorder lb = new LineBorder(new Color(255, 182, 193));
		jp1.setBounds(10, 40, 220, 270); // µµº≠ ∏Ò∑œ
		jp1.setLayout(new GridLayout(10, 1));

		for (int i = 1; i <= mh.size(); i++) {
			JLabel j = new JLabel();
			Book b = mh.get(i);
			JButton jbt = new JButton("°Ó");
			jbt.setBounds(176, 0, 43, 25);
			JOptionPane jop = new JOptionPane();
			jbt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int a = jop.showConfirmDialog(null, "¥Îø© ∏Ò∑œø° √ﬂ∞° «’¥œ¥Ÿ.", "»Æ¿Œ", JOptionPane.OK_CANCEL_OPTION,
							JOptionPane.INFORMATION_MESSAGE);
					if (cx >= 5) {
						jop.showConfirmDialog(null, "«—π¯ø° 4±«±Ó¡ˆ∏∏ ¥Îø© ∞°¥…«’¥œ¥Ÿ.", "»Æ¿Œ", JOptionPane.PLAIN_MESSAGE);
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
			j.setText(b.getBook_name() + " (" + b.getWriter() + ") " + "[" + b.getPublisher() + "]");
			j.setToolTipText(b.book_story);
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
		// JTextArea ≈¯∆¡
		ta1.setToolTipText("µµº≠ ∏Ò∑œ");

		// «¡∑π¿”ø°¥Ÿ∞° JLabel √ﬂ∞°
		frm.getContentPane().add(label1); // ¡ˆ±› √• ¥Îø© ¥Îø©?
		frm.getContentPane().add(label2); // ∞Àªˆ
		frm.getContentPane().add(label3); // ¿Â∏£
		frm.getContentPane().add(label4); // ¿Ã∏ß
		frm.getContentPane().add(label5); // ≥™¿Ã
		frm.getContentPane().add(label6); // ¡÷º“
//		frm.getContentPane().add(label7); // ø¨∂Ù√≥
		frm.getContentPane().add(label8); // <Ω≈∞£ ø‰√ª>
		frm.getContentPane().add(label9); // <¥Îø© ∏Ò∑œ>
		frm.getContentPane().add(label10); // ¥Îø©¿œ
		frm.getContentPane().add(label11); // π›≥≥¿œ
		frm.getContentPane().add(label12); // <¥Îø© «ˆ»≤>
		frm.getContentPane().add(label13);// (µµº≠Ω≈√ª)µµº≠ ¿Ã∏ß
		frm.getContentPane().add(label14);// (µµº≠Ω≈√ª)√‚∆«ªÁ
		frm.getContentPane().add(label15);// (µµº≠Ω≈√ª)¿€∞°
		frm.getContentPane().add(label16);// ≥‚
		frm.getContentPane().add(label17);// ø˘
		frm.getContentPane().add(label18);// ¿œ
		frm.getContentPane().add(label19);// ø¨∂Ù√≥ √ππ¯¬∞ -
		frm.getContentPane().add(label20);// ø¨∂Ù√≥ µŒπ¯¬∞-

		// «¡∑π¿”ø°¥Ÿ∞° JTextField √ﬂ∞°
		frm.getContentPane().add(tf1);// ∞Àªˆ
		frm.getContentPane().add(tf2);// ¿Ã∏ß
//		frm.getContentPane().add(tf3);// ≥™¿Ã
//		frm.getContentPane().add(tf4);// ¡÷º“
//		frm.getContentPane().add(tf5);// ø¨∂Ù√≥
		frm.getContentPane().add(tf6);// ¥Îø©¿œ
		frm.getContentPane().add(tf7);// π›≥≥¿œ
		frm.getContentPane().add(tf8);//
		frm.getContentPane().add(tf9);
		frm.getContentPane().add(tf0);
		frm.getContentPane().add(tf10);// ø¨∂Ù√≥ ∞°øÓµ• 4¿⁄∏Æ
		frm.getContentPane().add(tf11);// ø¨∂Ù√≥ ∏∂¡ˆ∏∑ 4¿⁄∏Æ

		// «¡∑π¿”ø°¥Ÿ∞° TextArea √ﬂ∞°
		frm.getContentPane().add(ta1);// µµº≠ ∏Ò∑œ
//		frm.getContentPane().add(ta2);// <Ω≈∞£ ø‰√ª>
		frm.getContentPane().add(ta3);// <¥Îø© ∏Ò∑œ>
		frm.getContentPane().add(ta4);// <¥Îø© «ˆ»≤>

		// «¡∑π¿”ø°¥Ÿ∞° πˆ∆∞ √ﬂ∞°
		frm.getContentPane().add(btn1);// ∞Àªˆ
//		frm.getContentPane().add(btn2);// ø¨∂Ù√≥
		frm.getContentPane().add(btn3);// π›≥≥¿œ
		frm.getContentPane().add(btn4);// ¥Îø©
		frm.getContentPane().add(btn5);// √Îº“
		frm.getContentPane().add(btn6);// ¥Îø©¿œ
		frm.getContentPane().add(btn7);// ¡÷º“
		frm.getContentPane().add(btn8);

		// «¡∑π¿”ø°¥Ÿ∞° JComboBox √ﬂ∞°
		frm.getContentPane().add(box1);// year
		frm.getContentPane().add(box2);// month
		frm.getContentPane().add(box3);// day
		frm.getContentPane().add(box4);// city
		frm.getContentPane().add(box5);// gu
		frm.getContentPane().add(box6);// dong
		frm.getContentPane().add(box7);// phone_number

		// ∆–≥Œ √ﬂ∞°
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.setBounds(10, 650, 510, 85);
		JLabel foot = new JLabel("º≠øÔ∆Ø∫∞Ω√ ¡æ∑Œ±∏ Copyright ®œ µµº≠∞¸ All rights reserved.");
		frm.add(foot);
		jim = new JLabel(img1);
		foot.setBounds(25, 740, 400, 30);
		jp.setBackground(Color.WHITE);
		new Thread(new Runnable() {
	         @Override
	         public void run() {
	            for(;;) {
	               int x=jim.getX()+5;
	               int y=jim.getY();
	               if(x>jim.getWidth()-850) {
	                  jim.setLocation(-550,0);
	               }
	               else
	                  jim.setLocation(x,y);
	               try {
	                  Thread.sleep(100);
	               }
	               catch(Exception e) {}
	            }
	         }
	      }).start();
		frm.add(jp);

		frm.add(jp1);
		// «¡∑π¿”¿Ã ∫∏¿Ãµµ∑œ º≥¡§
		frm.setVisible(true);
	}
}