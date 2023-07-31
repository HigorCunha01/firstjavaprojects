package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		
		double valorHora, salario;
		valorHora = sc.nextDouble();
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
	}

}
