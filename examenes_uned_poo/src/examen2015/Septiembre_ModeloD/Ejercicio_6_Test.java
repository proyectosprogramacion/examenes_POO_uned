package examen2015.Septiembre_ModeloD;

public class Ejercicio_6_Test {

	
	public static void main(String[] args) {
		Ejercicio_6_Hijo h = new Ejercicio_6_Padre();
		
		if(h instanceof Ejercicio_6_Hijo) {
			System.out.println("Instancia de la clase Hijo");
		}else {
			System.out.println("Instancia de la clase padre");
		}
	}
}
