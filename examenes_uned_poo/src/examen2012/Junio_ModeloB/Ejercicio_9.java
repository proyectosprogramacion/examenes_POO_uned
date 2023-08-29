package examen2012.Junio_ModeloB;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Set<Object> objetos = new HashSet<Object>();

		String obje1= "JAVA";
		int obje2=5;
		Boolean obje3 = new Boolean(true);
		
		objetos.add(obje3);
		objetos.add(obje1);
		objetos.add(obje2);
		objetos.add(obje3);

		for (Object object: objetos){
			System.out.println(object);
		}
		

	}

}
