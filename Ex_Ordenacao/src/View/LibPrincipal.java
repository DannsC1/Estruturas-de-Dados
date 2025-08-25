package View;

import br.Danns.ordenacao.OrdenacaoBubble;
import br.Danns.ordenacao.OrdenacaoMerge;

public class LibPrincipal {
	public static void main(String[] args) {
		OrdenacaoBubble bubble =  new OrdenacaoBubble();
		OrdenacaoMerge merge = new OrdenacaoMerge();
		
		//ex1
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		System.out.println("=== Exercício 1 ===\n");
		
		System.out.println("MergeSort:");
		merge.mergeSort(vetor1, 0, vetor1.length - 1);
		print(vetor1);
		
		//ex2
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};

		System.out.println("\n=== Exercício 2 ===\n");
		
		System.out.println("BubbleSort:");
		
		bubble.bubbleSort(vetor2);
        print(vetor2);
		
		//ex3
		int[] vetor3 = {101, 102, 103, 125, 124, 123, 104, 105, 106, 122};

		System.out.println("\n=== Exercício 3 ===\n");
		
		System.out.println("MergeSort:");
		merge.mergeSort(vetor3, 0, vetor3.length - 1);
        print(vetor3);
		
	}

	private static void print(int[] vetor) {
		System.out.println("============================================");
		for (int valor : vetor) {
			System.out.print(valor + " ");
		}
		System.out.println("\n============================================");
	}
}