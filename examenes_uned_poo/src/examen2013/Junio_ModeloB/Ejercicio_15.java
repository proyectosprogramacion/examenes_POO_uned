package examen2013.Junio_ModeloB;

import java.io.File;

public class Ejercicio_15 {

	public static void main(String[] args) {
		 String nombre = null;
		 
		 File file = new File("/folder", nombre);
		 System.out.println(file.exists());
	}
	
}
