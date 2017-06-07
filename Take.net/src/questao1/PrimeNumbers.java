package questao1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int proximo = 0;
		boolean entradaValida = true;
		do {
			System.out.println("Digite um n�mero maior que zero: ");
			String a = in.nextLine();

			// Verifica se a entrada � v�lida
			try {
				int n = Integer.parseInt(a);
				entradaValida = true;
				proximo = n + 1;
				if (n <= 0) {
					entradaValida = false;
					System.out.println("Valor menor ou igual a zero. Por favor digite um n�mero v�lido.");
				}

			} catch (Exception e) {
				System.out.println("O valor inv�lido. Por favor digite um n�mero v�lido.");
				entradaValida = false;
			}

			if (entradaValida) {
				int i = 1;
				// Imprime os pr�ximos 10 n�mero primos
				while (i <= 10) {
					int contador = 0;
					// Verifica se h� divisores para os proximos numeros a
					// partir do digitado
					for (int j = 2; j < proximo; j++) {

						if (((proximo % j) == 0) && (j != proximo)) {

							contador = j;
						}
					}
					// Se n�o h� divisores confirma se � primo
					if (contador == 0) {
						System.out.println(i + "� N�mero Primo: " + proximo);
						// incrementa while de primos
						i++;

					}
					// incrementa para verificar pr�ximo numero
					proximo += 1;
				}
			}

		} while (entradaValida != true);
		in.close();
	}
}
