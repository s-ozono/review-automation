
public class TSUIKA_ENSYU5 {

	(1)
	[正規表現パターン]
	.
			
	[処理]
	String s = "Java";
	s.matches(".");
	
	(2)
	[正規表現パターン]
	A[\d][\d\s]
			
	[処理]
	String s = "Java";
	s.matches("A[\d][\d\s]");
	
	(3)
	[正規表現パターン]
	U[A-Z] {3}
	
	{処理]
	String s = "Java";
	s.matchs("U[A-Z]{3}");

}
