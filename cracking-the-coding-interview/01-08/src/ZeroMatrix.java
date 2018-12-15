
public class ZeroMatrix {
	
	
	public int[][] setZeros(int[][] arr){
		boolean[] rowMap = new boolean[arr.length];
		boolean[] colMap = new boolean[arr[0].length];
		
		/// find all zeros and set it to map
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; row++) {
				if(arr[col][row] == 0) {
					rowMap[row] = true;
					colMap[col] = true;
				}
			}
		}
		
		for(int row = 1; row < rowMap.length; row++) {
			if(rowMap[row] == true) {
				for(int col = 1; col<colMap.length; col++) {
					arr[col][row] = 0;
				}
			}
		}
		for(int col = 1; col < rowMap.length; col++) {
			if(colMap[col] == true) {
				for(int row = 1; row<rowMap.length; row++) {
					arr[col][row] = 0;
				}
			}
		}
		
		/// turn row[0]s and col[0]s
		if(rowMap[0] == true) {
			for(int col = 0; col<colMap.length; col++) {
				arr[col][0] = 0;
			}
		}
		if(colMap[0] == true) {
			for(int row = 0; row<rowMap.length; row++) {
				arr[0][row] = 0;
			}
		}
		return arr;
	}
}
