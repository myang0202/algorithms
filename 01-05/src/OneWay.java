
public class OneWay {
	
	public boolean isOneEditAway(String str1, String str2){
		//find longer or shorter
		
		//if length is same
		if(str1 == str2) {
				return false;
		}
		String longString = "";
		String shortString = "";
		int longIndex = 0;
		int shortIndex = 0;
		if(str1.length() < str2.length()) {
			shortString = str1;
			longString = str2;
		}
		else {
			shortString = str2;
			longString = str1;
		}
		
		if(longString.length() - shortString.length() > 1) return false;
		

		boolean isAlreadyFound = false;
		
		while(longIndex < longString.length() && shortIndex < shortString.length()) {			
			if(longString.charAt(longIndex) != shortString.charAt(shortIndex)) {
				//Strike 2 and it's out
				if(isAlreadyFound == true) {
					return false;
				}
				else {
					isAlreadyFound = true;
				}
			}
			else {
				shortIndex++;
			}
			longIndex++;
			if(longString.length() == shortString.length()) {
				shortIndex++;
			}
		}
		return true;
	}
}
