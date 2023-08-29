package examen2014.Junio_ModeloB;

public class Ejercicio_1 {

	private String nombre = "ACME";
	private String registro = "0000";
	
	public Ejercicio_1 (String registro) {
		this.registro= registro;
	}

	public Ejercicio_1 (String nombre) {
		this.nombre = nombre;
	}
	public static void main(String[] args) {
		String nombre = "maquina1";
		Ejercicio_1 tm = new Ejercicio_1(nombre);
	}

}
