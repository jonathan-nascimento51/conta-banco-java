package br.edu.contabanco.main;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int numeroConta;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, insira o numero da conta: ");
		numeroConta = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("digite o numero da agencia: ");
		agencia = scanner.nextLine();;
		
		System.out.println("digite seu nome: ");
		nomeCliente = scanner.nextLine();
		
		System.out.println("digite seu saldo: ");
		saldo = scanner.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Obrigado " + nomeCliente + " por criar uma conta conosco, sua agencia é " + agencia + " conta: " +
		 numeroConta + " e seu saldo é: "+saldo+" o qual ja esta disponivel!");
		

	}

}
