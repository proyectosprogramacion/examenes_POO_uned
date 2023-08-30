package examen2016.Junio_ModeloB;

import java.util.ArrayList;

public class Ejercicio_4_Prueba {

	private static ArrayList<Ejercicio_4_Persona> amigos = new ArrayList<Ejercicio_4_Persona>();

	public Ejercicio_4_Prueba() {
		amigos.add(new Ejercicio_4_Persona("Pepe", "1234"));
		amigos.add(new Ejercicio_4_Persona("Sara", "1236"));
	}

	public static void borrarAmigo(String nombre) {
		for (Ejercicio_4_Persona p : amigos) {
			if (p.getNombre().equals(nombre)) {
				amigos.remove(p);
				System.out.println("Amigo borrado");
			}
		}
	}

	public static void main(String[] args) {
		borrarAmigo("Sara");
	}

}
