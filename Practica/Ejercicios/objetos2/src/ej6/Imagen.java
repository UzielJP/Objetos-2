package ej6;

import java.util.List;

public class Imagen implements Celda{

	
	
	private List<Celda> celdas; 
	
	public double proporcion()
	{
		
		return this.celdas.stream().mapToDouble(a->a.proporcion()).sum()/this.totalHijos();
	}
	
	public int totalHijos()
	{
		return this.celdas.stream().mapToInt(a->a.totalHijos()).sum();
	}
	
	//Tambien podria implementarlo con un vector de 4 Celdas.
	//Aun asi corre bien con una lista, es mas cercano al asi composite y es mas prolijo.
	/*
		private Celda[] celdas; 
		
		public double proporcion()
		{
			double cont = 0;
			
			for(int i=0;i<4;i++)
			{
				cont+=celda[i].proporcion();
			}
			
			return cont/this.totalHijos();
		}
		
		public int totalHijos()
		{
			int cont = 0;
			
			for(int i=0;i<4;i++)
			{
				cont+= celdas[i].totalHijos();
			}
			
			return cont;
		}
		
	 */
}
