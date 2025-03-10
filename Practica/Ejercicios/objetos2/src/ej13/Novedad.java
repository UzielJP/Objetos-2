package ej13;

import java.util.List;

public class Novedad implements Configuracion{

	public List<Pelicula> sugerir(Decodificador d)
	{
		return d.getGrilla().stream()
							.sorted((a,b)->a.getFecha().compareTo(b.getFecha()))
							.limit(3)
							.toList();
	}
	
}
