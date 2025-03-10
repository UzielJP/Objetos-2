package ej8;

import java.time.LocalDate;

public class InProgress extends ToDoItemStrategy{

	@Override
    public void togglePause(TodoItem state) 
	{
        state.setState(new Paused());
    }

    @Override
    public void finish(TodoItem state) 
    {
    	state.setState(new Finished(state));
    }
    
}
