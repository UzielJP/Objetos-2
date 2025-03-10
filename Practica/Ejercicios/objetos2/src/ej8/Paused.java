package ej8;

import java.time.LocalDate;

public class Paused extends ToDoItemStrategy{

	@Override
    public void togglePause(TodoItem state) 
	{
        state.setState(new InProgress());
    }

    @Override
    public void finish(TodoItem state) 
    {
    	state.setState(new Finished(state));
    }
    
}
