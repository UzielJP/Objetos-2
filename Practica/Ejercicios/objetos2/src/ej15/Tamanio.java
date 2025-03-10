package ej15;

public class Tamanio extends Decorator{

	public Tamanio(FileOO2 f,FileManager d) 
	{
		super(f,d);
	}

	@Override
	public String prettyPrint() 
	{
		return super.prettyPrint()+this.getFile().getTamanio()+" - ";
	}
	
}
