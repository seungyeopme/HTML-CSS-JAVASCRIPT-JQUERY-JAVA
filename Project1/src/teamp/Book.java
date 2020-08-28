package teamp;

import java.io.Serializable;
public class Book implements Serializable{
	int book_id;// ∫œ æ∆¿Ãµ Hashmap¿« ≈∞ ∞™¿∏∑Œ ªÁøÎ and DB ±‚∫ª≈∞∑Œ ªÁøÎ
	String book_name;// ¿Ã∏ß
	String writer;// ¿€ªÁ
	String publisher;// √‚∆«ªÁ
	String book_story;// ¡Ÿ∞≈∏Æ
	String book_img = "±‚∫ª ¿ÃπÃ¡ˆ ∆ƒ¿œ ∞Ê∑Œ";// ¿ÃπÃ¡ˆ µÓ∑œ æ» «ﬂ¿ªΩ√ ±‚∫ª ¿ÃπÃ¡ˆ
	int genre; // ¿Â∏£∫∞ ƒ⁄µÂ ex> 1. ∑Œ∏«Ω∫ 2. Ω∫∆˜√˜ 3.»£∑Ø.....

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
