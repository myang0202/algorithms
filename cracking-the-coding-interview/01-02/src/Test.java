
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PASS TEST
		String str1 = "ababab";
		String str2 = "aaabbb";		
		System.out.println(Permutation.isPermutation(str1,str2));
		//FAIL TEST
		String str3 = "cat";
		String str4 = "dog";
		System.out.println(Permutation.isPermutation(str3,str4));

	}

}
