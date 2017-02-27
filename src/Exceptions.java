
public class Exceptions {
	
	public static Variables v = new Variables();
	
	public static void Number(int a, int b) {
		for (int i = 0; i < v.nums.length; i++) {
			for (int j = 0; j < v.nums[i].length; j++) {
				v.nums[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		try {
			System.out.println(v.nums[a][b]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No number found at that index");
			System.out.println("Error found at " + e);
		} catch (Exception e1) {
			System.out.println("Error found at " + e1);
		}
	}

	// ArithmeticException
	public static void Mathematics(int a, int b, String action) {

		switch (action) {
		case "+": {
			System.out.println(a + b);
			break;
		}
		case "-": {
			System.out.println(a - b);
			break;
		}
		case "*": {
			System.out.println(a * b);
			break;
		}

		case "/": {
			try {
				System.out.println(a / b);
			} catch (ArithmeticException e) {
				System.out.println("Divided by Zero \n");
				throw new ArithmeticException("Division By Zero");
			}
			break;
		}

		case "%": {
			System.out.println(a % b);
			break;
		}

		case "^": {
			System.out.println((int) (Math.pow(a, b)));
			break;
		}
		}
	}
}
