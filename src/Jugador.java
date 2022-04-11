
public class Jugador {
	private String nombre;
	private int puntos;
	
	public Jugador (String nombre) {
		if (nombre!=null) {
			this.nombre = nombre;
			
		}else {
			this.nombre = "Sin nombre";
		}
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//Llamo desde JuegoPOO a esta funcion y le paso como parametro el objeto Dado que tiene la funcion 
	// Math Random "Tirar"
	public int tirarDados(Dado d1, Dado d2) {
		return d1.tirar()+d2.tirar();
	}

	public int getPuntos() {
		return puntos;
	}
	public void incrementarPuntos() {
		puntos++;
	}
}
