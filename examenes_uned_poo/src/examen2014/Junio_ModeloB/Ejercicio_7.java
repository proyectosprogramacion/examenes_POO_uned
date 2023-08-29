package examen2014.Junio_ModeloB;

public class Ejercicio_7 {

	public void tipoExtension(String nombre) {
		try {
			String ext = nombre.substring(nombre.indexOf('.'), nombre.length());
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println("Archivo no tiene extensión");
		} catch (ArithmeticException ex) {
			System.out.println("Error aritmético");
		} catch (NullPointerException ex) {
			System.out.println("Error en el puntero");
		} finally {
			System.out.println(". En clausula finally");
		}
		System.out.println(". Después del try");
	}

	public static void main(String[] args) {
		Ejercicio_7 ae = new Ejercicio_7();

		ae.tipoExtension("foo");
	}
}
