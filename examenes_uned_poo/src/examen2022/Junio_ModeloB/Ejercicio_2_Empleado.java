package examen2022.Junio_ModeloB;

public class Ejercicio_2_Empleado {

	public static void main(String[] args) {
		Ejercicio_2_Persona p;
		p = new Ejercicio_2_Medico();
		p.resumir();
		p = new Ejercicio_2_Ingeniero();
		p.resumir();
	}
}
