
public class TSUIKA_ENSYU1 {
	
	public static void main(String[] args) {
		
		// NullPointerException	を発生させる
		try {
			
			String message = null;
			
			//参照が null の文字列にメソッドを呼び出す
			message.length();
			
		} catch(NullPointerException exception) {
			
			exception.printStackTrace();
		} 
		
		// ArrayIndexOutOfBoundsException を発生させる
		try {
			
			int[] array = {};
			
			//配列の範囲外のインデックスにアクセス
			array[1] = 5;
			
		} catch(ArrayIndexOutOfBoundsException exception) {
			
			exception.printStackTrace();
		}
		
		// ClassCastException を発生させる
		try {
			
			Object stringObject = "Java";
			
			//実体の型と互換性のない型へキャスト
			Integer integerValue = (Integer) stringObject;
			
		} catch(ClassCastException exception) {
			
			exception.printStackTrace();
		}
	}
}
