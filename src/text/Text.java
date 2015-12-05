package text;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import text.Token.Type;

/**
 * Text class - list of sentences
 */
public class Text {
	
	/**
	 * Sentences in this text
	 */
	List<Sentence> text;
	
	/**
	 * Concstructor
	 */
	public Text() {
		text = new LinkedList<Sentence>();
	}
	
	/**
	 * Add new sentence to this text
	 * @param sentence sentence to add
	 */
	public void addSentence(Sentence sentence) {
		text.add(sentence);
	}
	
	/**
	 * Get list of all words in this text
	 * @return list of all word
	 */
	public List<Token> getAllWord() {
		List<Token> res = new ArrayList<Token>();
		
		for (Sentence s : text) {
			for (Token w: s.getSentence()) {
				if (w.getType() == Type.WORD && !w.getValue().isEmpty()) res.add(w);
			}
		}
		
		return res;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Sentence s : text) {
			sb.append(s.toString());
		}
		return sb.toString();
	}
}
