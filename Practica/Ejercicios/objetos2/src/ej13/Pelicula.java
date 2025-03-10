package ej13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private LocalDate anio;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, LocalDate anio, double puntaje) 
	{
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void agrearSimilar(Pelicula pelicula)
	{
		this.similares.add(pelicula);
		pelicula.setSimilar(this);
	}
	
	public void setSimilar(Pelicula pelicula)
	{
		this.similares.add(pelicula);
	}
	
	public List<Pelicula> getSimilare()
	{
		return this.similares;
	}
	
	public double getPuntaje()
	{
		return this.puntaje;
	}
	
	public LocalDate getFecha()
	{
		return this.anio;
	}
}
