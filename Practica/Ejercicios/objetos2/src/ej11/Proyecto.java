package ej11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private int nroIntegrantes;
	private int ganancia;
	private double sueldoIntegrantes;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private EtapaState etapa;
	
	public Proyecto(int nroIntegrantes, int ganancia, double sueldoIntegrantes, LocalDate fechaInicio, LocalDate fechaFin, String objetivo) 
	{
		this.nroIntegrantes = nroIntegrantes;
		this.ganancia = ganancia;
		this.sueldoIntegrantes = sueldoIntegrantes;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.etapa= new EnConstruccion();
	}
	
	public void aprobarEtapa()
	{
		this.etapa.aprobarEtapa(this);
	}
	
	public void modificarGanancia(int ganancia)
	{
		this.etapa.modificarGanancia(this, ganancia);
	}
	
	public void setGanancia(int ganancia)
	{
		this.ganancia=ganancia;
	}
	
	public boolean noEsCero()
	{
		return (this.precioDelProyecto()>0);
	}
	
	public void cancelarProyecto()
	{
		if(!this.objetivo.contains("Cancelado"))
		{
			this.objetivo+="Cancelado";
		}
	}
	
	public void setEtapa(EtapaState etapa)
	{
		this.etapa=etapa;
	}
	
	public double costoProyecto()
	{
		return (this.sueldoIntegrantes*this.nroIntegrantes)*ChronoUnit.DAYS.between(fechaInicio, fechaFin);	
	}
	
	public double precioDelProyecto()
	{
		return this.costoProyecto()+(this.costoProyecto()*this.ganancia)/100;
	}
}
