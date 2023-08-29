package Examen2017.Junio_primera_semana;

public class Ejercicio_10_B extends Ejercicio_10_A {

	public String mensaje = "En clase B";

	public void mensaje() {
		System.out.println(mensaje);
	}

	public static void main(String[] args) {
		Ejercicio_10_B obj1 = new Ejercicio_10_A();
		Ejercicio_10_B obj2= obj1;
		obj2.mensaje;
		
 }

}
