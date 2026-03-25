import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ENSYU2_2 {
	
	public static void main(String[] args) {
		
		// 現在の日時を取得
		LocalDate now = LocalDate.now();
		
		// 取得した日時の値に100を足す
		LocalDate nowp = now.plusDays(100);
		
		// 日時情報を文字列に変換して表示
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		
		String future = nowp.format(fmt);
		
		System.out.println(future);
	}
}