package examen2014.Junio_ModeloB;

public class Ejercicio_3_MessagePost extends Ejercicio_3_Post {

	public String mensaje = "En MessagePost";
	
	public void enviarMensaje() {
		System.out.println(mensaje);
	}
	
	public static void main(String[] args) {
		Ejercicio_3_Post p = new Ejercicio_3_MessagePost();
		
		System.out.println(p.mensaje + " ");
		
		p.enviarMensaje();
		

	}

}
