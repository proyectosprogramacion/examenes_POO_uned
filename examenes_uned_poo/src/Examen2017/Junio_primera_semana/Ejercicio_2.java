package Examen2017.Junio_primera_semana;

public class Ejercicio_2 {

	public static void main(String[] args) {
		String s;
		Boolean b1 = true;
		Boolean b2 = false;

		if ((b2 == false) | (21 % 3) > 2)
			s += "x";

		if (b1 && (b2 = true))
			s += "y";

		if (b2 == true)
			s += "z";

		System.out.println(s);
	}

}
