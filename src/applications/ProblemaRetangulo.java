package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProblemaRetangulo {

	/*
	 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
	 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a largura e altura do retângulo:");

		Rectangle retangulo = new Rectangle();

		retangulo.width = sc.nextDouble(); // largura
		retangulo.heigth = sc.nextDouble(); // altura

		System.out.println();
		System.out.printf("ÁREA = %.2f%n", retangulo.area());
		System.out.printf("PERÍMETRO = %.2f%n", retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

		sc.close();

	}

}