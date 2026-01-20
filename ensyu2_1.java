import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ENSYU2_1 {

	public static void main(String[] args) {
		
		//現在の日時をDate型で取得
		Date now = new Date();
		
		//取得した日時をCalendarにセット
		Calendar rightNpw = Calendar.getInstance();
		rightNpw.setTime(now);
		
		//Calendarから「日」の数値を取得
		int dayOfMonth = rightNpw.get(Calendar.DAY_OF_MONTH);
		
		//取得した値に100を足した値をCalendarの「日」にセット
		rightNpw.set(Calendar.DAY_OF_MONTH, dayOfMonth + 100);
		
		//Calendarの日付情報をDate型に変換
		Date date100 = rightNpw.getTime();
		
		//SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示
		SimpleDateFormat dateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String displayDate = dateFormat.format(date100);
		System.out.println(displayDate);
	}
}
