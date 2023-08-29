package examen2011.Septiembre_ModeloB;

public class Ejercicio_10 {

	public static void main(String[] args) {
		 final char a = 'A', d = 'D';
		 
		 char nota= 'B';
		 
		 switch (nota) {
		case a:
		case 'B':
			System.out.print("enhorabuena");
		case 'C':
			System.out.print("aprobado");
			break;
		case d:
		case 'F':
			System.out.print("not good");
		}
		 
	}

}
