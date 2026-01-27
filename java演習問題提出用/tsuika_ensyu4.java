import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//実行用
public class TSUIKA_ENSYU4 {
	
	public static void main(String[] args) {
		
		Book jump1 = new Book();
		
		jump1.setTitle("ONE PIECE");
		jump1.setPublishDate(new Date(015));
		jump1.setComment("ルフィー");
		
		Book jump2 = new Book();
		
		jump2.setTitle("ONE PIECE");
		jump2.setPublishDate(new Date(015));
		jump2.setComment("ゾロ");
		
		//等価であるか判定
		System.out.println(jump1.equals(jump2));
		
		Set<Book> mangaSet = new HashSet<>();
		
		mangaSet.add(jump1);
		mangaSet.add(jump2);
		
		// HashSetを利用しても正しく利用できるか
		System.out.println(mangaSet.size());
		
		Book jump0 = new Book();
		
		jump0.setTitle("スラムダンク");
		jump0.setPublishDate(new Date(011));
		jump0.setComment("桜木花道");
		
		List<Book> mangaList = new ArrayList<>();
		
		mangaList.add(jump1);
		mangaList.add(jump0);
		
		Collections.sort(mangaList);
		
		for(Book book : mangaList) {
			
			//発行日が古い順にタイトルが並べ替えられるか
			System.out.println(book.getTitle());
		}
	}
}

class Book implements Comparable<Book>, Cloneable {
	
	private String title;
	private Date publishDate;
	private String comment;
	
	// getter / setter
	public String getTitle() {
		
		return title;
	}
	
	public void setTitle(String title) {
		
		this.title = title;
	}
	
	public Date getPublishDate() {
		
		return publishDate;
	}
	
	public void setPublishDate(Date publishDate) {
		
		this.publishDate = publishDate;
	}
	
	public String getComment() {
		
		return comment;
	}
	
	public void setComment(String comment) {
		
		this.comment = comment;
	}
	
	//書名と発行日が同じであれば、等価と判定
	public boolean equals(Object obj) {
		
		//自身が引数として渡されてきた場合、無条件で true
		if(obj == this) {
			
			return true;
		}
		
		// null が引数として渡されてきた場合、無条件で false
		if(obj == null) {
			
			return false;
		}
		
		//比較し型が異なる場合、false を返す
		if(!(obj instanceof Book)) {
			
			return false;
		}
		
		Book matchBook = (Book) obj;
		
		return title.equals(matchBook.title) && publishDate.equals(matchBook.publishDate);  
	}				
	
	// equals と整合性のあるハッシュコードを返す
	public int hashCode() {
		
		return title.hashCode() +  publishDate.hashCode();
	}
	
	// Book インスタンスを発行日が古い順に並び替え
	public int compareTo(Book matchBook) {
		
		return publishDate.compareTo(matchBook.publishDate);
	}
	
	// clone() を呼び出し、深いコピーによる複製を行う
	public Book clone() throws CloneNotSupportedException {
	
			Book cloneBook = (Book) super.clone();
		
		cloneBook.publishDate = (Date) this.publishDate.clone();
		
		return cloneBook;
	}	
}