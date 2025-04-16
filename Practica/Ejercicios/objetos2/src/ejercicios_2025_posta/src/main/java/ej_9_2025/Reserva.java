package ej_9_2025;

import java.time.LocalDate;

public class Reserva {

	private int cantidadDeDias;
	private LocalDate fecha;
	private AutoEnAlquiler alquiler;
	
	public double montoAPagar()
	{
		return alquiler.monto(this.cantidadDeDias);
	}
	
	public double montoAReembolsar()
	{
		return alquiler.reembolso(LocalDate.now().compareTo(fecha), this.montoAPagar());
	}
}
