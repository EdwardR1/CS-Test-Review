import java.util.*;

public class Main {

	// Methods class housing all Methods and Variables used

	public static Variables va = new Variables();

	public static Overloading ov = new Overloading();

	public static Inheritance ap = new iPhone();
	public static Inheritance bp = new Windows();

	public static Exceptions ex = new Exceptions();

	public static ArrayMethods am = new ArrayMethods();

	public static GetSet gs = new GetSet();

	public static Implementation ac = new AppleMac();
	public static Implementation bc = new LinuxComputer();
	public static Implementation cc = new PersonalComputer();

	public static Options op = new Options();

	public static Abstract jav = new JavaLang("Java");
	public static Abstract pyt = new Python("Python");

	// Scanner class
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ArithmeticException {

		System.out.println("Welcome!");
		while (va.y == true) {
			System.out.println("What would you like to do?");
			String a = sc.nextLine();
			if (a.equalsIgnoreCase("What can I do?") || a.equalsIgnoreCase("help")) {
				for (int i = 0; i < op.firstOptions.size(); i++) {
					System.out.println(op.firstOptions.get(i));
				}
				System.out.println("");
			}

			else if (a.equalsIgnoreCase("Basics") || a.equalsIgnoreCase("a")) {

				// Basics
				System.out.println("What would you like to test?");
				String b = sc.nextLine();
				if (b.equalsIgnoreCase("help")) {
					for (int i = 0; i < op.BasicOptions.size(); i++) {
						System.out.println(op.BasicOptions.get(i));
					}
					System.out.println();
				}
				if (b.equalsIgnoreCase("a") || b.equalsIgnoreCase("Strings")) {
					System.out.println("What would you like to do with strings?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.StringOptions.size(); i++) {
							System.out.println(op.StringOptions.get(i));
						}
						System.out.println();
					}
					if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("length")) {
						System.out.println("The length of the example text is " + va.Text.length());
						System.out.println("And the example text is " + va.Text);
					} else if (c.equalsIgnoreCase("b") || c.equalsIgnoreCase("charAt")) {
						System.out.println("What is the index number? ");
						int d = sc.nextInt();
						System.out.println(va.Text.charAt(d));
					} else if (c.equalsIgnoreCase("c") || c.equalsIgnoreCase("Concat")) {
						System.out.println("What is the first line of text?");
						String d = sc.nextLine();
						System.out.println("What is the second line of text to be concatenated?");
						String e = sc.nextLine();
						System.out.print("Concatenated string is: ");
						System.out.print(d.concat(" ").concat(e));
					} else if (c.equalsIgnoreCase("d") || c.equalsIgnoreCase("IndexOf")) {
						System.out.println("What index are you looking for in the example word?");
						String f = sc.next();
						if (va.Text.indexOf(f) != -1) {
							System.out.println(
									"The index of the letter ".concat(f.concat(" is ") + (va.Text.indexOf(f))));
						} else if (va.Text.indexOf(f) == -1) {
							System.out.println("That letter is not in the word");
						}
					} else if (c.equalsIgnoreCase("e") || c.equalsIgnoreCase("contains")) {
						System.out.println("What letter are you checking for?");
						String g = sc.next();
						if (va.Text.contains(g)) {
							System.out.println("That letter is in the example word");
						} else {
							System.out.println("That letter is not in the example word");
						}
					} else if (c.equalsIgnoreCase("f") || c.equalsIgnoreCase("compareTo")) {
						System.out.println("What's your first string to compare?");
						String h = sc.nextLine();
						System.out.println("What's your second string to compare?");
						String i = sc.nextLine();
						System.out.println(h.compareTo(i));
					} else if (c.equalsIgnoreCase("g") || c.equalsIgnoreCase("replace")) {
						System.out.println("Insert a phrase to have characters replaced");
						String j = sc.nextLine();
						System.out.println("What character would you like to be replaced?");
						String k = sc.next();
						System.out.println("What character would you like to be used to replace the last character?");
						String l = sc.next();
						System.out.println("Your original word was: ".concat(j)
								.concat(", \n The new phrase with ".concat("'".concat(k).concat("'"))
										.concat(" replaced with ".concat("'".concat(l).concat("'"))
												.concat(" is: \n".concat(j.replace(k, l))))));
					}
				} else if (b.equalsIgnoreCase("getter") || b.equalsIgnoreCase("setters") || b.equalsIgnoreCase("b")) {
					System.out.println("What would you like to do? Get or Set?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.GSOptions.size(); i++) {
							System.out.println(op.GSOptions.get(i));
						}
						System.out.println();
					}

					if (c.equalsIgnoreCase("getter") || c.equalsIgnoreCase("a")) {
						System.out.println(gs.getHiddenText());
					} else if (c.equalsIgnoreCase("setter") || c.equalsIgnoreCase("b")) {
						System.out.println("What would you like to change it to?");
						String d = sc.nextLine();
						gs.setHiddenText(d);
						System.out.println(
								"The original text has been changed to '".concat(gs.getHiddenText()).concat("'"));
					}
				} else if (b.equalsIgnoreCase("casting") || b.equalsIgnoreCase("c")) {
					System.out.println("What data type would you like to use?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.CastingOptions.size(); i++) {
							System.out.println(op.CastingOptions.get(i));
						}
						System.out.println();
					}
					if (c.equalsIgnoreCase("Strings") || c.equalsIgnoreCase("a")) {
						System.out.println("Insert a phrase to be casted to a Character Array");
						String d = sc.nextLine();
						String ExampleText = d;
						char[] charExText = ExampleText.toCharArray();
						System.out.println(
								"This is the example text casted into a character array, each character will be printed");
						for (int i = 0; i < charExText.length; i++) {
							System.out.println(charExText[i]);
						}
					} else if (c.equalsIgnoreCase("Numbers") || c.equalsIgnoreCase("int")
							|| c.equalsIgnoreCase("double") || c.equalsIgnoreCase("b")) {

						System.out.println("Pi is a mathematical Constant");
						System.out.println("Pi is normally a double, printed as: " + Math.PI);
						System.out.println("As an integer, Pi is rounded to the first full number, printed as: "
								+ (int) (Math.PI));
						System.out.println(
								"As a float, Pi is rounded to a smaller decimal place than doubles, printed as: "
										+ (float) (Math.PI));
					}
				}

				else if (b.equalsIgnoreCase("variables") || b.equalsIgnoreCase("dataTypes")
						|| b.equalsIgnoreCase("d")) {
					System.out.println(
							"There are " + va.DataTypesArray.length + " primary data types, as listed below:\n\n");
					for (int i = 0; i < va.DataTypesArray.length; i++) {
						System.out.println(va.DataTypesArray[i]);
					}
					System.out.println("However only 5 of which are really necessary.\n");
					for (int j = 0; j < 5; j++) {
						System.out.println(va.DataTypesArray[j]);
					}
				} else if (b.equalsIgnoreCase("operators") || b.equalsIgnoreCase("e")) {
					System.out.println("What operators would you like to look at?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.OperatorOptions.size(); i++) {
							System.out.println(op.OperatorOptions.get(i));
						}
						System.out.println();
					}
					if (c.equalsIgnoreCase("arithmetic") || c.equalsIgnoreCase("a")) {
						char[] operators = new char[] { '+', '-', '/', '*', '%' };
						System.out.println("There are " + operators.length + " arithmetic operators, listed below: \n");
						for (int i = 0; i < operators.length; i++) {
							System.out.println(operators[i]);
						}
						System.out.println("\nAddition operator: '" + operators[0] + "'; an example would be 5 + 5 = "
								+ (int) (5 + 5));
						System.out.println("Subtraction operator: '" + operators[1] + "'; an example would be 10 - 5 = "
								+ (int) (10 - 5));
						System.out.println("Division operator: '" + operators[2] + "'; an example would be 10 / 5 = "
								+ (int) (10 / 5));
						System.out.println("Multiplication operator: '" + operators[3]
								+ "'; an example would be 10 * 5 = " + (int) (10 * 5));
						System.out.println("Modulus operator: '" + operators[4] + "'; an example would be 10 % 6 = "
								+ (int) (10 % 6));
					} else if (c.equalsIgnoreCase("increment/decrement") || c.equalsIgnoreCase("b")) {
						String[] change = new String[] { "++", "--" };
						System.out.println("There are " + change.length + " changing functions, they are: \n");
						for (int j = 0; j < change.length; j++) {
							System.out.println(change[j]);
						}
						System.out.println("\n Increments are created by using '" + change[0]
								+ "' to increase numbers, usually used in loops");
						System.out.println("Decrements are created by using '" + change[1]
								+ "' to decrease numbers, usually used in loops");
					}
				}

			}

			else if (a.equalsIgnoreCase("Classes") || a.equalsIgnoreCase("Objects") || a.equalsIgnoreCase("b")) {
				System.out.println("What would you like to test?");
				String b = sc.nextLine();
			}

			else if (a.equalsIgnoreCase("Arrays") || a.equalsIgnoreCase("c")) {
				System.out.println("What would you like to test?");
				String b = sc.nextLine();
				if (b.equalsIgnoreCase("help")) {
					for (int i = 0; i < op.ArrayOptions.size(); i++) {
						System.out.println(op.ArrayOptions.get(i));
					}
					System.out.println();
				}

				// ArrayLists
				if (b.equalsIgnoreCase("ArrayList") || b.equalsIgnoreCase("a")) {
					System.out.println("What action? ");
					String c = sc.nextLine();

					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.ArrayListOptions.size(); i++) {
							System.out.println(op.ArrayListOptions.get(i));
						}
						System.out.println();
					}
					// Add Items
					if (c.equalsIgnoreCase("add") || c.equalsIgnoreCase("a")) {
						System.out.println("How many objects would you like to add?");
						int e = sc.nextInt();
						for (int i = 0; i < e; i++) {
							System.out.println("What object would you like to add? ");
							String d = sc.nextLine();
							va.arr.add(d);
						}
					}

					// Remove Items
					else if (c.equalsIgnoreCase("remove") || c.equalsIgnoreCase("b")) {
						System.out.println("What object number would you like to remove? ");
						int e = sc.nextInt();
						va.arr.remove(e);
					}

					// Get Items
					else if (c.equalsIgnoreCase("get") || c.equalsIgnoreCase("list") || c.equalsIgnoreCase("c")) {
						System.out.println("What object index are you trying to find?");
						int e = sc.nextInt();
						va.arr.get(e);
					}

					// Get List
					else if (c.equalsIgnoreCase("listSize") || c.equalsIgnoreCase("d")) {
						for (int f = 0; f < va.arr.size(); f++) {
							System.out.println(va.arr.get(f));
						}
					}
				}

				// Two Dimensional Tests
				else if (b.equalsIgnoreCase("b") || b.equalsIgnoreCase("TwoD")) {
					System.out.println("What would you like to do today with Two Dimensional Arrays?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.TwoDOptions.size(); i++) {
							System.out.println(op.TwoDOptions.get(i));
						}
						System.out.println();
					}
					if (c.equalsIgnoreCase("numberIteration") || c.equalsIgnoreCase("a")
							|| c.equalsIgnoreCase("ReadPoint")) {
						System.out.println("What row number? ");
						int d = sc.nextInt();
						System.out.println("What column number? ");
						int e = sc.nextInt();
						am.NumberIteration(d, e);
					} else if (c.equalsIgnoreCase("fullTwoDArray") || c.equalsIgnoreCase("b")) {
						am.TwoDimensionalArrayIterationPrintAll();
					}
				}

				// One Dimensional Tests
				else if (b.equalsIgnoreCase("i") || b.equalsIgnoreCase("OneD")) {
					System.out.println("What would you like to do today with One Dimensional Arrays?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.OneDOptions.size(); i++) {
							System.out.println(op.OneDOptions.get(i));
						}
						System.out.println();
					}
					if (c.equalsIgnoreCase("Iteration") || c.equalsIgnoreCase("a")) {
						System.out.println("What index would you like to find?");
						int d = sc.nextInt();
						am.OneDIteration(d);
					} else if (c.equalsIgnoreCase("length") || c.equalsIgnoreCase("b")) {
						System.out.print(va.arrNum.length);
					}
				}
			}

			else if (a.equalsIgnoreCase("Loops") || a.equalsIgnoreCase("d") || a.equalsIgnoreCase("Conditionals")) {
				System.out.println("What would you like to test?");
				String b = sc.nextLine();
				if (b.equalsIgnoreCase("help")) {
					for (int i = 0; i < op.LoopOptions.size(); i++) {
						System.out.println(op.LoopOptions.get(i));
					}
					System.out.println();
				}

				if (b.equalsIgnoreCase("For") || b.equalsIgnoreCase("a")) {
					System.out.println("An example of a for loop would be: ");
					for (int i = 1; i < 10; i++) {
						System.out.println(i);
					}
					System.out.println("Once the loop finishes, it closes itself and ends. ");
				}

				else if (b.equalsIgnoreCase("While") || b.equalsIgnoreCase("b")) {
					System.out.println(
							"This is an example of a while loop, it will ask you for what you will like to do until you say 'STOP'");
					while (va.x = true) {
						System.out.println("What would you like to do?");
						String c = sc.nextLine();

						if (c.equalsIgnoreCase("stop")) {
							System.out.println("Ending while loop");
							break;
						}
					}
				}

				else if (b.equalsIgnoreCase("Switch") || b.equalsIgnoreCase("c")) {
					System.out.println("This is an example of a Switch conditional");
					System.out.println("What value of a given array would you like to find?");
					int d = sc.nextInt();
					switch (d) {
					case 1: {
						System.out.println("The first value is: ");
						System.out.println(va.switchDoubles[0]);
						break;
					}
					case 2: {
						System.out.println("The second value is: ");
						System.out.println(va.switchDoubles[1]);
						break;
					}
					case 3: {
						System.out.println("The third value is: ");
						System.out.println(va.switchDoubles[2]);
						break;
					}
					case 4: {
						System.out.println("The fourth value is: ");
						System.out.println(va.switchDoubles[3]);
						break;
					}
					case 5: {
						System.out.println("The fifth value is: ");
						System.out.println(va.switchDoubles[4]);
						break;
					}
					default: {
						System.out.println("That value is too large and outside of the array");
						break;
					}
					}
				}

			}

			else if (a.equalsIgnoreCase("MoreClasses") || a.equalsIgnoreCase("e")) {
				System.out.println("What would you like to test?");
				String b = sc.nextLine();
				if (b.equalsIgnoreCase("help")) {
					for (int i = 0; i < op.ClassOptions.size(); i++) {
						System.out.println(op.ClassOptions.get(i));
					}
					System.out.println();
				}
				if (b.equalsIgnoreCase("Computer") || b.equalsIgnoreCase("a")) {
					System.out.println("What computer do you have at home?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.ComputerOptions.size(); i++) {
							System.out.println(op.ComputerOptions.get(i));
						}
						System.out.println();
					}
					if (c.toUpperCase().contains("MAC") || c.equalsIgnoreCase("a")) {
						ac.OperatingSystem();
					} else if (c.toUpperCase().contains("EICK")) {
						Implementation cc1 = new PersonalComputer() {
							@Override
							public void OperatingSystem() {
								System.out.println("Hello Ed and Nick");
							}
						};
						cc1.OperatingSystem();
					} else if (c.toLowerCase().contains("linux") || c.equalsIgnoreCase("b")) {
						bc.OperatingSystem();
					} else if (c.toUpperCase().contains("WINDOWS") || c.equalsIgnoreCase("c")) {
						cc.OperatingSystem();
					}
				}

				else if (b.equalsIgnoreCase("Inheritance") || b.equalsIgnoreCase("b")) {
					System.out.println("What phone do you have?");
					String d = sc.nextLine();
					if (d.equalsIgnoreCase("help")) {
						for (int i = 0; i < op.PhoneOptions.size(); i++) {
							System.out.println(op.PhoneOptions.get(i));
						}
						System.out.println();

					} else if (d.toLowerCase().contains("developer") && d.toLowerCase().contains("iphone 7")) {
						Inheritance ap1 = new iPhone() {
							@Override
							public void OS() {
								System.out.println("Wow you're using iOS 10.3");
							}
						};
						ap1.OS();
					} else if (d.toLowerCase().contains("iphone 7")) {
						Inheritance ap2 = new iPhone() {
							@Override
							public void OS() {
								System.out.println("Wow you're on an iPhone 7 running iOS 10!");
							}

						};
						ap2.OS();
					} else if (d.toLowerCase().contains("iphone 4s")) {
						Inheritance ap3 = new iPhone() {
							@Override
							public void OS() {
								System.out.println("Wow, you're using iOS 9. You should invest in a new phone!");
							}
						};
						ap3.OS();
					} else if (d.toUpperCase().contains("IPHONE 3")) {
						Inheritance ap4 = new iPhone() {
							@Override
							public void OS() {
								System.out.println("Wow you're using iOS 7, how does it still work?");
							}
						};
						ap4.OS();
					} else if (d.toUpperCase().contains("IPHONE") || d.equalsIgnoreCase("a")) {
						ap.OS();
					} else if (d.toUpperCase().contains("SAMSUNG") && d.toUpperCase().contains("S7")
							&& d.toUpperCase().contains("NOTE")) {
						Inheritance bp1 = new Windows() {
							@Override
							public void OS() {
								System.out
										.println("How do you still have that phone? Dispose of it before it explodes!");
							}
						};
						bp1.OS();
					} else if (d.toUpperCase().contains("SAMSUNG") || d.toLowerCase().contains("windows")
							|| d.toLowerCase().contains("android") || d.equalsIgnoreCase("b")
							|| d.toLowerCase().contains("google")) {
						bp.OS();
					}

				} else if (b.equalsIgnoreCase("Overloading") || b.equalsIgnoreCase("c")) {
					System.out.println("Int, Float, or Double?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("int") || c.equals("a")) {
						System.out.println("What is your first number?");
						int num1 = sc.nextInt();
						System.out.println("What is your second number?");
						int num2 = sc.nextInt();
						System.out.println("What is your mathematic symbol?");
						String sym = sc.nextLine();
						ov.PreciseMaths(num1, num2, sym);
					} else if (c.equalsIgnoreCase("double") || c.equals("b")) {
						System.out.println("What is your first number?");
						double num1 = sc.nextDouble();
						System.out.println("What is your second number?");
						double num2 = sc.nextDouble();
						System.out.println("What is your mathematic symbol?");
						String sym = sc.nextLine();
						ov.PreciseMaths(num1, num2, sym);
					} else if (c.equalsIgnoreCase("float") || c.equals("v")) {
						System.out.println("What is your first number?");
						float num1 = sc.nextFloat();
						System.out.println("What is your second number?");
						float num2 = sc.nextFloat();
						System.out.println("What is your mathematic symbol?");
						String sym = sc.nextLine();
						ov.PreciseMaths(num1, num2, sym);
					}
				} else if (b.equalsIgnoreCase("Abstract") || b.equalsIgnoreCase("d")) {
					System.out.println("What language are you using?");
					String c = sc.nextLine();
					switch (c) {
					case "a": {
						System.out.println(jav.ProgrammingLanguages());
						break;
					}
					case "b": {
						System.out.println(pyt.ProgrammingLanguages());
						break;
					}
					case "help": {
						for (int i = 0; i < op.AbstractOptions.size(); i++) {
							System.out.println(op.AbstractOptions.get(i));
						}
						System.out.println();
					}
					default: {
						System.out.println("nevermind");
						break;
					}

					}
				}
			}

			else if (a.equalsIgnoreCase("Exceptions") || a.equalsIgnoreCase("f")) {
				System.out.println("What would you like to test?");
				String b = sc.nextLine();

				if (b.equalsIgnoreCase("help")) {
					for (int i = 0; i < op.ExceptionOptions.size(); i++) {
						System.out.println(op.ExceptionOptions.get(i));
					}
					System.out.println();
				}

				// ArrayIndexOutOfBoundsException
				if (b.equalsIgnoreCase("number") || b.equalsIgnoreCase("ArrayException") || b.equalsIgnoreCase("a")) {
					System.out.println("What row number? ");
					int r = sc.nextInt();
					System.out.println("What column number? ");
					int c = sc.nextInt();
					ex.Number(r, c);

				}
				// ArithmeticException
				else if (b.equalsIgnoreCase("maths") || b.equalsIgnoreCase("ArithmeticException")
						|| b.equalsIgnoreCase("b")) {

					System.out.println("What is your first number? ");
					int c = sc.nextInt();
					System.out.println("What is your second number? ");
					int d = sc.nextInt();
					System.out.println("What is your mathematic action? ");
					String e = sc.next();
					ex.Mathematics(c, d, e);

				}
				else if(b.equalsIgnoreCase("null") || b.equalsIgnoreCase("c")){
					ex.NullPointer();
				}

			} else if (a.equalsIgnoreCase("Sorting") || a.equalsIgnoreCase("g") || a.equalsIgnoreCase("Iteration")) {
				System.out.println("What would you like to do? Sort or Iterate?");
				String b = sc.nextLine();
				if (b.equalsIgnoreCase("help")) {
					for (int i = 0; i < op.SortingOptions.size(); i++) {
						System.out.println(op.SortingOptions.get(i));
					}
					System.out.println();
				}
				if (b.equalsIgnoreCase("sort") || b.equalsIgnoreCase("a")) {
					Collections.sort(va.arrNumber);
					System.out.println(va.arrNumber);
				} else if (b.equalsIgnoreCase("iterate") || b.equalsIgnoreCase("b")) {
					System.out.println("Would you like to use Strings or Integers?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("Strings") || c.equalsIgnoreCase("a")) {
						for (int i = 0; i < va.arr.size(); i++) {
							String value = va.itAn.next();
							System.out.println(value);
						}
					} else if (c.equalsIgnoreCase("Integers") || c.equalsIgnoreCase("b")) {
						for (int i = 0; i < va.arrNumber.size(); i++) {
							int value = va.it.next();
							System.out.println(value);
						}
					}
				} else if (b.equalsIgnoreCase("sortedIterate") || b.equalsIgnoreCase("c")) {
					System.out.println("Would you like to use Strings or Integers?");
					String c = sc.nextLine();
					if (c.equalsIgnoreCase("Strings") || c.equalsIgnoreCase("a")) {
						Collections.sort(va.animals);
						for (int i = 0; i < va.animals.size(); i++) {
							String value = va.itAn.next();
							System.out.println(value);
						}
					} else if (c.equalsIgnoreCase("Integers") || c.equalsIgnoreCase("b")) {
						Collections.sort(va.arrNumber);
						for (int i = 0; i < va.arrNumber.size(); i++) {
							int v = va.it.next();
							System.out.println(v);
						}
					}
				}
			} else {
				break;
			}
		}

	}
}
