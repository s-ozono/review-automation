import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU3_Try {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(

				new InputStreamReader(new FileInputStream(args[0]), "UTF-8"))) {

			String line;

			// 1行ずつListに格納
			while ((line = br.readLine()) != null) {

				list.add(line);

			}

		} catch (IOException e) {

			System.out.println("読み込みエラー");

		}

		// 先頭から順に出力
		for (String s : list) {

			System.out.println(s);

		}

		// 逆順に出力
		for (int i = list.size() - 1; i >= 0; i--) {

			System.out.println(list.get(i));

		}

		// 「あいうえお」の行番号を出力
		for (int i = 0; i < list.size(); i++) {

			if ("あいうえお".equals(list.get(i))) {

				System.out.println((i + 1) + "行目");

			}

		}

	}

}