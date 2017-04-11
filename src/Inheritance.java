
public class Inheritance {
	private int x;
	public void OS(){
	}
	public Inheritance(){
		
	}
}

class iPhone extends Inheritance{
	public void OS(){
		System.out.println("I'm running iOS 10.2.1");
	}
}

class Windows extends Inheritance{
	public void OS(){
		System.out.println("I'm running Android 7.1.1");
	}
}


