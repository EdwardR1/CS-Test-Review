package Strings;
import java.util.Scanner;
public class TwoDTest{
	public static void main(String[] args){
	Scanner ui = new Scanner(System.in);
	int n=1;
	System.out.println("Hello, what would you like to do today? - 'a' Intro Test 'b' 2D Array 'c' Concat  'd' 1D Array  'e' replace  'f' substring 'g' trim 'h' uppercase 'i' lowercase 'j' length 'k' 1D specific value 'l' indexOf");
	String text = ui.nextLine();
		if(text.equals("a")){
		System.out.println("Welcome!");
		
	}

	else if(text.equals("b") || text.contains("2D")){
	System.out.println("What is your limit?");
	int lim = ui.nextInt();
		if(lim > 20){
		System.out.println("Please input again, your limit is too large");
		lim = ui.nextInt();
	}
	System.out.println("Second limit?");
	int lam = ui.nextInt();
		if(lam > 20){
		System.out.println("Please input again, your limit is too large");
		lam = ui.nextInt();
	}
	System.out.println("What's your lowest number?");
	int m = ui.nextInt();
	int[][] num = new int[lim][lam];
	System.out.println();
	for(int i = 0; i<num.length; i++){
		for(int j=0; j<num[i].length; j++){
			num[i][j] = (int) (Math.random()  * 10 + m);
			System.out.print(num[i][j] + " ");

	} System.out.println();
	}
	}

	else if(text.equals("c")){
	System.out.println(text.concat(" is concatenated with this."));
	}

	else if(text.equals("d") || text.contains("array")){
	System.out.println("What is the desired String to be sent to an array?");
	String text1 = ui.nextLine();
	if(text1.equals("Edward")){
		text1.replace("Edward", "God");
	}
	char[] textArray = text1.toCharArray();
	System.out.println("One moment please");
	System.out.println();
	System.out.println();
	for(int f=5; f>0; f--){
	System.out.println(f);
	System.out.println();
	}
	System.out.println();
	for(int i=0; i<textArray.length; i++){
		System.out.println(textArray[i]);
	}}	



	else if(text.equals("e")){
		System.out.println("What is the string?");
		String orig = ui.nextLine();
	System.out.println("What is the letter to be  replaced? ");
	String reped  = ui.nextLine();
	System.out.println("What is the letter to replace?");
	String rep = ui.nextLine();
	String retu = orig.replace(reped, rep);
	System.out.println(retu);
	}
	else if(text.equals("f")){
		System.out.println("What is the string?");
		String word = ui.nextLine();
		System.out.println("Here are the first letter and last letters removed.");
		System.out.println();
		System.out.println(word.substring(1, word.length() - 1));
	} 
	else if(text.equals("g")){
		System.out.println("What is the string with white spaces in the start?");
		String text2 = ui.nextLine();
		String text3 = " ".concat(text2).concat(" ");
		System.out.println("The text without white spaces at the start or end is below! ");
		System.out.println(text3.trim());
	}
	else if(text.equals("h")){
		System.out.println("What is your text?");
		String abc = ui.nextLine();
		System.out.println(abc.toUpperCase());
	}
	else if(text.equals("i")){
		System.out.println("What is your text?");
		String adc = ui.nextLine();
		System.out.println(adc.toLowerCase());
	}
	else if(text.equals("j")){
		System.out.println("What is the line of text?");
		String abb = ui.nextLine();
		System.out.println(abb.length() + (" is the length of the string ").concat(abb));
	}
	else if(text.equals("k")){
		System.out.println("What is the line of text?");
		String abd = ui.nextLine();
		char[] afd = abd.toCharArray();
		System.out.println("What is the specific index of the array you'd like to find?");
		int numb = ui.nextInt();
		System.out.println(afd[numb]);
	}
	else if(text.equals("l")){
		System.out.println("What is your string of text?");
		String ald = ui.nextLine();
		System.out.println("What is the index letter you'd like to look for within the string?");
		String alf = ui.nextLine();
		System.out.println(ald.indexOf(alf));
	}
	else{
	System.out.println("Okay nevermind");
	}
	}
}