import java.util.*;

public class TSUIKA_ENSYU4 {
	
	public class Book implements Comparable<Book>,Cloneable {

		private String title;
		private Date publishDate;
		private String comment;

		public static void main(String[] args) {
	
			// titleに値を代入
			public void setTitle(String title) {
			
				this.title = title;
			
			}
		
			// titleの値を返す
			public String getTitle() {
			
				return this.title;
			
			}
	
			// publishDateに値を代入
			public void setPublishDate(Date publishDate) {
				
				this.publishDate = publishDate;
				
			}
			
			// publishDateの値を返す
			public Date getPublishDate() {
				
				return this.publishDate;
				
			}
			
			// commentに値を代入
			public void setComment(String comment) {
				
				this.comment = comment;
				
			}
			
			// commentの値を返す
			public String getComment() {
				
				return this.comment;
				
			}
			
			// titleとpublishDateの値が同じなら等価
			public boolean equals(object o) {
				
				if(this == o) { return true; }
				
				if(o instanceof Book b) {
					
					if(this.title.equals(b.title) && this.publishDate.equals(b.publishDate)) {
						
						return true;
						
					}	
				}
			}
			
			// ハッシュ値を返す
			public int hashCode() {
				
				int result = 1;
				
				result = result * 31 + title.hashCode();
				
				result = result * 31 + publishDate;
				
				return result;
				
			}
			
			// publishDateの自然順序を設定
			public int compareTo(Book obj) {
				
				if(this.publishDate < obj.publishDate) {
					
					return -1;
					
				}
			}
			
			// Bookインスタンスのクローンを生成
			public Book clone() {
				
				Book result = new Book();
					
				result.title = this.title.clone();
				
				result.publishDate = this.publishDate.clone();
				
				result.comment = this.comment.clone();
				
				return result;
				
			}
		}
	}
}
