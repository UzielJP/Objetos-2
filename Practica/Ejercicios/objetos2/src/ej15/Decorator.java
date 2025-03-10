package ej15;

import java.time.LocalDate;

public class Decorator implements FileManager{

	private FileOO2 file;
	private FileManager decorador;
	
	public Decorator(FileOO2 file, FileManager decorador)
	{
		this.file=file;
		this.decorador=decorador;
	}
	
	public FileOO2 getFile()
	{
		return this.file;
	}
	
	@Override
	public String prettyPrint()
	{
		return this.decorador.prettyPrint();
	}
}
