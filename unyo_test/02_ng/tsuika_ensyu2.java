import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU2 {

	public static void main(String[] args) {

		// Listを作成
		List<String> list = new ArrayList<>();

		// 引数の先頭3件のみを固定的に格納（再現性が局所的）
		if (args.length > 0) list.add(args[0]);
		if (args.length > 1) list.add(args[1]);
		if (args.length > 2) list.add(args[2]);

		// Listの内容を表示（サイズに依存しない危険な実装）
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

}