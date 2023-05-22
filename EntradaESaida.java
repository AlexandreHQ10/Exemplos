/*IMPRIMIR OS VALORES QUE FORAM DETERMINADOS NO CORPO DO
PROGRAMA*/

package exemplos;

import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome = "Alexandre Henrique";

		int idade = 30;
		// float altura = 1.78;
		double altura = 1.78;
		char sexo = 'm';
		// boolean brasileiro = true;

		System.out.println("O nome é:  " + nome + "\nA idade é:  " + idade + "" + "\nA altura é:  " + altura
				+ "\nO sexo é:  " + sexo + "\n");

		ler.close();

	}

}
