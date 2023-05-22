/*PROGRAMA QUE TRANSFORMA TODAS AS LETRAS MINUSCULAS EM MAIÚSCULAS.*/

package exemplos;

import java.util.Scanner;

public class MinusculaMaiuscul {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Coloque o texto: ");
		String textoDigitado = sc.nextLine();

		String original = textoDigitado;
		String s01 = original.toUpperCase();

		System.out.println();
		System.out.println("Convertida todas as letras maiusculas: " + s01);

		sc.close();

	}
}