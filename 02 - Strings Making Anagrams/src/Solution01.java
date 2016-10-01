import java.util.Scanner;

public class Solution01 {

	public static int numberNeeded(StringBuilder primeira, StringBuilder segunda, int tamanhoPrimeira,
			int tamanhoSegunda) {

		int somaTamanhos = tamanhoPrimeira + tamanhoSegunda;

		StringBuilder terceira = new StringBuilder("");

		for (int i = 0; i < primeira.length() && i < segunda.length(); i++) {
			String z = "" + (segunda.charAt(i));
			if (primeira.indexOf(z) != -1) {
				primeira = primeira.deleteCharAt(primeira.indexOf(z));
				segunda = segunda.deleteCharAt(i);
				i--;
				terceira.append(z);
			} else {
				segunda = segunda.deleteCharAt(i);
				i--;
			}
		}

		return somaTamanhos - (terceira.length() * 2);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		StringBuilder primeira = new StringBuilder(in.next());
		StringBuilder segunda = new StringBuilder(in.next());

		System.out.println(numberNeeded(primeira, segunda, primeira.length(), segunda.length()));
	}
}
