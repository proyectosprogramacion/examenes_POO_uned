package examen2016.Septiembre_ModeloC;

public class Ejercicio_11 {

	public static void main(String[] args) {
		String cadena1 = "Examen";
		String cadena2 = new String(cadena1);

		if (cadena1 == cadena2) {
			System.out.println("cadena1 == cadena2");
		}

		if (cadena1.equals(cadena2)) {
			System.out.println("cadena1.equals(cadena2)");
		}

	}

}
