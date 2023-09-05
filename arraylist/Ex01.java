package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int contador;
		for (contador = 0 ; contador < 5 ; contador++) {
			String corDigitada = sc.nextLine();
			cores.add(corDigitada);
		}
		Collections.sort(cores);
		System.out.println(cores);
	}

}
