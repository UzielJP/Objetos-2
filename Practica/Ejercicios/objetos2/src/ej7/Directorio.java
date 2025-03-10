package ej7;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Directorio extends Componente{

	private List<Componente> hijos;
	
	public Directorio(String nombre)
	{
		super(nombre);
		this.hijos= new LinkedList<Componente>();
	}
	
	@Override
	public void agregarHijo(Componente hijo)
	{
		this.hijos.add(hijo);
	}
	
	@Override
	public List<Componente> obtenerHijos()
	{
		return this.hijos;
	}
	
	@Override
	public int tamanoTotalOcupado()
	{
		return this.hijos.stream().mapToInt(a->a.tamanoTotalOcupado()).sum();
	}
	
	@Override
	public Archivo archivoMasGrande()
	{
		return this.hijos.stream()
							.map(a->a.archivoMasGrande())
							.filter(a->a!=null)
							.max(Comparator.comparingInt(Archivo::tamanoTotalOcupado)) // Busca el archivo más grande
							.orElse(null);
	}
	
	@Override
	public Archivo archivoMasNuevo()
	{
		return this.hijos.stream()
				.map(a->a.archivoMasNuevo())
				.filter(a->a!=null)
				.max(Comparator.comparing(Archivo::getFecha)) // Cambiar sorted() por max()
	            .orElse(null);
	}
	
	
	//Version chatGPT
	@Override
	public Componente buscar(String nombre) {
	    if (this.elMismo(nombre)) {
	        return this;
	    }
	    return this.hijos.stream()
	            .map(hijo -> hijo.buscar(nombre))  // Llamada recursiva
	            .filter(componente -> componente != null)
	            .findFirst()
	            .orElse(null);
	}
	
	/*
	@Override
	public Componente buscar(String nombre)
	{
		return this.hijos.stream()
				.filter(a->a.elMismo(nombre)&&a!=null)
				.map(a->a.buscar(nombre))
				.filter(a->a!=null)
				.findFirst()
				.orElse(null);
	}
	*/
	
	//version chatGPT:
	@Override
	public List<Componente> buscarTodos(String nombre) {
	    List<Componente> encontrados = new LinkedList<>();

	    if (this.elMismo(nombre)) {
	        encontrados.add(this);
	    }

	    for (Componente hijo : this.hijos) {
	        encontrados.addAll(hijo.buscarTodos(nombre)); // Agregar resultados de la recursión
	    }

	    return encontrados;
	}
	
	/*
	@Override
	public List<Componente> buscarTodos(String nombre)
	{
		List<Componente> l = new LinkedList<Componente>();
		l = super.buscarTodos(nombre);
		if(this.hijos!=null)
		{
			List<Componente> a = new LinkedList<Componente>();
			a.addAll(l);
			for(Componente e : this.hijos)
			{
				a.addAll(e.buscarTodos(nombre));
			}
			l.removeAll(l);
			l.addAll(a);
		}
		return l.stream().filter(a->a!=null).toList();
	}
	*/
	
	@Override
	public String listadoDeContenido()
	{
		String str="/"+this.getNombre();
		for (Componente hijo : this.hijos)
		{
			str += hijo.listadoDeContenido();
		}
		return str;
	}
	
	
	
}
