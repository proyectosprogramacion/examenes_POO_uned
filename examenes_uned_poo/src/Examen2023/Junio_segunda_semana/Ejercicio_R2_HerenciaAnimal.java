package Examen2023.Junio_segunda_semana;

public class Ejercicio_R2_HerenciaAnimal {

	public static void main(String[] args) {

		Ejercicio_R2_Animal animal = new Ejercicio_R2_Perro();
		animal.caminar();
		((Ejercicio_R2_Perro) animal).ladrar();
	}
}
