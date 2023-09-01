package examen2015.Junio_ModeloB;

public class Ejercicio_8_Test {

	public static void main(String[] args) {
		Ejercicio_8_J j = new Ejercicio_8_J();

		boolean b1 = j instanceof Ejercicio_8_K;
		boolean b2 = j instanceof Ejercicio_8_J;

		boolean b3 = j instanceof Ejercicio_8_I;
		boolean b4 = j instanceof Object;

		System.out.println(b1 + "" + b2 + " " + b3 + "" + b4);
	}
}
