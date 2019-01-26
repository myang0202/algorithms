import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,11,15};
		twoSum(arr,9);
		
	}
    public static int[] twoSum(int[] nums, int target) {
    	HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
    	for(int i = 0; i < nums.length; i++) {
    		int sub = target - nums[i];
    		if(hash.containsKey(sub)) {
    			return new int[] {hash.get(sub),i};
    		}
    		else {
    			hash.put(nums[i], i);
    		}
    	}
    	return null;
    }

}
