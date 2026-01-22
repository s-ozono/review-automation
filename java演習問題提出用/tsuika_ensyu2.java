import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU2 {

	public static void main(String[] args) {
		
		//起動パラメータを格納する List を生成
		List<String> stringList = new ArrayList<>();
		
		// args 配列の引数を List型の変数に格納
		for(String contents : args) {
			
			stringList.add(contents);
		}
		
		// List型の変数に格納された値を表示
		for(String stringValue : stringList) {
			
			System.out.println(stringValue);
		}
	}
}
