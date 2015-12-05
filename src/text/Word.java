package text;

/**
 * Specific part of sentence - word
 */
public class Word extends Token {
	
	/**
	 * Constructor
	 */
	public Word(String word) {
		super(word);
		setType(Type.WORD);
	}
	
	/**
	 * Get number of some character in this word
	 * @param ch character to find his frequency
	 */
	public int getCharNum(char ch) {
		
		int res = 0;
		for (char c: this.getValue().toLowerCase().toCharArray()) {
			if (c == ch) res++;
		}
		
		return res;
	}
	
}
