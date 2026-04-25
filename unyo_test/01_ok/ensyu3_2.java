import java.util.ArrayList;

public class ENSYU3_2 {

	public static void main(String[] args) {

		// Heroインスタンスを格納するArrayListを作成
		ArrayList<Hero> heroes = new ArrayList<>();

		// 勇者を2名作成してリストに追加
		heroes.add(new Hero("斎藤"));
		heroes.add(new Hero("鈴木"));

		// 1つずつ取り出して名前を表示
		for (Hero hero : heroes) {

			System.out.println(hero.getName());

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