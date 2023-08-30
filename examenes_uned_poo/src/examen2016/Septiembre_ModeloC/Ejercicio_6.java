package examen2016.Septiembre_ModeloC;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_6 {

	public static void main(String[] args) {
		List lista = new ArrayList();

		lista.add("AA");
		lista.add("BB");
		lista.add(8);
		for (int n = 0; n < lista.size(); n++) {
			System.out.print(lista.get(n));
		}

	}
}
