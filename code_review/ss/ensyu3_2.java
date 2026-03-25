import java.util.ArrayList;

public class ENSYU3_2 {
	
	public static void main(String[] args) {

	// 勇者斎藤と勇者鈴木のインスタンスを生成
	Hero saitou = new Hero("斎藤");
	Hero suzuki = new Hero("鈴木");

	// Hero型を格納するArrayListを生成
	ArrayList<Hero> heroes = new ArrayList<Hero>();
	
	// 斎藤と鈴木をArrayListに格納
	heroes.add(saitou);
	heroes.add(suzuki);
	
	// ArrayListから要素を1つずつ取り出して表示
	for(Hero hero : heroes) {
		
		System.out.println(hero.getName());
		}
	}
}