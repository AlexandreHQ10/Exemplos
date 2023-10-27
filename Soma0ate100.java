package Calculador;

public class Tabuada {

	public static void main(String[] args) {

		int soma = 0, sequenciaDeSoma = 0, sequenciaNumerica = 0;

		System.out.println("As somas de todos os números de 0 até 100 são  :");

		while (sequenciaDeSoma <= 100) {

			for (sequenciaNumerica = 0; sequenciaNumerica <= 100; sequenciaNumerica++) {

				System.out.println("\nA soma do número  " + sequenciaNumerica + "  com o anterior é  " + soma + ".");
				soma += sequenciaDeSoma;
				sequenciaDeSoma++;

			}
			System.out.println("\nA soma total de 0 a 100 é : " + soma+".");
		}
	}
}
