
public class Juego {
	private int jugador1;
	private int jugador2;

	public Juego() {
		jugador1 = 0;
		jugador2 = 0;
	}
//MINUTO 40:57;
	public void jugar() {
		int puntosJ1, puntosJ2;
		for (int i = 0; i < 10; i++) {
			
			puntosJ1 = tirar() + tirar();
			puntosJ2 = tirar() + tirar();
			if (puntosJ1 > 7 && puntosJ1 > puntosJ2) {
				jugador1++;
			} else {
				if (puntosJ2 > 7 && puntosJ2 > puntosJ1) {
					jugador2++;
				}
			}
		}
		System.out.println(ganador());

	}

	public int tirar() {
		int tirada = 0;
		tirada = (int) (Math.random() * 6) + 1;
		return tirada;
	}

	public String ganador() {
		if (jugador1 > jugador2) {
	    	 return "El ganador es el jugador 1 con " + jugador1 + " puntos";
		} else {
		     if (jugador2>jugador1) {
		    	 return "El ganador es el jugador 2 con " + jugador2 + " puntos";
		     }else {
		    	 return "Resulto en empate jugador1= " + jugador1 + " Jugador2 = "+ jugador2;
		     }
		}
	}

	public static void main(String[] args) {
		Juego dados = new Juego();
		dados.jugar();
	}

}
