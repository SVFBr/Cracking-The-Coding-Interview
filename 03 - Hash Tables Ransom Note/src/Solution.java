
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Usuario digita tamanho do HashMap que devera ser lido e numero de
 * entradas identicas que deverao ser contadas.
 * 
 */


public class Solution {

	static Map<String, Integer> registrarConteudo(Scanner sc, int tamanho) {
		Map<String, Integer> palavraContagem = new HashMap<String, Integer>();
		for (int i = 0; i < tamanho; i++) {
			String palavra = sc.next();
			if (!palavraContagem.containsKey(palavra)) {
				palavraContagem.put(palavra, 0);
			}
			palavraContagem.put(palavra, palavraContagem.get(palavra) + 1);
		}
		return palavraContagem;
	}

	private static boolean contem(Map<String, Integer> registroMagazine, Map<String, Integer> registroResgate) {
		for (Entry<String, Integer> entradaResgate : registroResgate.entrySet()) {
			if (!registroMagazine.containsKey(entradaResgate.getKey())
					|| registroMagazine.get(entradaResgate.getKey()) < entradaResgate.getValue()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tamanhoMagazine = sc.nextInt();
		int tamanhoResgate = sc.nextInt();
		Map<String, Integer> registroMagazine = registrarConteudo(sc, tamanhoMagazine);
		Map<String, Integer> registroResgate = registrarConteudo(sc, tamanhoResgate);
		System.out.println(contem(registroMagazine, registroResgate) ? "Yes" : "No");
		sc.close();

	}

}
