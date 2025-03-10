package ej15;

import java.time.LocalDate;

public class Nombre extends Decorator{

	public Nombre(FileOO2 f,FileManager d) 
	{
		super(f,d);
	}

	@Override
	public String prettyPrint() 
	{
		return super.prettyPrint()+this.getFile().getNombre()+" - ";
	}
	
}
