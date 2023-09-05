package estrutura_dados;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Ex02 {
	public static void main(String[] args) {
		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		while (true) {

			System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

			System.out.println("\n-- 1 - Adicionar livro na pilha --");
			System.out.println("-- 2 - Listar todos os livros --");
			System.out.println("-- 3 - Retirar livro da pilha --");
			System.out.println("-- 0 - Sair --");
			System.out.println("# ## ### #### ###########      ############ #### ### ## #");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nome = leia.nextLine();
				pilha.push(nome);
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("Lista de clientes na pilha: " + pilha);
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					pilha.pop();
					System.out.println("Lista de livros na pilha: " + pilha);
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
