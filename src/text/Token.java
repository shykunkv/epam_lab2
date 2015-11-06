package text;

public abstract class Token {
	
	
	public enum Type {
		WORD, PUNCTUATION, WHITESPACE;
	};
	
	protected Type type;
	protected String value;
	
	public Token(String value) {
		this.value = value;
	}

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
	
	@Override
	public String toString() {
		return value;
	}
}
