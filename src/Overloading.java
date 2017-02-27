
public class Overloading {

	public void PreciseMaths(int a, int b, String symbol) {
		if (symbol.equals("*")) {
			System.out.println(a * b);
		} else if (symbol.equals("-")) {
			System.out.println(a - b);
		} else if (symbol.equals("+")) {
			System.out.println(a + b);
		} else if (symbol.equals("/")) {
			try {
				System.out.println(a / b);
			} catch (Exception e) {
				System.out.println("Cannot return");
			}
		} else {
			System.out.println("Try again?");
		}
	}
	public void PreciseMaths(double a, double b, String symbol) {
		if (symbol.equals("*")) {
			System.out.println(a * b);
		} else if (symbol.equals("-")) {
			System.out.println(a - b);
		} else if (symbol.equals("+")) {
			System.out.println(a + b);
		} else if (symbol.equals("/")) {
			try {
				System.out.println(a / b);
			} catch (Exception e) {
				System.out.println("Cannot return");
			}
		} else {
			System.out.println("Try again?");
		}
	}

	public void PreciseMaths(float a, float b, String symbol) {
		if (symbol.equals("*")) {
			System.out.println(a * b);
		} else if (symbol.equals("-")) {
			System.out.println(a - b);
		} else if (symbol.equals("+")) {
			System.out.println(a + b);
		} else if (symbol.equals("/")) {
			try {
				System.out.println(a / b);
			} catch (Exception e) {
				System.out.println("Cannot return");
			}
		} else {
			System.out.println("Try again?");
		}
	}
}
