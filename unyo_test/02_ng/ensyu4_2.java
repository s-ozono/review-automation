public class StrongBox<T> {

	// 本来は列挙型を使うべきだが、文字列で管理してしまっている
	private String keyType;

	// 金庫に格納するインスタンス
	private T item;

	// get()の呼び出し回数
	private int count = 0;

	// 鍵の種類を受け取るコンストラクタ
	public StrongBox(String keyType) {
		this.keyType = keyType;
	}

	// 金庫にインスタンスを格納する
	public void put(T item) {
		this.item = item;
	}

	// 金庫からインスタンスを取得する
	public T get() {

		// get()が呼ばれるたびに回数を増やす
		count++;

		// 必要試行回数未満でもnullを返さず、常に何か返してしまう
		if (count < getRequiredCount()) {
			return item;
		}

		// 必要試行回数を超えても格納した値ではなくnullを返してしまう
		return null;
	}

	// 鍵の種類ごとの必要試行回数を返す
	private int getRequiredCount() {
		if ("PADLOCK".equals(keyType)) {
			return 1024;
		} else if ("BUTTON".equals(keyType)) {
			return 10000;
		} else if ("DIAL".equals(keyType)) {
			return 30000;
		} else if ("FINGER".equals(keyType)) {
			return 1000000;
		}
		return 0;
	}

	public static void main(String[] args) {

		// 本来は列挙型を使うべきだが文字列で指定している
		StrongBox<String> box = new StrongBox<>("PADLOCK");

		// 金庫に値を格納
		box.put("お宝");

		// 取得結果を保持する変数
		String result = null;

		// get()を繰り返し呼び出す
		for (int i = 0; i < 1200; i++) {

			// 金庫から値を取得
			result = box.get();

			// if分岐を使って結果を判定している
			if (result == null) {
				System.out.println("nullが返されました");
			} else {
				System.out.println("取得結果：" + result);
			}
		}
	}
}