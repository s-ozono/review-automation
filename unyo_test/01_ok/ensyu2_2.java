import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ENSYU2_2 {
	
	public static void main(String[] args) {

		// 現在の日付を取得
		LocalDate now = LocalDate.now();

		// 現在の日付から100日後の日付を計算
		LocalDate after100Days = now.plusDays(100);

		// 表示形式（西暦YYYY年MM月DD日）を指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

		// フォーマットした日付を出力
		System.out.println(after100Days.format(formatter));
    
	}

}