package Ejercicios;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		
		// Declaracion de variables
		
		int max = 80;
		int min = 20;
		int intentos = 10;
		
		
		System.out.println("Bienvenido elige un numero entre 20 y 80");
		
		// Crea un número random
		Random rand = new Random();
		int rnum = rand.nextInt(max - min) + min;
		System.out.println(rnum);
		
		// Escanea el primer número introducido por el usuario
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		try {
			do {
				
				intentos--;
				
				// Si un numero está fuera de rango, repite la operación
				while (numero < min || numero > max) {
					System.out.println("Introduce un numero valido");
					numero = sc.nextInt();
				}
				
				// Aquí comprobamos si el numero es diferente del random y damos las pistas
				if (numero != rnum) {
					System.out.println("tienes " + (intentos+1) + " intentos");
					if (numero > rnum) {
						System.out.println("El numero es menor");
					} else {
						System.out.println("El numero es mayor");
					}
					numero = sc.nextInt();
					
				// Si agotamos los intentos
					if (intentos == 0) {
						System.out.println("Perdistes");
						break;
					}
				// Si acertamos el número
					if (numero == rnum) {
						System.out.println("felicidades has ganado");
						System.out.println("Has usado " + (10 - intentos) + " intentos");
					}
				}
			} while (intentos != 0);
		} catch (Exception e) {
			System.out.println("Se ha introducido un caracter no válido");
		}
	}

}
