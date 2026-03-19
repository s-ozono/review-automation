
public class ENSYU4_1 {

	public class StrongBox<E> {
		
		private E date;
		
		public void put(E d) {
			
			this.date = d;
		}
		
		public E get() {
			
			return this.date;
		}	
	}	
}
