package text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	
	private List<Token> sentence;
	
	public Sentence() {
		sentence = new ArrayList<Token>();
	}
	
	public void addWord(Token token) {
		sentence.add(token);
	}
	
	public int getLength() {
		return this.sentence.size();
	}
	
	public List<Token> getSentence() {
		return sentence;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Token t : sentence) {
			sb.append(t.getValue());
		}
		return sb.toString();
	}
}
