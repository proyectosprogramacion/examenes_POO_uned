package examen2014.Septiembre_ModeloD;

import java.util.Random;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Random generadorAleatorios;
		generadorAleatorios = new Random();

		for (int n = 0; n <= 100; n++) {
			System.out.print(generadorAleatorios.nextInt(n + 1));
		}
	}

}
