package ej2_1;

public class EmpleadoTemporario extends EmpleadoPasante{
	private double horasTrabajadas = 0;
	private int cantidadHijos = 0;
	// ......
	    
	public double sueldo() {
		return super.sueldo()+(this.horasTrabajadas * 500)+(this.cantidadHijos * 1000);
	}
}
