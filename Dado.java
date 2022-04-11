
public class Dado {
	private int cantidadCaras;
	private int ultimoValor;

	public Dado() {
		cantidadCaras = 6;
		ultimoValor = 0;
	}

	public Dado(int cantidadCaras) {
		this.cantidadCaras = cantidadCaras;
	}

	public int getCantidadCaras() {
		return cantidadCaras;
	}

	public int tirar() {
		int tirada = 0;
		tirada = (int) (Math.random() * cantidadCaras) + 1;
		ultimoValor = tirada;
		return tirada;
	}
	public int getUltimoValor () {
		return ultimoValor;
	}
}
