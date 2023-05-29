package br.edu.contabanco.main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int numeroConta = 0;
		String agencia = "";
		String nomeCliente;
		Double saldo = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
        while (numeroConta == 0 || String.valueOf(numeroConta).length() != 4) {
            System.out.println("Por favor, digite um número de conta válido com 4 dígitos: ");
            String input = scanner.nextLine();
            
            try {
                numeroConta = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                numeroConta = 0;
            }
            
            if (String.valueOf(numeroConta).length() != 4) {
                System.out.println("Número de conta inválido. Tente novamente.");
            }
        }
        
        while (agencia.isEmpty() || agencia.length() != 5) {
        	System.out.println("Por favor, digite um número de agência válido com 5 dígitos: ");
        	agencia = scanner.nextLine();
        	
        	if (agencia.length() != 5) {
                System.out.println("Número de agência inválido. Tente novamente.");
            }
	
        }
		
        
		System.out.println("digite seu nome: ");
		nomeCliente = scanner.nextLine();
		
		
		boolean saldoValido = false;
        do {
            System.out.println("Digite seu saldo: ");
            String saldoInput = scanner.nextLine();

            try {
                saldo = Double.parseDouble(saldoInput);
                saldoValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor de saldo inválido. Tente novamente.");
            }
        } while (!saldoValido);
		
        
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String saldoFormatado = decimalFormat.format(saldo);
		
        System.out.println();

        System.out.println("Obrigado, " + nomeCliente + ", por criar uma conta conosco.");
        System.out.println("Sua agência é " + agencia + ", conta número " + numeroConta + " e seu saldo é: " + saldoFormatado);
        System.out.println("O saldo já está disponível!");

        scanner.close();
	}
}
