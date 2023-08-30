package examen2016.Septiembre_ModeloC;

public class Ejercicio_13_B extends Ejercicio_13_A {

	public double metodo1(double d) {
		System.out.println("ClaseB");
		return 1.0;
	}
	
	
	public static void main(String[] args) {
		new Ejercicio_13_B().metodo1(0.0);
	}

}
