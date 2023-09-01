package exercicio_condicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		// caso par
		if (numero == 0) {
			System.out.println("O número " + numero + " é neutro e par");
		}
		else {
			if (numero % 2 == 0) {
				// caso par positivo
				if (numero > 0) {
					System.out.println("O número " + numero + " é par e positivo!");
				} else {
					System.out.println("O número é par e negativo");
				}
			} else if (numero % 2 != 0) {
				if (numero > 0) {
					System.out.println("O número " + numero + "é ímpar positivo!");

				}
			} else {
				System.out.println("O número é ímpar e negativo");
			}

		}
	}

}
