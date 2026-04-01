
public class TSUIKA_ENSYU5 {
	
	public static void main(String[] args) {
	
		// 検索する文字列を用意
		String s = "Java";
		
		String for2 = "A8";
		
		String for3 = "USSS";
		
		// 正規表現と一致しているか確認し表示
		System.out.println(s.matches(".*"));
		
		System.out.println(for2.matches("A[0-9][0-9]?"));
		
		System.out.println(s.matches("A[0-9][0-9]?"));
		
		System.out.println(for3.matches("U[A-Z]{3}"));
		
		System.out.println(s.matches("U[A-Z]{3}"));
	}
}

(1)
.*

(2)
A[0-9][0-9]?
		
(3)
U[A-Z]{3}