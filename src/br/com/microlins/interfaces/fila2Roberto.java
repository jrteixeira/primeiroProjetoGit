package br.com.microlins.interfaces;

import java.util.ArrayList;
import java.util.List;

public class fila2Roberto<E> implements IPilha<E> {
	
	List<E> lista = null;
	
	public fila2Roberto () {
		lista = new ArrayList<>();
	}
	@Override
	public E pegarPrimeiro() {
		E temp = lista.get(0);
			if (lista.get(0) != null) {
				
				lista.remove(0);
				
				
			}
			else{
				System.out.println("nao existe nada na posição 0");
			}
			
		
		return temp;
	}

	@Override
	public E consultarPrimeiro() {
		boolean boo = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(0) != null) {
				lista.get(0);
				boo = true;
			}
			if (boo = false) {
				System.out.println("nao existe nada na posição 0");
			}
			
		}
		return lista.get(0);
	}

	@Override
	public void adicionar(E parametro) {
		lista.add(parametro);
		
	}

	@Override
	public void remover(E parametro) {
		lista.remove(parametro);		
	}

	@Override
	public int quantidadeItens() {
		
	
		return lista.size(); 
	}

	@Override
	public E elementoNaPosicao(int posicao) {
		
				
			
		
		return lista.get(posicao);
	}

}
