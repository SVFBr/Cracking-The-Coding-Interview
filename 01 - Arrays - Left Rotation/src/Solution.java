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
	// Recebendo: o array, total de giros, tamanho do array
	private void giroAEsquerda(int[] a, int k, int n) {
		int i;
		for (i = 0; i < k; i++) {
			giroAEsquerdaPorUm(a, n);
		}
	}

	// Recebendo: o array, tamanho do array
	private void giroAEsquerdaPorUm(int[] a, int n) {
		int i, temp;
		temp = a[0];
		for (i = 0; i < n - 1; i++)
			a[i] = a[i + 1];
		a[i] = temp;
	}

	private void imprimeArray(int[] a, int n) {
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		Scanner in = new Scanner(System.in);

		// n: tamanho do array
		int n = in.nextInt();

		// k: total de giros
		int k = in.nextInt();

		// a: valores inputatos no array
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		// Passando: o array, total de giros, tamanho do array
		solution.giroAEsquerda(a, k, n);

		// Passando: o array, tamanho do array
		solution.imprimeArray(a, n);

	}

}
