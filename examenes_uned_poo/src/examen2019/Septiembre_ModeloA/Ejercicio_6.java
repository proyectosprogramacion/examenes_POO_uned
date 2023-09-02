package examen2019.Septiembre_ModeloA;

import java.util.Random;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
		Random randonGenerator;
		randonGenerator = new Random (0);
		char index = (char)  randonGenerator.nextInt (0);
		
		System.out.println(index);
	}

}
