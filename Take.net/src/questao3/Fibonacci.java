package questao3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = 0;
		boolean entradaValida = true;
		do {
			System.out.println("Digite o número de posições de fibonacci: ");
			String linha = in.nextLine();
			int[] vetorFib = null;
			// Verifica se a entrada é válida
			try {
				n = Integer.parseInt(linha);
				entradaValida = true;
				vetorFib = new int[n];
				if (n <= 0) {
					entradaValida = false;
					System.out.println("Valor menor ou igual a zero. Por favor digite um número válido.");
				}

			} catch (Exception e) {
				System.out.println("O valor inválido. Por favor digite um número válido.");
				entradaValida = false;
			}

			if (entradaValida) {
				fibonacci(n,vetorFib);
				
				for (int i = 0; i < n; i++) {
					System.out.print(vetorFib[i]+" ");
				}

			}
		} while (entradaValida != true);
		in.close();
	}

	public static int fibonacci(int inteiro, int[] vetor) {
		if (inteiro == 1 || inteiro == 2) {
			vetor[0] = 1;
			vetor[1] = 1;
			return 1;
		}
		if (inteiro > 2) {

			vetor[inteiro - 1] = fibonacci(inteiro - 1, vetor) + fibonacci(inteiro - 2, vetor);

			return fibonacci(inteiro - 1, vetor) + fibonacci(inteiro - 2, vetor);

		}
		return 0;
	}

}
