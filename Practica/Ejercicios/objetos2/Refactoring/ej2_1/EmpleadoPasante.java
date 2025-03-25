package ej2_1;

public class EmpleadoPasante {
	private String nombre;
	private String apellido;
	private double sueldoBasico = 0;
	
	public double sueldo()
	{
		return this.sueldoBasico-(this.sueldoBasico*0.13);
	}
}
