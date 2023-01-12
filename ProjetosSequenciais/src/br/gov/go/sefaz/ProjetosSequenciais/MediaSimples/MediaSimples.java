package br.gov.go.sefaz.ProjetosSequenciais.MediaSimples;

import java.util.Scanner;

public class MediaSimples {
	private static Scanner scanner;

	public static void main(String [] args) {
		scanner = new Scanner(System.in);
		double x, y, media;
		System.out.println("Informe o primeiro número:");
		x = scanner.nextDouble();
		System.out.println("informe o segundo número");
		y = scanner.nextDouble();
		media = (x + y) / 2.0;
		System.out.println("media = " + media);
	}

}
