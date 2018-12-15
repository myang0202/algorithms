
public class ZeroMatrix {
	
	
	public void setZeros(int[][] arr){
		boolean[] rowMap = new boolean[arr.length];
		boolean[] colMap = new boolean[arr[0].length];
		
		/// find all zeros and set it to map
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				if(arr[col][row] == 0) {
					rowMap[row] = true;
					colMap[col] = true;
				}
			}
		}
		
		for(int row = 1; row < rowMap.length; row++) {
			if(rowMap[row] == true) {
				for(int col = 1; col<colMap.length; col++) {
					arr[row][col] = 0;
				}
			}
		}
		for(int col = 1; col < rowMap.length; col++) {
			if(colMap[col] == true) {
				for(int row = 1; row<rowMap.length; row++) {
					arr[row][col] = 0;
				}
			}
		}
		
		/// turn row[0]s and col[0]s
		if(rowMap[0] == true) {
			for(int col = 0; col<colMap.length; col++) {
				arr[0][col] = 0;
			}
		}
		if(colMap[0] == true) {
			for(int row = 0; row<rowMap.length; row++) {
				arr[row][0] = 0;
			}
		}
		printResult(arr);
	}
	public void printResult(int[][] arr) {
		for(int i =0; i<arr.length;i++) {
			for( int j = 0; j < arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}
