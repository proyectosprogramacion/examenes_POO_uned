package examen2018.Junio_ModeloA;

import java.util.Random;

public class Ejercicio_8_Random {

	public static void main(String[] args) {
		 Random randomGenerator;
		 randomGenerator = new Random();
		 
		 int index = randomGenerator.nextInt();
		 System.out.println(index);
	}
}
