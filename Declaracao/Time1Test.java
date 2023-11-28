package br.gov.go.sefaz.Declaracao;

public class Time1Test {

	public static void main(String[] args) {
		//Cria e inicializa um objeto Time1
		Time1 time = new Time1(); // invoca o construtor Time1
		
		// Gera saída de representação de string da data/hora
		displayTime("Depois que o objeto de tempo é criado", time);
		System.out.println();
		
		// altera a data/hora e gera saída da data/hora atualizada
		time.setTime(13, 27, 06);
		displayTime("Depois de chamar setTime", time);
		System.out.println();
		
		// Tenta definir data/hora com valores inválidos
		try {
			time.setTime(99, 99, 99);
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		// Exibe a data/hora após uma tentativa de definir valores inválidos
		displayTime("Depois de chamar setTime com valores inválidos", time);
	}
	
	// Exibe um objeto Time1 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time1 t) {
		System.out.printf("%s%nHora Universal: %s%nHora padrão: %s%n", header, t.toUniversalString(),t.toString());
	}

}
