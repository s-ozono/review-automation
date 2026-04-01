
public class StrongBox<E> {

	private E data;
	private KeyType keyType;
	private int count;
	
	// 鍵の種類を受け取る
	public StrongBox(KeyType keyName ) {
		this.keyType = keyName;
		
	}
	
	// 変数dataの値を設定
	public void put(E d) {
		
		this.data = d;
		
	}
	
	// countを1増やし変数dataの値を返す
	public E get() {
		
		++count;
		
		switch(this.keyType) {
		
			case PADLOCK -> {
			
				if(count < 1024) {
					
					return null;
				
					}
				}
				case BUTTON -> {
					
					if(count < 10000) {
						
						return null;
						
						}
					}
				case DIAL -> {
					
					if(count < 30000) {
						
						return null;
						
						}
					}
				case FINGER -> {
					
					if(count < 1000000) {
						
						return null;
						
						}
					}
		}
		
		return this.data;	
	}
}
