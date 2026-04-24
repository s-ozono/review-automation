import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU3_Finally {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "UTF-8"));

			// NG：固定回数で読み込み（行数が変わると破綻）
			list.add(br.readLine());
			list.add(br.readLine());
			list.add(br.readLine());
			list.add(br.readLine());
			list.add(br.readLine());

		} catch (Exception e) {

			// NG：例外内容を表示せず、原因が分からない
			System.out.println("エラー");

		} finally {

			try {

				// NG：brがnullの可能性を考慮していない
				br.close();

			} catch (Exception e) {

				// NG：ここでも詳細を出さない
				System.out.println("close失敗");

			}

		}

		// NG：固定添字で出力（行数依存）
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));

		// NG：逆順も固定（柔軟性なし）
		System.out.println(list.get(4));
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(0));

		// NG：固定位置のみチェック（データ変化に弱い）
		if ("あいうえお".equals(list.get(0))) {

			System.out.println("1行目");

		}

		if ("あいうえお".equals(list.get(1))) {

			System.out.println("2行目");

		}

		if ("あいうえお".equals(list.get(2))) {

			System.out.println("3行目");

		}

		if ("あいうえお".equals(list.get(3))) {

			System.out.println("4行目");

		}

		if ("あいうえお".equals(list.get(4))) {

			System.out.println("5行目");

		}

	}
}