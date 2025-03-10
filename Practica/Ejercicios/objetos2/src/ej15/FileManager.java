package ej15;

import java.time.LocalDate;

public interface FileManager {

	public abstract String prettyPrint();
	
	
	 public static void main(String[] args) {
	        FileOO2 file = new FileOO2("File", "txt", 15.2, 
	            LocalDate.of(2024, 1, 1), LocalDate.of(2024, 2, 20), "rwx");

	        // Se inicializa con la base
	        FileManager display = new Decorator(file,file);
	        System.out.println(display.prettyPrint());

	        // Se van agregando decoradores uno por uno
	        display = new Nombre(file,display);
	        System.out.println(display.prettyPrint());

	        display = new Extension(file,display);
	        System.out.println(display.prettyPrint());

	        display = new Permisos(file,display);
	        System.out.println(display.prettyPrint());
	        
	        display = new FechaCreacion(file,display);
	        System.out.println(display.prettyPrint());
	        
	        display = new FechaModificacion(file,display);
	        System.out.println(display.prettyPrint());
	    }
}
