import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ENSYU2_1 {

	// 「現在の100日後の日付」を「西暦2011年09月24日」という形式で表示する
	public static void main(String[] args) {
		
		Date now = new Date();
				
		Calendar c = Calendar.getInstance();
		
		c.setTime(now);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		
		Date d = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
				
		String s = f.format(d);
		
		System.out.println(s);
	}
}