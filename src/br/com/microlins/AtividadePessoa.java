package br.com.microlins;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import br.com.microlins.interfaces.IAtividadePessoa;

public class AtividadePessoa implements IAtividadePessoa{

	private List<Pessoa> pessoa = null;
	private List<Atividade> atividade = null;
	
	public AtividadePessoa() {
		pessoa = new ArrayList<>();
		atividade = new ArrayList<>();
	}

	@Override
	public boolean gravarAtividade(Atividade atividade) {
		// TODO Auto-generated method stub
		if (this.atividade != null) {
		this.atividade.add(atividade);
		return true;
		}
		return false;
	}

	@Override
	public List<Atividade> recuperarTodasAtividadesPorPessoa(Pessoa pessoa) {
		 List<Atividade> atividades = new ArrayList<>();
		for (Atividade at : atividade) {
			if (at.getPessoa().equals(pessoa))
			
			atividades.add(at);
		}
		return atividades;
	}

	@Override
	public Atividade recuperarUltimaAtividadePessoa(Pessoa pessoa) {
	
		int indice = 0;
		for (int i = 0; i < atividade.size(); i++) {
			if (atividade.get(i).getPessoa().equals(pessoa)) {
				if (i >= indice) {
					indice = i;
					
				}
			}
		}
		return atividade.get(indice);
	}

	@Override
	public boolean removerAtividade(Atividade atividade) {
		if(this.atividade.remove(atividade)) {
			return true;
		}
		return false;
	}

	@Override
	public int quantidadeAtividadesRealizadasPorPessoa(Pessoa pessoa) {
		int qtd = 0;
		for (Atividade at : atividade) {
			if (at.getPessoa().equals(pessoa)) {
				qtd += 1;
			}
		}
		return qtd;
	}

	@Override
	public int totalAtividades() {
		// TODO Auto-generated method stub
		return atividade.size();
	}

	@Override
	public void limparLista() {
		// TODO Auto-generated method stub
		pessoa.clear();
		atividade.clear();
	}

	@Override
	public Atividade consultarUltimaAtividadeRealizada() {
		return atividade.get(atividade.size() -1);
	}
	
	
}
