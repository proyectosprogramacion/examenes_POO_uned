package examen2014.Septiembre_ModeloD;

public class Ejercicio_13_MessagePost extends Ejercicio_6_Post {

	public String toString() {
		return "Mensaje 1 " + super.toString();
	}

	public static void main(String[] args) {
		Ejercicio_13_Post p = new Ejercicio_13_MessagePost;
		
		System.err.println(p);
	}
}
