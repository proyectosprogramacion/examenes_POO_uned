package examen2015.Septiembre_ModeloD;

public class Ejercicio_8_Test {

	
	public static void main(String[] args) {
		Ejercicio_8_Hijo h = (Ejercicio_8_Hijo) new Ejercicio_8_Padre();
		
		if(h instanceof Ejercicio_8_Hijo) {
			System.out.println("Instancia de la clase Hijo");
		}else {
			System.out.println("Instancia de la clase padre");
		}
	}
}
