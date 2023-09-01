package examen2015.Septiembre_ModeloD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio_10_Test {

	
	public static void main(String[] args) {
		List <Ejercicio_10_Padre> lista = new ArrayList <Ejercicio_10_Padre>();
		
		lista.add(new Ejercicio_10_Hijo());
		lista.add(new Ejercicio_10_Hijo());
		lista.add(new Ejercicio_10_Hija());

		
		for (Iterator <Ejercicio_10_Padre> it = lista.iterator(); 
				it.hasNext();) {
			Ejercicio_10_Padre p =it.next();
			p.metodoA();
			
		}
		
		
	}
}
