package br.gov.go.sefaz.craps;

import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum Status {
		Jogando, venceu, perdeu
	};

	// Constantes que representam lan�amentos comuns dos dados
	private static final int OLHOS_DE_COBRA = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARROS = 12;

	// Joga uma partida de craps
	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus; // Pode conter JOGANDO, VENCEU OU PERDEU
		int sumOfDice = rollDice(); // Primeira rolagem dos dados
		// Determina o estado do jogo e a pontua��o com base no primeiro lan�amento
		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.venceu;
			break;
		case OLHOS_DE_COBRA:
		case TREY:
		case BOX_CARROS:
			gameStatus = Status.perdeu;
			break;
		default:
			gameStatus = Status.Jogando;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		// enquanto o jogo n�o estiver completo
		while (gameStatus == Status.Jogando) {
			sumOfDice = rollDice(); // lan�a os dados novamente
			// determine o estado do jogo
			if (sumOfDice == myPoint) // vit�ria por pontua��o
				gameStatus = Status.venceu;
			else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontua��o
				gameStatus = Status.perdeu;
			// Exibe uma mensagem se ganhou ou perdeu
			if (gameStatus == Status.venceu)
				System.out.println("Venceu!!! :) ");
			else
				System.out.println("Perdeu!!! :( ");
		}
	}
	// lan�a os dados, calcula a soma e exibe os resultados 
	public static int rollDice() {
		// Seleciona valores aleat�rios do dado
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		int sum = die1 + die2;
		System.out.printf("Jogador sorteio %d + %d = %d%n", die1, die2, sum);
		return sum;
	}
}
