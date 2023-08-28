package Examen2023.primera_semana;

public class Ejercicio_7 {

	public static void main(String[] args) {

		boolean expresion1= ! (4 < 5);
		boolean expresion2= (2>2) ||( (4==4) && (1<0));
		boolean expresion3=(2>2) || (4==4) && (1<0);
		boolean expresion4=(2>2) || ! ( (4==4) && (1<0));
		boolean expresion5=(34 != 33) &&! false;

			System.out.println(expresion1);
			System.out.println(expresion2);
			System.out.println(expresion3);
			System.out.println(expresion4);
			System.out.println(expresion5);

		
	}

}
