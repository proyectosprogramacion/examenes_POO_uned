package examen2011.Septiembre_ModeloB;

public class Ejercicio_11 {

	public static int metodoIncognita(String input) {

		int count = 0;
		int length = input.length();
		int i = 0;

		String lowercase = input.toLowerCase();

		while (i < length) {
			switch (lowercase.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;

			}
			i++;

		}
		return count;
	}

	public static void main(String[] args) {

		int x = metodoIncognita("Ototrrinolaringologo");
		System.out.println(x);
	}

}
