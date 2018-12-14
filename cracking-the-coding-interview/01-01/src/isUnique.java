import java.util.HashSet;

public class isUnique {
	// MAX NUMBER OF CHARACTERS
	private static final int NUM_CHAR = 256;
	
	// HASING
	// ADDITIONAL SPACE
	public static boolean hashing(String str) {
		if(str.length() > NUM_CHAR){
			return false;
		}
		HashSet<Character> set = new HashSet<Character>(NUM_CHAR);
		for(int i = 0; i < str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				return false;
			}
			else {
				set.add(str.charAt(i));
			}
		}
		return true;
		
	}
	
	// brute force method
	// NO ADDITIONAL SPACE
	public static boolean doubleLoop(String str) {
		if(str.length() > NUM_CHAR){
			return false;
		}
		for(int i = 0; i < str.length() - 1; i++) {
			for(int j = i + 1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
}
