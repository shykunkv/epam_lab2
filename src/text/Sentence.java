package text;

import java.util.ArrayList;
import java.util.List;


/**
 * Sentence class - list of tokens
 */
public class Sentence {
	
	
	/**
	 * Tokens in this sentence
	 */
	private List<Token> sentence;
	
	/**
	 * Constructor
	 */
	public Sentence() {
		sentence = new ArrayList<Token>();
	}
	
	/**
	 * Add token to this sentence
	 * @param token token to add
	 */
	public void addWord(Token token) {
		sentence.add(token);
	}
	
	/**
	 * Get length of this sentence - number of tokens
	 * @return number of tokens in sentence
	 */
	public int getLength() {
		return this.sentence.size();
	}
	
	
	public List<Token> getSentence() {
		return sentence;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Token t : sentence) {
			sb.append(t.getValue());
		}
		return sb.toString();
	}
}
