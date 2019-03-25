package br.com.microlins;

import br.com.microlins.interfaces.IPessoa;

public class Pessoa implements IPessoa {

	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String exibirDados() {
		// TODO Auto-generated method stub
		toString();
		String message = toString() +  "imc: " + calculaImc();
		return message;
	}

	@Override
	public double calculaImc() {
		// TODO Auto-generated method stub
		double imc = peso / (altura * altura);
		return imc;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
