import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ENSYU3_1 {

	public static void main(String[] args) {

	// 都道府県名を重複なし・順序不問で扱うためSetを使用
	Set<String> prefectures = new HashSet<>();

	// 北海道、青森県を追加
	prefectures.add("北海道");
	prefectures.add("青森県");

	// 生徒の点数は順序あり・重複ありのためListを使用
	List<Integer> studentScores = new ArrayList<>();

	// 2人分の点数を追加
	studentScores.add(85);
	studentScores.add(92);

	// 総理大臣名と任期を対応付けるためMapを使用
	Map<String, String> primeMinisters = new HashMap<>();

	// 総理大臣と任期を登録
	primeMinisters.put("安倍晋三", "2012-2020");
	primeMinisters.put("菅義偉", "2020-2021");

	// 都道府県一覧を出力
	System.out.println(prefectures);

	// 生徒の点数一覧を出力
	System.out.println(studentScores);

	// 総理大臣と任期の対応を出力
	System.out.println(primeMinisters);

	}

}