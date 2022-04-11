import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JuegoPOO {

	private Jugador jug1;
	private Jugador jug2;

	private Dado dado1;
	private Dado dado2;

	private int rondas = 10;

	public JuegoPOO() {
		jug1 = new Jugador("Jugador 1");
		jug2 = new Jugador("Jugador 2");

		dado1 = new Dado(6);
		dado2 = new Dado(6);

	}

	public JuegoPOO(Jugador j1, Jugador j2) {
		jug1 = j1;
		jug2 = j2;

		dado1 = new Dado(6);
		dado2 = new Dado(6);

	}

	public JuegoPOO(Jugador j1, Jugador j2, int CantidadLados) {
		jug1 = j1;
		jug2 = j2;

		dado1 = new Dado(CantidadLados);
		dado2 = new Dado(CantidadLados);

	}

	public void jugar() {
		// Una constante en codigo solo se puede cambiar si compilamos el codigo denuevo
		for (int i = 0; i < rondas; i++) {

			int puntos1 = jug1.tirarDados(dado1, dado2);
			int puntos2 = jug2.tirarDados(dado1, dado2);

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
		String nombreJugador1 = "", nombreJugador2 = "";
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese su nombre jugador1");
			nombreJugador1 = entrada.readLine();
			System.out.println("Ingrese su nombre jugador2");
			nombreJugador2 = entrada.readLine();

		} catch (Exception exc) {
			System.out.println(exc);
		}

		Jugador j1 = new Jugador(nombreJugador1);
		Jugador j2 = new Jugador(nombreJugador2);

		JuegoPOO juego = new JuegoPOO(j1, j2);
		juego.jugar();
		System.out.println("Puntos del perdedor: " + juego.ganador().getPuntos());
	}
}
