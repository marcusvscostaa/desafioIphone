package Iphone;

import java.util.Scanner;

import Funcionalidade.AparelhoTelefonico;
import Funcionalidade.NavegadorInternet;
import Funcionalidade.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet  {

	public void exibirPagina(String url) {
		System.out.println("A URL " +url+" foi aberta");
	}

	public void adicionarNovaAba() {
		System.out.println("Uma nova aba foi aber");
	}

	public void atualizarPagina() {
		System.out.println("A página foi atualizada");
	}
	public void tocar() {
		System.out.println("Tocando a musica");
		
	}

	public void pausar() {
		System.out.println("Musica pausada");	
	}

	public void selecionarMusica(String musica) {
		System.out.println("Slecionar musica: " + musica);	
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz inciado");	
	}

	public void atender() {
		System.out.println("Chamada atendida");	
		
	}

	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);	
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int opcao;
		do {
			System.out.println("Selecione uma opção no menu: \n +" + "1: Ligar \n +"
					+ "2: Atender \n +" + "3: Correio de voz \n +" + "4: Selecionar música \n +"
					+ "5: Tocar música \n +" + "6: Pausar música \n +" + "7: Abrir página \n +"
					+ "8:Nova aba \n +" + "9: Atualizar página \n +" + "0: Desligar");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o numero: ");
				String numero = sc.next();
				iphone.ligar(numero);
				Thread.sleep(1000);
				break;
			case 2:
				iphone.atender();
				Thread.sleep(1000);
				break;
			case 3:
				iphone.iniciarCorreioVoz();
				Thread.sleep(1000);
				break;
			case 4:
				System.out.println("Digite a musica: ");
				String musica = sc.next();
				iphone.selecionarMusica(musica);
				Thread.sleep(1000);
				break;
			case 5:
				iphone.tocar();
				Thread.sleep(1000);
				break;
			case 6:
				iphone.pausar();
				Thread.sleep(1000);
				break;
			case 7:
				System.out.println("Digite o URL: ");
				String url = sc.next();
				iphone.exibirPagina(url);
				Thread.sleep(1000);
				break;
			case 8:
				iphone.adicionarNovaAba();
				Thread.sleep(1000);
				break;
			case 9:
				iphone.atualizarPagina();
				Thread.sleep(1000);
				break;
			case 0:
				System.out.println("Desligando o aparelho");
				Thread.sleep(900);
				break;
			default:
				System.out.println("Opção inválida. Insira um número de 0 a 9.");
				Thread.sleep(1000);
			}
		} while (opcao != 0);
		sc.close();
	}

}
