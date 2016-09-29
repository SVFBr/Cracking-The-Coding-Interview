import java.util.Scanner;

/**
 * 
 * A left rotation operation on an array of size n shifts each of the array's
 * elements 1 unit to the left. For example, if 2 left rotations are performed
 * on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
 * 
 * Given an array of n integers and a number, d , perform d left rotations on
 * the array. Then print the updated array as a single line of space-separated
 * integers.
 * 
 * Input Format
 * 
 * The first line contains two space-separated integers denoting the respective
 * values of n (the number of integers) and d (the number of left rotations you
 * must perform). The second line contains n space-separated integers describing
 * the respective elements of the array's initial state.
 */

public class Solution {
	private void giroAEsquerda(int[] array, int quantidadeDeGiros, int tamanhoArray) {
		int i;
		for (i = 0; i < quantidadeDeGiros; i++) {
			giroAEsquerdaPorUm(array, tamanhoArray);
		}
	}

	private void giroAEsquerdaPorUm(int[] array, int tamanhoArray) {
		int i, temp;
		temp = array[0];
		for (i = 0; i < tamanhoArray - 1; i++)
			array[i] = array[i + 1];
		array[i] = temp;
	}

	private void imprimeArray(int[] a, int n) {
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		Scanner in = new Scanner(System.in);

		int tamanhoArray = in.nextInt();

		int quantidadeDeGiros = in.nextInt();

		int array[] = new int[tamanhoArray];
		for (int a_i = 0; a_i < tamanhoArray; a_i++) {
			array[a_i] = in.nextInt();
		}

		// Passando: o array, total de giros, tamanho do array
		solution.giroAEsquerda(array, quantidadeDeGiros, tamanhoArray);

		// Passando: o array, tamanho do array
		solution.imprimeArray(array, tamanhoArray);

	}

}
