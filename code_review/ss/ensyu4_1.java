
public class ENSYU4_1 {

	public class StrongBox<E> {
		
		private E data;
		
		public void put(E d) {
			
			this.data = d;
		}
		
		public E get() {
			
			return this.data;
		}	
	}	
}