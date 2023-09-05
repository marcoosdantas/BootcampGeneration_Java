package arraylist;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> setInteiros = new HashSet<String>();
		System.out.println("Digite 10 números inteiros: ");
		for (int contador = 0 ; contador < 10 ; contador++) {
			setInteiros.add(sc.nextLine());
		}
		System.out.println(setInteiros);
	}

}
