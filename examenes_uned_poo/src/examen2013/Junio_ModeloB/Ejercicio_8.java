package examen2013.Junio_ModeloB;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio_8 {

	
	static void add (Set set) {
		set.add("Hola");
		set.add(1);
		System.out.println(set.size());
	}
	
	public static void main(String[] args) {
		Set <String> set = new HashSet<String>();
		add(set);
	}
}
