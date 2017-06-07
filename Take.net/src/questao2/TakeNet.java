package questao2;

import java.util.Scanner;

public class TakeNet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = 0;
		boolean entradaValida = true;
		do {
			System.out.println("Digite um n�mero maior que um: ");
			String linha = in.nextLine();

			// Verifica se a entrada � v�lida
			try {
				n = Integer.parseInt(linha);
				entradaValida = true;

				if (n <= 1) {
					entradaValida = false;
					System.out.println("Valor menor ou igual a um. Por favor digite um n�mero v�lido.");
				}

			} catch (Exception e) {
				System.out.println("O valor inv�lido. Por favor digite um n�mero v�lido.");
				entradaValida = false;
			}

			if (entradaValida) {

				for (int i = 1; i <= n; i++) {
				//Se for divis�vel por 3 e 5 imprime TakeNet
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println("TakeNet");
					}//Se for divis�vel por 3 imprime Take
					else if (i % 3 == 0) {
						System.out.println("Take");
					}//Se for divis�vel por 5 imprime Net 
					else if (i % 5 == 0) {
						System.out.println("Net");
					} //Imprime o n�mero
					else {
						System.out.println(i);
					}
				}
			}

		} while (entradaValida != true);
		in.close();
	}
}
