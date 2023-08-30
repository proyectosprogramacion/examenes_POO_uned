package examen2013.Junio_ModeloA;

public class Ejercicio_12 {

	static void start() {
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b1 + " " + b2);

	}

	public static boolean fix(boolean b1) {
		b1 = true;
		return b1;
	}

	public static void main(String[] args) {
		Ejercicio_12 p = new Ejercicio_12();
		p.start();
	}
}
