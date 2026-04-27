import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {

	// 書名
	private String title;

	// 発行日
	private Date publishDate;

	// コメント
	private String comment;

	// 書名の取得
	public String getTitle() {
		return title;
	}

	// 書名の設定
	public void setTitle(String title) {
		this.title = title;
	}

	// 発行日の取得
	public Date getPublishDate() {

		return (Date)publishDate.clone();

	}

	// 発行日の設定
	public void setPublishDate(Date publishDate) {

		this.publishDate = (Date)publishDate.clone();

	}

		// コメントの取得
	public String getComment() {
		return comment;
	}

	// コメントの設定
	public void setComment(String comment) {
		this.comment = comment;
	}

	// オブジェクトの等価性を判定（書名と発行日が同じなら等しい）
	@Override
	public boolean equals(Object o) {

		// 同一インスタンスであればtrue
		if (this == o) {
			return true;
		}

		// 型が異なる場合はfalse
		if (!(o instanceof Book)) {
			return false;
		}

		// Book型にキャストして比較
		Book book = (Book) o;

		// 書名と発行日が一致すればtrue
		return title.equals(book.title) && publishDate.equals(book.publishDate);
	}

	// ハッシュコードを生成（equalsと整合性を持たせる）
	@Override
	public int hashCode() {

		// 書名と発行日をもとにハッシュ値を生成
		return Objects.hash(title, publishDate);
	}

	// 発行日で比較（古い順にソート）
	@Override
	public int compareTo(Book other) {

		// 発行日を比較して並び替え
		return this.publishDate.compareTo(other.publishDate);
	}

	// オブジェクトの複製（深いコピー）
	@Override
	public Book clone() {

		// 新しいBookインスタンスを作成
		Book copy = new Book();

		// 書名をコピー（Stringは不変なのでそのままでOK）
		copy.title = this.title;

		// Dateは可変オブジェクトのためcloneで複製（深いコピー）
		copy.publishDate = (Date) this.publishDate.clone();

		// コメントをコピー
		copy.comment = this.comment;

		// 複製したインスタンスを返す
		return copy;
	}
}