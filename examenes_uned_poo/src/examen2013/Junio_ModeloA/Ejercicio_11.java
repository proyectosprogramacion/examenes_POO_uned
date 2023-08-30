package examen2013.Junio_ModeloA;

public class Ejercicio_11 {

	public static void leftShift(int i, int j) {
		i <<= j;
	}

	public static void main(String[] args) {
		int i = 4, j = 2;
		leftShift(i, j);
		
		System.out.println(i);
	}
}
