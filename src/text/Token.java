package text;

/**
 * Some piece of the sentence
 */
public abstract class Token {
	
	/**
	 * Different tyopes for sentence parts
	 */
	public enum Type {
		WORD, PUNCTUATION, WHITESPACE;
	};
	
	/**
	 * Token type
	 */
	protected Type type;
	
	/**
	 * Token value
	 */
	protected String value;
	
	/**
	 * Constructor
	 */
	public Token(String value) {
		this.value = value;
	}
	
	/**
	 * Getters and setters
	 */
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public int getCharNum(char ch) {
		return 0;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return value;
	}
}
