package textProccesing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

import text.Sentence;
import text.Text;
import text.Token;
import text.Word;


public class TextProcess {
	
	private Text text;
	static int pos;
	
	
	
	public TextProcess() {
		text = new Text();
		pos = 0;
	}
	
	
	public void readText(String file) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(file));
		
		sc.useDelimiter(" |,|\\.|\\?|\\!|\\-");
		Sentence sent = new Sentence();
		while (sc.hasNext()) {
			sent.addWord(new Word(sc.next()));
		}
		text.addSentence(sent);
	}
	
	public List<Token> sort(final char c) {
		
		List<Token> res = getText().getAllWord();
		
		Collections.sort(res, new Comparator<Token>() {
			
			public int compare(Token arg0, Token arg1) {
				int t1 = arg1.getCharNum(c);
				int t2 = arg0.getCharNum(c);
				if (t1 == t2) {
					return arg0.getValue().compareToIgnoreCase(arg1.getValue());
				} else {
					return Integer.compare(t1, t2);
				}
			}
			
		});
		
		return res;
	}
	
	public Text getText() {
		return text;
	}
	
}
