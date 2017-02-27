
public class ArrayMethods {
	public static Variables v = new Variables();
	// One Dimensional Array Iteration
	public static void OneDIteration(int a) {
		for (int i = 0; i < v.arrNum.length; i++) {
			v.arrNum[i] = (int) (Math.random() * 10 + 1);

		}
		System.out.print(v.arrNum[a]);
	}

	// Iterate Numbers
	public static void NumberIteration(int r, int c) {
		for (int i = 0; i < v.nums.length; i++) {
			for (int j = 0; j < v.nums[i].length; j++) {
				v.nums[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		System.out.print(v.nums[r][c]);

	}

	public static void TwoDimensionalArrayIterationPrintAll() {
		for (int i = 0; i < v.nums.length; i++) {
			for (int j = 0; j < v.nums[i].length; j++) {
				v.nums[i][j] = (int) (Math.random() * 10 + 1);
				System.out.print(v.nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
