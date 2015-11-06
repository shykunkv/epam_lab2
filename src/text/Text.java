package text;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import text.Token.Type;

public class Text {
	
	List<Sentence> text;
	
	public Text() {
		text = new LinkedList<Sentence>();
	}
	
	public void addSentence(Sentence sentence) {
		text.add(sentence);
	}
	
	public List<Token> getAllWord() {
		List<Token> res = new ArrayList<Token>();
		
		for (Sentence s : text) {
			for (Token w: s.getSentence()) {
				if (w.getType() == Type.WORD && !w.getValue().isEmpty()) res.add(w);
			}
		}
		
		return res;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Sentence s : text) {
			sb.append(s.toString());
		}
		return sb.toString();
	}
}
