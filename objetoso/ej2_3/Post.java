package ej2_3;

import java.time.LocalDate;

public class Post {

	private Usuario user;
	private LocalDate fecha;
	private String texto;
	
	public LocalDate getFecha()
	{
		return this.fecha;
	}
	
	public boolean mismoUsuario(Usuario user)
	{
		return this.user.equals(user);
	}
	
	public boolean despuesDe(LocalDate fecha)
	{
		return this.fecha.isAfter(fecha);
	}
}
