// Interface
public interface Implementation {
	public void OperatingSystem();
}


class AppleMac implements Implementation{
	public void OperatingSystem(){
		System.out.println("I'm using OS Sierra 10.12.3");
	}
}

class LinuxComputer implements Implementation{
	public void OperatingSystem(){
		System.out.println("I'm using Linux,\n Why would you do this to yourself?");
	}
}

class PersonalComputer implements Implementation{
	public void OperatingSystem(){
		System.out.println("I'm using Windows 10.1");
	}
}


