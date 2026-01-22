import java.util.ArrayList;
import java.util.List;

public class ENSYU3_2 {
	
	public static void main(String[] args) {
		
		// Heroを格納するArrayListを生成
		List<Hero> heroNameList = new ArrayList<>();
		
		//勇者2名をインスタンス化
		Hero hero01 = new Hero("斎藤");
		Hero hero02 = new Hero("鈴木");
		
		//勇者2名をArrayListに格納
		heroNameList.add(hero01);
		heroNameList.add(hero02);
		
		//一つずつ順番に要素を取り出して名前を表示
		for(Hero hero : heroNameList) {
			
			System.out.println(hero.getName());
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

