package examen2016.Junio_ModeloC;

public class Ejercicio_12 {
	static String from;
	static String to;
	static String message;
	int number;

	public Ejercicio_12(String from, String to, String message, int number) {
		this.from = from;
		this.to = to;
		this.message = message;
		this.number = number;
	}

	public static void main(String[] args) {
		Ejercicio_12 m = new Ejercicio_12("Hola", "Adios", "Luego", 3);
		System.out.println("Funciona");
	}
}
