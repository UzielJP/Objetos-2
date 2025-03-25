package ej2_1;

public class EmpleadoPlanta extends EmpleadoPasante{
	private int cantidadHijos = 0;
    // ......
    
    @Override
    public double sueldo() {
        return super.sueldo()+(this.cantidadHijos * 2000);
    }
}
