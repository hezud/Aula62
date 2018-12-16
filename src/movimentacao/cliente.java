package movimentacao;

import java.util.Scanner;

import banco.Conta;

public class cliente {

	public static void main(String[] args) {
		int numero;
		String nome;
		char opcao;
		double deposito;
		Conta conta;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		numero = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter account holder: ");
		nome = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		opcao = sc.next().charAt(0);

		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposito = sc.nextDouble();
			conta = new Conta(numero, nome, deposito);
		} else {
			conta = new Conta(numero, nome);
		}

		System.out.printf("%nAccount data:%n%s%n%n", conta);

		System.out.print("Enter a deposit value: ");
		conta.deposito(sc.nextDouble());

		System.out.printf("Updated account data:%n%s%n%n", conta);

		System.out.print("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());

		System.out.printf("Updated account data:%n%s", conta);

		sc.close();

	}

}
