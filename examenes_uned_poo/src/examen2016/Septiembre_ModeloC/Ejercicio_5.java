package examen2016.Septiembre_ModeloC;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio_5 {
	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<Integer>();

		conjunto.add(new Integer(86));

		conjunto.add(75);

		conjunto.add(new Integer(86));

		conjunto.add(null);

		conjunto.add(309);

		Iterator i = conjunto.iterator();

		while (i.hasNext()) {
			System.out.println(i.hasNext());
		}

	}

}
