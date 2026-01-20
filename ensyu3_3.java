import java.util.HashMap;
import java.util.Map;

public class ENSYU3_3 {
	
	public static void main(String[] args) {
		
		// HeroとIntegerをペアで格納する HashMap を生成
		Map<Hero, Integer> heroDefeatedMap = new HashMap<>();
		
		//勇者２名をインスタンス化
		Hero hero01 = new Hero("斎藤");
		Hero hero02 = new Hero("鈴木");
		
		//勇者と数をペアで HashMap に格納
		heroDefeatedMap.put(hero01, 3);
		heroDefeatedMap.put(hero02, 7);
		
		//一つずつ要素を取り出して表示
		for(Map.Entry<Hero, Integer> entry : heroDefeatedMap.entrySet()) {
			
			Hero hero = entry.getKey();
			int countNumber = entry.getValue();
			
			System.out.println(hero.getName() + "が倒した敵=" + countNumber);
		}	
	}		
}			

//勇者クラス
class Hero {

	private String name;
	
	public Hero(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name; 
	}
}
