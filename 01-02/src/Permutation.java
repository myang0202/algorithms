public class Permutation {
	private static final int NUM_CHAR = 256;
	//SORTING
	
	//STORE ARRAY
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length() !=  str2.length()) {
			return false;
		}
		int[] character = new int[NUM_CHAR];
		//COUNT LETTERS IN STRING 1 THEN STORE IN ARRAY
		for(int i = 0; i < str1.length(); i++) {
			character[str1.charAt(i)]++;
		}
		for(int j = 0; j < str2.length(); j++) {
			character[str2.charAt(j)]--;
			if(character[str2.charAt(j)] < 0) {
				return false;
			}
		}
		return true;
	}
}
