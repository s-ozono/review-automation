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

		// 1つずつ取り出して表示
		for (Map.Entry<Hero, Integer> entry : result.entrySet()) {

			Hero hero = entry.getKey();

			Integer count = entry.getValue();

			System.out.println(hero.getName() + "が倒した敵=" + count);

		}

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