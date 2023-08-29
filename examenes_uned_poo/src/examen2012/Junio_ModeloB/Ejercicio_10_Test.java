package examen2012.Junio_ModeloB;

public class Ejercicio_10_Test {

	public static void main(String[] args) {
		
		Ejercicio_10_Disparo dn = new Ejercicio_10_DisparoNave();
		
		new Ejercicio_10_Test().inicio(dn);		
		
	}

	public void inicio (Ejercicio_10_Disparo d) {
		d.disparar();
	}
}
