
public class JuegoPOO {
	
	private Jugador jug1;
	private Jugador jug2;
	
	private Dado dado1;
	private Dado dado2;
	
	public JuegoPOO() {
		jug1 = new Jugador("Jugador1");
		jug2 = new Jugador("Jugador2");
		
		dado1 = new Dado(6);
		dado2 = new Dado(6);
		
	}
	
	public JuegoPOO(Jugador j1, Jugador j2) {
		jug1 = j1;
		jug2=j2;
		
		dado1 = new Dado(6);
		dado2 = new Dado(6);		
		
	}
	
	public JuegoPOO(Jugador j1, Jugador j2, int CantidadLados) {
		jug1 = j1;
		jug2=j2;
		
		dado1 = new Dado(CantidadLados);
		dado2 = new Dado(CantidadLados);		
		
	}
	
	public static void main(String[] args) {
		
	}
}
