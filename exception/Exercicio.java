package exception;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		int opcao;
		float saldo = 1000, operacao;
		Scanner leia = new Scanner(System.in);
		while (true) {

			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

			System.out.println("\n--Digite 1 para visualizar o saldo--");
			System.out.println("--Digite 2 para realizar um saque--");
			System.out.println("--Digite 3 para realizar um depósito--");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Saldo: " + saldo);
				break;
			case 2:
				System.out.println("Digite o valor do saque: ");
				operacao = leia.nextFloat();
				if (operacao <= saldo) {
					saldo -= operacao;
				} else {
					System.out.println("Saldo insuficiente!");
				}
				System.out.println("Saldo: " + saldo);
				break;
			case 3:
				System.out.println("Digite o valor do depósito: ");
				operacao = leia.nextFloat();
				saldo += operacao;
				System.out.println("Saldo: " + saldo);
				break;
			default:
				throw new RuntimeException("Digite uma opção de 1 a 3.");
			}
		}

	}
}
