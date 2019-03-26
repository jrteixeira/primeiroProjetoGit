package br.com.microlins;

import br.com.microlins.interfaces.IPessoa;

public class Pessoa implements IPessoa {

	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private double imc;
	
	
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
		String message = toString() +  "\nimc: " + calculaImc();
		return message;
	}

	@Override
	public double calculaImc() {
		// TODO Auto-generated method stub
		 imc = peso / (altura * altura);
		return imc;
	}
	
	public void verificaImc() {
		calculaImc();
		if (imc < 17) {
		String message = "Seu imc é: " + imc + "\n Voce esta muito abaixo do peso!!";
		System.out.println(message);
		}
			if (17 <=imc && imc <= 18.49) {
			String message = "Seu imc é: " + imc + "\n Voce esta abaixo do peso!!";
			System.out.println(message);
			}	
				if (18.49 <imc && imc <= 24.99) {
				String message = "Seu imc é: " + imc + "\n Voce esta com o peso normal!!";
				System.out.println(message);
				}
					if (24.99 <imc && imc <= 29.99) {
					String message = "Seu imc é: " + imc + "\n Voce esta acima do peso!!";
					System.out.println(message);
					}
						if (29.99 <imc && imc <= 34.99) {
						String message = "Seu imc é: " + imc + "\n Voce esta com obesidade nivel 1, cuidado!!";
						System.out.println(message);
						}
							if (34.99 <imc && imc <= 39.99) {
							String message = "Seu imc é: " + imc + "\n Voce esta com obesidade nivel 2 (severa), cuidado!!";
							System.out.println(message);
							}
							if (imc >= 40) {
								String message = "Seu imc é: " + imc + "\n Voce esta com obesidade nivel 3 (mórbida), cuidado!!";
								System.out.println(message);
								}
		
	}

	@Override
	public String toString() {
		return "Nome: " + nome + 
				"\nIdade: " + idade + 
				"\nPeso: " + peso + 
				"\nAltura: " + altura;
	}

}
