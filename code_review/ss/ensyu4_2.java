
public class ENSYU4_2 {

	public static void main(String[] args) {
		
		// StrongBoxのインスタンスを生成
		StrongBox<String> sb = new StrongBox<String>(KeyType.PADLOCK);
		
		// StringBoxクラスの変数dataに値を設定
		sb.put("宝");
		
		//StringBoxクラスのcountを1増やし変数dataの値を取得 
		String s = sb.get();
		
		System.out.println(s);
		
	}
}