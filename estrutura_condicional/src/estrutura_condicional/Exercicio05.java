package estrutura_condicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total;
		int codigo, qte;
		codigo = 0;
		qte = 0;
		total = 0;
		
		System.out.println("Digite o codigo do item:");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade:");
		qte = sc.nextInt();
		
		if (codigo == 1) {
			total = 4.00 * qte;
		}
		else if (codigo == 2) {
			total = 4.50 * qte;
		}
		else if (codigo == 3) {
			total = 5.00 * qte;
		}
		else if (codigo == 4) {
			total = 2.00 * qte;
		}
		else if (codigo == 5) {
			total = 1.50 * qte;
		}
		else {
			System.out.println("ITEM NAO CADASTRADO!");
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
