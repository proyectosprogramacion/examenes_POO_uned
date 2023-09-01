package examen2015.Septiembre_ModeloD;

import java.util.ArrayList;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		
		ArrayList <String> lista= new ArrayList<String>();
		
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		
		for(String valor: lista) {
			System.out.println("Elimino " + valor + " - ");
			lista.remove(valor);
		}
	}
	
	
}
