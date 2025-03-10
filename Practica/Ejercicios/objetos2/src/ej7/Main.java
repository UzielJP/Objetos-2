package ej7;

public class Main {
	
	    public static void main(String[] args) {
	        // Creación de directorios y archivos
	        Directorio dirA = new Directorio("Directorio A");
	        Directorio dirA1 = new Directorio("Directorio A.1");
	        Directorio dirA1_1 = new Directorio("Directorio A.1.1");
	        Directorio dirA1_2 = new Directorio("Directorio A.1.2");
	        Directorio dirA2 = new Directorio("Directorio A.2");

	        Archivo archivoA1 = new Archivo("Archivo A1", 500);
	        Archivo archivoA2 = new Archivo("Archivo A2", 700);
	        Archivo archivoA1_1 = new Archivo("Archivo A1.1", 200);
	        Archivo archivoA1_2 = new Archivo("Archivo A1.2", 100);

	        // Agregar archivos a directorios correspondientes
	        dirA1_1.agregarHijo(archivoA1_1);
	        dirA1_2.agregarHijo(archivoA1_2);
	        dirA1.agregarHijo(dirA1_1);
	        dirA1.agregarHijo(dirA1_2);
	        dirA.agregarHijo(dirA1);
	        dirA.agregarHijo(dirA2);
	        dirA.agregarHijo(archivoA1);
	        dirA.agregarHijo(archivoA2);

	        // Mostrar listado de contenido
	        System.out.println(dirA.listadoDeContenido());
	    }
	
}
