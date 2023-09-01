package examen2015.Septiembre_ModeloC;

public class Ejercicio_6_Main {

	public static Ejercicio_6_Vehiculo v;
	public static Ejercicio_6_Coche c;
	public static Ejercicio_6_Bicicleta b;

	public static void main(String[] args) {
		c = new Ejercicio_6_Coche();

		v = c;
		
		b = (Ejercicio_6_Bicicleta) c;
		
		b= (Ejercicio_6_Bicicleta) v;
		

		System.out.println("Funciona");

	}

}
