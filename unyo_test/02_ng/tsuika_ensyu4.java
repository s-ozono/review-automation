import java.util.Date;

public class TSUIKA_ENSYU4 {

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
		if (obj instanceof TSUIKA_ENSYU4_NG) {
			TSUIKA_ENSYU4_NG book = (TSUIKA_ENSYU4_NG) obj;
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
	public int compareTo(TSUIKA_ENSYU4_NG other) {
		return this.title.compareTo(other.title);
	}

	// clone()を不適切に実装
	// 深いコピーではなく同じDateインスタンスを共有している
	public TSUIKA_ENSYU4_NG clone() {
		TSUIKA_ENSYU4_NG copy = new TSUIKA_ENSYU4_NG();
		copy.title = this.title;
		copy.publishDate = this.publishDate;
		copy.comment = this.comment;
		return copy;
	}
}