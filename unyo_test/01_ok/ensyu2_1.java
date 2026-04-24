import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ENSYU2_1 {

	public static void main(String[] args) {

		// ①現在の日時をDate型で取得
		Date now = new Date();

		// ②取得した日時情報をCalendarにセット
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		// ③Calendarから「日」の数値を取得
		int day = cal.get(Calendar.DAY_OF_MONTH);

		// ④取得した値に100を足した値をCalendarの「日」にセット
		cal.set(Calendar.DAY_OF_MONTH, day + 100);

		// ⑤Calendarの日付情報をDate型に変換
		Date after100Days = cal.getTime();

		// ⑥SimpleDateFormatで指定形式にして表示
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

		System.out.println(sdf.format(after100Days));

	}

}