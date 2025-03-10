package ej15;

public class FechaModificacion extends Decorator{

	public FechaModificacion(FileOO2 f,FileManager d) 
	{
		super(f,d);
	}

	@Override
	public String prettyPrint() 
	{
		return super.prettyPrint()+this.getFile().getFechaModificacion()+" - ";
	}
	
}
