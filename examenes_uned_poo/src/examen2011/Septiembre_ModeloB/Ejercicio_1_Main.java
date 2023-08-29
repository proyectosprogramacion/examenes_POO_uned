package examen2011.Septiembre_ModeloB;

public class Ejercicio_1_Main {

	public static void main(String[] args) {

		Ejercicio_1_TV a = new Ejercicio_1_TV("Philips", "42PFL5603D");
		Ejercicio_1_TV b = new Ejercicio_1_TV("Philips", "42PFL5603D");

		if (a.equals(b)) {
			System.out.println("iguales");
		} else {
			System.out.println(" no son iguales");
		}

	}

}
