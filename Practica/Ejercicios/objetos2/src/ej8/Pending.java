package ej8;

import java.time.Instant;
import java.time.LocalDate;

public class Pending extends ToDoItemStrategy{

	@Override
	public void start(TodoItem state)
	{
		state.setState(new InProgress());
		state.setInicio(LocalDate.now());
	}
	
}
