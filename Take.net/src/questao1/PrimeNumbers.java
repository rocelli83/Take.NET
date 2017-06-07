package questao1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int proximo = 0;
		boolean entradaValida = true;
		do {
			System.out.println("Digite um número maior que zero: ");
			String a = in.nextLine();

			// Verifica se a entrada é válida
			try {
				int n = Integer.parseInt(a);
				entradaValida = true;
				proximo = n + 1;
				if (n <= 0) {
					entradaValida = false;
					System.out.println("Valor menor ou igual a zero. Por favor digite um número válido.");
				}

			} catch (Exception e) {
				System.out.println("O valor inválido. Por favor digite um número válido.");
				entradaValida = false;
			}

			if (entradaValida) {
				int i = 1;
				// Imprime os próximos 10 número primos
				while (i <= 10) {
					int contador = 0;
					// Verifica se há divisores para os proximos numeros a
					// partir do digitado
					for (int j = 2; j < proximo; j++) {

						if (((proximo % j) == 0) && (j != proximo)) {

							contador = j;
						}
					}
					// Se não há divisores confirma se é primo
					if (contador == 0) {
						System.out.println(i + "º Número Primo: " + proximo);
						// incrementa while de primos
						i++;

					}
					// incrementa para verificar próximo numero
					proximo += 1;
				}
			}

		} while (entradaValida != true);
		in.close();
	}
}
