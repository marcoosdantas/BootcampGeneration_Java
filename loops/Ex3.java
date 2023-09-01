package loops;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int numero = 0, soma = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma idade: ");
		do {
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;
			}

		} while (numero != 0);
		System.out.println("A soma dos números positivos é: " + soma);
	}
}