import java.util.Arrays;

public class TSUIKA_ENSYU2 {

	public static void main(String[] args) {

		
		// String配列argsからリストのインスタンスを生成
		var list = Arrays.asList(args);
		
		// listの中身を1つずつ取り出して表示
		for(String i : list) {
			
			System.out.println(i);
			
		}
	}
}