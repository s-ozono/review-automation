public class TSUIKA_ENSYU1 {

	public static void main(String[] args) {

		// NullPointerExceptionを発生させる
		try {

			String str = null;

			str.length();

		} catch (NullPointerException e) {

			e.printStackTrace();

		}

		// ArrayIndexOutOfBoundsExceptionを発生させる
		try {

			int[] arr = new int[3];

			int value = arr[5];

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

		}

		// ClassCastExceptionを発生させる
		try {

			Object obj = "文字列";

			Integer num = (Integer) obj;

		} catch (ClassCastException e) {

			e.printStackTrace();

		}

		// プログラムは正常終了
		System.out.println("プログラム終了");

	}

}