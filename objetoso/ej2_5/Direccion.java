package ej2_5;

public class Direccion {

	private String localidad;
	private String numero;
	private String calle;
	private String departamento;
	
	public String getDireccionFormateada() {
		return 
			this.localidad +", " +
			this.calle + ", " +
			this.numero + ", " +
			this.departamento;
	}
}
