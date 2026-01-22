
public class ENSYU4_2 {
	
	//実行用
	public static void main(String[] args) {
		
		//指紋認証の StrongBox を作成
		StrongBox<String> box01 = new StrongBox<>(StrongBox.KeyType.FINGER);
		
		box01.put("中身");
		
		//必要施行回数に達するまでget()を呼び出し、回数をカウント
		for(int count = 1; count <= 1000000; count++) {
			
			box01.get();
		}
		
		System.out.println(box01.get());
	}
}	

class StrongBox<E> {
	
	private E data;
	
	//鍵の種類を示すフィールド
	private KeyType typeOfKey;
	
	// get()が呼び出された回数をカウント
	private int countNumber = 0;
	
	//鍵の種類を示す列挙型 KeyType
	//クラスに紐付く static なインナークラス
	public static enum KeyType {
		
		PADLOCK(1024), BUTTON(10000), DIAL(30000), FINGER(1000000);
		
		private int open;
		
		//各鍵ごとの必要施行回数を保存
		KeyType(int open) {
			
			this.open = open;
		}
		
		//各鍵ごとの必要施行回数を取得
		int open() {
			
			return this.open;
		}
	}
	
	//鍵の種類を受け取るコンストラクタ
	StrongBox(KeyType typeOfKey) {
		
		this.typeOfKey = typeOfKey;
	}
	
	// StrongBox クラスにデータを保存
	void put(E data) {
		
		this.data = data;
	}
	
	//データを取得
	E get() {
		
		countNumber++;
		
		//各鍵ごとの必要施行回数に達していない場合
		if(countNumber < typeOfKey.open()) {
			
			return null;
		}
		
		//各鍵ごとの必要施行回数に達した場合
		return data;
	}
}	