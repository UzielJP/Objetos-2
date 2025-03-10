package ej15;

public class Extension extends Decorator{

	public Extension(FileOO2 f,FileManager d) 
	{
		super(f,d);
	}

	@Override
	public String prettyPrint() 
	{
		return super.prettyPrint()+this.getFile().getExtension()+" - ";
	}
	
}
