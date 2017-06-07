package questao2;

import java.util.Scanner;

public class TakeNet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = 0;
		boolean entradaValida = true;
		do {
			System.out.println("Digite um número maior que um: ");
			String linha = in.nextLine();

			// Verifica se a entrada é válida
			try {
				n = Integer.parseInt(linha);
				entradaValida = true;

				if (n <= 1) {
					entradaValida = false;
					System.out.println("Valor menor ou igual a um. Por favor digite um número válido.");
				}

			} catch (Exception e) {
				System.out.println("O valor inválido. Por favor digite um número válido.");
				entradaValida = false;
			}

			if (entradaValida) {

				for (int i = 1; i <= n; i++) {
				//Se for divisível por 3 e 5 imprime TakeNet
					if (i % 3 == 0 && i % 5 == 0) {
						System.out.println("TakeNet");
					}//Se for divisível por 3 imprime Take
					else if (i % 3 == 0) {
						System.out.println("Take");
					}//Se for divisível por 5 imprime Net 
					else if (i % 5 == 0) {
						System.out.println("Net");
					} //Imprime o número
					else {
						System.out.println(i);
					}
				}
			}

		} while (entradaValida != true);
		in.close();
	}
}
