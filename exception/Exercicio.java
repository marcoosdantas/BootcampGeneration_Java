package exception;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		int opcao, quantidade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Código de produto: ");
		opcao = leia.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Cachorro Quente");
			break;
		case 2:
			System.out.println(
                "X-Salada");
			break;
		case 3:
			System.out.println("X-Bacon");
			break;
		case 4:
			System.out.println("Bauru");
			break;
		case 5:
			System.out.println(
                "Refrigerante");
			break;
		case 6:
			System.out.println("Suco de Laranja");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		System.out.println("Quantidade ");
		quantidade = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Valor total: R$ " + 10 * quantidade);
			break;
		case 2:
			System.out.println(
                "Valor total: R$ " + 15 * quantidade);
			break;
		case 3:
			System.out.println("Valor total: R$ " + 18 * quantidade);
			break;
		case 4:
			System.out.println("Valor total: R$ " + 12 * quantidade);
			break;
		case 5:
			System.out.println("Valor total: R$ " + 8 * quantidade);
			break;
		case 6:
			System.out.println("Valor total: R$ " + 13 * quantidade);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
}