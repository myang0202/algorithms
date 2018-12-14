
public class PalindromePermutation {
	private String str;
	private int[] charCountArr;
	//constructor
	public PalindromePermutation(String str) {
		this.str = str;
		this.charCountArr = new int[Character.getNumericValue('z')];
		for(int c = 0; c < charCountArr.length; c++) {
			charCountArr[c] = 0;
		}
	}
	
	// main fun
	public boolean isPalindromePermutation() {
		if(str.length() == 1) {
			return true;
		}
		char[] charArr = str.toCharArray();
		countCharactersInArray(charArr);
		int count = countOddCharacters(charCountArr);
		//if there are 1 or 0 odd counts then return true
		if(count <= 1) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");

		return false;
	}
	
	//dependency injection for testing purpose
	public void countCharactersInArray(char[] charArr) {
		for (char c : charArr) {
			charCountArr[Character.getNumericValue(c)]++;
		}
	}
	
	// return number of odd character counts
	//dependency injection for testing purpose
	public int countOddCharacters(int[] arr) {
		int OddCharacterCount = 0;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i]%2 != 0) {
				OddCharacterCount++;
			}
		}
		System.out.println(OddCharacterCount);

		return OddCharacterCount;
	}
	

}
