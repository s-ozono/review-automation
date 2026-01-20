import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ENSYU3_1 {
	
	//(1)Set
	//順序は不問、かつ重複要素がない Set を使用
	Set<String> prefectures = new HashSet<>();
	
	//(2)List
	//テストの点数は重複する可能性があり、順番に要素としての値を取り出したいため、List を使用
	List<Integer> scores = new ArrayList<>();
	
	//(3)Map
	//キー（名前）とバリュー（任期）をセットで扱いたいため、Map を使用
	Map<String, String> primeMinisters = new HashMap<>();
}	