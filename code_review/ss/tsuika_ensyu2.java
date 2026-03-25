import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU2 {

	public static void main(String[] args) {
		
		List<String> s = new ArrayList<String>();
		
		s.add(args[0]);
		s.add(args[1]);
		s.add(args[2]);
		
		for(String i : s) {
			
			System.out.println(i);
			
		}
	}
}