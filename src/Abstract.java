
public abstract class Abstract {
	private String text;
	
	public Abstract(String data){
		data = text;
	}
	
	public abstract String ProgrammingLanguages();
}


class JavaLang extends Abstract{
	public JavaLang(String data){
		super(data);
	}
	
	public String ProgrammingLanguages(){
		return "Java";
	}
	
}

class Python extends Abstract{
	public Python(String data){
		super(data);
	}
	
	public String ProgrammingLanguages(){
		return "Python";
	}
}