package ej7;

import java.util.LinkedList;
import java.util.List;

public abstract class Componente {

	private String nombre;
	
	public Componente(String nombre)
	{
		this.nombre=nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public boolean elMismo(String nombre)
	{
		return this.getNombre().equals(nombre);
	}
	
	public abstract void agregarHijo(Componente hijo);
	public abstract List<Componente> obtenerHijos();
	
	//Hecho:
	public abstract int tamanoTotalOcupado();
	
	//Hecho:
	public abstract Archivo archivoMasGrande();
	
	//Hecho:
	public abstract Archivo archivoMasNuevo();
	
	public Componente buscar(String nombre)
	{
		if(this.elMismo(nombre))
		{
			return this;
		}
		return null;
	}
	
	public List<Componente> buscarTodos(String nombre)
	{
		List<Componente> l = new LinkedList<Componente>();
		if(this.elMismo(nombre))
		{
			l.add(this);
		}
		return l;
	}
	
	public String listadoDeContenido()
	{
		return "/"+this.nombre+"\n";
	}
	
}
