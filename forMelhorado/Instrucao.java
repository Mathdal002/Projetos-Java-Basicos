package forMelhorado;

public class Instrucao {
	public static void main(String[] args) {
		int[] array = { 87,68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int total = 0;
		// Adiciona o valor de cada elemento ao total
		for(int number : array)
			total += number;
		System.out.printf("Total de elementos no array: %d%n", total);
	}
}
