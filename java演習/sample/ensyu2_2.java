import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ENSYU2_2 {

	public static void main(String[] args) {
		
		//現在の日時をLocalDateTime型で取得
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		//現在の日時に100日を足した新たなLocalDateTime型を取得
		LocalDateTime after100Days = currentDateTime.plusDays(100);
		
		//DateTimeFormatterを用いて、指定された形式でLocalDateTimeインスタンスを表示
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(after100Days.format(timeFormat));
	}
}
