import java.util.ArrayList;

public class Exceptions {
	
	public static Variables v = new Variables();
	
	// Array Index Out of Bounds
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

	// NullPointerException
	public static void NullPointer(){
		String x1 = null;
		try{
			System.out.println(x1.toString());
		} catch(NullPointerException e){
			System.out.println("Error found at " + e);
			System.out.println();
			System.out.println("Variable is a null, so NullPointerException is casted");
			System.out.println("");
			System.out.println("You tried to cast a null valued object to a String and got a NullPointerException,"
					+ "\nthis is what happens when the exception is caught. "
					+ "\nWhat happens next is where the exception is thrown.");
			System.out.println();
			throw new NullPointerException("Null Value casted to String");
		}
	}
	
	// ArrayStoreException
	public static void ArrayStore(int a){
		int[] intal = new int[5];
		try{
			intal[0] = a;
		} catch(ArrayStoreException e){
			
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
