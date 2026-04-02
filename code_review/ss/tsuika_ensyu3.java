import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TSUIKA_ENSYU3 {

	【解答欄(finally句)】
	public static void main(String[] args)  {
		
		FileReader fr = null;
		BufferedReader in = null;
		List<String> list = new ArrayList<String>();
		
		
		try {
		
		// テキストファイルを開く
		in = new BufferedReader(new FileReader("textA.txt"));
		
		//　文字列sにテキストファイルの内容を1行ずつ格納
		String s = in.readLine();
		
		while(s != null) {
			
			list.add(s);
			
			s = in.readLine();
			
			}
		
		// テキストファイルの内容を1行目から表示
		for(int i = 0; i < 5; i++) {
			
			System.out.println("list[i]");
			
		}
		
		// テキストファイルの内容を最後の業から表示
		for(int i = 4; i >= 0; i--) {
			
			System.out.println("list[i]");
			
		}
		
		// テキストファイルの内容が「あいうえお」であれば「3行目」と表示
		for(int i = 0; i < 5; i++) {
			
			if("list[i]" == "あいうえお");
			
			System.out.println(i + 1 + "行目");
			
		}
		
		// 例外発生時にエラー文を表示
		}catch(IOException e) {
			
			System.out.println("ファイル読み込みエラーです");
			
		// ファイルを閉じる	
		} finally {
			
			if(in != null) {
				
				try {
					
					in.close();
					
				} catch(IOException e2) {}
			}
		}
	}
}

【解答欄(try句)】
public static void main(String[] args) {
	
	List<String> list = new ArrayList<String>();
	
	// テキストファイルを開く
	try(BufferedReader in = new BufferedReader(new FileReader("textA.txt")) {
			
			// 文字列sにテキストファイルの内容を1行ずつ格納
			String s = in.readLine();
			
			while(s != null) {
				
				list.add(s);
				
				s = in.readLine();
				
			}
	
		// テキストファイルの内容を1行目から表示	
		for(int i = 0; i < 5; i++) {
		
			System.out.println("list[i]");
		
		}
	
		// テキストファイルの内容を最後の業から表示
		for(int i = 4; i >= 0; i--) {
		
			System.out.println("list[i]");
		
		}
		
		// テキストファイルの内容が「あいうえお」であれば「3行目」と表示
		for(int i = 0; i < 5; i++) {
		
			if("list[i]" == "あいうえお");
		
			System.out.println(i + 1 + "行目");
		
		}
	
	// 例外発生時にエラー文を表示
	}catch(IOException e) {
		
		System.out.println("ファイル読み込みエラーです");
	}
}