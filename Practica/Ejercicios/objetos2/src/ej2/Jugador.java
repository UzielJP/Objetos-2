package ej2;

public class Jugador {

	private Estrategia estrategia;
	
	public Jugador(Estrategia estrategia)
	{
		this.estrategia=estrategia;
	}
	
	public void jugar(Estrategia estrategia)
	{
		System.out.println(this.estrategia.jugar(estrategia));
	}
	
	public static void main(String[] args) {
        // Crear jugadores con diferentes estrategias
        Jugador jugador1 = new Jugador(new Piedra());
        Jugador jugador2 = new Jugador(new Tijera());

        // Realizar un enfrentamiento entre jugador1 y jugador2
        jugador1.jugar(jugador2.estrategia); // Esperado: "Piedra vs Tijera: Gana"

        // Otro enfrentamiento
        Jugador jugador3 = new Jugador(new Papel());
        jugador2.jugar(jugador3.estrategia); // Esperado: "Tijera vs Papel: Pierde"

        // Enfrentamiento de empates
        jugador3.jugar(jugador1.estrategia); // Esperado: "Papel vs Piedra: Gana"
        jugador1.jugar(jugador1.estrategia); // Esperado: "Piedra vs Piedra: Empate"

        // Enfrentamientos con Spock y Lagarto
        Jugador jugador4 = new Jugador(new Spock());
        Jugador jugador5 = new Jugador(new Lagarto());

        jugador4.jugar(jugador5.estrategia); // Esperado: "Spock vs Lagarto: Gana"
        jugador5.jugar(jugador4.estrategia); // Esperado: "Lagarto vs Spock: Pierde"

        jugador1.jugar(jugador4.estrategia); // Esperado: "Piedra vs Spock: Pierde"
        jugador3.jugar(jugador5.estrategia); // Esperado: "Papel vs Lagarto: Pierde"
    }
	
}
