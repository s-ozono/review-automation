import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ENSYU2_2 {

	public static void main(String[] args) {
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		LocalDateTime after100Days = currentDateTime.plusDays(100);
		
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern(" 西暦yyyy年MM月dd日 ");
		
		System.out.println(after100Days.format(timeFormat));
	}
}
