import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU2 {

	public static void main(String[] args) {

		// String型を格納するList型の変数listを宣言
		List<String> list = new ArrayList<String>();
		
		// 起動パラメータに指定された引数をlistに格納
		// 格納できる引数の数に制限なし
		list.add(args[0]);
		list.add(args[1]);
		list.add(args[2]);
		
		// listの中身を1つずつ取り出して表示
		for(String i : list) {
			
			System.out.println(i);
			
		}
	}
}