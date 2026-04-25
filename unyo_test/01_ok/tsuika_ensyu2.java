import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU2 {

	public static void main(String[] args) {

		// 起動パラメータを格納するListを作成
		List<String> list = new ArrayList<>();

		// 配列argsの内容をListに格納
		for (String arg : args) {

			list.add(arg);

		}

		// Listに格納された値を順に表示
		for (String value : list) {

			System.out.println(value);

		}

	}

}