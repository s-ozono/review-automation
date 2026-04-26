public class TSUIKA_ENSYU5 {

	public static void main(String[] args) {

		// テスト用文字列
		String[] samples = {"", "A1", "A11", "A", "UABC", "UAB", "UaBC"};

		// (1) すべての文字列（空文字含む）
		String pattern1 = ".*";

		// (2) 最初がA、2文字目が数字、3文字目は数字または無し
		String pattern2 = "^A\\d\\d?$";

		// (3) 最初がU、2～4文字目が英大文字
		String pattern3 = "^U[A-Z]{1,3}$";

		// 確認処理
		for (String s : samples) {

			System.out.println("対象文字列: \"" + s + "\"");

			System.out.println(" (1) " + s.matches(pattern1));
			System.out.println(" (2) " + s.matches(pattern2));
			System.out.println(" (3) " + s.matches(pattern3));

			System.out.println();

		}

	}

}