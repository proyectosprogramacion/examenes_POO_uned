package examen2014.Junio_ModeloB;

import java.util.ArrayList;

public class Ejercicio_13 {

	
	ArrayList <String > canciones = new ArrayList <String>();
	
	public static void main(String[] args) {
		Ejercicio_13 mo = new Ejercicio_13();
		
		mo.canciones.add("Al amanecer");
		
		System.out.println("¿Existe la canción: " + mo.existe("Al amanecener"));
	}
	
	public boolean existe(String cancion) {
		for (String titulo: canciones) {
			if(titulo.equals(cancion)){
				return true;
			}
		}return false;
	}
	
}
