package examen2012.Junio_ModeloB;

public class Ejercicio_6_Main {

	public static void main(String[] args) {

		Ejercicio_6_TV tv1 = new Ejercicio_6_TV("Sony", "Bravia");
		Ejercicio_6_TV tv2 = new Ejercicio_6_TV("Sony", "aivarB");

		if (tv1.equals(tv2)) {
			System.out.println("Los televisores son iguales");
		} else {
			System.out.println("Los televisores no son iguales");
		}

	}

}
