package br.com.microlins;

import java.util.ArrayList;
import java.util.List;

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
		return false;
	}

	@Override
	public List<Atividade> recuperarTodasAtividadesPorPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atividade recuperarUltimaAtividadePessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removerAtividade(Atividade atividade) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int quantidadeAtividadesRealizadasPorPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int totalAtividades() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void limparLista() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Atividade consultarUltimaAtividadeRealizada() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
