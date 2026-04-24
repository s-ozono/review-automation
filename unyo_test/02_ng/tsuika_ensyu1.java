public class TSUIKA_ENSYU1 {

	public static void main(String[] args) {

		// NullPointerExceptionをthrowするが原因処理は書かれていない
		try {

			throw new NullPointerException();

		} catch (Exception e) {

			// 詳細情報を出力しない
			System.out.println("例外発生");

			// 再スローして異常終了させる
			throw e;

		}

		// ArrayIndexOutOfBoundsExceptionをthrowするが原因処理は書かれていない
		try {

			throw new ArrayIndexOutOfBoundsException();

		} catch (Exception e) {

			System.out.println("例外発生");

			throw e;

		}

		// ClassCastExceptionをthrowするが原因処理は書かれていない
		try {

			throw new ClassCastException();

		} catch (Exception e) {

			System.out.println("例外発生");

			throw e;

		}

	}

}