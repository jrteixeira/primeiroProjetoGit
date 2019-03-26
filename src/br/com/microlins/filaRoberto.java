package br.com.microlins;

import java.util.LinkedList;
import java.util.Queue;

import br.com.microlins.interfaces.IPilhaString;

public class filaRoberto implements IPilhaString{
	
	Queue<String> fila = null;
	public filaRoberto() {
		fila = new LinkedList<String>();	
	
	}
		
	@Override
	public String pegarPrimeiro() {
		return fila.poll();
		
	}

	@Override
	public String consultarPrimeiro() {

		return fila.peek();
	}

	@Override
	public void adicionar(String parametro) {
		
		fila.add(parametro);
		
	}

	@Override
	public void remover(String parametro) {
		boolean boo = false;
		for (int i = 0; i < fila.size(); i++) {
		fila.remove(parametro);
		boo = true;
		}
		if (boo = false) {
			System.out.println("Parametro invalido!");
		}		
	}

	@Override
	public int quantidadeItens() {
				
		return fila.size();
	}

	@Override
	public String elementoNaPosicao(int posicao) {
		
		return fila.element();
	}

	
}
