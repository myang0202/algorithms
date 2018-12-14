
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{0, 2, 1, 0},
						{0, 2, 0, 1},
						{1, 1, 0, 1},
						{0, 1, 0, 1}};
		PondSizes pond = new PondSizes();
		pond.setPondMap(arr);
		pond.getPondsSizes();
	}

}
