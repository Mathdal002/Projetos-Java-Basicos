package br.gov.go.sefaz.EstruraDados.executavel;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
	
	public  static void  main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		fila.add("Matheus");
		fila.add("Jose");
		fila.add("Tom");
		System.out.println(fila);
		
		String x2 = fila.poll(); // retira elementos da fila
		System.out.println(x2);
		
		System.out.println(fila);
	}
}
