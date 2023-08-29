package examen2011.Junio_ModeloA;

public class Ejercicio_3_Tenor extends Ejercicio_3_Cantante {

	public static String cantar() {
		return "fa";
	}
	public static void main(String[] args) {
		Ejercicio_3_Tenor t = new Ejercicio_3_Tenor();
		
		Ejercicio_3_Cantante s = new Ejercicio_3_Tenor();
		
		System.out.println(t.cantar() + " " + s.cantar());
		
	}

}
