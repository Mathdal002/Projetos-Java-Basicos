package br.gov.go.sefaz.EstruraDados.pilha;

import java.util.LinkedList;
import java.util.List;

public class pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	public void push(String nome) {
		this.nomes.add(nome);
	}
	
	//Remover o ultimo ser inserido
	public String pop() {
		return nomes.remove(nomes.size()-1); 
	}
	
	public boolean vazia() {
		return nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
}
