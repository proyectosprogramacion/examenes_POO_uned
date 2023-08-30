package examen2013.Junio_ModeloA;

public class Ejercicio_13 {

	public int aMethod() {
		static int i=0;
		i++;
		return i;
	}
	
	public static void main(String[] args) {
		Ejercicio_13 test = new Ejercicio_13();
		
		int j= test.aMethod();
		int j= test.aMethod();
		
		System.out.println(j);
	}
}
