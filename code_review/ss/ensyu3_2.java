import java.util.ArrayList;

public class ENSYU3_2 {
	
	public static void main(String[] args) {

	Hero saitou = new Hero("斎藤");
	Hero suzuki = new Hero("鈴木");
	
	ArrayList<Hero> heros = new ArrayList<Hero>();
	
	heros.add(saitou);
	heros.add(suzuki);
	
	for(Hero hero : heros) {
		
		System.out.println(hero.getName());
		}
	}
}