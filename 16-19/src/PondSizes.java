import java.util.*; 

public class PondSizes {
	private int[][] pond_arr;
	private int[][] map;
	private ArrayList<Integer> pond_sizes;
	
	/**
	 * default constructor
	 */
	public PondSizes() {
		
	}
	
	/**
	 * Constructor for test
	 * @param arr
	 */
	public PondSizes(int[][] arr) {
		pond_arr = arr;
		createMap();
	}
	
	/**
	 * setter for pond sizes with default 
	 * @param arr
	 */
	public void setPondMap(int[][] arr) {
		pond_arr = arr;
		createMap();
	}
	
	private void createMap() {
		if(pond_arr.length < 1) {
			throw new IllegalArgumentException("boo");
		}
		int[][] map = new int[pond_arr.length][pond_arr[0].length];
		this.map = map;
	}
	
	public ArrayList<Integer> getPondsSizes() {
		for(int row = 0; row < pond_arr.length ; row ++) {
			for(int col = 0; col < pond_arr[row].length; col++){
				if(pond_arr[row][col] == 0 && map[row][col] != -1) {
					System.out.println(pondSize(row,col));
					int pond_size = (pondSize(row,col));
					pond_sizes.add(pondSize(row,col));
				}
			}
		}
		return pond_sizes;
	}
	
	public int pondSize(int row,int col) {
		System.out.println(map[row][col]);

		if(row < 0 || row > map[row].length || col < 0 || col > map[col].length || map[row][col] == -1) {
			return 0;
		}
		map[row][col] = -1; //visited
		if(map[row][col] != 0) {
			return 0;
		}
		System.out.println(row);

		int size = 1;
		if(map[row][col] == 0) {
			for(int i = row -1; i < row+1; i ++) {
				for(int k = col -1; k > col +1 ; k++) {
					size += pondSize(i,k);
				}
			}
		}
		return size;
	}
	
}
