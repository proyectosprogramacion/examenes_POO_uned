package Examen2017.Junio_segunda_semana;

public class Ejercicio_13 {

	public Ejercicio_13() {
	}

	public static void lanzarExcepcion(int prueba) {
		if (prueba == 1) {
			throw new IllegalArgumentException("Excepcion lanzada");
		}
		System.out.println("Prueba superada");
	}

	public static void main(String[] args) {
		lanzarExcepcion(1);
	}

}
