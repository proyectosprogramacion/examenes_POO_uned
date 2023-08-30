package examen2013.Septiembre_ModeloC;

public class Ejercicio_8_MiClaseTest {

	public static void main(String[] args) {
		Ejercicio_8_MiClase a1 = new Ejercicio_8_MiClase();
		
		Ejercicio_8_MiClase a2 = new Ejercicio_8_MiClase();
		
		Ejercicio_8_MiClase a3 = new Ejercicio_8_MiClase();
		
		a1.valor=150;
		a2.valor=150;
		a3 = a2;
		if (a1 == a2) {
			System.out.println(" UNO");
		}
		if (a1==a3) {
			System.out.println(" DOS");
		}
		if (a2== a3) {
			System.out.println(" TRES");
		}
	}
}
