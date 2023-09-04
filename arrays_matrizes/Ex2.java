package arrays_matrizes;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrizInteiros = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizInteiros[linha][coluna] = sc.nextInt();
			}
		}
		System.out.print("Elementos da diagonal principal: ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (linha == coluna) {
					System.out.print(matrizInteiros[linha][coluna] + " ");
					somaPrincipal += matrizInteiros[linha][coluna];
				}
			}
		}
		System.out.println();
		System.out.print("Elementos da diagonal secundária: ");
		for (int linha = 0; linha < matrizInteiros.length; linha++) {
			for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				if (linha + coluna == matrizInteiros.length - 1) {
					somaSecundaria += matrizInteiros[linha][coluna];
					System.out.print(matrizInteiros[linha][coluna] + " ");
				}

			}
		}
		System.out.println("Soma da diagonal principal: " + somaPrincipal);
		System.out.println("Soma da diagonal secundária: " + somaSecundaria);
		sc.close();
	}
}
