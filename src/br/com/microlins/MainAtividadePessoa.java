package br.com.microlins;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class MainAtividadePessoa {

	public static void main(String[] args) throws ParseException {
		int i = 0;
		int m = 0;
		Pessoa p = new Pessoa();
		Atividade a = null;
		AtividadePessoa ap = new AtividadePessoa();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("---Cadastro pessoal---");
		System.out.println("Digite seu nome: ");
		p.setNome(sc.next());
		System.out.println("Digite sua idade: ");
		p.setIdade(sc.nextInt());
		System.out.println("Digite seu peso: ");
		p.setPeso(sc.nextDouble());
		System.out.println("Digite sua altura: ");
		p.setAltura(sc.nextDouble());
		System.out.println("Cadastro concluido!!");
		System.out.println("*********************");
		
		while(i != 9) {
		System.out.println();
		System.out.println("---Systema de atividades por pessoa---");
		System.out.println("--------------");
		System.out.println("Menu principal");
		System.out.println("--------------");
		System.out.println("1 - gerenciar seus dados");
		System.out.println("2 - Cadastrar uma atividade");
		System.out.println("3 - Exibir todas as atividades por pessoa");
		System.out.println("4 - Exibir sua ultima atividade");
		System.out.println("5 - Exibir a quantidade de atividades realizadas por pessoa");
		System.out.println("6 - Exibir total de atividades");	
		System.out.println("7 - Exibir a ultima atividade realizada");	
		System.out.println("8 - Limpar atividades");
		System.out.println("9 - Sair");	
		System.out.println("-------------------------");
		i = sc.nextInt();
		
		switch (i) {
		case 1:
			while(m != 3 ) {
			System.out.println("--------------");
			System.out.println("Menu pessoal");
			System.out.println("--------------");
			System.out.println("1 - Exibir dados");
			System.out.println("2 - Avaliar seu imc");
			System.out.println("3 - Sair");
			m = sc.nextInt();
				switch (m) {
				case 1:
					System.out.println(p.exibirDados());
					break;
				case 2:
					p.verificaImc();
					break;
				}
			}
			break;
		case 2:
			System.out.println("Digite a hora de inicio da sua atividade (HH:mm): ");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime horaInicio = LocalTime.parse(sc.next(), formatter);
			System.out.println("Digite a hora do fim da sua atividade (HH:mm): ");
			LocalTime horaFim = LocalTime.parse(sc.next(), formatter);
			System.out.println("Digite a descrição da sua atividade: ");
			String descricao = sc.next();
			a = new Atividade(p, horaInicio, horaFim, descricao);
			ap.gravarAtividade(a);
			System.out.println("Atividade cadastrada!!");
			System.out.println("*********************");
			break;
		case 3:
			System.out.println(ap.recuperarTodasAtividadesPorPessoa(p));
			break;
		case 4:
			System.out.println(ap.recuperarUltimaAtividadePessoa(p));
			break;
		case 5:
			System.out.println(ap.quantidadeAtividadesRealizadasPorPessoa(p));
			break;
		case 6:
			System.out.println(ap.totalAtividades());
			break;
		case 7:
			System.out.println(ap.consultarUltimaAtividadeRealizada());
			break;
		case 8:
			ap.limparLista();
			break;
		}
		System.out.println("---Fim do programa---");
		}
	}

}
