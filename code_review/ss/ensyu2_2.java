import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ENSYU2_2 {
	
	public static void main(String[] args) {
		
		LocalDate ldate = LocalDate.now();
		
		LocalDate ldatep = ldate.plusDays(100);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		String nowPlus100days = ldatep.format(fmt);
		
		System.out.println(nowPlus100days);
	}
}