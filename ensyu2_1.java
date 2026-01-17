import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ENSYU2_1 {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		Calendar rightNpw = Calendar.getInstance();
		
		rightNpw.setTime(now);
		
		int dayOfMonth = rightNpw.get(Calendar.DAY_OF_MONTH);
		
		rightNpw.set(Calendar.DAY_OF_MONTH, dayOfMonth + 100);
		
		Date date100 = rightNpw.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat(" 西暦yyyy年MM月dd日 ");
		
		String displayDate = dateFormat.format(date100);
		
		System.out.println(displayDate);
	}
}
