public class StrongBox<T> {

	// 鍵の種類を表す列挙型
	public enum KeyType {
		PADLOCK,
		BUTTON,
		DIAL,
		FINGER
	}

	// 格納するアイテム
	private T item;

	// 鍵の種類
	private KeyType keyType;

	// get()の呼び出し回数をカウント
	private int count = 0;

	// 鍵の種類を受け取るコンストラクタ
	public StrongBox(KeyType keyType) {

		this.keyType = keyType;

	}

	// アイテムを格納するメソッド
	public void put(T item) {

		this.item = item;

	}

	// アイテムを取得するメソッド（一定回数までは取得不可）
	public T get() {

		// get()が呼ばれるたびに回数をインクリメント
		count++;

		// 必要回数に達していない場合はnullを返す
		if (count < getRequiredCount()) {

			return null;

		}

		// 必要回数に達した場合は格納されている値を返す
		return item;

	}

	// 鍵の種類ごとの必要試行回数を取得するメソッド
	private int getRequiredCount() {

		// 鍵の種類によって必要回数を分岐
		switch (keyType) {

		case PADLOCK:
			return 1024;

		case BUTTON:
			return 10000;

		case DIAL:
			return 30000;

		case FINGER:
			return 1000000;

		default:

			return Integer.MAX_VALUE;

		}

	}

	public static void main(String[] args) {

		// 南京錠タイプの金庫を作成
		StrongBox<String> box = new StrongBox<>(StrongBox.KeyType.PADLOCK);

		// 金庫に値を格納
		box.put("お宝");

		// 取得結果を保持する変数
		String result = null;

		// 繰り返しget()を呼び出して開くか確認
		for (int i = 0; i < 1100; i++) {
			
			// 金庫から値を取得
			result = box.get();

			// 値が取得できた場合（鍵が開いた場合）
			if (result != null) {

				// 取得成功メッセージを表示
				System.out.println("取得成功：" + result);

				// 試行回数を表示
				System.out.println("試行回数：" + (i + 1));

				// ループを終了
				break;

			}

		}

		// 最後まで開かなかった場合の処理
		if (result == null) {

			System.out.println("まだ開きません");

		}

	}

}