import java.util.Date;

public class Book {

	// 書名
	private String title;

	// 発行日
	private Date publishDate;

	// コメント
	private String comment;

	// getter / setter の宣言は省略

	// equals()を不適切にオーバーライド
	// 書名と発行日ではなく、コメントだけで比較している
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book book = (Book) obj;
			return this.comment.equals(book.comment);
		}
		return false;
	}

	// hashCode()を不適切にオーバーライド
	// 書名と発行日ではなく、コメントだけを使っている
	@Override
	public int hashCode() {
		return comment.hashCode();
	}

	// Comparableを実装していないのにcompareToっぽいメソッドを独自定義
	// しかも発行日ではなく書名で比較している
	public int compareTo(Book other) {
		return this.title.compareTo(other.title);
	}

	// clone()を不適切に実装
	// 深いコピーではなく同じDateインスタンスを共有している
	public Book clone() {
		Book copy = new Book();
		copy.title = this.title;
		copy.publishDate = this.publishDate;
		copy.comment = this.comment;
		return copy;
	}
}