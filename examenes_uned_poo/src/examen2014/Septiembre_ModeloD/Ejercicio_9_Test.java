package examen2014.Septiembre_ModeloD;

public class Ejercicio_9_Test {

	public static void main(String[] args) {
		Ejercicio_9_MusicOrganizer mo = new Ejercicio_9_MusicOrganizer();

		mo.addFile("Disco 1");
		mo.addFile("Disco 2");
		mo.addFile("Disco 3");

		mo.listFile(1);
		mo.removeFile(1);
		mo.listFile(1);
	}

}
