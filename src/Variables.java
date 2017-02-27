import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Variables {

	private String PrivateText = new String("Text");

	public static Overloading ov = new Overloading();
	
	
	public static boolean x;
	public static boolean y = true;
	public static String Text = new String("Hello World");

	// Two Dimensional Integer Array
	public static int[][] nums = new int[10][10];

	public static String[] DataTypesArray = new String[] { "String", "int", "double", "boolean", "char", "long",
			"float", "short", "byte" };

	// One Dimensional Integer Array
	public static int[] arrNum = new int[10];

	public static double[] switchDoubles = new double[] { Math.random() * 100, Math.random() * 100 * Math.PI,
			Math.random() * 100 * Math.E, Math.PI, Math.E };

	public static int[] switchArr = new int[] { (int) (Math.random() * 100), (int) (Math.random() * 100),
			(int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100) };

	// String ArrayList(Objects)
	public static ArrayList<String> arr = new ArrayList<String>(10) {
		{
			add("Object 1");
			add("Object 2");
			add("Object 3");
			add("Object 4");
		}
	};

	// String ArrayList(Animals)
	public static ArrayList<String> animals = new ArrayList<String>(10) {
		{
			add("Cat");
			add("Fox");
			add("Dog");
			add("Donkey");
			add("Ape");
			add("Human");
		}
	};

	// Integer ArrayList(Numbers)
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Integer> arrNumber = new ArrayList<Integer>(10) {
		{
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
			add((int) (Math.random() * 100) + 1);
		}
	};

	// Integer Iterator of Numbers
	public static Iterator<Integer> it = arrNumber.iterator();

	// String Iterator of Animals
	public static Iterator<String> itAn = animals.iterator();

}
