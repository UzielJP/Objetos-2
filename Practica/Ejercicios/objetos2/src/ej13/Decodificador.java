package ej13;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> vistas;
	private Configuracion sujerencia;
	
	private Decodificador()
	{
		this.grilla= new ArrayList<Pelicula>();
		this.vistas= new ArrayList<Pelicula>();
	}
	
	public List<Pelicula> sugerir()
	{
		return this.sujerencia.sugerir(this);
	}
	
	public List<Pelicula> getVistas()
	{
		return this.vistas;
	}
	
	public List<Pelicula> getGrilla()
	{
		return this.grilla;
	}
}
