package examen2011.Septiembre_ModeloB;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Set<Object> objetos = new HashSet<Object>();

		String one = "hola";
		int two = 2;

		Boolean three = new Boolean(true);

		objetos.add(one);
		objetos.add(two);
		objetos.add(three);
		objetos.add(three);

		for (Object objecto : objetos) {
			System.out.println(objecto);
		}

	}
}
