package View;

import Controller.QuickSort;
import br.Danns.ordenacao.OrdenacaoBubble;
import br.Danns.ordenacao.OrdenacaoMerge;

public class Principal {
	
	public static void main(String[] args) {
		OrdenacaoBubble orde = new OrdenacaoBubble();
		OrdenacaoMerge Merg = new OrdenacaoMerge();
		QuickSort quickSort = new QuickSort();
		
		double tempoInicial , tempoFinal, tempoTotal;
		
		int[] vetor1 = new int[1499];
		int[] vetor2 = new int[1499];
		int[] vetor3 = new int[1499];
		
		for (int i = 1499; i > 0; i--) {
			 vetor1[1499 - i] = i;
			 vetor2[1499 - i] = i;
			 vetor3[1499 - i] = i;
		}
		//Bubble
		tempoInicial = System.nanoTime(); 
		orde.bubbleSort(vetor1); 
		tempoFinal = System.nanoTime(); 
		tempoTotal = tempoFinal - tempoInicial; 
		tempoTotal = tempoTotal / Math.pow(10, 9); 
		System.out.printf("Tempo Bubble => %.8f s%n", tempoTotal);
		
		//Merge
		tempoInicial = System.nanoTime();
		int fim2 = vetor2.length - 1;
		Merg.mergeSort(vetor2, 0, fim2);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.printf("Tempo Merge => %.8f s%n", tempoTotal);

		// Quick
		tempoInicial = System.nanoTime();
		int fim3 = vetor3.length - 1;
		quickSort.quickSort(vetor3, 0, fim3);
		tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.printf("Tempo Quick => %.8f s%n", tempoTotal);
	}
}