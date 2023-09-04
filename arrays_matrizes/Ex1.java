package arrays_matrizes;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, contador, numeroDigitado , numeroEncontrado = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar");
		numeroDigitado = sc.nextInt();
		for (contador = 0 ; contador < 10 ; contador++) {
			if (numeroDigitado == vetorInteiros[contador]) {
				System.out.println("O número " + numeroDigitado + " está na posição " + contador);
				numeroEncontrado++;
				break;
			}
		}
		if (numeroEncontrado == 0) {
			System.out.println("O número não foi encontrado");
		}
	}

}
	