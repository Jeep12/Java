
public class Cubilete {
	private int cantDados;
	private int cantCaras;
	Dado[] dados;

	public Cubilete( int cantCaras,int cantDados) {
		this.cantDados = cantDados;
		this.cantCaras = cantCaras;
		dados = new Dado[cantDados];
		for (int i = 0; i < cantDados; i++) {
			dados[i] = new Dado(cantCaras);
		}
	}

	public int tirar() {
		int suma = 0;
		for (int i = 0; i < cantDados; i++) {
			suma += dados[i].tirar();
		}
		return suma;
	}

	public int ultimaTirada() {
		int suma = 0;
		for (int i = 0; i < cantDados; i++) {
			suma = dados[i].getUltimoValor();
		}
		return suma;
	}

}
