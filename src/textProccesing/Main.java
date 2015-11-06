package textProccesing;

import java.io.FileNotFoundException;
import java.util.List;

import text.Token;

public class Main {

	public static void main(String[] args) {
		String file = "src/input.txt";
		TextProcess textProcess = new TextProcess();
		try {
			textProcess.readText(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<Token> res = textProcess.sort('l');
		
		System.out.println(res.toString());
	}

}
