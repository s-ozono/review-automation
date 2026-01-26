
public class TSUIKA_ENSYU5 {
	
	public static void main(String[] args) {
		
		//(1) 全ての文字列(空文字「""」も含む)
		String regex1 = ".*";
		
		//(2) 最初の1文字はA、2文字目は数字、3文字目は数字か無し
		String regex2 = "A[0-9]{1,2}";
		
		//(3) 最初の1文字はU、2～4文字目は英大文字
		String regex3 = "U[A-Z]{1,3}";
		
		//(1) の正規表現にマッチするか確認
		String text1 = "";
		String text2 = "ABC";
		String text3 = "123";
		
		System.out.println("text1 : " + text1.matches(regex1));
		System.out.println("text2 : " + text2.matches(regex1));
		System.out.println("text3 : " + text3.matches(regex1));
		
		//(2) の正規表現にマッチするか確認
		String characters1 = "A1";
		String characters2 = "A11";
		String characters3 = "A";
		
		System.out.println("characters1 : " + characters1.matches(regex2));
		System.out.println("characters2 : " + characters2.matches(regex2));
		System.out.println("characters3 : " + characters3.matches(regex2));
		
		//(3) の正規表現にマッチするか確認
		String letters1 = "UABC";
		String letters2 = "UAB";
		String letters3 = "Uabc";
		
		System.out.println("letters1 : " + letters1.matches(regex3));
		System.out.println("letters2 : " + letters2.matches(regex3));
		System.out.println("letters3 : " + letters3.matches(regex3));
	}
}
