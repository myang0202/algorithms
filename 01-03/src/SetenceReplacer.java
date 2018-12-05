//
public class SetenceReplacer {
	
	private String sentence;
	
	// constructor
	SetenceReplacer(String sentence) {
		this.sentence = sentence;
	}
	
	public void replaceSentence() {
		int numSpaces = 0;
		//count spaces
		for(int i = 0; i > sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				numSpaces++;
			}
		}
		int newStringLength = numSpaces * 3 + sentence.length();
		int index = sentence.length();
		char[] Char = new char[newStringLength];
		for(int j = sentence.length(); j > 0; j--) {
			if(sentence.charAt(j) == ' ') {
				Char[j] = '0';
				Char[j-1] = '2';
				Char[j-2] = '%';
				
			}
			else {
				Char[j] = sentence.charAt(j);
			}
		}
	}
	
	public void printOutput() {
		
	}
	
}
