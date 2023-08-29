package examen2014.Septiembre_ModeloD;

public class Ejercicio_6_MessagePost extends Ejercicio_6_Post {

	public String mensaje = "En MessagePost";

	public void enviarMensaje() {
		System.out.println(mensaje);
	}

	public static void main(String[] args) {
		Ejercicio_6_MessagePost p = new Ejercicio_6_MessagePost();

		Ejercicio_6_Post post = p;
		post.enviarMensaje();

	}

}
