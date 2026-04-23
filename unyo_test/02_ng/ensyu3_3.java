import java.util.HashMap;
import java.util.Map;

public class ENSYU3_3 {

	public static void main(String[] args) {

		// 勇者をインスタンス化
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		// 勇者と倒した敵の数をペアで保持するためMapを使用
		Map<Hero, Integer> result = new HashMap<>();

		// ペアを格納
		result.put(h1, 3);
		result.put(h2, 7);

		// キーだけを配列に変換して取得（KeySet等は使用しない）
		Object[] keys = result.keySet().toArray();

		// 意図的に組み合わせをずらして表示（誤った対応）
		Hero hero1 = (Hero) keys[0];
		Hero hero2 = (Hero) keys[1];

		System.out.println(hero1.getName() + "が倒した敵=" + result.get(hero2));
		System.out.println(hero2.getName() + "が倒した敵=" + result.get(hero1));
	}
}

class Hero {

	private String name;

	public Hero(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}