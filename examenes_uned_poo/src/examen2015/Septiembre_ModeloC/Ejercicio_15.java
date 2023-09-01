package examen2015.Septiembre_ModeloC;

import java.io.IOException;

public class Ejercicio_15 {

	public static void main(String[] args) throws IOException {
		String filename = new String ("EJEMPLO");
		
		try {
			throw IOException();
		}catch(Exception e) {
			System.out.println("Unable o save to " + filename);
		}
		
	}
}
