/*USANDO IF ELSE, ELEIÇÕES*/

package exemplos;

import java.util.Scanner;

public class IfElseIfEncadadeado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade :");
		int idade = sc.nextInt();

		if (idade < 16) {
			System.out.println("Você ainda não pode votar.");
		} else if ((idade < 18) || (idade > 64)) {
			System.out.println("Você pode votar, se quiser. ");
		} else {
			System.out.println("É necessário votar. ");
		}
		sc.close();
	}

}
