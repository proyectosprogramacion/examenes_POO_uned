package examen2019.Septiembre_ModeloB;

public class Ejercicio_R2_ClaseC {

	public static void main(String[] args) {
		new Ejercicio_R2_ClaseC().metodo();
	}
	
	
	void metodo() {
		new Ejercicio_R2_ClaseC().metodo1();
		((Ejercicio_R2_ClaseA) new Ejercicio_R2_ClaseB()).metodo1();
		((Ejercicio_R2_ClaseA) new Ejercicio_R2_ClaseB()).metodo2();

	}
}
