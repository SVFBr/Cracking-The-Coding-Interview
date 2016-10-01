import java.util.Scanner;

public class Solution01 {

	public static int numberNeeded(StringBuilder first, StringBuilder second, int aTamaho, int bTamanho) {

		StringBuilder stringContadora = new StringBuilder("");
		int contagem = 0;

		for (int i = 0; i < first.length() && i < second.length(); i++) {
			String z = "" + (second.charAt(i));

			if (first.indexOf(z) != -1) {
				first = first.deleteCharAt(first.indexOf(z));
				second = second.deleteCharAt(i);
				i--;
				stringContadora.append(z);
			} else {
				second = second.deleteCharAt(i);
				i--;
			}
		}

		return aTamaho + bTamanho - stringContadora.length() - stringContadora.length();

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();

		StringBuilder first = new StringBuilder(a);
		StringBuilder second = new StringBuilder(b);

		System.out.println(numberNeeded(first, second, a.length(), b.length()));
	}
}
