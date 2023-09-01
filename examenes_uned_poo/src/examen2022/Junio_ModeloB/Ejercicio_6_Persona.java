package examen2022.Junio_ModeloB;

public class Ejercicio_6_Persona {

	String nombre;

	Ejercicio_6_Persona(String n) {
		nombre = n;
	}

	Ejercicio_6_Persona() {
		this("Arturo");
	}

	public static void main(String[] args) {
		Ejercicio_6_Persona p1 = new Ejercicio_6_Persona("Miguel");
		Ejercicio_6_Persona p2 = new Ejercicio_6_Persona();
	}

}
