import java.util.HashMap;
import java.util.Map;

public class ENSYU3_3 {

	public static void main(String[] args) {
		
		Hero saitou = new Hero("斉藤");
		Hero suzuki = new Hero("鈴木");

		Map<Hero,Integer> heroKillsEnemies = new HashMap<Hero,Integer>();
		
		heroKillsEnemies.put(saitou, 3);
		heroKillsEnemies.put(suzuki, 7);
		
		int saitouKillsEnemies = heroKillsEnemies.get(saitou);
		
		System.out.println("斎藤が倒した敵=" + saitouKillsEnemies);
		
		int suzukiKillsEnemies = heroKillsEnemies.get(suzuki);
		
		System.out.println("鈴木が倒した敵=" + suzukiKillsEnemies);
	}  
}