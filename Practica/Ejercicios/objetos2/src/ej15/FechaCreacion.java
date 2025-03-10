package ej15;

public class FechaCreacion extends Decorator{

	public FechaCreacion(FileOO2 f,FileManager d) 
	{
		super(f,d);
	}

	@Override
	public String prettyPrint() 
	{
		return super.prettyPrint()+this.getFile().getFechaInicio()+" - ";
	}
	
}
