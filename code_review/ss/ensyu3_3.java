import java.util.HashMap;
import java.util.Map;

public class ENSYU3_3 {

	public static void main(String[] args) {
		
		// 勇者斎藤と勇者鈴木のインスタンスを生成
		Hero saitou = new Hero("斉藤");
		Hero suzuki = new Hero("鈴木");

		// Hero型とIntegar型をセットで格納するMapを生成
		Map<Hero,Integer> heroes = new HashMap<Hero,Integer>();
		
		// Mapに勇者名と倒した敵をセットで格納
		heroes.put(saitou, 3);
		heroes.put(suzuki, 7);
		
		// 勇者名を取得し繰り返す
		for(Hero key : heroes.keySet()) {
			
			// 勇者が倒した敵の数を取得し繰り返す
			int value = heroes.get(key);
			
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}  
}