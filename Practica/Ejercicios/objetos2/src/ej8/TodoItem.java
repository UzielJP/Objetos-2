package ej8;

import java.time.Duration;
import java.time.LocalDate;

public class TodoItem {
	
	private String nombre;
	private String descripcion;
	private LocalDate inicio;
	private LocalDate fin;
	private ToDoItemStrategy state;
	
	public TodoItem(String nombre, String descripcion)
	{
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.state= new Pending();
		this.inicio=null;
		this.fin=null;
	}
	
    public void start() 
    {
        state.start(this);
    }
	
    public void togglePause() 
    {
        state.togglePause(this);
    }

    public void finish() 
    {
        state.finish(this);
    }
	
	public void setInicio(LocalDate inicio)
	{
		this.inicio=inicio;
	}
	
	public Duration workedTime()
	{
		if(this.inicio==null)
		{
			throw new RuntimeException("El todoItem no se inicio.");
		}
		 return (fin != null) ? Duration.between(inicio, fin) : Duration.between(inicio, LocalDate.now());
	}
	
	public void addComment(String comentario)
	{
		if(this.fin==null)
		{
			throw new RuntimeException("El todoItem esta acabado, no se pueden agregar comentarios.");
		}
		this.descripcion+=" "+comentario;
	}
	
	public void setFin(LocalDate fin)
	{
		this.fin=fin;
	}
	 
	public void setState(ToDoItemStrategy state)
	{
		this.state=state;
	}
	
}
