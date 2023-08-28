package Examen2023.segunda_semana;

import java.util.Iterator;

public class Ejercicio_7 {

	public static void main(String[] args) {
		int[] array1 = { 3, 2, 1 };
		int[] array2 = { 4, 5, 6 };
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array2[array1[i]-1] + " ");
		}

	}
}
