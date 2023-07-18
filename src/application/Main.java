package application;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthToggleButtonUI;

import entities.AbrirConta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AbrirConta conta;
		
		System.out.print("Entre com o numero da conta:");
		int num = sc.nextInt();
		System.out.print("Informe o nome do títular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Gostaria de fazer algum deposito: (y/n) ");
		char resposta = sc.next().charAt(0);
	
		
		if (resposta == 'y') {
			
			System.out.println("Informe o valor: ");
			double valorInicial = sc.nextDouble();
			conta = new AbrirConta(num, nome, valorInicial);
		} else {
			conta = new AbrirConta(num, nome);
		}
		
		System.out.println();
		System.out.println("Conta atualizada");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Qual o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println(conta);
		
		
		
		sc.close();
	}

}
