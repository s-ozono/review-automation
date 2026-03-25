import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ENSYU2_1 {

	// 「現在の100日後の日付」を「西暦2011年09月24日」という形式で表示する
	public static void main(String[] args) {
		
		// 現在の日時を取得
		Date now = new Date();
				
		Calendar c = Calendar.getInstance();
		
		// 取得した日時情報をCalendarにセット
		c.setTime(now);
		
		// Calendarから「日」のデータを取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		// 取得した値に100を足した値をCalendarの「日」にセット
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		
		// Calendarの日付情報をDate型に変換
		Date future = c.getTime();
		
		// 指定された形式でDateインスタンスの内容を表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
				
		String s = f.format(future);
		
		System.out.println(s);
	}
}