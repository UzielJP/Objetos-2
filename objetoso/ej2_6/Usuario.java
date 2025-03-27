package ej2_6;

public class Usuario {

	private String nombre;
	private int numero;
	private Subscripcion tipoSuscripcion;
	private String email;
	
	public double calcularCostoPelicula(Pelicula p)
	{
		return this.tipoSuscripcion.costo(p);
	}
}
