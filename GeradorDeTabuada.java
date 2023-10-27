package exemplos;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número a ser calculado: ");
		int calculadora = sc.nextInt();
		int contadora = 1;

		while (contadora < 11) {
			System.out.println( calculadora + " x " + contadora + " = " + contadora * calculadora );
			contadora++;

		}
		sc.close();
	}

}
