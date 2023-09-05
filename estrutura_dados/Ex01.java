package estrutura_dados;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex01 {

	public static void main(String[] args) {
		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		while (true) {

			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

			System.out.println("\n-- 1 - Adicionar cliente na fila --");
			System.out.println("-- 2 - Listar todos os clientes --");
			System.out.println("-- 3 - Chamar uma pessoa na fila --");
			System.out.println("-- 0 - Sair --");
			System.out.println("# ## ### #### ###########      ############ #### ### ## #");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de clientes na fila: " + fila);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					fila.remove();
					System.out.println("Lista de clientes na fila: " + fila);
				}

				break;
			case 0:
				System.out.println("Programa finalizado!");
				leia.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida!");
			}
		}

	}
}
