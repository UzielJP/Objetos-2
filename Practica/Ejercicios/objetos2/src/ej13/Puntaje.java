package ej13;

import java.util.List;

public class Puntaje implements Configuracion{

	public List<Pelicula> sugerir(Decodificador d)
	{
		return d.getGrilla().stream()
							.sorted((a,b)->Double.compare(b.getPuntaje(),a.getPuntaje()))
							.limit(3)
							.toList();
	}
	
}
