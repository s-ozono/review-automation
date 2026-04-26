import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU3_Finally {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.err.println("エラー: ファイル名が指定されていません。");
			System.err.println("使用法: java TSUIKA_ENSYU3_Finally <ファイル名>");
			return; // プログラムを終了
	    }

		List<String> list = new ArrayList<>();
		
		BufferedReader br = null;

		try {

			// ファイルをUTF-8で読み込む
			br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "UTF-8"));

			String line;

			// 1行ずつListに格納
			while ((line = br.readLine()) != null) {

				list.add(line);

			}

		} catch (IOException e) {

			System.err.println("ファイル読み込みエラーが発生しました: " + e.getMessage());

		} finally {

			// finally句でクローズ処理
			try {

				if (br != null) br.close();

			} catch (IOException e) {

				System.err.println("ファイルのクローズ中にエラーが発生しました: " + e.getMessage());

			}

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