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
		cubil = new Cubilete(2, 6);

	}

	public JuegoPOO(Jugador j1, Jugador j2) {
		jug1 = j1;
		jug2 = j2;
		cubil = new Cubilete(2, 6);

	}

	public JuegoPOO(Jugador j1, Jugador j2, int CantidadLados, int cantDados) {
		jug1 = j1;
		jug2 = j2;

		cubil = new Cubilete(CantidadLados, cantDados);

	}

	public void jugar() {
		// Una constante en codigo solo se puede cambiar si compilamos el codigo denuevo

		for (int i = 0; i < rondas; i++) {

			int puntos1 = jug1.tirarCubilete(cubil);
			int puntos2 = jug2.tirarCubilete(cubil);

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
		String nombreJugador1, nombreJugador2;
		int cantidadDados;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese nombre de jugador 1");
			nombreJugador1 = entrada.readLine();
			System.out.println ("Ingrese nombre de jugador 2");
			nombreJugador2 = entrada.readLine();
			System.out.println("Ingrese la cantidad de dados para el cubilete");
			cantidadDados =new Integer(entrada.readLine()); 
			
			Jugador j1 = new Jugador(nombreJugador1);
			Jugador j2 = new Jugador(nombreJugador2);
			JuegoPOO juego = new JuegoPOO(j1, j2, 6, cantidadDados);
			juego.jugar();
			System.out.println("El jugador: " + j1.getNombre() + "  " + j1.getPuntos() + " puntos");
			System.out.println("El jugador: " + j2.getNombre() + "  " + j2.getPuntos() + " puntos");

			
			
		} catch (Exception exc) {
			System.out.println(exc);
		}

	}
}
