package loops;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		List<Double> notas = new ArrayList<D>();
		Scanner leia = new Scanner(System.in);
		int numMenor, numMaior, contador;
		System.out.println("Digite o primeiro número (menor): ");
		numMenor = leia.nextInt();
		System.out.println("Digite o segundo número número (maior): ");
		numMaior = leia.nextInt();
		if (numMenor > numMaior) {
			System.out.println("Intervalo inválido");
		} else {
			for (contador = numMenor; contador <= numMaior; contador++) {
				if (contador != 0 && contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é divisível por 3 e 5");
			}
			
			}
		}

	}

}
