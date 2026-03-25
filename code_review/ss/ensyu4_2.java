
public class ENSYU4_2 {

	public class StrongBox<E> {
		
		private E date;
		private KeyType keyType;
		private int count;
		
		public StrongBox(KeyType keyName ) {
			this.keyType = keyName;
			
		}
		
		public void put(E d) {
			
			this.date = d;
		}
		
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
			return this.date;	
	}
	
	enum KeyType {
		
		PADLOCK, BUTTON, DIAL, FINGER;
	}
}
}