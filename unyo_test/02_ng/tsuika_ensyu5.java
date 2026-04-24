public class TSUIKA_ENSYU5 {

	public static void main(String[] args) {

		String[] samples = {"", "A1", "A11", "A", "UABC", "UAB", "UaBC"};

		// NG：正規表現として誤っているパターン
		String pattern1 = ".+";          // 空文字にマッチしない（本来はOKにすべき）
		String pattern2 = "A[0-9]";      // 3文字目に対応していない
		String pattern3 = "U[A-Z]";      // 文字数制限が不正

		for (String s : samples) {

			System.out.println("対象文字列: \"" + s + "\"");

			// NG：matchesを使わず、containsで判定している
			boolean result1 = s.contains(pattern1);

			// NG：startsWithなどで部分的にしか判定していない
			boolean result2 = s.startsWith("A") && s.length() > 1;

			// NG：長さチェックも不完全で、条件を満たしていない
			boolean result3 = s.startsWith("U") && s.length() >= 2;

			System.out.println(" (1) " + result1);
			System.out.println(" (2) " + result2);
			System.out.println(" (3) " + result3);

			System.out.println();

		}

	}

}