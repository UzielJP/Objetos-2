package ej9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String name;
	private String puntoDeEncuentro;
	private double costo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private int maximoInscriptos;
	private int minimoInscriptos;
	private List<Usuario> listaInscriptos;
	private List<Usuario> listaEspera;
	private ExcursionState estado; 
	
	public Excursion(String name, String puntoDeEncuentro, double costo, LocalDate fechaInicio, LocalDate fechaFin,
			int maximoInscriptos, int minimoInscriptos) {
		this.name = name;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.maximoInscriptos = maximoInscriptos;
		this.minimoInscriptos = minimoInscriptos;
		this.listaInscriptos= new ArrayList();
		this.listaEspera= new ArrayList();
		this.estado= new Provisoria();
	}

	public void inscribir(Usuario usuario)
	{
		estado.inscribir(this,usuario);
	}
	
	public String obtenerInformacion()
	{
		return this.estado.obtenerInformacion(this);
	}
	
	public void agregarLista(Usuario usuario)
	{
		this.listaInscriptos.add(usuario);
	}
	
	public void agregarListaEspera(Usuario usuario)
	{
		this.listaEspera.add(usuario);
	}
	
	public boolean cupoMaximo()
	{
		return (this.listaInscriptos.size()>=this.maximoInscriptos);
	}
	
	public boolean cupoMinimo()
	{
		return (this.listaInscriptos.size()==this.minimoInscriptos);
	}
	
	public int faltanteMaximo()
	{
		return this.maximoInscriptos-this.listaInscriptos.size();
	}
	
	public int faltanteMinimo()
	{
		return this.minimoInscriptos-this.listaInscriptos.size();
	}
	
	public String getMails()
	{
		return this.listaInscriptos.stream()
									.map(a->a.getMail()+". ")
									.toList()
									.toString();
	}
	
	public void setState(ExcursionState estado)
	{
		this.estado=estado;
	}
	
	@Override
	public String toString()
	{
		return this.name+". "+this.puntoDeEncuentro+". "+this.costo+". "+this.fechaInicio+". "+this.fechaFin+". "+this.puntoDeEncuentro+". ";
	}
	
}
