package examen2011.Junio_ModeloA;

public class Ejercicio_7_Test {

	public static void main(String[] args) {

		Ejercicio_7_Vehiculo v = new Ejercicio_7_Coche();

		Ejercicio_7_Bicicleta b = (Ejercicio_7_Bicicleta) v;

		v.imprimirSonido();

		b.imprimirSonido();

	}

}
