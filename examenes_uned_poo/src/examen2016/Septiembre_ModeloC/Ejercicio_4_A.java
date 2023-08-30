package examen2016.Septiembre_ModeloC;

public class Ejercicio_4_A {

	protected void metodo1() {
		System.out.println("Entro en el método desde ClaseA");
	}

	public static void main(String[] args) {
		Ejercicio_4_A p = new Ejercicio_4_B();

		p.metodo1();
	}

}
