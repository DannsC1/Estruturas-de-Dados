package View;

import Controller.QuickSort;

public class Principal {

	public static void main(String[] args) {
		
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
		
		QuickSort quick = new QuickSort();
		
		int fim1 = vetor1.length - 1;
		quick.quickSort(vetor1, 0, fim1);
		
		int fim2 = vetor2.length - 1;
		quick.quickSort(vetor2, 0, fim2);
		
		int fim3 = vetor3.length - 1;
		quick.quickSort(vetor3, 0, fim3);
		
		for (int i : vetor1) {
			System.out.print(i + " ");	
		}
		
		System.out.println();
		
		for (int i : vetor2) {
			System.out.print(i + " ");	
		}
		
		System.out.println();
		
		for (int i : vetor3) {
			System.out.print(i + " ");	
		}

	}
}