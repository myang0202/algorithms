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
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				numSpaces++;
			}
		}
		
		int newStringLength = numSpaces * 2 + sentence.length();
		char[] Char = new char[newStringLength];

		System.out.println(newStringLength);
		for(int j = sentence.length() - 1; j >= 0; j--) {
			if(sentence.charAt(j) == ' ') {
				Char[newStringLength-1] = '0';
				Char[newStringLength-2] = '2';
				Char[newStringLength-3] = '%';
				newStringLength -= 3;
			}
			else {
				Char[newStringLength -1] = sentence.charAt(j);
				newStringLength--;
				System.out.println(newStringLength);
			}
		}
		printOutput(Char);
	}
	
	// print output
	public void printOutput(char[] charString) {
		System.out.println(charString);
	}
	
}
