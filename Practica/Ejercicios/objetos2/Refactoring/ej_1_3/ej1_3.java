package ej_1_3;

public class ej1_3 {
	
	public void imprimirValores() {
		
		System.out.println("El promedio de las edades es %s y el total de salarios es %s",personal.Stream().mapToInt(a->a.getEdad()).sum()/personal.size(),personal.Stream().mapToDouble(a->a.getSalario()).sum());
		
	}

}
