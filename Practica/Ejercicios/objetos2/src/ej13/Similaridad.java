package ej13;

import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements Configuracion{

	public List<Pelicula> sugerir(Decodificador d)
	{
		return d.getVistas().stream()
							.flatMap(a->a.getSimilare().stream())
							.sorted((a,b)->a.getFecha().compareTo(b.getFecha()))
							.limit(3)
							.toList();
	}
	
}
