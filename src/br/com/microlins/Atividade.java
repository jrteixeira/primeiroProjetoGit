package br.com.microlins;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import br.com.microlins.interfaces.IAtividade;

public class Atividade implements IAtividade {

	private Pessoa pessoa;
	private LocalTime horaInicio;
	private LocalTime horaFim;
	private String descricao;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

	public Atividade() {	
	}
	
	public Atividade(Pessoa pessoa, LocalTime horaInicio, LocalTime horaFim, String descricao) {
		this.pessoa = pessoa;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.descricao = descricao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String resumoAtividade() {
		// TODO Auto-generated method stub
		
		return "\n\nPessoa: " + pessoa +
			   "\nHora de inicio: " + horaInicio.format(formatter) +
			   "\nHora do fim: " + horaFim.format(formatter) +
			   "\nDescrição: " + descricao;
	}

	@Override
	public String toString() {
		return "\nDados da pessoa: " + pessoa +
				   "\nHora de inicio: " + horaInicio.format(formatter) +
				   "\nHora do fim: " + horaFim.format(formatter) +
				   "\nDescrição: "+ descricao + "\n";
	}
	
	

}
