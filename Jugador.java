
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

	public int getPuntos() {
		return puntos;
	}
	public void incrementarPuntos() {
		
	}
}
