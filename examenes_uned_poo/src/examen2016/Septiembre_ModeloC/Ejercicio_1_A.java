package examen2016.Septiembre_ModeloC;

public abstract class Ejercicio_1_A {

	public final void metodo1() {
		System.out.println("Clase A");
	}
	
	public static void main(String[] args) {
		Ejercicio_1_A obj = new Ejercicio_1_B();
		
		obj.metodo1();
	}

}
