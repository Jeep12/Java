
public class Jugador {
	private String nombre;
	private int puntos;
	private Cubilete cubil;

	public Jugador(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;

		} else {
			this.nombre = "Sin nombre";
		}
		puntos = 0;
		cubil = new Cubilete(2,6);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Llamo desde JuegoPOO a esta funcion y le paso como parametro el objeto Dado
	// que tiene la funcion
	// Math Random "Tirar"
	public int tirarCubilete() {
		int tirada = cubil.tirar();
		System.out.println("Entro a tirar de jugador, valor tirada:" + tirada);
		return tirada;
	}

	public int getPuntos() {
		return puntos;
	}

	public void incrementarPuntos() {
		puntos++;
	}
}
