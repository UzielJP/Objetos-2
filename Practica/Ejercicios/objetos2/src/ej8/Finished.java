package ej8;

import java.time.LocalDate;

public class Finished extends ToDoItemStrategy{

	//Entiendo que una clase vacia es un pecado, pero en este caso es la mejor opcion que se me ocurrio.
	
	public Finished(TodoItem state)
	{
		state.setFin(LocalDate.now());
	}
	
}
