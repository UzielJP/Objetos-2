package ej15;

public class Permisos extends Decorator{

	public Permisos(FileOO2 f,FileManager d) 
	{
		super(f,d);
	}

	@Override
	public String prettyPrint() 
	{
		return super.prettyPrint()+this.getFile().getPermisos()+" - ";
	}
	
}
