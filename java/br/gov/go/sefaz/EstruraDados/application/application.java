package br.gov.go.sefaz.EstruraDados.application;

import java.util.Stack;

public class application {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("Matheus");
		stack.push("Junior");
		
		System.out.println(stack);
		
		// Retirar da pilha
		System.out.println(stack.pop());
		System.out.println(stack);
		
		//Quem vem primeiro na pilha
		String nome = stack.peek();
		System.out.println(nome);
	}
}
