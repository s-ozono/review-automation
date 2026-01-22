
public class ENSYU4_1 {
	
	//実行用
	public static void main(String[] args) {
		
		// String という実型引数を指定
		StrongBox<String> box01 = new StrongBox<>();
		
		box01.put("箱の中身");
		
		// get() で取得する際、キャストは不要		
		String insideBox = box01.get();
		
		System.out.println(insideBox);
	}
}

//インスタンスの型が決まっていないため、仮型引数 E を指定
class StrongBox<E> {
	
	private E data;
	
	// StrongBoxクラスに一つのインスタンスを保存
	void put(E data) {
		
		this.data = data;
	}
	
	// get() でインスタンスを取得
	E get() {
		
		return this.data;
	}
}