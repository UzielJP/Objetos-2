package ej8;

import java.time.LocalDate;

public abstract class ToDoItemStrategy {
	
	public void start(TodoItem state)
	{
		throw new RuntimeException("No se puede iniciar en el estado actual.");
	}

	public void togglePause(TodoItem state) 
	{
        throw new RuntimeException("El objeto ToDoItem no se encuentra en in-progress o paused.");
    }

    public void finish(TodoItem state) 
    {
        throw new RuntimeException("No se puede finalizar en el estado actual.");
    }
    
}
