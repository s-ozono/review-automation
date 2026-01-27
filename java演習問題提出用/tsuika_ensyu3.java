import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TSUIKA_ENSYU3 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		Scanner fileScanner = null;
		
		try {
			
			//ファイルのオブジェクトを生成
			File putFile = new File(args[0]);
			
			// UTF-8 形式のテキストファイルを読み込む
			fileScanner = new Scanner(putFile, "UTF-8");
			
			//テキストファイルに記載された内容を list に格納
			while(fileScanner.hasNextLine()) {
				
				list.add(fileScanner.nextLine());
			}
			
			//テキストファイルの1行目から順に出力
			for(String line : list) {
				
				System.out.println(line);
			}
			
			//テキストファイルの最終行から逆順に1行目まで出力
			for(int i = list.size() -1; i >= 0; i--) {
				
				System.out.println(list.get(i));
			}
			
			//テキストファイルのうち、「あいうえお」の文字列が格納されている行番号を出力
			for(int i = 0; i < list.size(); i++) {
				
				if(list.get(i).equals("あいうえお")) {
					
					System.out.println(i + 1 + "行目");
				}
			}
			
		} catch(FileNotFoundException exception) {
			
			System.out.println("ファイルが見つかりません");
		
		} finally {
			
			// null でないとき、ファイルをクローズ
			if(fileScanner != null) {
				
				fileScanner.close();
			}
		}				
	}
}		
	
		