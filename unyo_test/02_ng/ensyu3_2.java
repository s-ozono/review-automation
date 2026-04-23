import java.util.ArrayList;

class ENSYU3_2 {

	public static void main(String[] args) {

		// ジェネリクスを使わずにArrayListを作成（型が不適切）
		ArrayList list = new ArrayList();

		// 勇者オブジェクトをリストに追加
		list.add(new Hero("斎藤"));
		list.add(new Hero("鈴木"));

		// 固定インデックスで要素を取得（動的処理不可）
		Hero h1 = (Hero) list.get(0);
		Hero h2 = (Hero) list.get(1);

		// 特定の名前の場合のみ出力（この条件でしか正常動作しない）
		if (h1.getName().equals("斎藤") && h2.getName().equals("鈴木")) {

			// 固定値を直接出力（リストの内容を使っていない）
			System.out.println("斎藤");
			System.out.println("鈴木");
		}
	}
}

// アクセス修飾子なし（パッケージプライベート）
class Hero {

	// フィールドもアクセス修飾子なし
	String name;

	// コンストラクタもアクセス修飾子なし
	Hero(String name) {
		this.name = name;
	}

	// メソッドもアクセス修飾子なし
	String getName() {
		return this.name;
	}
}