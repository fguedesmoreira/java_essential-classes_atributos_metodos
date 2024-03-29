package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProblemaAlunos {

	/*
	 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve
	 * nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro
	 * valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer
	 * também se o aluno está aprovado (APROVADO) ou não (REPROVADO) e, em caso
	 * negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado
	 * (que é 60% da nota). Você deve criar uma classe Student para resolver este
	 * problema.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		System.out.print("Informe o nome do aluno: ");
		aluno.name = sc.nextLine();

		System.out.println("Informe as notas dos três trimestres:");
		aluno.grade1 = sc.nextDouble();
		aluno.grade2 = sc.nextDouble();
		aluno.grade3 = sc.nextDouble();

		System.out.printf("NOTA FINAL = %.2f%n", aluno.finalGrade());
		System.out.println(aluno.situation());

		sc.close();

	}

}