package examen2011.Junio_ModeloB;

public class Ejercicio_14 {

	public static void add3(Integer i) {
		int val = i.intValue();
		val += 3;
		i = new Integer(val);
	}

	public static void main(String[] args) {

		Integer i = new Integer(0);
		add3(i);
		System.out.println(i.intValue());

	}

}
