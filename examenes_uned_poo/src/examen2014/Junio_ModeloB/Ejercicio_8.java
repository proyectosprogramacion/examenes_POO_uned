package examen2014.Junio_ModeloB;

public class Ejercicio_8 {

	private final String alarma = "11:00";
	
	public void alarma (String hora) {
		System.out.println("Hora == Alaram is: " + hora == alarma);
	}
	
	
	public static void main(String[] args) {
		Ejercicio_8 ae = new Ejercicio_8();
		
		ae.alarma("11:00");
	}
}
