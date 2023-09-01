package loops;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int idade = 0, contadorMenor = 0, contadorMaior = 0, contador;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma idade: ");
		while (idade >= 0) {
			idade = leia.nextInt();
			if (idade < 21 && idade >= 0) {
				contadorMenor++;
			} else if (idade > 50) {
				contadorMaior++;
			}
		}
		System.out.println(
				"Pessoas menores de 21 anos = " + contadorMenor + "\nPessoas maiores de 50 anos:" + contadorMaior);
	}
}
