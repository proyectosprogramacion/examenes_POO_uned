package examen2015.Septiembre_ModeloD;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
		
		ArrayList <String> lista= new ArrayList<String>();
		
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		
		Iterator <String> it = lista.iterator();
		
		while(it.hasNext()) {
			String valor = it.next();
			System.out.println("Elimino " + valor + " - ");
			it.remove();
		}
	}
	
	
}
