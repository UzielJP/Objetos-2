package ej7;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends Componente{

	private int tamanio;
	private LocalDate fecha;
	
	public Archivo(String nombre,int tamanio)
	{
		super(nombre);
		this.tamanio=tamanio;
	}
	
	public LocalDate getFecha()
	{
		return this.fecha;
	}
	
	@Override
	public void agregarHijo(Componente c){}
	
	@Override
	public List<Componente> obtenerHijos()
	{
		return null;
	}
	
	@Override
	public int tamanoTotalOcupado()
	{
		return this.tamanio;
	}
	
	@Override
	public Archivo archivoMasGrande()
	{
		return this;
	}
	
	@Override
	public Archivo archivoMasNuevo()
	{
		return this;
	}
}
