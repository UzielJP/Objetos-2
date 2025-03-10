package ej3;

public class Empleado {

	private Tipo tipoEmpleado;
	
	public Empleado(Tipo tipoEmpleado)
	{
		this.tipoEmpleado=tipoEmpleado;
	}
	
	public double sueldo()
	{
		return tipoEmpleado.sueldo();
	}
	
}
