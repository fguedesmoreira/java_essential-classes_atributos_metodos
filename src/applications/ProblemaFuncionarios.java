package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProblemaFuncionarios {

	/*
	 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e
	 * imposto). Em seguida, mostrar os dados do funcionário (nome e salário
	 * líquido). Em seguida, aumentar o salário do funcionário com base em uma
	 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
	 * mostrar novamente os dados do funcionário.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Employee funcionario = new Employee();

		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();

		System.out.print("Salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();

		System.out.print("Imposto: ");
		funcionario.tax = sc.nextDouble();

		System.out.printf("Funcionário: %s", funcionario);
		System.out.println();

		System.out.print("Qual a porcentagem para aumentar o salário? ");
		funcionario.increaseSalary(sc.nextDouble());

		System.out.println();
		System.out.printf("Dados atualizados: %s", funcionario);

		sc.close();

	}

}