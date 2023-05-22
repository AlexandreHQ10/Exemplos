/*MEDIA DAS NOTAS*/

package exemplos;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n1, n2, n3, n4;
		double media;

		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextInt();
		System.out.println("Digite a quarta nota: ");
		n4 = ler.nextInt();
		media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("A média é: " + media);

		ler.close();
	}

}
