
public class Cubilete {
	private int cantDados;

	Dado[] dados;

	public Cubilete(int cantDados, int cantCaras) {
		dados = new Dado[2];
		for (int i = 0; i < 2; i++) {
			dados[i] = new Dado(6);
		}
	}
	
	public int tirar() {
		int suma = 0;
		for (int i = 0; i < cantDados; i++) {
			suma += dados[i].tirar();
			System.out.println(dados[i].tirar() );
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
