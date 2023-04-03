package Ejercicios;

public class ejercicio2B {

	public static void main(String[] args) {

	    char[][] zonaJuego = {
	            {'*', ' ', '*', ' ', ' '},
	            {' ', ' ', '*', ' ', '*'},
	            {'*', '*', ' ', ' ', '*'},
	            {' ', ' ', '*', '*', '*'},
	            {' ', ' ', '*', ' ', '*'}
	        };
	        int celdasSeguras = celdasSeguras(zonaJuego);
	        System.out.println("Hay " + celdasSeguras + " celdas seguras en la zona de juego.");
	}



public static int celdasSeguras(char[][] zonaJuego) {
	 int celdasSeguras = 0;
	    for (int i = 0; i < zonaJuego.length; i++) {
	        for (int j = 0; j < zonaJuego[i].length; j++) {
	            if (zonaJuego[i][j] == ' ') {
	                boolean mina = false;
	                mina = extracted(zonaJuego, i, j, mina);
	                if (!mina) {
	                    celdasSeguras++;
	                }
	            }
	        }
	    }
	    return celdasSeguras;

}


/**
 * Este método usa los valores i y j como parámetros del for de la matriz para comparar si hay una mina
 * 
 * @param zonaJuego
 * @param i
 * @param j
 * @param mina
 * @return mina
 */
private static boolean extracted(char[][] zonaJuego, int i, int j, boolean mina) {
	for (int k = i - 1; k <= i + 1; k++) {
	    if (k >= 0 && k < zonaJuego.length) {
	        for (int l = j - 1; l <= j + 1; l++) {
	            if (l >= 0 && l < zonaJuego[k].length && zonaJuego[k][l] == '*') {
	                mina = true;
	                break;
	            }
	        }
	    }
	    if (mina) {
	        break;
	    }
	}
	return mina;
}
}