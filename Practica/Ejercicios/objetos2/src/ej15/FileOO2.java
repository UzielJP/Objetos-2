package ej15;

import java.time.LocalDate;

public class FileOO2 implements FileManager
{
	
	private String nombre;
	private String extension;
	private String permisos;
	private LocalDate fechaInicio;
	private LocalDate fechaModificacion;
	private double tamanio;
	
	public FileOO2(String nombre, String extension, double tamanio, LocalDate fechaInicio, LocalDate fechaModificacion,String permisos) 
	{
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.fechaInicio = fechaInicio;
		this.fechaModificacion = fechaModificacion;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getPermisos() {
		return permisos;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public double getTamanio() {
		return tamanio;
	}

	@Override
	public String prettyPrint() 
	{
		return "";
	}
	
}
