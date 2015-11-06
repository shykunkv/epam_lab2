package text;

public class Word extends Token {
	
	public Word(String word) {
		super(word);
		setType(Type.WORD);
	}
	
	
	public int getCharNum(char ch) {
		int res = 0;
		for (char c: this.getValue().toLowerCase().toCharArray()) {
			if (c == ch) res++;
		}
		return res;
	}
	
}
