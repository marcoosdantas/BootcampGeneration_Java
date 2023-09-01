package exercicio_condicional;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacaoSangue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do doador: ");
		nome = sc.nextLine();
		System.out.println("Digite a idade do doador: ");
		idade = sc.nextInt();
		System.out.println("Primeira doação de sangue? ");
		doacaoSangue = sc.nextBoolean();
		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apto(a) para doar sangue!");
		} else if (idade >= 60 && idade <= 69) {
			if (doacaoSangue == true) {
				System.out.println(nome + " não está apto(a) para doar sangue!");
			} else {
				System.out.println(nome + " está apto(a) para doar sangue!");
			}
		} else {
			System.out.println(nome + " não está apto(a) para doar sangue!");
		}

		sc.close();
	}

}
