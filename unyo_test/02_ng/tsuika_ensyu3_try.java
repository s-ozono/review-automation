import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU3_Try {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		BufferedReader br = null;

		try {

			br = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "UTF-8"));

			// NG：固定回数でしか読み込まない
			String line1 = br.readLine();
			String line2 = br.readLine();
			String line3 = br.readLine();
			String line4 = br.readLine();
			String line5 = br.readLine();

			list.add(line1);
			list.add(line2);
			list.add(line3);
			list.add(line4);
			list.add(line5);

			// NG：try内でしかcloseしていない → 例外時はcloseされない
			br.close();

		} catch (Exception e) {

			// NG：例外の詳細を出力しない
			System.out.println("失敗しました");

		}

		// NG：固定添字アクセス（サイズ変化で例外）
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));

		// NG：逆順も固定
		System.out.println(list.get(4));
		System.out.println(list.get(3));
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		System.out.println(list.get(0));

		// NG：固定位置のみ判定
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