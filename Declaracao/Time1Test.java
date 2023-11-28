package br.gov.go.sefaz.Declaracao;

public class Time1Test {

	public static void main(String[] args) {
		//Cria e inicializa um objeto Time1
		Time1 time = new Time1(); // invoca o construtor Time1
		
		// Gera sa�da de representa��o de string da data/hora
		displayTime("Depois que o objeto de tempo � criado", time);
		System.out.println();
		
		// altera a data/hora e gera sa�da da data/hora atualizada
		time.setTime(13, 27, 06);
		displayTime("Depois de chamar setTime", time);
		System.out.println();
		
		// Tenta definir data/hora com valores inv�lidos
		try {
			time.setTime(99, 99, 99);
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		// Exibe a data/hora ap�s uma tentativa de definir valores inv�lidos
		displayTime("Depois de chamar setTime com valores inv�lidos", time);
	}
	
	// Exibe um objeto Time1 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nHora Universal: %s%nHora padr�o: %s%n", header, t.toUniversalString(),t.toString());
	}

}
