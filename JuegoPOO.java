import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JuegoPOO {

	private Jugador jug1;
	private Jugador jug2;

	private Cubilete cubil;
	

	private int rondas = 10;

	public JuegoPOO() {
		jug1 = new Jugador("Jugador 1");
		jug2 = new Jugador("Jugador 2");
		cubil = new Cubilete (6);

	}

	public JuegoPOO(Jugador j1, Jugador j2) {
		jug1 = j1;
		jug2 = j2;
		cubil = new Cubilete (6);

	}

	public JuegoPOO(Jugador j1, Jugador j2, int CantidadLados) {
		jug1 = j1;
		jug2 = j2;

		cubil = new Cubilete (CantidadLados);

	}

	public void jugar() {
		// Una constante en codigo solo se puede cambiar si compilamos el codigo denuevo
		for (int i = 0; i < rondas; i++) {

			int puntos1 = jug1.tirarDados(cubil.getD1(),cubil.getD2());
			int puntos2 = jug2.tirarDados(cubil.getD1(),cubil.getD2());

			if (puntos1 > 7 && puntos1 > puntos2) {
				jug1.incrementarPuntos();
				;
			} else {
				if (puntos2 > 7 && puntos2 > puntos1) {
					jug2.incrementarPuntos();
				} else {

				}
			}

		}
		if (ganador() != null) {
			System.out
					.println("Gano el jugador " + ganador().getNombre() + " Con " + ganador().getPuntos() + " Puntos");

		} else {
			System.out.println("Empate");
		}
	}

	public Jugador ganador() {

		if (jug1.getPuntos() > jug2.getPuntos()) {
			return jug1;
		} else {
			if (jug2.getPuntos() > jug1.getPuntos()) {
				return jug2;
			} else {
				return null;
			}
		}
	}

	public static void main(String[] args) {
	
		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Java");
		
		JuegoPOO juego = new JuegoPOO(j1, j2);
		juego.jugar();
		System.out.println("El jugador: "+j1.getNombre() +"  "+ j1.getPuntos() + " puntos");
		System.out.println("El jugador: " + j2.getNombre() +"  "+ j2.getPuntos() + " puntos");

	}
}
