
public class TSUIKA_ENSYU1 {
	
	public static void main(String[] args) {

		try {
			
			A[] array = new D[]{ (D) null, newC(), newD()};
			
			System.out.println(array[0])
			
			array[3] = 1;
			
			
		} catch (NullPointerExeption e) {
			
			System.out.println(e.PrintStackTrace());
			
	
		} catch (ArrayIndexOutOfBoundsExeption e) {
			
			System.out.println(e.PrintStackTrace());
			

		} catch (ClassCastException e) {
			
			System.out.println(e.PrintStackTrace());
			
		}
	} 
}